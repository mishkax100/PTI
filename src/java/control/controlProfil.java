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
import model.*;

/**
 *
 * @author Bona
 */
public class controlProfil {
    public static List<Admin>LihatAdmin() throws SQLException {
        Connection conn;
        DatabaseConnection database = new DatabaseConnection();
        conn = null;
//        String status="";
        PreparedStatement stmt;
        ResultSet resultSet;
        
//        connection = null;
        PreparedStatement statement = null;
        ArrayList<Admin> adminList = new ArrayList<>();
        conn = database.getConnection();
        statement = conn.prepareStatement("SELECT * FROM ADMIN");
        resultSet = statement.executeQuery();
        while (resultSet.next()) {
            Admin admin = new Admin();
            admin.setId_admin(resultSet.getString("id_admin"));
            admin.setNama(resultSet.getString("nama"));
            admin.setTTL(resultSet.getString("TTL"));
            admin.setPassword(resultSet.getString("password"));
            admin.setEmail(resultSet.getString("email"));
            admin.setNama(resultSet.getString("nama"));
            admin.setNo_telp(resultSet.getString("no_telp"));
            admin.setAlamat(resultSet.getString("alamat"));
            admin.setJenis_kelamin(resultSet.getString("jenis_kelamin"));
            adminList.add(admin);
        }
        return adminList;
    }
}
