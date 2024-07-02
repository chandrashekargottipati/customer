package foodie.util;

import foodie.model.Customer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CsvreadCustomerUtill {

    String customercsvpath = "D:\\java\\hello-world\\src\\main\\java\\foodie\\data\\customers.csv";
    List<Customer> customerList = new ArrayList<>();
    String line;

    public List<Customer> readcustomerfromcsv() {
        String csvsplit = ",";
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(customercsvpath))) {
            bufferedReader.readLine();
            while ((line = bufferedReader.readLine()) != null) {
                String[] data = line.split(csvsplit);
                Customer customer = new Customer();
                customer.setId(data[0]);
                customer.setName(data[1]);
                customer.setEmail(data[2]);
                customer.setPassword(data[3]);
                customerList.add(customer);
            }
        } catch (IOException e) {
            System.out.println("File not found in thi path"+ customercsvpath);
            System.exit(0);
            e.printStackTrace();
        }
        return customerList;
    }


}
