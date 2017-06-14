/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bona
 */
import java.sql.ResultSet;
import java.sql.Statement;
import control.DatabaseConnection;
import control.ControlLogin;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
public class login {
    public static void main(String[] args) {
//        DatabaseConnection conn= new DatabaseConnection();
//        conn.getConnection();
//        try {
//            String query = "select * from lppm";
//            try (Statement statement = conn.getConnection().createStatement()) {
//                ResultSet result = statement.executeQuery(query);
//                while (result.next()) {
//                System.out.println("username : " + result.getString("id_lppm"));
//                System.out.println("password : " + result.getString("password"));
//                }
//            }
//            conn.close();
//        } catch (SQLException ex) {
//        }
//        
        try {
            if(!ControlLogin.CekLogin("14514090", "123456").equals("")){
                System.out.println("login lu");
            }else{
                System.out.println("gak login lu");
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}
