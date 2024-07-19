package com.helloworld.java.conditionalstements.foodie.util;

import com.helloworld.java.conditionalstements.foodie.model.Customermodel;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CsvreadCustomerUtill {

    String customercsvpath = "D:\\java\\hello-world\\src\\main\\java\\foodie\\data\\customers.csv";
    List<Customermodel> customermodelList = new ArrayList<>();
    String line;

    public List<Customermodel> readcustomerfromcsv() {
        String csvsplit = ",";
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(customercsvpath))) {
            bufferedReader.readLine();
            while ((line = bufferedReader.readLine()) != null) {
                String[] data = line.split(csvsplit);
                Customermodel customermodel = new Customermodel();
                customermodel.setId(data[0]);
                customermodel.setName(data[1]);
                customermodel.setEmail(data[2]);
                customermodel.setPassword(data[3]);
                customermodelList.add(customermodel);
            }
        } catch (IOException e) {
            System.out.println("File not found in thi path"+ customercsvpath);
            System.exit(0);
            e.printStackTrace();
        }
        return customermodelList;
    }


}
