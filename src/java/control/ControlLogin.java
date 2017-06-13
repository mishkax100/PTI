package control;
import java.sql.*;
public class ControlLogin {
    public static String CekLogin(String username, String password) throws SQLException{
        Connection conn;
        DatabaseConnection database = new DatabaseConnection();
        
        conn = null;
        String status="";
        PreparedStatement stmt;
        ResultSet resultSet;
        try {
            conn = database.getConnection();
            

            
            stmt = conn.prepareStatement("SELECT ID_ADMIN, PASSWORD FROM ADMIN "
                    + "WHERE ID_ADMIN= ? and PASSWORD= ?");
            stmt.setString(1, username);
            stmt.setString(2, password);
            resultSet = stmt.executeQuery();
            if(resultSet.next()){
                status="admin";
            }
            stmt.clearParameters();
            stmt.close();
            
            stmt = conn.prepareStatement("SELECT ID_LPPM, PASSWORD FROM LPPM "
                    + "WHERE ID_LPPM= ? and PASSWORD= ?");
            stmt.setString(1, username);
            stmt.setString(2, password);
            resultSet = stmt.executeQuery();
            if(resultSet.next()){
                status="lppm";
            }
            stmt.clearParameters();
            stmt.close();
            
            stmt = conn.prepareStatement("SELECT ID_PENGARANG, PASSWORD FROM PENGARANG "
                    + "WHERE ID_PENGARANG= ? and PASSWORD= ?");
            stmt.setString(1, username);
            stmt.setString(2, password);
            resultSet = stmt.executeQuery();
            if(resultSet.next()){
                status="pengarang";
            }
            stmt.clearParameters();
            stmt.close();
            
            
            

            
            
//            stmt = conn.prepareStatement("SELECT EMAIL, PASSWORD FROM"
//                    + "PENGARANG WHERE EMAIL= ? and PASSWORD= ?");

            conn.close();
        }catch (SQLException | NumberFormatException e){
            
        }
        return status;
    }
}
