/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.farhan.pemesanan;

import javax.swing.JOptionPane;

/**
 *
 * @author paan
 */
public class formPemesanan extends javax.swing.JFrame {
    // Harga menu
    private final int HARGA_AMERICANO = 20000;
    private final int HARGA_CHICKEN_STEAK = 25000;
    private final int HARGA_UDANG = 16000;
    private final int HARGA_AIS_KRIM = 10000;

    /**
     * Creates new form formPemesanan
     */
    public formPemesanan() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAlamat = new javax.swing.JTextArea();
        txtNoTelp = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        cbAmericano = new javax.swing.JCheckBox();
        cbChickenSteak = new javax.swing.JCheckBox();
        cbUdang = new javax.swing.JCheckBox();
        cbAisKrim = new javax.swing.JCheckBox();
        jLabel8 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JLabel();
        btnTambah = new javax.swing.JButton();
        txtAreaOutput = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();
        btnClear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Form Pemesanan");

        jLabel1.setFont(new java.awt.Font("Marker Felt", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Aplikasi Pemesanan");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Data Customer", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Avenir Next", 1, 13))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Avenir Next", 0, 13)); // NOI18N
        jLabel2.setText("Nama:");

        jLabel3.setFont(new java.awt.Font("Avenir Next", 0, 13)); // NOI18N
        jLabel3.setText("Alamat:");

        jLabel4.setFont(new java.awt.Font("Avenir Next", 0, 13)); // NOI18N
        jLabel4.setText("No. telp:");

        txtNama.setFont(new java.awt.Font("Avenir Next", 0, 13)); // NOI18N

        txtAlamat.setColumns(20);
        txtAlamat.setFont(new java.awt.Font("Avenir Next", 0, 13)); // NOI18N
        txtAlamat.setRows(5);
        jScrollPane1.setViewportView(txtAlamat);

        txtNoTelp.setFont(new java.awt.Font("Avenir Next", 0, 13)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(53, 53, 53)
                        .addComponent(txtNama))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
                            .addComponent(txtNoTelp))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtNoTelp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pilih Menu", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Avenir Next", 1, 13))); // NOI18N

        cbAmericano.setFont(new java.awt.Font("Avenir Next", 0, 13)); // NOI18N
        cbAmericano.setText("Americano");
        cbAmericano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAmericanoActionPerformed(evt);
            }
        });

        cbChickenSteak.setFont(new java.awt.Font("Avenir Next", 0, 13)); // NOI18N
        cbChickenSteak.setText("Chicken Steak");
        cbChickenSteak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbChickenSteakActionPerformed(evt);
            }
        });

        cbUdang.setFont(new java.awt.Font("Avenir Next", 0, 13)); // NOI18N
        cbUdang.setText("Udang Mursid");
        cbUdang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbUdangActionPerformed(evt);
            }
        });

        cbAisKrim.setFont(new java.awt.Font("Avenir Next", 0, 13)); // NOI18N
        cbAisKrim.setText("Ais Krim");
        cbAisKrim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAisKrimActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbAisKrim)
                    .addComponent(cbChickenSteak)
                    .addComponent(cbAmericano)
                    .addComponent(cbUdang))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(cbAmericano)
                .addGap(18, 18, 18)
                .addComponent(cbChickenSteak)
                .addGap(18, 18, 18)
                .addComponent(cbUdang)
                .addGap(18, 18, 18)
                .addComponent(cbAisKrim)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel8.setFont(new java.awt.Font("Avenir Next", 0, 13)); // NOI18N
        jLabel8.setText("Total Bayar");

        txtTotal.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 24)); // NOI18N
        txtTotal.setForeground(new java.awt.Color(51, 51, 51));
        txtTotal.setText("0");

        btnTambah.setBackground(new java.awt.Color(0, 102, 204));
        btnTambah.setFont(new java.awt.Font("Avenir Next", 1, 13)); // NOI18N
        btnTambah.setForeground(new java.awt.Color(255, 255, 255));
        btnTambah.setText("Tambah");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        txtAreaOutput.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detail Pemesanan", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Avenir Next", 0, 13))); // NOI18N

        txtArea.setEditable(false);
        txtArea.setColumns(20);
        txtArea.setRows(5);
        txtAreaOutput.setViewportView(txtArea);

        btnClear.setFont(new java.awt.Font("Avenir Next", 1, 13)); // NOI18N
        btnClear.setText("Clear");
        btnClear.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        btnClear.setBorderPainted(false);
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtAreaOutput)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel8))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 41, Short.MAX_VALUE)
                                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(txtAreaOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        String nama = txtNama.getText();
        String alamat = txtAlamat.getText();
        String no_telp = txtNoTelp.getText();
        
        if (nama.isEmpty() || alamat.isEmpty() || no_telp.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Nama, Alamat, dan No Telepon harus diisi.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
        }

        if (!cbAmericano.isSelected() && !cbChickenSteak.isSelected() && !cbUdang.isSelected() && !cbAisKrim.isSelected()) {
            JOptionPane.showMessageDialog(null, "Pilih menu yang ingin dipesan.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int totalHarga = 0;
        StringBuilder receipt = new StringBuilder();

        receipt.append("Nama: " + nama + "\n");
        receipt.append("Alamat: " + alamat + "\n");
        receipt.append("No Telepon: " + no_telp + "\n");
        receipt.append("====================================\n");
        receipt.append("Pesanan anda: \n");

        if (cbAmericano.isSelected()) {
            receipt.append("Americano - Rp " + HARGA_AMERICANO + "\n");
            totalHarga += HARGA_AMERICANO;
        }
        if (cbChickenSteak.isSelected()) {
            receipt.append("Chicken Steak - Rp " + HARGA_CHICKEN_STEAK + "\n");
            totalHarga += HARGA_CHICKEN_STEAK;
        }
        if (cbUdang.isSelected()) {
            receipt.append("Udang - Rp " + HARGA_UDANG + "\n");
            totalHarga += HARGA_UDANG;
        }
        if (cbAisKrim.isSelected()) {
            receipt.append("Ais Krim - Rp " + HARGA_AIS_KRIM + "\n");
            totalHarga += HARGA_AIS_KRIM;
        }

        receipt.append("====================================\n");
        receipt.append("Total Harga: Rp " + totalHarga + "\n");

        txtArea.append(receipt.toString());

        txtNama.setText("");
        txtAlamat.setText("");
        txtNoTelp.setText("");
        txtTotal.setText("0");
        cbAmericano.setSelected(false);
        cbChickenSteak.setSelected(false);
        cbUdang.setSelected(false);
        cbAisKrim.setSelected(false);
    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        txtNama.setText("");
        txtAlamat.setText("");
        txtNoTelp.setText("");
        
        cbAmericano.setSelected(false);
        cbChickenSteak.setSelected(false);
        cbUdang.setSelected(false);
        cbAisKrim.setSelected(false);
    
        txtTotal.setText("0");
        txtArea.setText("");
        
    }//GEN-LAST:event_btnClearActionPerformed

    private void cbAmericanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAmericanoActionPerformed
        // TODO add your handling code here:
        int total = Integer.parseInt(txtTotal.getText());

        if (cbAmericano.isSelected()) {
            total += HARGA_AMERICANO;
        } else {
            total -= HARGA_AMERICANO;
        }

        txtTotal.setText(String.valueOf(total));
    }//GEN-LAST:event_cbAmericanoActionPerformed

    private void cbChickenSteakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbChickenSteakActionPerformed
        // TODO add your handling code here:
        int total = Integer.parseInt(txtTotal.getText());

        if (cbChickenSteak.isSelected()) {
            total += HARGA_CHICKEN_STEAK;
        } else {
            total -= HARGA_CHICKEN_STEAK;
        }

        txtTotal.setText(String.valueOf(total));
    }//GEN-LAST:event_cbChickenSteakActionPerformed

    private void cbUdangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbUdangActionPerformed
        // TODO add your handling code here:
        int total = Integer.parseInt(txtTotal.getText());

        if (cbUdang.isSelected()) {
            total += HARGA_UDANG;
        } else {
            total -= HARGA_UDANG;
        }

        txtTotal.setText(String.valueOf(total));
    }//GEN-LAST:event_cbUdangActionPerformed

    private void cbAisKrimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAisKrimActionPerformed
        // TODO add your handling code here:
        int total = Integer.parseInt(txtTotal.getText());

        if (cbAisKrim.isSelected()) {
            total += HARGA_AIS_KRIM;
        } else {
            total -= HARGA_AIS_KRIM;
        }

        txtTotal.setText(String.valueOf(total));
    }//GEN-LAST:event_cbAisKrimActionPerformed

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
            java.util.logging.Logger.getLogger(formPemesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formPemesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formPemesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formPemesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formPemesanan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnTambah;
    private javax.swing.JCheckBox cbAisKrim;
    private javax.swing.JCheckBox cbAmericano;
    private javax.swing.JCheckBox cbChickenSteak;
    private javax.swing.JCheckBox cbUdang;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtAlamat;
    private javax.swing.JTextArea txtArea;
    private javax.swing.JScrollPane txtAreaOutput;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtNoTelp;
    private javax.swing.JLabel txtTotal;
    // End of variables declaration//GEN-END:variables
}
