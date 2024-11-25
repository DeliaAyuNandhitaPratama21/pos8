/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package main;

import java.awt.Frame;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static main.AdminPageUser.viewData;

/**
 *
 * @author ASUS
 */
public class KasirPageProduk extends javax.swing.JFrame {

    DataProduk p;
    
    /**
     * Creates new form AdminPage1
     */
    DefaultTableModel model2;
    public KasirPageProduk() {
        initComponents();
    }
    
    public KasirPageProduk(DataProduk P) {
        initComponents();
        
        viewProduk("");
         
        
    } 

         
         
        
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        labelDataUser = new javax.swing.JLabel();
        labelDataProduk = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnTambahProduk = new javax.swing.JButton();
        btnUbahProduk = new javax.swing.JButton();
        btnHapusProduk = new javax.swing.JButton();
        btnRefreshProduk = new javax.swing.JButton();
        txtCariUser = new javax.swing.JTextField();
        labelCariUser = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tabel2 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        iconKeluar = new javax.swing.JLabel();
        iconProfil = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelDataUser.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        labelDataUser.setForeground(new java.awt.Color(255, 255, 255));
        labelDataUser.setText("Data User");
        labelDataUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelDataUserMouseClicked(evt);
            }
        });
        jPanel2.add(labelDataUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 6, -1, 28));

        labelDataProduk.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        labelDataProduk.setText("Data Produk");
        labelDataProduk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelDataProdukMouseClicked(evt);
            }
        });
        jPanel2.add(labelDataProduk, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 6, -1, 28));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        btnTambahProduk.setBackground(new java.awt.Color(102, 102, 255));
        btnTambahProduk.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        btnTambahProduk.setForeground(new java.awt.Color(255, 255, 255));
        btnTambahProduk.setText("Tambah");
        btnTambahProduk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahProdukActionPerformed(evt);
            }
        });

        btnUbahProduk.setBackground(new java.awt.Color(102, 102, 255));
        btnUbahProduk.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        btnUbahProduk.setForeground(new java.awt.Color(255, 255, 255));
        btnUbahProduk.setText("Ubah");
        btnUbahProduk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbahProdukActionPerformed(evt);
            }
        });

        btnHapusProduk.setBackground(new java.awt.Color(102, 102, 255));
        btnHapusProduk.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        btnHapusProduk.setForeground(new java.awt.Color(255, 255, 255));
        btnHapusProduk.setText("Hapus");
        btnHapusProduk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusProdukActionPerformed(evt);
            }
        });

        btnRefreshProduk.setBackground(new java.awt.Color(102, 102, 255));
        btnRefreshProduk.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        btnRefreshProduk.setForeground(new java.awt.Color(255, 255, 255));
        btnRefreshProduk.setText("Refresh");
        btnRefreshProduk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshProdukActionPerformed(evt);
            }
        });

        txtCariUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCariUserKeyReleased(evt);
            }
        });

        labelCariUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search_25px_1.png"))); // NOI18N

        Tabel2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NO", "KODE PRODUK", "NAMA PRODUK", "GAMBAR PRODUK", "KATEGORI PRODUK", "SUPPLIER", "HARGA JUAL", "HARGA BELI", "STOK PRODUK"
            }
        ));
        Tabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tabel2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(Tabel2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(btnTambahProduk, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnUbahProduk, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnHapusProduk, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnRefreshProduk, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 155, Short.MAX_VALUE)
                .addComponent(txtCariUser, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelCariUser)
                .addGap(46, 46, 46))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnTambahProduk, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnUbahProduk, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnHapusProduk, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnRefreshProduk, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtCariUser, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelCariUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 940, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 82, 940, 460));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("KASIR");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, 40));

        iconKeluar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logout_30px.png"))); // NOI18N
        iconKeluar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconKeluarMouseClicked(evt);
            }
        });
        jPanel1.add(iconKeluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 20, 30, 40));

        iconProfil.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        iconProfil.setForeground(new java.awt.Color(255, 255, 255));
        iconProfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/male_user_40px.png"))); // NOI18N
        iconProfil.setText("Satrio");
        jPanel1.add(iconProfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 20, -1, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 931, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTambahProdukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahProdukActionPerformed
        TambahProduk T = new TambahProduk(this, true);
        T.setVisible(true);
    }//GEN-LAST:event_btnTambahProdukActionPerformed

    private void txtCariUserKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCariUserKeyReleased
        String key = txtCariUser.getText();
        String w = "WHERE "
                + "kode_produk LIKE '%"+key+"%' "
                + "OR nama_produk LIKE '%"+key+"%' "
                + "OR gambar_produk LIKE '%"+key+"%' "
                + "OR kategori_produk LIKE '%"+key+"%'"
                + "OR supplier LIKE '%"+key+"%'"
                + "OR harga_jual LIKE '%"+key+"%'"
                + "OR harga_beli LIKE '%"+key+"%'"
                + "OR stok_produk LIKE '%"+key+"%'";
        viewProduk(w);
    }//GEN-LAST:event_txtCariUserKeyReleased

    private void btnRefreshProdukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshProdukActionPerformed
        txtCariUser.setText(""); 
        viewProduk(""); 
    }//GEN-LAST:event_btnRefreshProdukActionPerformed

    private void btnHapusProdukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusProdukActionPerformed
        int n = Tabel2.getSelectedRow();
        if(n != -1){
            int id = Integer.parseInt(Tabel2.getValueAt(n, 0).toString());
//            JOptionPane.showMessageDialog(this, id); 
            
            int pilihan = JOptionPane.showConfirmDialog(this, 
                    "Apakah Anda yakin untuk menghapus data user ini?",
                    "Hapus Data",JOptionPane.YES_NO_OPTION);
            if(pilihan == 0){
                String Q = "DELETE FROM produk WHERE id="+id+" ";
                try {
                    Connection K = Koneksi.conn();
                    Statement S = K.createStatement();
                    S.executeUpdate(Q);
                    viewProduk(""); 
                } catch (Exception e) {
                }
            }else {
                
            }
           
        }else {
            JOptionPane.showMessageDialog(this, "Anda belum memilih data"); 
        
        }
    }//GEN-LAST:event_btnHapusProdukActionPerformed

    private void btnUbahProdukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahProdukActionPerformed
        int n = Tabel2.getSelectedRow();
        if(n != -1){
            int id = Integer.parseInt(Tabel2.getValueAt(n, 0).toString());
            String KP = Tabel2.getValueAt(n, 2).toString();
            String NP = Tabel2.getValueAt(n, 3).toString();
            String GP = Tabel2.getValueAt(n, 4).toString();
            String KAP = Tabel2.getValueAt(n, 5).toString();
            String SUP = Tabel2.getValueAt(n, 6).toString();
            String HJ = Tabel2.getValueAt(n, 7).toString();
            String HB = Tabel2.getValueAt(n, 8).toString();
            String SP = Tabel2.getValueAt(n, 9).toString();
            UbahProduk U = new UbahProduk(this, true);
            U.setId(id);
            U.setKP(KP);
            U.setNP(NP);
            U.setGP(GP);
            U.setKAP(KAP);
            U.setSUP(SUP);
            U.setHJ(HJ);
            U.setHB(HB);
            U.setSP(SP);
            U.setVisible(true); 
        }
    }//GEN-LAST:event_btnUbahProdukActionPerformed

    private void iconKeluarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconKeluarMouseClicked
        keluar();
    }//GEN-LAST:event_iconKeluarMouseClicked

    private void labelDataProdukMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelDataProdukMouseClicked
       
    }//GEN-LAST:event_labelDataProdukMouseClicked

    private void labelDataUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelDataUserMouseClicked
        AdminPageUser frame = new AdminPageUser(); 
        frame.setVisible(true);               
        frame.setLocationRelativeTo(null);    

        dispose();
    }//GEN-LAST:event_labelDataUserMouseClicked

    private void Tabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabel2MouseClicked
        
    }//GEN-LAST:event_Tabel2MouseClicked

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
            java.util.logging.Logger.getLogger(KasirPageProduk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KasirPageProduk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KasirPageProduk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KasirPageProduk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KasirPageProduk().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JTable Tabel2;
    private javax.swing.JButton btnHapusProduk;
    private javax.swing.JButton btnRefreshProduk;
    private javax.swing.JButton btnTambahProduk;
    private javax.swing.JButton btnUbahProduk;
    private javax.swing.JLabel iconKeluar;
    private javax.swing.JLabel iconProfil;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelCariUser;
    private javax.swing.JLabel labelDataProduk;
    private javax.swing.JLabel labelDataUser;
    private javax.swing.JTextField txtCariUser;
    // End of variables declaration//GEN-END:variables

    public static void viewProduk(String where) {
        
        
        try {
            DefaultTableModel m = (DefaultTableModel) Tabel2.getModel();
            //m.getDataVector().removeAllElements();
            for (int i = m.getRowCount()-1; i >=0; i--) {
                m.removeRow(i); 
            }
            
            Connection K = Koneksi.conn();
            Statement S = K.createStatement();
            String Q = "SELECT * FROM produk "+where;
            ResultSet R = S.executeQuery(Q);
            int n = 1;
            while (R.next()) {                 
                int id = R.getInt("id");
                 	 	 	 	 	 	 	 	
                String kode_produk = R.getString("kode_produk");
                String nama_produk = R.getString("nama_produk"); 
                String gambar_produk = R.getString("gambar_produk");  
                String kategori_produk = R.getString("kategori_produk");
                String supplier = R.getString("supplier");
                String harga_jual = R.getString("harga_jual");
                String harga_beli = R.getString("harga_beli");
                String stok_produk = R.getString("stok_produk");
                Object[] data = {id, n, kode_produk, nama_produk, gambar_produk,
                        kategori_produk, supplier, harga_jual, harga_beli, stok_produk};
                m.addRow(data); 
                n++;
            }
            
            Tabel2.getColumnModel().getColumn(0).setMinWidth(0);
            Tabel2.getColumnModel().getColumn(0).setMaxWidth(0);
            
        } catch (Exception e) {
            //error handling
        }
    }
    
    private void keluar() {
    int confirm = JOptionPane.showConfirmDialog(this, 
        "Apakah Anda yakin ingin logout?", "Konfirmasi Logout", 
        JOptionPane.YES_NO_OPTION);
    
    if (confirm == JOptionPane.YES_OPTION) {
        this.dispose();
        
        Login loginForm = new Login();
        loginForm.setVisible(true);
        }
    }
}
