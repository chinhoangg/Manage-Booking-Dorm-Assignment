
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

public class Room {
    private int id;
    private String name;
    private int duration;
    private double price;
    private String description;
    private String imageUrl;
    private String createdDate;
    private int categoryId;
}
