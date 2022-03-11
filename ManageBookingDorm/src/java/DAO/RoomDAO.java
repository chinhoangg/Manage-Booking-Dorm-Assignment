
package DAO;

import context.DBContext;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Room;

/**
 *
 * @author chinhoag
 */
public class RoomDAO {
    public List<Room> getAllProducts() {
        List<Room> list = new ArrayList<>();
        try {
            String sql = "select * from Room";
            Connection conn = new DBContext().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Room product = Room.builder()
                        .id(rs.getInt(1))
                        .name(rs.getString(2))
                        .duration(rs.getInt(3))
                        .price(rs.getDouble(4))
                        .description(rs.getString(5))
                        .imageUrl(rs.getString(6))
                        .createdDate(rs.getString(7))
                        .categoryId(rs.getInt(8)).build();
                list.add(product);
            }
        } catch (Exception ex) {
            Logger.getLogger(CategoryDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    
    public List<Room> getProductsByCategoryId(int categoryId) {
        List<Room> list = new ArrayList<>();
        try {
            String sql = "select * from Room where Room.category_id = ?";
            Connection conn = new DBContext().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, categoryId);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Room product = Room.builder()
                        .id(rs.getInt(1))
                        .name(rs.getString(2))
                        .duration(rs.getInt(3))
                        .price(rs.getDouble(4))
                        .description(rs.getString(5))
                        .imageUrl(rs.getString(6))
                        .createdDate(rs.getString(7))
                        .categoryId(rs.getInt(8)).build();
                list.add(product);
            }
        } catch (Exception ex) {
            Logger.getLogger(CategoryDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    
    public List<Room> search(String keyword) {
        List<Room> list = new ArrayList<>();
        try {
            String sql = "select *  from Room where name like ?";
            Connection conn = new DBContext().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, "%" + keyword + "%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Room product = Room.builder()
                        .id(rs.getInt(1))
                        .name(rs.getString(2))
                        .duration(rs.getInt(3))
                        .price(rs.getDouble(4))
                        .description(rs.getString(5))
                        .imageUrl(rs.getString(6))
                        .createdDate(rs.getString(7))
                        .categoryId(rs.getInt(8)).build();
                list.add(product);
            }
        } catch (Exception ex) {
            Logger.getLogger(CategoryDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    
    public List<Room> getProductsWithPagging(int page, int PAGE_SIZE) {
        List<Room> list = new ArrayList<>();
        try {
            String sql = "select *  from Room order by id\n"
                    + "offset (?-1)*? row fetch next ? rows only";
            Connection conn = new DBContext().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, page);
            ps.setInt(2, PAGE_SIZE);
            ps.setInt(3, PAGE_SIZE);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Room product = Room.builder()
                        .id(rs.getInt(1))
                        .name(rs.getString(2))
                        .duration(rs.getInt(3))
                        .price(rs.getDouble(4))
                        .description(rs.getString(5))
                        .imageUrl(rs.getString(6))
                        .createdDate(rs.getString(7))
                        .categoryId(rs.getInt(8)).build();
                list.add(product);
            }
        } catch (Exception ex) {
            Logger.getLogger(CategoryDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    
    public Room getProductById(int productId) {
        try {
            String sql = "select *  from Room where id = ?";
            Connection conn = new DBContext().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, productId);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Room product = Room.builder()
                        .id(rs.getInt(1))
                        .name(rs.getString(2))
                        .duration(rs.getInt(3))
                        .price(rs.getDouble(4))
                        .description(rs.getString(5))
                        .imageUrl(rs.getString(6))
                        .createdDate(rs.getString(7))
                        .categoryId(rs.getInt(8)).build();
                return product;
            }
        } catch (Exception ex) {
            Logger.getLogger(CategoryDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public int getTotalProducts() {
        try {
            String sql = "select count(id)  from Room ";
            Connection conn = new DBContext().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception ex) {
            Logger.getLogger(CategoryDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
}
