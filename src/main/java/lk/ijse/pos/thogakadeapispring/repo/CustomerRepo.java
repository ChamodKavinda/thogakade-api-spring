package lk.ijse.pos.thogakadeapispring.repo;

import lk.ijse.pos.thogakadeapispring.entity.Customer;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, String> {

}
