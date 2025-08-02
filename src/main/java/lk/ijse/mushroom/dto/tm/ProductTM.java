package lk.ijse.mushroom.dto.tm;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class ProductTM {
    private int product_id;
    private String Product_name;
    private String quantity;
}
