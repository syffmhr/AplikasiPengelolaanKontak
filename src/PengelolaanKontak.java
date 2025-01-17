
import java.sql.ResultSet;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.ResultSet;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class PengelolaanKontak extends javax.swing.JFrame {

    /**
     * Creates new form PengelolaanKontak
     */
    public PengelolaanKontak() {
        initComponents();
        
        start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtPhone = new javax.swing.JTextField();
        txtCari = new javax.swing.JTextField();
        cmbCategory = new javax.swing.JComboBox<>();
        btnTambah = new javax.swing.JButton();
        btnUbah = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnEkspor = new javax.swing.JButton();
        btnImpor = new javax.swing.JButton();
        btnCari = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableContacts = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Aplikasi Pengelolaan Kontak", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 24))); // NOI18N
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("Nama :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(7, 7, 7, 7);
        jPanel1.add(jLabel1, gridBagConstraints);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("No Telp :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(7, 7, 7, 7);
        jPanel1.add(jLabel2, gridBagConstraints);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("Cari :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(7, 7, 7, 7);
        jPanel1.add(jLabel3, gridBagConstraints);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("Kategori :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(7, 7, 7, 7);
        jPanel1.add(jLabel4, gridBagConstraints);

        txtName.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(7, 7, 7, 7);
        jPanel1.add(txtName, gridBagConstraints);

        txtPhone.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtPhone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPhoneKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(7, 7, 7, 7);
        jPanel1.add(txtPhone, gridBagConstraints);

        txtCari.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(7, 7, 7, 7);
        jPanel1.add(txtCari, gridBagConstraints);

        cmbCategory.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        cmbCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Keluarga", "Teman", "Kerja" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(7, 7, 7, 7);
        jPanel1.add(cmbCategory, gridBagConstraints);

        btnTambah.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnTambah.setText("Tambah");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(7, 7, 7, 7);
        jPanel1.add(btnTambah, gridBagConstraints);

        btnUbah.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnUbah.setText("Ubah");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(7, 7, 7, 7);
        jPanel1.add(btnUbah, gridBagConstraints);

        btnHapus.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnHapus.setText("Hapus");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(7, 7, 7, 7);
        jPanel1.add(btnHapus, gridBagConstraints);

        btnEkspor.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnEkspor.setText("Ekspor");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(7, 7, 7, 7);
        jPanel1.add(btnEkspor, gridBagConstraints);

        btnImpor.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnImpor.setText("Import");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(7, 7, 7, 7);
        jPanel1.add(btnImpor, gridBagConstraints);

        btnCari.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnCari.setText("Cari");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(7, 7, 7, 7);
        jPanel1.add(btnCari, gridBagConstraints);

        tableContacts.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        tableContacts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NO", "Nama", "No. Telp", "Kategori"
            }
        ));
        jScrollPane1.setViewportView(tableContacts);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.insets = new java.awt.Insets(7, 7, 7, 7);
        jPanel1.add(jScrollPane1, gridBagConstraints);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        
    }//GEN-LAST:event_btnTambahActionPerformed

    private void txtPhoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPhoneKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c) && c != java.awt.event.KeyEvent.VK_BACK_SPACE) {
            evt.consume();
            JOptionPane.showMessageDialog(this, "Masukkan angka yang valid!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_txtPhoneKeyTyped

    private void loadKontak() {
        DefaultTableModel tableModel = (DefaultTableModel) tableContacts.getModel();
        tableModel.setRowCount(0); 
        try (ResultSet rs = Contact.getKontak()) {
            while (rs != null && rs.next()) {
                tableModel.addRow(new Object[]{
                        rs.getInt("id"),
                        rs.getString("nama"),
                        rs.getString("nomor"),
                        rs.getString("kategori")
                });
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    private class addKontakListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String nama = txtName.getText();
            String nomor = txtPhone.getText();
            String kategori = cmbCategory.getSelectedItem().toString();
            if (validasiNomor(nomor)) {
                if (!txtName.getText().isEmpty()) {
                    Contact.tambahKontak(new Contact(nama, nomor, kategori));
                    loadKontak();
                    bersihkanField();
                } else {
                    JOptionPane.showMessageDialog(null, "Nama tidak boleh kosong!");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Invalid phone number!");
            }
        }
    }

    private class ubahKontakListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            DefaultTableModel tableModel = (DefaultTableModel) tableContacts.getModel();
            int barisAktif = tableContacts.getSelectedRow();
            if (barisAktif >= 0) {
                String id = tableModel.getValueAt(barisAktif, 0).toString();
                String nama = txtName.getText();
                String nomor = txtPhone.getText();
                String kategori = cmbCategory.getSelectedItem().toString();
                if (validasiNomor(nomor)) {
                    Contact.ubahKontak(Integer.parseInt(id), new Contact(nama, nomor, kategori));
                    loadKontak();
                    bersihkanField();
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid phone number!");
                }
            }
        }
    }

    private class hapusKontakListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            DefaultTableModel tableModel = (DefaultTableModel) tableContacts.getModel();
            int barisAktif = tableContacts.getSelectedRow(); 
            if (barisAktif >= 0) {
                String id = tableModel.getValueAt(barisAktif, 0).toString(); 
                Contact.hapusKontak(Integer.parseInt(id));
                loadKontak();
                bersihkanField(); 
            }
        }
    }

    private class cariKontakListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            DefaultTableModel tableModel = (DefaultTableModel) tableContacts.getModel();
            String query = txtCari.getText();
            tableModel.setRowCount(0); 
            try (ResultSet rs = Contact.cariKontak(query)) {
                while (rs != null && rs.next()) {
                    tableModel.addRow(new Object[]{
                            rs.getInt("id"),
                            rs.getString("nama"),
                            rs.getString("nomor"),
                            rs.getString("kategori")
                    });
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
  
    private class eksporKontakListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            Contact.eksporKeCSV();
        }
    }

    private class imporKontakListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            Contact.imporDariCSV();
            loadKontak();
        }
    }

    private void bersihkanField() {
        txtName.setText("");
        txtPhone.setText("");
        cmbCategory.setSelectedIndex(0);
        tableContacts.clearSelection();
    }

    private boolean validasiNomor(String nomor) {
        return nomor.matches("\\d{10,15}");
    }
    
    private void start() {
        btnTambah.addActionListener(new addKontakListener());
        btnUbah.addActionListener(new ubahKontakListener());
        btnHapus.addActionListener(new hapusKontakListener());
        btnCari.addActionListener(new cariKontakListener());
        btnEkspor.addActionListener(new eksporKontakListener());
        btnImpor.addActionListener(new imporKontakListener());

        cmbCategory.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    String kategoriTerpilih = (String) cmbCategory.getSelectedItem();
                    String deskripsi = "";

                    switch (kategoriTerpilih) {
                        case "Keluarga":
                            deskripsi = "Kontak yang merupakan anggota keluarga.";
                            break;
                        case "Teman":
                            deskripsi = "Kontak yang merupakan teman pribadi.";
                            break;
                        case "Kerja":
                            deskripsi = "Kontak yang merupakan rekan kerja.";
                            break;
                    }
                    System.out.println(deskripsi);
                }
            }
        });

        tableContacts.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                DefaultTableModel tableModel = (DefaultTableModel) tableContacts.getModel();
                int barisAktif = tableContacts.getSelectedRow();
                if (barisAktif >= 0) {
                    txtName.setText(tableModel.getValueAt(barisAktif, 1).toString());
                    txtPhone.setText(tableModel.getValueAt(barisAktif, 2).toString());
                    cmbCategory.setSelectedItem(tableModel.getValueAt(barisAktif, 3).toString());
                }
            }
        });

        loadKontak();
    }
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
            java.util.logging.Logger.getLogger(PengelolaanKontak.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PengelolaanKontak.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PengelolaanKontak.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PengelolaanKontak.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PengelolaanKontak().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCari;
    private javax.swing.JButton btnEkspor;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnImpor;
    private javax.swing.JButton btnTambah;
    private javax.swing.JButton btnUbah;
    private javax.swing.JComboBox<String> cmbCategory;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableContacts;
    private javax.swing.JTextField txtCari;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhone;
    // End of variables declaration//GEN-END:variables
}
