/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prak9;

import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */
public class FrameBebas extends javax.swing.JFrame implements ListSelectionListener{
    DefaultTableModel dtm;
    private boolean Baru;
    private int lastSelectionIndex;

    /**
     * Creates new form FrameBebas
     */
    public FrameBebas() {
        initComponents();
        dataTabel.getSelectionModel().addListSelectionListener(this);
        dtm = (DefaultTableModel)dataTabel.getModel();
    }
    
    private void disableControl(){
        batalB.setEnabled(false);
        simpanB.setEnabled(false);
        tambahB.setEnabled(true);
        ubahB.setEnabled(false);
        hapusB.setEnabled(false);
        
        dataTabel.setEnabled(true);
        
        noIDTF.setEditable(false);
        namaObatTF.setEditable(false);
        
        stokObatS.setEnabled(false);
        jenisObatCB.setEnabled(false);
        
        noIDTF.setText(" ");
        namaObatTF.setText(" ");
        
        stokObatS.setValue(0);
        jenisObatCB.setSelectedIndex(0);
        
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
        jLabel1 = new javax.swing.JLabel();
        noIDTF = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        namaObatTF = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        stokObatS = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        jenisObatCB = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        batalB = new javax.swing.JButton();
        simpanB = new javax.swing.JButton();
        tambahB = new javax.swing.JButton();
        ubahB = new javax.swing.JButton();
        hapusB = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        dataTabel = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        exitMenuItem = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new java.awt.GridLayout(4, 2));

        jLabel1.setText("No ID");
        jPanel1.add(jLabel1);

        noIDTF.setEditable(false);
        jPanel1.add(noIDTF);

        jLabel2.setText("Nama Obat");
        jPanel1.add(jLabel2);

        namaObatTF.setEditable(false);
        jPanel1.add(namaObatTF);

        jLabel3.setText("Stok Obat");
        jPanel1.add(jLabel3);

        stokObatS.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        stokObatS.setEnabled(false);
        jPanel1.add(stokObatS);

        jLabel4.setText("Jenis Obat");
        jPanel1.add(jLabel4);

        jenisObatCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Pilih-", "Pil", "Kapsul", "Puyer", "Cair" }));
        jenisObatCB.setEnabled(false);
        jPanel1.add(jenisObatCB);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        batalB.setText("Batal");
        batalB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                batalBActionPerformed(evt);
            }
        });
        jPanel2.add(batalB);

        simpanB.setText("Simpan");
        simpanB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanBActionPerformed(evt);
            }
        });
        jPanel2.add(simpanB);

        tambahB.setText("Tambah");
        tambahB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahBActionPerformed(evt);
            }
        });
        jPanel2.add(tambahB);

        ubahB.setText("Ubah");
        ubahB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ubahBActionPerformed(evt);
            }
        });
        jPanel2.add(ubahB);

        hapusB.setText("Hapus");
        hapusB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusBActionPerformed(evt);
            }
        });
        jPanel2.add(hapusB);

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);
        getContentPane().add(jPanel3, java.awt.BorderLayout.PAGE_END);

        dataTabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No ID", "Nama Obat", "Stok Obat", "Jenis Obat"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(dataTabel);

        getContentPane().add(jScrollPane2, java.awt.BorderLayout.PAGE_END);

        jMenu1.setText("File");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem1.setText("Open");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);
        jMenu1.add(jSeparator1);

        exitMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(exitMenuItem);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("About");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
       JOptionPane.showMessageDialog(null, "Hello");
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void tambahBActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        batalB.setEnabled(true);
        simpanB.setEnabled(true);
        tambahB.setEnabled(false);
        ubahB.setEnabled(false);
        hapusB.setEnabled(false);
        
        dataTabel.setEnabled(false);
        
        noIDTF.setEditable(true);
        namaObatTF.setEditable(true);
        
        stokObatS.setEnabled(true);
        jenisObatCB.setEnabled(true);
        
        noIDTF.setText(" ");
        namaObatTF.setText(" ");
        
        stokObatS.setValue(0);
        jenisObatCB.setSelectedIndex(0);
        
        Baru = true;
    }

    private void simpanBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanBActionPerformed
        // TODO add your handling code here:
        String noID = noIDTF.getText();
        String namaObat = namaObatTF.getText();
        Integer stokObat = (Integer) stokObatS.getValue();
        String jenisObat = (String) jenisObatCB.getSelectedItem();
        System.out.println("No ID = " + noID);
        System.out.println("Nama Obat = " + namaObat);
        System.out.println("Stok Obat = " + stokObat);
        System.out.println("Jenis Obat = " + jenisObat);
        
        if(Baru)
        {
            dtm.addRow(new Object [] {noID, namaObat, stokObat, jenisObat});
        }
        else
        {
            dtm.setValueAt(noID, lastSelectionIndex, 0);
            dtm.setValueAt(namaObat, lastSelectionIndex, 1);
            dtm.setValueAt(stokObat, lastSelectionIndex, 2);
            dtm.setValueAt(jenisObat, lastSelectionIndex, 3);
        }
           
        disableControl();
    }//GEN-LAST:event_simpanBActionPerformed

    private void batalBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_batalBActionPerformed
        // TODO add your handling code here:
        disableControl();
    }//GEN-LAST:event_batalBActionPerformed

    private void ubahBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ubahBActionPerformed
        // TODO add your handling code here:
        batalB.setEnabled(true);
        simpanB.setEnabled(true);
        tambahB.setEnabled(false);
        ubahB.setEnabled(false);
        hapusB.setEnabled(false);
        
        dataTabel.setEnabled(false);
        
        noIDTF.setEditable(true);
        namaObatTF.setEditable(true);
        
        stokObatS.setEnabled(true);
        jenisObatCB.setEnabled(true);
        
        Baru = false;
    }

    private void hapusBActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
         if (lastSelectionIndex == -1)
        {
            return;
        }
        dtm.removeRow(lastSelectionIndex);
        
        
//        dtm.removeTableModelListener(dataTabel);
//        dtm.removeRow(lastSelectionIndex);
//        dtm.addTableModelListener(dataTabel);
//        int Yes = JOptionPane.showConfirmDialog(null, "Apakah Yakin ingin Menghapus?" + lastSelectionIndex + "", "Konfirmasi", JOptionPane.YES_NO_OPTION);
//        
//        if(Yes == 0){
//            
//           
//        }
        
        
    }//GEN-LAST:event_hapusBActionPerformed

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
            java.util.logging.Logger.getLogger(FrameBebas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameBebas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameBebas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameBebas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameBebas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton batalB;
    private javax.swing.JTable dataTabel;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JButton hapusB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JComboBox<String> jenisObatCB;
    private javax.swing.JTextField namaObatTF;
    private javax.swing.JTextField noIDTF;
    private javax.swing.JButton simpanB;
    private javax.swing.JSpinner stokObatS;
    private javax.swing.JButton tambahB;
    private javax.swing.JButton ubahB;
    // End of variables declaration//GEN-END:variables

    @Override
    public void valueChanged(ListSelectionEvent e) {
        ListSelectionModel lsm = (ListSelectionModel) e.getSource();
        lastSelectionIndex = lsm.getMinSelectionIndex();
        if (lastSelectionIndex == -1)
        {
            noIDTF.setText("");
            namaObatTF.setText("");
            stokObatS.setValue(0);
            jenisObatCB.setSelectedItem(-1);

            ubahB.setEnabled(false);
            hapusB.setEnabled(false);
            return;
        }

        noIDTF.setText((String)dtm.getValueAt(lastSelectionIndex, 0));
        namaObatTF.setText((String)dtm.getValueAt(lastSelectionIndex, 1));
        stokObatS.setValue(dtm.getValueAt(lastSelectionIndex, 2));
        jenisObatCB.setSelectedItem(dtm.getValueAt(lastSelectionIndex, 3));
        
        ubahB.setEnabled(true);
        hapusB.setEnabled(true);
    }
//        ListSelectionModel lsm = (ListSelectionModel) e.getSource();
//        lastSelectionIndex = lsm.getMinSelectionIndex();
//        noIDTF.setText((String)dtm.getValueAt(lastSelectionIndex, 0));
//        namaObatTF.setText((String)dtm.getValueAt(lastSelectionIndex, 1));
//        stokObatS.setValue(dtm.getValueAt(lastSelectionIndex, 2));
//        jenisObatCB.setSelectedItem(dtm.getValueAt(lastSelectionIndex, 3));
//        
//        ubahB.setEnabled(true);
//        hapusB.setEnabled(true);
    }


