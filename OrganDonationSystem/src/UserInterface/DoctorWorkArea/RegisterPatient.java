/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.DoctorWorkArea;

import Business.Enterprise.Enterprise;
import Business.LabTest.LabTest;
import Business.PatientInfo.PatientInfo;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.DoctorRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;

/**
 *
 * @author chief_kmv
 */
public class RegisterPatient extends javax.swing.JPanel {

    /**
     * Creates new form RegisterPatient
     */
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccount userAccount;

    public RegisterPatient(JPanel userProcessContainer, UserAccount userAccount, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.enterprise = enterprise;
        populateTable();
    }

    public void populateTable() {

        typeCombo.addItem("Reciever");
        typeCombo.addItem("Donor");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RegisterBtn = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        weightTxt = new javax.swing.JTextField();
        nameTxt = new javax.swing.JTextField();
        genderTxt = new javax.swing.JTextField();
        typeCombo = new javax.swing.JComboBox<>();
        dobPicker = new org.jdesktop.swingx.JXDatePicker();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ssnTxt = new javax.swing.JTextField();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        RegisterBtn.setText("Register Patient");
        RegisterBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterBtnActionPerformed(evt);
            }
        });
        add(RegisterBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 510, -1, -1));

        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 23, -1, -1));

        jLabel1.setText("Gender");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, -1, -1));

        jLabel2.setText("Name");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, -1, -1));

        jLabel4.setText("Weight");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, -1, -1));

        jLabel6.setText("Type");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 330, -1, -1));

        weightTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                weightTxtActionPerformed(evt);
            }
        });
        add(weightTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 280, 110, -1));

        nameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTxtActionPerformed(evt);
            }
        });
        add(nameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, 110, -1));

        genderTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderTxtActionPerformed(evt);
            }
        });
        add(genderTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 200, 110, -1));

        add(typeCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 330, 110, -1));
        add(dobPicker, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 240, -1, -1));

        jLabel5.setText("Date of Birth");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, -1, -1));

        jLabel3.setText("SSN:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, -1, -1));
        add(ssnTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, 110, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void weightTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_weightTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_weightTxtActionPerformed

    private void nameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTxtActionPerformed

    private void genderTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genderTxtActionPerformed

    private void RegisterBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterBtnActionPerformed
        // TODO add your handling code here:
        PatientInfo patient = new PatientInfo();
        DoctorRequest req = new DoctorRequest();
        LabTest labtest = new LabTest();
        patient.setName(nameTxt.getText());
        patient.setSsn(ssnTxt.getText());
        patient.setDob(dobPicker.getDate());
        patient.setGender(genderTxt.getText());
        patient.setWeight(weightTxt.getText());
        patient.setType((String) typeCombo.getSelectedItem());
        labtest.setTestResult("Awaiting");
        req.setRequest_id("");
        req.setPatient(patient);
        req.setLabtest(labtest);
        userAccount.getWorkQueue().addRequest(req);


    }//GEN-LAST:event_RegisterBtnActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        DoctorMainPanel dwjp = (DoctorMainPanel) component;
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton RegisterBtn;
    private org.jdesktop.swingx.JXDatePicker dobPicker;
    private javax.swing.JTextField genderTxt;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JTextField ssnTxt;
    private javax.swing.JComboBox<String> typeCombo;
    private javax.swing.JTextField weightTxt;
    // End of variables declaration//GEN-END:variables
}