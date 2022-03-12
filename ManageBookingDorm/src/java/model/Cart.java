package model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author chinhoag
 */
@Builder
@Getter
@Setter
@ToString
public class Cart {
    private Room product ;
    private int duration; //thoi gian sinh vien muon o ky tuc xa
}
