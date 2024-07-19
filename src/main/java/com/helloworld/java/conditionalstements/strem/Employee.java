package com.helloworld.java.conditionalstements.strem;

import java.util.Objects;

public class Employee {
    // Attributes
    private String name;
    private int id;
    private int age;
    private String email;
    private double salary;
    private String department;

    // Constructor
    public Employee(String name, int id, int age, String email, double salary, String department) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.email = email;
        this.salary = salary;
        this.department = department;
    }

    // Getter and Setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    // hashCode method
    @Override
    public int hashCode() {
        return Objects.hash(name, id, age, email, salary, department);
    }

    // equals method
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && age == employee.age &&
               Double.compare(employee.salary, salary) == 0 &&
               Objects.equals(name, employee.name) &&
               Objects.equals(email, employee.email) &&
               Objects.equals(department, employee.department);
    }

    // toString method
    @Override
    public String toString() {
        return "Employee{" +
               "name='" + name + '\'' +
               ", id=" + id +
               ", age=" + age +
               ", email='" + email + '\'' +
               ", salary=" + salary +
               ", department='" + department + '\'' +
               '}';
    }

}
