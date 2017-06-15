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
import model.LPPM;


/**
 *
 * @author Hp i3 Geforce
 */
public class ControlLPPM {
    public static void TambahLPPM(LPPM lppm) throws SQLException{

            String id_lppm = lppm.getId_lppm();
            String password = lppm.getPassword();
            String nama = lppm.getNama();
            String ttl = lppm.getTTL();
            String email = lppm.getEmail();
            String kelamin = lppm.getJenis_kelamin();
            String telp = lppm.getNo_telp();
            String alamat = lppm.getAlamat();
                     
        Connection conn;
       
        
        conn = null; DatabaseConnection database = new DatabaseConnection();
//        String status="";
        PreparedStatement stmt;
//        ResultSet resultSet;
        try {
            conn = database.getConnection();
            

            
           stmt = conn.prepareStatement("INSERT INTO LPPM (id_lppm, nama, ttl, "
                    + "password, email, no_telp, jenis_kelamin, alamat) VALUES "
                    + "('" +id_lppm+ "','" +nama+"','"+ttl+ "','" +password+ "',"
                    + "'"+email+"','" +telp+ "','" +kelamin+ "','" +alamat+ "')");
                                 
           stmt.executeUpdate();

            conn.close();
        }catch (SQLException e){
            
            
        }
        
    }
   
    public static void main(String[] args) {
     
        try {
            LPPM test = new LPPM();
            test.setId_lppm("L1203");
            test.setNama("Laika");
            test.setTTL("New Jersey, 15-May-1988");
            test.setPassword("lalalalala");
            test.setEmail("laik@yahoo.com");
            test.setNo_telp("029550377");
            test.setJenis_kelamin("Male");
            test.setAlamat("Boston, Lincolnshire");
            TambahLPPM(test);
//        try {
//            List<LPPM> lppm;
//                lppm=lihatLPPM();
//            for (int i = 0; i < lppm.size(); i++) {
//                System.out.println(lppm.get(i).getNama());
//            }
            
//            TambahLPPM(test);
        } catch (SQLException ex) {
            Logger.getLogger(ControlLPPM.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
       
    

      
    public static List<LPPM> lihatLPPM() throws SQLException{
        DatabaseConnection database = new DatabaseConnection();
        Connection conn;
        conn = database.getConnection();
        PreparedStatement psmt = null;
        ResultSet rset = null;
        conn.setAutoCommit(false);
       
        String sql = "select id_lppm, nama, ttl, "
                    + "password, email, no_telp, jenis_kelamin, alamat"
                + "from lppm";
        
        rset = psmt.executeQuery();
        List <LPPM> lppm= new ArrayList<>();
        while (rset.next()){
            LPPM a = new LPPM();
            a.setId_lppm(rset.getString(1));
            a.setNama(rset.getString(2));
            a.setTTL(rset.getString(3));
            a.setPassword(rset.getString(4));
            a.setEmail(rset.getString(5));
            a.setNo_telp(rset.getString(6));
            a.setJenis_kelamin(rset.getString(7));
            a.setAlamat(rset.getString(8));
            
            lppm.add(a);
        }
        conn.commit();
        return lppm;
    }
}
    

        


