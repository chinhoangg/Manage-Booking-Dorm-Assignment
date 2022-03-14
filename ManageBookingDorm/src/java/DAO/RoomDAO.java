package DAO;

import context.DBContext;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Admissier;
import model.Bill;
import model.BillDetail;
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

    public List<Admissier> getAllAdmissier() {
        List<Admissier> list = new ArrayList<>();
        try {
            String sql = "select * from Admissier";
            Connection conn = new DBContext().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Admissier ad = Admissier.builder()
                        .id(rs.getInt(1))
                        .name(rs.getString(2))
                        .phone(rs.getString(3))
                        .address(rs.getString(4)).build();
                list.add(ad);
            }
        } catch (Exception ex) {
            Logger.getLogger(CategoryDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public List<BillDetail> getAllBillDetail() {
        List<BillDetail> list = new ArrayList<>();
        try {
            String sql = "select * from BillDetail";
            Connection conn = new DBContext().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                BillDetail bd = BillDetail.builder()
                        .id(rs.getInt(1))
                        .billId(rs.getInt(2))
                        .roomName(rs.getString(3))
                        .roomImage(rs.getString(4))
                        .roomPrice(rs.getDouble(5))
                        .duration(rs.getInt(6)).build();
                list.add(bd);
            }
        } catch (Exception ex) {
            Logger.getLogger(CategoryDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public List<Bill> getAllBill() {
        List<Bill> list = new ArrayList<>();
        try {
            String sql = "select * from Bills";
            Connection conn = new DBContext().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Bill b = Bill.builder()
                        .id(rs.getInt(1))
                        .accountId(rs.getInt(2))
                        .totalPrice(rs.getDouble(3))
                        .note(rs.getString(4))
                        .createdDate(rs.getString(5))
                        .admissierId(rs.getInt(6)).build();
                list.add(b);
            }
        } catch (Exception ex) {
            Logger.getLogger(CategoryDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public void createRoom(String name, int duration, double price, String description, String image_url, String created_date, int category_id) {
        String query = "INSERT INTO [ManageBookingDorm].[dbo].[Room]\n"
                + "           ([name]\n"
                + "           ,[duration]\n"
                + "           ,[price]\n"
                + "           ,[description]\n"
                + "           ,[image_url]\n"
                + "           ,[created_date]\n"
                + "           ,[category_id])\n"
                + "     VALUES\n"
                + "           (?,?,?,?,?,?,?)";
        try {
            Connection conn = new DBContext().getConnection();
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, name);
            ps.setInt(2, duration);
            ps.setDouble(3, price);
            ps.setString(4, description);
            ps.setString(5, image_url);
            ps.setString(6, created_date);
            ps.setInt(7, category_id);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

}
