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
import model.Karya_ilmiah;
import model.Pengarang;

/**
 *
 * @author Hp i3 Geforce
 */
public class ControlPengarang {
    public static void TambahPengarang(Pengarang peng) throws SQLException{
     String id_pengarang = peng.getId_pengarang();
            String nama_pengarang = peng.getNama();
            String password = peng.getPassword();
            String email = peng.getEmail();
            
            String telp = peng.getNo_telp();
            String alamat = peng.getAlamat();
            String kelamin = peng.getJenis_kelamin();
            String ttl = peng.getTTL();
            int hindeks = peng.getH_index();
            String status = peng.getStatus();
            String prodi = peng.getProdi();
            
                Connection conn;
        DatabaseConnection database = new DatabaseConnection();        
        conn = null;
        PreparedStatement stmt;
        try {
            conn = database.getConnection();                       
            stmt = conn.prepareStatement("INSERT INTO pengarang (id_pengarang, nama_pengarang, password, "
                    + "email, no_telp, alamat, jenis_kelamin, ttl"
                    + ", h_indeks, status, prodi) VALUES "
                    + "('" +id_pengarang+ "','" +nama_pengarang+"','"+password+ "','" +email+ "',"
                    + "'"+telp+"','" +alamat+ "','" +kelamin+ "','" +ttl+ 
                    "','" +hindeks+ "','" +status+ "','" +prodi+ "')");
                 
            stmt.executeUpdate();
            conn.close();
        }catch (SQLException e){
            Logger.getLogger(ControlKaryaIlmiah.class.getName()).log(Level.SEVERE, null,e);          
        }        
    }
    public static List<Karya_ilmiah> lihatPengarang() throws SQLException{
        DatabaseConnection database = new DatabaseConnection();
        Connection conn;
        conn = database.getConnection();
        PreparedStatement psmt = null;
        ResultSet rset = null;
        conn.setAutoCommit(false);
       
        String sql = "select judul, tgl_upload, abstrak, "
                    + "disiplin_ilmu, tipe_jurnal, volume, tahun_terbit, nama_jurnal"
                    + ", nama_penerbit, pembiaya, jumlah_biaya, id_karyailmiah, nama_pengarang from karya_ilmiah";
        psmt=conn.prepareStatement(sql);
        rset = psmt.executeQuery();
        List <Karya_ilmiah> ka= new ArrayList<>();
        while (rset.next()){
            Karya_ilmiah a = new Karya_ilmiah();
            a.setJudul(rset.getString(1));
            a.setTgl_upload(rset.getString(2));
            a.setAbstrak(rset.getString(3));
            a.setDisiplin_ilmu(rset.getString(4));
            a.setTipe_jurnal(rset.getString(5));
            a.setVolume(rset.getInt(6));
            a.setTahun_terbit(rset.getInt(7));
            a.setNama_jurnal(rset.getString(8));
            a.setNama_penerbit(rset.getString(9));
            a.setPembiaya(rset.getString(10));
            a.setBiaya(rset.getDouble(11));
            a.setId_karyailmiah(rset.getString(12));
            a.setNama_pengarang(rset.getString(13));
            ka.add(a);
        }
        
        conn.commit();
        psmt.close();
        conn.close();
        return ka;
    }
}
