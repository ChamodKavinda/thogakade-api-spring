package lk.ijse.pos.thogakadeapispring.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDTO {
    String id;
    String name;
    String address;
    double salary;
}
