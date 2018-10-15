package firstspringmvcapp.firstspringmvcapp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@RestController
public class EmployeesController {

    @RequestMapping("getEmployees")
    public List<Employee> getEmployees(){
        List<Employee> result = new ArrayList<>();

        result.add(new Employee("Jan", "Nowak", new BigDecimal(3453.243)));
        result.add(new Employee("Ola", "Kaczka", new BigDecimal(5453.243)));
        result.add(new Employee("Tola", "Cola", new BigDecimal(6453.243)));

        return result;
    }
}
