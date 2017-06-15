/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bona
 */
import model.*;
import control.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class daftar {
    
    public static void main(String[] args) {
        Pengarang peng=new Pengarang();
        peng.setId_pengarang("123456");
        peng.setNama("coba1");
        peng.setPassword("123456");
        peng.setProdi("TI");
        peng.setEmail("apem@gmail.com");
        peng.setJenis_kelamin("laki");
        peng.setTTL("malang, 6-6-1982");
        peng.setStatus("dosen");
        peng.setNo_telp("012379876876");
        peng.setH_index("3");
        
        try {
            controlAkun.daftarPengarang(peng);
        } catch (SQLException ex) {
            Logger.getLogger(daftar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
