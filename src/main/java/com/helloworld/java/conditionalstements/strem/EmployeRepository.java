package com.helloworld.java.conditionalstements.strem;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class EmployeRepository {

    List<Employee> employeeList;

    public EmployeRepository(){
        this.employeeList = new ArrayList<>();
        employeeList.add(new Employee("Alice Smith", 101, 30, "alice.smith@example.com", 75000.0, "Engineering"));
        employeeList.add(new Employee("Bob Johnson", 102, 35, "bob.johnson@example.com", 80000.0, "Marketing"));
        employeeList.add(new Employee("Charlie Brown", 103, 40, "charlie.brown@example.com", 85000.0, "Sales"));
        employeeList.add(new Employee("Diana Prince", 104, 28, "diana.prince@example.com", 78000.0, "Human Resources"));
        employeeList.add(new Employee("Ethan Hunt", 105, 38, "ethan.hunt@example.com", 90000.0, "Security"));
        employeeList.add(new Employee("Fiona Gallagher", 106, 33, "fiona.gallagher@example.com", 82000.0, "Finance"));
        employeeList.add(new Employee("George Clooney", 107, 45, "george.clooney@example.com", 95000.0, "Operations"));
        employeeList.add(new Employee("Hannah Baker", 108, 25, "hannah.baker@example.com", 70000.0, "Customer Support"));
        employeeList.add(new Employee("Ian Somerhalder", 109, 50, "ian.somerhalder@example.com", 98000.0, "Management"));
        employeeList.add(new Employee("Jessica Jones", 110, 27, "jessica.jones@example.com", 76000.0, "Development"));
    }

    public List<Employee> getallEmployedetails(){
        return this.employeeList;
    }

    public Optional<Employee> getEmployeid(int id){
        return this.employeeList.stream().filter(employee -> employee.getId() == id).findFirst();
    }


}
