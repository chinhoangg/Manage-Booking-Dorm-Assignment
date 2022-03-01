
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

public class Category {
    private int id;
    private String name;
}
