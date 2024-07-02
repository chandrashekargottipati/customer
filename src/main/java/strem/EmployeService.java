package strem;

import javax.swing.plaf.PanelUI;
import java.util.List;
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
}
