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
import model.DatabaseConnection;
public class tes1 {
    public static void main(String[] args) {
        DatabaseConnection conn= new DatabaseConnection();
        conn.getConnection();
        try {
            String query = "select * from dosen";
            Statement statement = conn.getConnection().createStatement();
            ResultSet result = statement.executeQuery(query);
            while (result.next()) {
                System.out.println("username : " + result.getString("id_dosen"));
                System.out.println("password : " + result.getString("email"));
            }
            statement.close();
        } catch (Exception ex) {
            System.out.println("messages: " + ex.getMessage());
        }
    }
    
}
