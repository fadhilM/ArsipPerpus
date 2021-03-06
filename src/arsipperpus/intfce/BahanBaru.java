/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arsipperpus.intfce;

import java.awt.CardLayout;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import org.jdatepicker.JDatePicker;

/**
 *
 * @author Lenovo
 */
public class BahanBaru extends javax.swing.JFrame {

    /**
     * Creates new form BahanBaru
     */
    admPage halAdm;
    boolean baru = false;
    public BahanBaru() {
        initComponents();
        
    }
    
    public void setBahanBaru(boolean pilih) {
        if (pilih) {
            judulAtas.setText("Menambah Bahan Pustaka");
            bDelet.setVisible(false);
        }else{
            judulAtas.setText("Merubah Bahan Pustaka");
            
        }
        
    }

    public JPanel getPanelBuku() {
        return panelBuku;
    }
    
    public JTextField getbIsbn() {
        return bIsbn;
    }

    public JTextField getbJudul() {
        return bJudul;
    }

    public JTextField getbPenerbit() {
        return bPenerbit;
    }

    public JTextField getbPengarang() {
        return bPengarang;
    }

    public JTextField getdJudul1() {
        return dJudul1;
    }

    public JTextField getdPenerbit1() {
        return dPenerbit1;
    }

    
    
    public JComboBox<String> getKategori() {
        return kategori;
    }

    public JComboBox<String> getSumber() {
        return sumber;
    }

    public JDatePicker getTglMasuk() {
        return tglMasuk;
    }

    public JDatePicker getTglTerbit() {
        return tglTerbit;
    }

    public JTextField getdBahasa() {
        return dBahasa;
    }
    
    
    public JButton getBackButt() {
        return backBtn;
    }

    public JButton getSimpan() {
        return simpan;
    }

    public ButtonGroup getTipeKajian() {
        return tipeKajian;
    }

    public JRadioButton getPilihBuku() {
        return pilihBuku;
    }

    public JRadioButton getPilihDVD() {
        return pilihDVD;
    }
    
    
    
    
    
    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        tipeKajian = new javax.swing.ButtonGroup();
        mainPanel = new javax.swing.JPanel();
        panelBuku = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        bJudul = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        bPengarang = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        bPenerbit = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        bIsbn = new javax.swing.JTextField();
        panelDvd = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        dJudul1 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        dBahasa = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        dPenerbit1 = new javax.swing.JTextField();
        judulAtas = new javax.swing.JLabel();
        pilihBuku = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        pilihDVD = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        kategori = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        sumber = new javax.swing.JComboBox<>();
        simpan = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        bDelet = new javax.swing.JButton();
        tglTerbit = new org.jdatepicker.JDatePicker();
        tglMasuk = new org.jdatepicker.JDatePicker();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainPanel.setLayout(new java.awt.CardLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Judul buku");

        bJudul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bJudulActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Nama pengarang");

        bPengarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPengarangActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Penerbit");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("ISBN");

        bIsbn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bIsbnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBukuLayout = new javax.swing.GroupLayout(panelBuku);
        panelBuku.setLayout(panelBukuLayout);
        panelBukuLayout.setHorizontalGroup(
            panelBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBukuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7)
                    .addComponent(jLabel5))
                .addGap(30, 30, 30)
                .addGroup(panelBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bIsbn)
                    .addComponent(bPengarang, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
                    .addComponent(bPenerbit)
                    .addComponent(bJudul))
                .addContainerGap())
        );
        panelBukuLayout.setVerticalGroup(
            panelBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBukuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bJudul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBukuLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel4))
                    .addComponent(bPengarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(bPenerbit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(bIsbn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        mainPanel.add(panelBuku, "panelBuku");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Judul DVD");

        dJudul1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dJudul1ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("Bahasa");

        dBahasa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dBahasaActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("Penerbit");

        javax.swing.GroupLayout panelDvdLayout = new javax.swing.GroupLayout(panelDvd);
        panelDvd.setLayout(panelDvdLayout);
        panelDvdLayout.setHorizontalGroup(
            panelDvdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDvdLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDvdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDvdLayout.createSequentialGroup()
                        .addGroup(panelDvdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12))
                        .addGap(69, 69, 69)
                        .addGroup(panelDvdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dBahasa, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                            .addComponent(dJudul1)))
                    .addGroup(panelDvdLayout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(80, 80, 80)
                        .addComponent(dPenerbit1)))
                .addContainerGap())
        );
        panelDvdLayout.setVerticalGroup(
            panelDvdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDvdLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDvdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dJudul1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(panelDvdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDvdLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel12))
                    .addComponent(dBahasa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(panelDvdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(dPenerbit1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        mainPanel.add(panelDvd, "panelDvd");

        judulAtas.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        judulAtas.setText("Menambah Bahan Pustaka");

        tipeKajian.add(pilihBuku);
        pilihBuku.setSelected(true);
        pilihBuku.setText("Buku");
        pilihBuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pilihBukuActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Tipe: ");

        tipeKajian.add(pilihDVD);
        pilihDVD.setText("DVD");
        pilihDVD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pilihDVDActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Kategori");

        kategori.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Agama", "Bahasa", "Kewarganegaraan", "IT", "Pendidikan", "Sosial" }));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Tanggal terbit");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Tanggal masuk");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("Cara Mendapatkan");

        sumber.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Beli", "Hibah", "Hadiah" }));

        simpan.setText("Simpan");
        simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanActionPerformed(evt);
            }
        });

        backBtn.setText("Kembali");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        bDelet.setText("Hapus");
        bDelet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDeletActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(judulAtas))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addGap(104, 104, 104)
                        .addComponent(pilihBuku)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pilihDVD)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(backBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bDelet)
                        .addGap(18, 18, 18)
                        .addComponent(simpan)
                        .addGap(33, 33, 33))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(kategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tglTerbit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tglMasuk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(judulAtas)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pilihDVD)
                    .addComponent(pilihBuku)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel9))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(kategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tglTerbit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tglMasuk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(sumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bDelet, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(simpan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(15, 15, 15))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void pilihDVDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pilihDVDActionPerformed
        CardLayout card=(CardLayout)mainPanel.getLayout();
        card.show(mainPanel, "panelDvd");
    }//GEN-LAST:event_pilihDVDActionPerformed

    private void bJudulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bJudulActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bJudulActionPerformed

    private void bPengarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPengarangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bPengarangActionPerformed

    private void bIsbnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bIsbnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bIsbnActionPerformed

    private void dJudul1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dJudul1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dJudul1ActionPerformed

    private void dBahasaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dBahasaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dBahasaActionPerformed

    private void pilihBukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pilihBukuActionPerformed
        CardLayout card=(CardLayout)mainPanel.getLayout();
        card.show(mainPanel, "panelBuku");
    }//GEN-LAST:event_pilihBukuActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        halAdm = new admPage();
        halAdm.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_backBtnActionPerformed

    private void bDeletActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDeletActionPerformed
        JOptionPane.showMessageDialog(null, "Data Sudah diHapus");
    }//GEN-LAST:event_bDeletActionPerformed

    private void simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanActionPerformed
        // TODO add your handling code here:
        
        JOptionPane.showMessageDialog(null, "Data Tersimpan");
        halAdm = new admPage();
        halAdm.setVisible(true);
        this.dispose();
        
//        Utk percobaan bisa terambil apa ndak data dr datepicker
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        Calendar value1 = (Calendar)tglTerbit.getModel().getValue();
        java.util.Date selectedDate1 = value1.getTime();
        String tgl_terbit = df.format(selectedDate1);
        System.out.println("tgl terbit = "+tgl_terbit);
        
        Calendar value2 = (Calendar)tglMasuk.getModel().getValue();
        java.util.Date selectedDate2 = value2.getTime();
        String tgl_masuk = df.format(selectedDate2);
        System.out.println("tgl masuk = "+tgl_masuk);
        
        
    }//GEN-LAST:event_simpanActionPerformed

    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BahanBaru.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BahanBaru.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BahanBaru.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BahanBaru.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BahanBaru().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bDelet;
    private javax.swing.JTextField bIsbn;
    private javax.swing.JTextField bJudul;
    private javax.swing.JTextField bPenerbit;
    private javax.swing.JTextField bPengarang;
    private javax.swing.JButton backBtn;
    private javax.swing.JTextField dBahasa;
    private javax.swing.JTextField dJudul1;
    private javax.swing.JTextField dPenerbit1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel judulAtas;
    private javax.swing.JComboBox<String> kategori;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel panelBuku;
    private javax.swing.JPanel panelDvd;
    private javax.swing.JRadioButton pilihBuku;
    private javax.swing.JRadioButton pilihDVD;
    private javax.swing.JButton simpan;
    private javax.swing.JComboBox<String> sumber;
    private org.jdatepicker.JDatePicker tglMasuk;
    private org.jdatepicker.JDatePicker tglTerbit;
    private javax.swing.ButtonGroup tipeKajian;
    // End of variables declaration//GEN-END:variables
}
