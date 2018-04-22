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
public abstract class BahanPustaka {
    
    protected String id;
    protected String judul;
    protected String penerbit;
    protected String kategori;
    protected Date tglTerbit;
    protected Date tglMasuk;
    protected String sumber;

    
    public String getId() {
        return id;
    }
    
    public String getJudul() {
        return judul;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public String getKategori() {
        return kategori;
    }

    public Date getTglTerbit() {
        return tglTerbit;
    }

    public Date getTglMasuk() {
        return tglMasuk;
    }

    public String getSumber() {
        return sumber;
    }
    
    public abstract void  setId(int angka);
    
    
    
    
    
    
    
    
    
    
}
