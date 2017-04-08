/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PostTest6;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author A$CE
 */
public class Tugas1 extends javax.swing.JFrame {
private DefaultTableModel model;
private final Connection con = koneksi.getConnection();
private Statement stt;
private ResultSet rss;
private PreparedStatement pst;
int id;
    /**
     * Creates new form Tugas1
     */
    public Tugas1() {
        initComponents();
    }
private void InitTable(){//inisiasi tabel atau membuat table secara manual
        model = new DefaultTableModel(); //instansi class model dari class defaulttablemodel
        model.addColumn("JUDUL"); //membuat kolom judul di instans class model
        model.addColumn("PENULIS"); //membuat kolom penulis di instans class model
        model.addColumn("HARGA"); // membuat kolom harga di instance class model
        model.addColumn("ID"); //Menambah kolom dengan nama ID
        jTable1.setModel(model);
        jTable1.getColumn("ID").setPreferredWidth(0);
        jTable1.getColumn("ID").setMinWidth(0);
        jTable1.getColumn("ID").setWidth(0);
        jTable1.getColumn("ID").setMaxWidth(0);
        //Pada getColumn("ID") bertujuan untuk mengecilkan agar tidak tampak kolom ID tersebut
        //Kolom id digunakan untuk mengubah dan menghapus
    
    }

   private boolean validasi(String judul){ //mthod agar tidk ada data yang sama ketika dibuat
       try{ //untuk membuat eksepsi
           stt = con.createStatement(); //agar konek db
           String sql = "SELECT * FROM buku where judul='"+judul+"'"; //mendeklarasikan variabel sql dengan query untuk menampilkan data sesuai kondisi judul yang ditentukan
           rss = stt.executeQuery(sql); //untuk konek ke db
           if(rss.next())
               return true;
           else
               return false;
       }catch(SQLException e){ //menangkap sebuah error pada SQL
           System.out.println(e.getMessage());
           return false;
       }
   }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        simpan = new javax.swing.JButton();
        ubah = new javax.swing.JButton();
        hapus = new javax.swing.JButton();
        keluar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        cari = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        pilih = new javax.swing.JComboBox();
        penulis = new javax.swing.JComboBox();
        judul = new javax.swing.JTextField();
        harga = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        idd = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 0, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel6.setText("Form Data Buku");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(138, 138, 138))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel6)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Judul ");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Penulis");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Harga");

        simpan.setText("Simpan");
        simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanActionPerformed(evt);
            }
        });

        ubah.setText("Ubah");
        ubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ubahActionPerformed(evt);
            }
        });

        hapus.setText("Hapus");
        hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusActionPerformed(evt);
            }
        });

        keluar.setText("Keluar");
        keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("Cari");

        cari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cariKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setText("Oleh");

        pilih.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Judul", "Penulis", "Harga" }));

        penulis.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Raditya Dika", "Ayu Utami", "Dewi Lestari", "Tere Liye", "Asma Nadia", "Salim A. Fillah", "Andre Hirata", "Mira Widjaja" }));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "JUDUL", "PENULIS", "HARGA"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jTable1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTable1KeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(28, 28, 28)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(penulis, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(harga)
                                    .addComponent(judul)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(cari, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel5)))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(pilih, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(keluar, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(25, 25, 25)))))))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(simpan, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(ubah, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 265, Short.MAX_VALUE)
                        .addComponent(idd))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(judul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(penulis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(harga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(pilih, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(idd)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(simpan)
                        .addComponent(ubah)
                        .addComponent(hapus)
                        .addComponent(keluar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                .addGap(70, 70, 70))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluarActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_keluarActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        InitTable();
        TampilData();
    }//GEN-LAST:event_formComponentShown

    private void simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanActionPerformed
        // TODO add your handling code here:
        TambahData();
        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();
        TampilData();
        judul.setText("");
        harga.setText("");
//        idd.setText("");
    }//GEN-LAST:event_simpanActionPerformed

    private void ubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ubahActionPerformed
        // TODO add your handling code here:
        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();
        UpdateData();
        TampilData();
        judul.setText("");
        harga.setText("");
    }//GEN-LAST:event_ubahActionPerformed

    private void hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusActionPerformed
        // TODO add your handling code here:
        HapusData();
        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();
        TampilData();
        judul.setText("");
        harga.setText("");
        ubah.setEnabled(false);
        hapus.setEnabled(false);
    }//GEN-LAST:event_hapusActionPerformed

    private void cariKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cariKeyTyped
        // TODO add your handling code here:
           model.getDataVector().removeAllElements();//mendeklarasikan model yang mmengambil data vector dan meremove semua ellements
       model.fireTableDataChanged();//mendeklarasikan model yang di fireTableDataChanged
       String caridengan = pilih.getSelectedItem().toString();
       try{
           String sql = "select * from buku where "+caridengan+" like '%"+cari.getText()+"%'";
           stt = con.createStatement();//pembuatan statement
           rss = stt.executeQuery(sql);//eksekusi query
           ResultSet rss=stt.executeQuery(sql);
           while(rss.next()){// perulangan result set dari variable rss hingga tidak terpenuhi untuk perulangan
                //menampilkan data sesuai array :
               Object[] o=new Object[3];
               o[0]=rss.getString("JUDUL");
               o[1]=rss.getString("PENULIS");
               o[2]=rss.getString("HARGA");
               model.addRow(o);
           }
           stt.close();//menutup stt
           rss.close();//menutup rss
       }catch(SQLException e){System.out.println("Terjadi Kesalahan");}
    }//GEN-LAST:event_cariKeyTyped

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
    }//GEN-LAST:event_formWindowClosing

    private void jTable1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyReleased
        // TODO add your handling code here:
        int baris = jTable1.getSelectedRow();
        String judull=jTable1.getValueAt(baris, 0).toString();
        String penuliss=jTable1.getValueAt(baris, 1).toString();
        String hargaa=jTable1.getValueAt(baris, 2).toString();
        String ids = jTable1.getValueAt(baris, 3).toString();
        
        idd.setText(ids);
        judul.setText(judull);
        penulis.setSelectedItem(penuliss);
        harga.setText(hargaa);   
    }//GEN-LAST:event_jTable1KeyReleased

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        //Event yang berfungsi jika jTable di klik
        ubah.setEnabled(true);
        hapus.setEnabled(true);
        int baris = jTable1.getSelectedRow();
        String judull=jTable1.getValueAt(baris, 0).toString();
        String penuliss=jTable1.getValueAt(baris, 1).toString();
        String hargaa=jTable1.getValueAt(baris, 2).toString();
        String ids = jTable1.getValueAt(baris, 3).toString();
        
        idd.setText(ids);
        judul.setText(judull);
        penulis.setSelectedItem(penuliss);
        harga.setText(hargaa);
    
    }//GEN-LAST:event_jTable1MouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        ubah.setEnabled(false);
        hapus.setEnabled(false);
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(Tugas1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tugas1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tugas1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tugas1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tugas1().setVisible(true);
            }
        });
    }

     private void TampilData(){ //Merupakan fungsi yang Bernama TampilData yang digunakan untuk menampilkan data dari Databases tabel buku
        try{
            String sql = "SELECT * FROM buku"; //Fungsi sql yang berfungsi untuk menampilkan data dari tabel buku
            stt = con.createStatement();
            rss = stt.executeQuery(sql); //Yang menjalankan fungsi sql yang telah ditulis
            while(rss.next()){ // perulangan result set dari variable rss hingga tidak terpenuhi untuk perulangan
                //menampilkan data sesuai array :
                Object[] o = new Object[4];
                o[0] = rss.getString("judul"); //Data kolom judul dari tabel buku dimasukkan kedalam object o
                o[1] = rss.getString("penulis"); //Data kolom penulis dari tabel buku dimasukkan kedalam object o
                o[2] = rss.getInt("harga"); //Data kolom harga dari tabel buku dimasukkan kedalam object o
                o[3] = rss.getInt("id"); //Data kolom id dari tabel buku dimasukkan kedalam object o
                model.addRow(o); // Data-data tadi lalu di masukkan kedalam jTable1
                
            }
        }catch(SQLException e){
            System.out.println(e.getMessage()); //Menangkap kesalahan jika misalnya terjadi
        }
        
    }
    private void TambahData(){ //Fungsi yang berfungsi untuk menambah data ke databases tabel buku
        String judull = judul.getText();
        String penuliss = penulis.getSelectedItem().toString();
        int hargaa = Integer.parseInt(harga.getText());
        try{
            String sql = "INSERT INTO buku VALUES(NULL,'"+judull+"','"+penuliss+"',"+hargaa+")"; 
            //Fungsi SQL yang digunakan untuk memasukan data yaitu Insert
            stt = con.createStatement();
            stt.executeUpdate(sql); //executeUpdate adalah yang menjalankan querynya
            model.addRow(new Object[]{judull,penuliss,hargaa});
        }catch(SQLException e){
            System.out.println(e.getMessage()); //Menangkap kesalahan jika terjadi
        }
    }
    
    private void HapusData(){ //Fungsi yang digunakkan untuk menghapus data dari tabel buku di databases
        String judull = judul.getText();
        String penuliss = penulis.getSelectedItem().toString();
        int hargaa= Integer.parseInt(harga.getText());
        int ids = Integer.parseInt(idd.getText()); //Mengambil data ID yang dari jLabel idd
        try{
            String sql = "delete from buku where id='"+ids+"'";
            //Menghapus data dengan id = ids, ids berisi id penulis dan lain-lain
            stt = con.createStatement();
            stt.executeUpdate(sql); //  yang menjalankan query sql
        }catch(SQLException e){
            System.out.println(e.getMessage()); //Menangkap kesalahan jika terjadi
        }
    }
   private void UpdateData(){ //Fungsi yang digunakkan untuk mengubah data atau mengupdate data
//        int baris = jTable1.getSelectedRow();
        String judull = judul.getText(); //Mengambil judul yang dari jTextfield txtJudul
        String penuliss = penulis.getSelectedItem().toString();  //Mengambil penulis yang dari comboPenulis
        int hargaa = Integer.parseInt(harga.getText()); //Mengambil data harga yang dari jTextfield txtHarga
        int ids = Integer.parseInt(idd.getText()); //Mengambil data ID yang dari jLabel idd
        try
        {
            String sql = "update buku set judul='"+judull+"', penulis='"+penuliss+"', harga='"+hargaa+"'Where id='"+ids+"'";
            //query sql untuk mengupdate dimana id = ids, ids berisi id penulis dan lain-lain
            stt = con.createStatement();
            stt.executeUpdate(sql); // yang menjalankan querynya
        }catch(SQLException e){
            System.out.println(e.getMessage()); //Menangkap kesalahan jika terjadi
        }
    }
   
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cari;
    private javax.swing.JButton hapus;
    private javax.swing.JTextField harga;
    private javax.swing.JLabel idd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField judul;
    private javax.swing.JButton keluar;
    private javax.swing.JComboBox penulis;
    private javax.swing.JComboBox pilih;
    private javax.swing.JButton simpan;
    private javax.swing.JButton ubah;
    // End of variables declaration//GEN-END:variables
}
