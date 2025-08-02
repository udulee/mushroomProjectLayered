package lk.ijse.mushroom.dto.tm;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class OrderTM {
    private int OrderId;
    private int CustomerId;
    private String PaymentStatus;
    private String OrderDate;
    private String TotalAmount;
}
