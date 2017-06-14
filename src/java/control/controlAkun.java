/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import com.google.common.hash.Hashing;
import java.nio.charset.StandardCharsets;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.*;

/**
 *
 * @author Bona
 */
public class controlAkun {
    public static String cekLogin(String username, String password) throws SQLException{
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
            password = Hashing.sha256().hashString(password, StandardCharsets.UTF_8).toString();
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
    public static void daftarPengarang(Pengarang pengarang) throws SQLException{
    Connection conn;
    DatabaseConnection database = new DatabaseConnection();

    conn = null;
    PreparedStatement stmt;
    try {
        conn = database.getConnection();
        stmt = conn.prepareStatement("INSERT INTO PENGARANG(ID_PENGARANG, "
                + "EMAIL, NAMA, PRODI, PASSWORD, NO_TELP, JENIS_KELAMIN, TTL,"
                + " STATUS, ALAMAT, H_INDEKS) VALUES (?,?,?,?,?,?,?,?,?,?,?)");
        
        String password = Hashing.sha256().hashString(pengarang.getPassword(),
                StandardCharsets.UTF_8).toString();
        stmt.setString(1,pengarang.getId_pengarang());
        stmt.setString(2, pengarang.getEmail());
        stmt.setString(3, pengarang.getNama());
        stmt.setString(4, pengarang.getProdi());
        stmt.setString(5, password); //password di enkripsi
        stmt.setString(6, pengarang.getNo_telp());
        stmt.setString(7, pengarang.getJenis_kelamin());
        stmt.setString(8, pengarang.getTTL());
        stmt.setString(9, pengarang.getStatus());
        stmt.setString(10, pengarang.getAlamat());
        stmt.setString(11, pengarang.getH_index());
        stmt.executeUpdate();

        stmt.close();
        conn.close();
    }catch (SQLException e){
        Logger.getLogger(ControlDaftar.class.getName()).log(Level.SEVERE, null, e);
    }
}
    public static void hapusPengarang(Pengarang pengarang) throws SQLException {
        Connection conn;
        DatabaseConnection database = new DatabaseConnection();
        PreparedStatement stmt = null;
        String sql = "DELETE FROM PENGARANG WHERE ID_PENGARANG=?";
        conn = database.getConnection();
        stmt = conn.prepareStatement(sql);
        stmt.setString(1, pengarang.getId_pengarang());
        stmt.executeUpdate();
        stmt.close();
        conn.close();
    }
    
    public static void hapusAdmin(Admin admin) throws SQLException {
        Connection conn;
        DatabaseConnection database = new DatabaseConnection();
        PreparedStatement stmt = null;
        String sql = "DELETE FROM ADMIN WHERE ID_ADMIN=?";
        conn = database.getConnection();
        stmt = conn.prepareStatement(sql);
        stmt.setString(1, admin.getId_admin());
        stmt.executeUpdate();
        stmt.close();
        conn.close();
    }
    
    public static void hapusLPPM(LPPM lppm) throws SQLException {
        Connection conn;
        DatabaseConnection database = new DatabaseConnection();
        PreparedStatement stmt = null;
        String sql = "DELETE FROM LPPM WHERE ID_LPPM=?";
        conn = database.getConnection();
        stmt = conn.prepareStatement(sql);
        stmt.setString(1, lppm.getId_lppm());
        stmt.executeUpdate();
        stmt.close();
        conn.close();
    }
        
        
}
