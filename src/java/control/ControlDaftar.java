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
import java.util.logging.Level;
import java.util.logging.Logger;
import model.*;

/**
 *
 * @author Bona
 */
public class ControlDaftar {
    public static void DaftarPengarang(Pengarang pengarang) throws SQLException{
        Connection conn;
        DatabaseConnection database = new DatabaseConnection();
        
        conn = null;
        PreparedStatement stmt;
        try {
            conn = database.getConnection();
            stmt = conn.prepareStatement("INSERT INTO PENGARANG(ID_PENGARANG, "
                    + "EMAIL, NAMA, PRODI, PASSWORD, NO_TELP, JENIS_KELAMIN, TTL,"
                    + " STATUS, ALAMAT, H_INDEKS) VALUES (?,?,?,?,?,?,?,?,?,?,?)");
            stmt.setString(1,pengarang.getId_pengarang());
            stmt.setString(2, pengarang.getEmail());
            stmt.setString(3, pengarang.getNama());
            stmt.setString(4, pengarang.getProdi());
            stmt.setString(5, pengarang.getPassword());
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
}
