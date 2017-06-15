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

/**
 *
 * @author Hp i3 Geforce
 */
public class ControlKaryaIlmiah {   
    public static void TambahKaryaIlmiah(Karya_ilmiah kai) throws SQLException{

            String judul = kai.getJudul();
            String tglupload = kai.getTgl_upload();
            String abstrak = kai.getAbstrak();
            String disiplin_ilmu = kai.getDisiplin_ilmu();
            String tipe_jurnal = kai.getTipe_jurnal();
            int volume = kai.getVolume();
            int tahun_terbit = kai.getTahun_terbit();
            String nama_jurnal = kai.getNama_jurnal();
            String nama_penerbit = kai.getNama_penerbit();
            String pembiaya = kai.getPembiaya();
            double jumlah_biaya = kai.getBiaya();
                     
        Connection conn;
        DatabaseConnection database = new DatabaseConnection();        
        conn = null;
        PreparedStatement stmt;
        try {
            conn = database.getConnection();                       
            stmt = conn.prepareStatement("INSERT INTO karya_ilmiah (judul, tgl_upload, abstrak, "
                    + "disiplin_ilmu, tipe_jurnal, volume, tahun_terbit, nama_jurnal"
                    + ", nama_penerbit, pembiaya, jumlah_biaya) VALUES "
                    + "('" +judul+ "','" +tglupload+"','"+abstrak+ "','" +disiplin_ilmu+ "',"
                    + "'"+tipe_jurnal+"','" +volume+ "','" +tahun_terbit+ "','" +nama_jurnal+ 
                    "','" +nama_penerbit+ "','" +pembiaya+ "','" +jumlah_biaya+ "')");
                 
            stmt.executeUpdate();
            conn.close();
        }catch (SQLException e){
            Logger.getLogger(ControlKaryaIlmiah.class.getName()).log(Level.SEVERE, null,e);          
        }        
    }
         
     public static List<Karya_ilmiah> lihatKaryaIlmiah() throws SQLException{
        DatabaseConnection database = new DatabaseConnection();
        Connection conn;
        conn = database.getConnection();
        PreparedStatement psmt = null;
        ResultSet rset = null;
        conn.setAutoCommit(false);
       
        String sql = "select judul, tgl_upload, abstrak, "
                    + "disiplin_ilmu, tipe_jurnal, volume, tahun_terbit, nama_jurnal"
                    + ", nama_penerbit, pembiaya, jumlah_biaya"
                + "from karya_ilmiah";
        
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
            ka.add(a);
        }
        conn.commit();
        return ka;
    }
              
    public static void main(String[] args) {
        Karya_ilmiah test = new Karya_ilmiah();
        test.setJudul("TIK Dalam Era Globalisasi");
        test.setTgl_upload("17-July-2016");
        test.setAbstrak("Mengenal Teknologi Informasi");
        test.setDisiplin_ilmu("Teknologi Informasi");             
        test.setTipe_jurnal("Non-fiksi");     
        test.setVolume(5);
        test.setTahun_terbit(2016);
        test.setNama_jurnal("Harian Tech");
        test.setNama_penerbit("Gramedia");
        test.setPembiaya("Rudi Hatmoko");
        test.setBiaya(350000);
        try {
            TambahKaryaIlmiah(test);
        } catch (SQLException ex) {
            Logger.getLogger(ControlAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
