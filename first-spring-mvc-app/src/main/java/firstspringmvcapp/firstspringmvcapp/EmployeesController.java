package firstspringmvcapp.firstspringmvcapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@RequestMapping("employees")
@RestController
public class EmployeesController {

    @RequestMapping(value = "/getEmployees", method = {RequestMethod.GET, RequestMethod.POST})
    //@PostMapping("/getEmployees")
    public List<Employee> getEmployees(){
        List<Employee> result = new ArrayList<>();

        result.add(new Employee("Jan", "Nowak", new BigDecimal(3453.243)));
        result.add(new Employee("Ola", "Kaczka", new BigDecimal(5453.243)));
        result.add(new Employee("Tola", "Cola", new BigDecimal(6453.243)));

        return result;
    }

    //@RequestMapping("findAny")
    @GetMapping("findAny")
    public Employee findAny(){
        return new Employee("Jan", "Kowalski", new BigDecimal(1500.011));
    }
}
