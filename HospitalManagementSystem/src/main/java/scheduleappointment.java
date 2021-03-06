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
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import java.util.Date;  


public class scheduleappointment extends javax.swing.JFrame {
int flag=0;
    /**
     * Creates new form scheduleappointment
     */
    public scheduleappointment() {
     
//        DoctorBox.setEditable(false);
//        DoctorBox.setEditable(false);
//        VisitTypeBox.setEditable(false);
//        CategoryBox.setEditable(false);
        
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

        CloseAddPatientBtn = new javax.swing.JButton();
        PatientIDLabel = new javax.swing.JLabel();
        NameLabel = new javax.swing.JLabel();
        PhoneLabel = new javax.swing.JLabel();
        AgeLabel = new javax.swing.JLabel();
        GenderLabel = new javax.swing.JLabel();
        AddressLabel = new javax.swing.JLabel();
        EmailLabel = new javax.swing.JLabel();
        AllergiesLabel = new javax.swing.JLabel();
        PatientIDTxt = new javax.swing.JTextField();
        TimeBox = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        ReasonTxt = new javax.swing.JTextArea();
        SavePatientBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        DateBox = new com.toedter.calendar.JDateChooser();
        CategoryBox = new javax.swing.JComboBox<>();
        VisitTypeBox = new javax.swing.JComboBox<>();
        DoctorBox = new javax.swing.JComboBox<>();
        MinuteBox = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        PatientValidLabel = new javax.swing.JLabel();
        TimeBox2 = new javax.swing.JComboBox<>();
        MinuteBox2 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(450, 120));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(741, 535));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CloseAddPatientBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        CloseAddPatientBtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\trank\\OneDrive\\Documents\\NetBeansProjects\\HospitalManagementSystem\\src\\HMS ICON\\Close.png")); // NOI18N
        CloseAddPatientBtn.setText("Close");
        CloseAddPatientBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseAddPatientBtnActionPerformed(evt);
            }
        });
        getContentPane().add(CloseAddPatientBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 490, -1, -1));

        PatientIDLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        PatientIDLabel.setForeground(new java.awt.Color(102, 0, 102));
        PatientIDLabel.setText("Patient ID");
        getContentPane().add(PatientIDLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 70, 19));

        NameLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        NameLabel.setForeground(new java.awt.Color(102, 0, 102));
        NameLabel.setText("Date");
        getContentPane().add(NameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, 59, -1));

        PhoneLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        PhoneLabel.setForeground(new java.awt.Color(102, 0, 102));
        PhoneLabel.setText("Doctor");
        getContentPane().add(PhoneLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 50, -1));

        AgeLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        AgeLabel.setForeground(new java.awt.Color(102, 0, 102));
        AgeLabel.setText("Category");
        getContentPane().add(AgeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 60, -1));

        GenderLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        GenderLabel.setForeground(new java.awt.Color(102, 0, 102));
        GenderLabel.setText("Visit Type");
        getContentPane().add(GenderLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, -1, -1));

        AddressLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        AddressLabel.setForeground(new java.awt.Color(102, 0, 102));
        AddressLabel.setText("Start Time");
        getContentPane().add(AddressLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, -1, -1));

        EmailLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        EmailLabel.setForeground(new java.awt.Color(102, 0, 102));
        EmailLabel.setText("End Time");
        getContentPane().add(EmailLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, -1, -1));

        AllergiesLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        AllergiesLabel.setForeground(new java.awt.Color(102, 0, 102));
        AllergiesLabel.setText("Reason for visit");
        getContentPane().add(AllergiesLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 360, 100, -1));

        PatientIDTxt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        PatientIDTxt.setPreferredSize(new java.awt.Dimension(40, 21));
        getContentPane().add(PatientIDTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 340, -1));

        TimeBox.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        TimeBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19" }));
        TimeBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TimeBoxActionPerformed(evt);
            }
        });
        getContentPane().add(TimeBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, -1, -1));

        ReasonTxt.setColumns(20);
        ReasonTxt.setRows(5);
        jScrollPane1.setViewportView(ReasonTxt);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 350, 340, 120));

        SavePatientBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        SavePatientBtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\trank\\OneDrive\\Documents\\NetBeansProjects\\HospitalManagementSystem\\src\\HMS ICON\\save-icon--1.png")); // NOI18N
        SavePatientBtn.setText(" Save");
        SavePatientBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SavePatientBtnActionPerformed(evt);
            }
        });
        getContentPane().add(SavePatientBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 490, 100, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 153));
        jLabel1.setText("Schedule an appointment");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, -1, -1));
        getContentPane().add(DateBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 130, -1));

        CategoryBox.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        CategoryBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "General illness", "Dental issue", "Dermatology", "Eye Care", "Emergency", "Other", " " }));
        getContentPane().add(CategoryBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 340, -1));

        VisitTypeBox.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        VisitTypeBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "New Patient", "Return Patient" }));
        getContentPane().add(VisitTypeBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 340, -1));

        DoctorBox.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        DoctorBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dr. Will Wonka", "Dr. Adam Dudley", "Dr. Annie Nguyen", "Dr. Julius Reinhold", "Dr. Joseph Indiana", "Dr. Carlos Medel", "Dr. Lolong Donair" }));
        getContentPane().add(DoctorBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 340, -1));

        MinuteBox.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MinuteBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "15", "30", "45" }));
        getContentPane().add(MinuteBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 280, 50, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText(":");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, -1, -1));

        PatientValidLabel.setForeground(new java.awt.Color(204, 102, 0));
        getContentPane().add(PatientValidLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 90, -1, -1));

        TimeBox2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        TimeBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19" }));
        TimeBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TimeBox2ActionPerformed(evt);
            }
        });
        getContentPane().add(TimeBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, -1, -1));

        MinuteBox2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MinuteBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "15", "30", "45" }));
        getContentPane().add(MinuteBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 320, 50, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText(":");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 320, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\trank\\OneDrive\\Documents\\NetBeansProjects\\HospitalManagementSystem\\src\\HMS ICON\\bg.jpg")); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CloseAddPatientBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseAddPatientBtnActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_CloseAddPatientBtnActionPerformed

    private void SavePatientBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SavePatientBtnActionPerformed
        // TODO add your handling code here:
        String patientID = PatientIDTxt.getText();
        String doctor= (String)DoctorBox.getSelectedItem();
        String starttime =(String)TimeBox.getSelectedItem()+":"+(String)MinuteBox.getSelectedItem();
        String endtime =(String)TimeBox2.getSelectedItem()+":"+(String)MinuteBox2.getSelectedItem();
        String visittype= (String)VisitTypeBox.getSelectedItem();
        String category= (String)CategoryBox.getSelectedItem();
        String reason = ReasonTxt.getText();
        
        Date d = DateBox.getDate();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String date= sdf.format(d);
        
        
       
        try{
            Connection con = ConnectionProvider.getCon();
            Statement st= con.createStatement();
            st.executeUpdate("insert into appointment(patientID, doctor, category,visittype,date,startime,endtime,reason) values('"+patientID+"', '"+doctor+"','"+category+"','"+visittype+"','"+date+"','"+starttime+"','"+endtime+"','"+reason+"')");
            JOptionPane.showMessageDialog(null,"Appointment Booked");
            setVisible(false);
            new scheduleappointment().setVisible(true);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Patient ID is not existed");
        }
    }//GEN-LAST:event_SavePatientBtnActionPerformed

    private void TimeBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TimeBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TimeBoxActionPerformed

    private void TimeBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TimeBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TimeBox2ActionPerformed

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
            java.util.logging.Logger.getLogger(addnewpatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addnewpatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addnewpatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addnewpatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new scheduleappointment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddressLabel;
    private javax.swing.JLabel AgeLabel;
    private javax.swing.JLabel AllergiesLabel;
    private javax.swing.JComboBox<String> CategoryBox;
    private javax.swing.JButton CloseAddPatientBtn;
    private com.toedter.calendar.JDateChooser DateBox;
    private javax.swing.JComboBox<String> DoctorBox;
    private javax.swing.JLabel EmailLabel;
    private javax.swing.JLabel GenderLabel;
    private javax.swing.JComboBox<String> MinuteBox;
    private javax.swing.JComboBox<String> MinuteBox2;
    private javax.swing.JLabel NameLabel;
    private javax.swing.JLabel PatientIDLabel;
    private javax.swing.JTextField PatientIDTxt;
    private javax.swing.JLabel PatientValidLabel;
    private javax.swing.JLabel PhoneLabel;
    private javax.swing.JTextArea ReasonTxt;
    private javax.swing.JButton SavePatientBtn;
    private javax.swing.JComboBox<String> TimeBox;
    private javax.swing.JComboBox<String> TimeBox2;
    private javax.swing.JComboBox<String> VisitTypeBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
