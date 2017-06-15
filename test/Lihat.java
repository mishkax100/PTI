
import control.controlAkun;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Karya_ilmiah;
import model.Pengarang;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hp i3 Geforce
 */
public class Lihat {
    public static void main(String[] args) {
        Karya_ilmiah peng=new Karya_ilmiah();
//        peng.setId_dokumen("123456");
//        peng.setAbstrak("coba1");
//        peng.setPassword("123456");
//        peng.setProdi("TI");
//        peng.setEmail("apem@gmail.com");
//        peng.setJenis_kelamin("laki");
//        peng.setTTL("malang, 6-6-1982");
//        peng.setStatus("dosen");
//        peng.setNo_telp("012379876876");
//        peng.setH_index("3");
        try {
        List<Karya_ilmiah> list=control.ControlKaryaIlmiah.lihatKaryaIlmiah();
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i).getJudul());
            }
//            controlAkun.daftarPengarang(peng);
        } catch (SQLException ex) {
            Logger.getLogger(daftar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
