
package DAO;

import context.DBContext;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Bill;

/**
 *
 * @author chinhoag
 */
public class BillDAO {
    public int createReturnId(Bill bill) {
        try {
            String sql = "INSERT INTO [dbo].[Bills]\n"
                    + "           ([account_id]\n"
                    + "           ,[totalPrice]\n"
                    + "           ,[note]\n"
                    + "           ,[admissier_id])\n"
                    + "     VALUES\n"
                    + "           (?,?,?,?)";
            Connection conn = new DBContext().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, bill.getAccountId());
            ps.setDouble(2, bill.getTotalPrice());
            ps.setString(3, bill.getNote());
            ps.setInt(4, bill.getAdmissierId());
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                return rs.getInt(1);
            }

        } catch (Exception ex) {
            Logger.getLogger(AdmissierDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
}
