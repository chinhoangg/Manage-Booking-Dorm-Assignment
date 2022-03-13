
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

public class Admissier {
    private int id;
    private String name;
    private String phone;
    private String address;
}
