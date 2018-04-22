/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arsipperpus;

import java.sql.Date;

/**
 *
 * @author Lenovo
 */
public class DVD extends BahanPustaka{
    
//    private String id_DVD;
    private String Bahasa;
    
    
    public DVD(int id, String judul, String bahasa, String penerbit, String kategori,
            Date tglTerbit, Date tglMasuk, String sumber){
        
        setId(id);
//        this.id = id;
        this.judul = judul;
        this.Bahasa = bahasa;
        this.penerbit = penerbit;
        this.kategori = kategori;
        this.tglTerbit = tglTerbit;
        this.tglMasuk = tglMasuk;
        this.sumber = sumber;
        
        
    }

    public String getId_DVD() {
        return id;
    }

    public String getBahasa() {
        return Bahasa;
    }

    @Override
    public void setId(int angka) {
        this.id = "DV-"+angka;
    }
    
    
    
    
    
    
    
    
}
