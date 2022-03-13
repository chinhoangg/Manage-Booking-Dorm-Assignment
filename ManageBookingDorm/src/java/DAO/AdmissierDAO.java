/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import context.DBContext;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Admissier;

/**
 *
 * @author chinhoag
 */
public class AdmissierDAO {
    public int createReturnId(Admissier admissier) {
        try {
            String sql = "INSERT INTO [dbo].[Admissier]\n"
                    + "           ([name]\n"
                    + "           ,[phone]\n"
                    + "           ,[address])\n"
                    + "     VALUES\n"
                    + "           (?,?,?)";
            Connection conn = new DBContext().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, admissier.getName());
            ps.setString(2, admissier.getPhone());
            ps.setString(3, admissier.getAddress());
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            if(rs.next()){
                return rs.getInt(1);
            }
            
        } catch (Exception ex) {
            Logger.getLogger(AdmissierDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
}
