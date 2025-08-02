package lk.ijse.mushroom.dto.tm;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DeliverPageTM {
    private int deliverId;
    private int orderId;
    private int customerId;
    private String OrderAmount;
}
