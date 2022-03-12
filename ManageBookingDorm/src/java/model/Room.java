
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
    private int duration;     //thoi gian sinh vien dc o toi da trong 1 lan book
    private double price;
    private String description;
    private String imageUrl;
    private String createdDate;
    private int categoryId;
}
