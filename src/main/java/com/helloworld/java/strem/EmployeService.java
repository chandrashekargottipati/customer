package com.helloworld.java.strem;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeService {

    EmployeRepository employeRepository;

    public EmployeService(EmployeRepository employeRepository){
        this.employeRepository = employeRepository;
    }

    public List<Employee> getemployedetails() {
        return employeRepository.getallEmployedetails();
    }

    public List<Employee> filterbysalary(double minsalary){
        //intermediat operation
       return this.employeRepository.getallEmployedetails().stream()
               .filter(employee -> employee.getSalary() >= 70000)
               .collect(Collectors.toList());

    }

    public void getemplydepatment() {
        this.employeRepository.getallEmployedetails().stream().forEach(employee ->{
            if (employee.getDepartment() == "Development"){
            System.out.println(" employe "+employee.getDepartment());

            }
        });
    }

    public List<String> getemployeeEmail(){
        return this.employeRepository.getallEmployedetails().stream().map(Employee::getEmail).collect(Collectors.toList());
    }

    public Employee getemployebyid(int id) throws EmployeeNotfoundException {
        Optional<Employee> optional =  this.employeRepository.getEmployeid(id);
        if (optional.isPresent()){
            return optional.get();
        }else {
            throw new EmployeeNotfoundException("Employee Not found with id : "+id);
        }
    }
}
