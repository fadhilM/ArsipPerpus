/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arsipperpus;

import Model.PerpusDB;
import arsipperpus.intfce.BahanBaru;
import arsipperpus.intfce.admPage;
import arsipperpus.intfce.login;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Controller {
//    PerpusDB DB;
//    BahanBaru bahan;
//    login awal;
//    admPage pageAdmin;
//    
//     public Controller() throws SQLException {
//         DB = new PerpusDB();
//         bahan = new BahanBaru();
//         awal = new login();
//         pageAdmin = new admPage();
//         
////         awal.setVisible(true);
//         bahan.setVisible(true);
//         bahan.getSimpan().addActionListener(new SimpanBahan());
//     }
//
//    private class SimpanBahan implements ActionListener {
//       
//        @Override
//        public void actionPerformed(ActionEvent e) {
//            if (bahan.getPilihBuku().isSelected()) {
//                String judul = bahan.getbJudul().getText();
//                String pengarang = bahan.getbPengarang().getText();
//                String penerbit = bahan.getbPenerbit().getText();
//                String ISBN = bahan.getbIsbn().getText();
//                String kategori = bahan.getKategori().getSelectedItem().toString();
//                String sumber = bahan.getSumber().getSelectedItem().toString();
//                
//                Calendar terbit = (Calendar)bahan.getTglTerbit().getModel().getValue();
//                java.util.Date tglTerbit = terbit.getTime();
//                java.sql.Date dateTerbit = new java.sql.Date (tglTerbit.getTime());
//                
//                Calendar masuk = (Calendar)bahan.getTglMasuk().getModel().getValue();
//                java.util.Date tglMasuk = masuk.getTime();
//                java.sql.Date dateMasuk = new java.sql.Date (tglMasuk.getTime());
//                
//                try {
//                    System.out.println(judul);
//                    DB.insertBook(judul, pengarang, penerbit, ISBN, kategori, dateTerbit, dateMasuk, sumber);
//                    pageAdmin.setVisible(true);
//                    bahan.dispose();
//                } catch (SQLException ex) {
//                    Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
//                }
//            }
//            else if(bahan.getPilihDVD().isSelected()){
//                String judul = bahan.getdJudul1().getText();
//                String bahasa = bahan.getdBahasa().getText();
//                String penerbit = bahan.getdPenerbit1().getText();
//                String ISBN = bahan.getbIsbn().getText();
//                String kategori = bahan.getKategori().getSelectedItem().toString();
//                String sumber = bahan.getSumber().getSelectedItem().toString();
//                
//                Calendar terbit = (Calendar)bahan.getTglTerbit().getModel().getValue();
//                java.util.Date tglTerbit = terbit.getTime();
//                java.sql.Date dateTerbit = new java.sql.Date (tglTerbit.getTime());
//                
//                Calendar masuk = (Calendar)bahan.getTglMasuk().getModel().getValue();
//                java.util.Date tglMasuk = masuk.getTime();
//                java.sql.Date dateMasuk = new java.sql.Date (tglMasuk.getTime());
//                
//                
//                try {
//                    DB.insertDVD(judul, bahasa, penerbit, kategori, dateTerbit, dateMasuk, sumber);
//                    pageAdmin.setVisible(true);
//                    bahan.dispose();
//                } catch (SQLException ex) {
//                    Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
//                }
//            }
//               
//        }
//    }

    
    
    
    
    
    
    
}
