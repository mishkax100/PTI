/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Admin;
import model.LPPM;

/**
 *
 * @author Hp i3 Geforce
 */
public class ControlAdmin {
    public static void TambahAdmin(Admin admin) throws SQLException{

            String id_admin = admin.getId_admin();
            String password = admin.getPassword();
            String nama = admin.getNama();
            String ttl = admin.getTTL();
            String email = admin.getEmail();
            String kelamin = admin.getJenis_kelamin();
            String telp = admin.getNo_telp();
            String alamat = admin.getAlamat();
                     
        Connection conn;
        DatabaseConnection database = new DatabaseConnection();       
        conn = null;
        PreparedStatement stmt;
        try {
            conn = database.getConnection();                      
            stmt = conn.prepareStatement("INSERT INTO ADMIN (id_admin, nama, ttl, "
                    + "password, email, no_telp, alamat, jenis_kelamin) VALUES "
                    + "('" +id_admin+ "','" +password+"','"+nama+ "','" +ttl+ "',"
                    + "'"+email+"','" +telp+ "','" +alamat+ "','" +kelamin+ "')");
       
            
            stmt.executeUpdate();
            conn.close();
        }catch (SQLException e){
            
            
        }        
    }
    
      
     public static List<Admin> lihatAdmin() throws SQLException{
        DatabaseConnection database = new DatabaseConnection();
        Connection conn;
        conn = database.getConnection();
        PreparedStatement psmt = null;
        ResultSet rset = null;
        conn.setAutoCommit(false);
               
       
        String sql = "select id_admin, nama, ttl, password, email, no_telp, alamat, jenis_kelamin"
                + "from admin";
        
        rset = psmt.executeQuery();
        List <Admin> admin= new ArrayList<>();
        while (rset.next()){
            Admin a = new Admin();
            a.setId_admin(rset.getString(1));
            a.setNama(rset.getString(2));
            a.setTTL(rset.getString(3));
            a.setPassword(rset.getString(4));
            a.setEmail(rset.getString(5));
            a.setNo_telp(rset.getString(6));
            a.setAlamat(rset.getString(7));
            a.setJenis_kelamin(rset.getString(8));
            admin.add(a);
        }
        conn.commit();
        return admin;
    }
               
    public static void main(String[] args) {
        Admin test = new Admin();
        test.setId_admin("A1880");
        test.setNama("Madara");
        test.setTTL("Texas, 12-June-1983");
        test.setPassword("lalalalala");             
        test.setEmail("madara@yahoo.com");     
        test.setNo_telp("029853327");
        test.setAlamat("New York");
        test.setJenis_kelamin("Male");
        try {
            TambahAdmin(test);
        } catch (SQLException ex) {
            Logger.getLogger(ControlAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
 

