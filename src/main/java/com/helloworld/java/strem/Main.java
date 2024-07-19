package com.helloworld.java.strem;

import java.util.List;

public class Main {
    public static void main(String[] args) throws EmployeeNotfoundException {
        EmployeRepository employeRepository = new EmployeRepository();
        EmployeService employeService = new EmployeService(employeRepository);
        List<Employee> getemployedetails = employeService.getemployedetails();
//        System.out.println(getemployedetails);
//        getemployedetails.forEach(System.out::println);
//        employeService.filterbysalary(7000).forEach(System.out::println);
        employeService.getemplydepatment();
        employeService.getemployeeEmail().forEach(System.out::println);

        try {
            System.out.println(employeService.getemployebyid(1022));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }


}
