package lk.ijse.pos.thogakadeapispring.controller;

import lk.ijse.pos.thogakadeapispring.dto.CustomerDTO;
import lk.ijse.pos.thogakadeapispring.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/customer")
@CrossOrigin

public class CustomerController {

    @Autowired
    CustomerService customerService;

    @PostMapping("/save")
    public String saveCustomer(@RequestBody CustomerDTO dto){
        customerService.saveCustomer(dto);
        return "saved";
    }

    public String updateCustomer(){
        return "Updated";
    }

    public String deleteCustomer(){
        return "Deleted";
    }

    public String getCustomer(){
        return "new Customer()";
    }

    public String getAll(){
        return "new Customer()";
    }

}
