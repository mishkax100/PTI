
import java.sql.SQLException;
import java.util.logging.Level;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bona
 */
import control.*;
import java.util.List;
import java.util.logging.Logger;
import model.*;
public class hapus {
    public static void main(String[] args) {
        Admin peng=new Admin();
        peng.setId_admin("145314078");
        peng.setNama("coba1");
        peng.setPassword("123456");
//        peng.setProdi("TI");
        peng.setEmail("apem@gmail.com");
        peng.setJenis_kelamin("laki");
        peng.setTTL("malang, 6-6-1982");
//        peng.setStatus("dosen");
        peng.setNo_telp("012379876876");
//        peng.setH_index("3");
        
        try {
            
            List<Admin> admin=controlProfil.LihatAdmin();
            for (int i = 0; i < admin.size(); i++) {
                System.out.println(admin.get(i).getId_admin()+", "
                        +admin.get(i).getNama()+", "+admin.get(i).getJenis_kelamin());
            }
//            controlAkun.hapusLPPM(peng);
        } catch (SQLException ex) {
            Logger.getLogger(hapus.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
