
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

public class BillDetail {
    private int id;
    private int billId;
    private String roomName;
    private String roomImage;
    private double roomPrice;
    private int duration;
}
