
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

public class Bill {
    private int id;
    private int accountId;
    private double totalPrice;
    private String note;
    private String createdDate;
    private int admissierId;
}
