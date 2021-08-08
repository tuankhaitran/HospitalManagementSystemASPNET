/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author trank
 */
import Project.ConnectionProvider;
import java.sql.*;
import net.proteanit.sql.DbUtils;
import javax.swing.JOptionPane;

public class ViewSchedule extends javax.swing.JFrame {

    /**
     * Creates new form ViewSchedule
     */
    public ViewSchedule() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        AppointmentTable = new javax.swing.JTable();
        CloseBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(330, 100));
        setUndecorated(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AppointmentTable.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        AppointmentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        AppointmentTable.setRowHeight(30);
        jScrollPane1.setViewportView(AppointmentTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 58, 737, 170));

        CloseBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        CloseBtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\trank\\OneDrive\\Documents\\NetBeansProjects\\HospitalManagementSystem\\src\\HMS ICON\\Close.png")); // NOI18N
        CloseBtn.setText("Close");
        CloseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseBtnActionPerformed(evt);
            }
        });
        getContentPane().add(CloseBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(666, 445, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 153));
        jLabel1.setText("View appointments");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(281, 11, 273, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\trank\\OneDrive\\Documents\\NetBeansProjects\\HospitalManagementSystem\\src\\HMS ICON\\bg.jpg")); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -290, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        try {
            Connection con = ConnectionProvider.getCon();
            Statement st= con.createStatement();
            ResultSet rs= st.executeQuery("Select * from appointment order by appointmentID");
            AppointmentTable.setModel(DbUtils.resultSetToTableModel(rs));
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_formComponentShown

    private void CloseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseBtnActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_CloseBtnActionPerformed

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
            java.util.logging.Logger.getLogger(listpatients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(listpatients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(listpatients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(listpatients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewSchedule().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable AppointmentTable;
    private javax.swing.JButton CloseBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
