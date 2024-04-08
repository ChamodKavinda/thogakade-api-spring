package lk.ijse.pos.thogakadeapispring.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name="Customer")
public class Customer {
    @Id
    String id;
    String name;
    String address;
    double salary;
}
