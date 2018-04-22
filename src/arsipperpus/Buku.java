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
public class Buku extends BahanPustaka{
//    private String id_Buku;
    private String Pengarang;
    private String ISBN;
    
    public Buku(int id, String judul, String pengarang, String penerbit, String isbn, String kategori,
            Date tglTerbit, Date tglMasuk, String sumber){
        
        setId(id);
//        this.id = id;
        this.judul = judul;
        this.Pengarang = pengarang;
        this.penerbit = penerbit;
        this.ISBN = isbn;
        this.kategori = kategori;
        this.tglTerbit = tglTerbit;
        this.tglMasuk = tglMasuk;
        this.sumber = sumber;
        
        
    }

    public String getId_Buku() {
        return id;
    }

    public String getPengarang() {
        return Pengarang;
    }

    public String getISBN() {
        return ISBN;
    }

    @Override
    public void setId(int angka) {
        this.id = "BK-"+angka;
    }
    
    
    
    
    
    
}
