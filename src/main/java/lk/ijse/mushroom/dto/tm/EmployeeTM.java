package lk.ijse.mushroom.dto.tm;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeTM {
    private int Employee_id;
    private String First_name;
    private String Last_name;
    private Double salary;
    private String Contact;
    private String Email;

}
