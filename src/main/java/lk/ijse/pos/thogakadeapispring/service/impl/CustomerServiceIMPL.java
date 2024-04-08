package lk.ijse.pos.thogakadeapispring.service.impl;

import lk.ijse.pos.thogakadeapispring.dto.CustomerDTO;
import lk.ijse.pos.thogakadeapispring.entity.Customer;
import lk.ijse.pos.thogakadeapispring.repo.CustomerRepo;
import lk.ijse.pos.thogakadeapispring.service.CustomerService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CustomerServiceIMPL implements CustomerService {

    @Autowired
    CustomerRepo customerRepo;

    @Autowired
    ModelMapper modelMapper;
    @Override
    public void saveCustomer(CustomerDTO dto) {
        if(!customerRepo.existsById(dto.getId())){
            Customer c = modelMapper.map(dto, Customer.class);
            customerRepo.save(c);
        }else{
            throw new RuntimeException("Customer Already Exists");
        }
    }
}
