/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.EmergencyServices;

import Business.Enterprise.Enterprise;
import Business.GenerateEmail.GenerateEmail;
import Business.Main.EcoSystem;
import Business.Network.Network;
import Business.Organization.EmergencyServicesOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.EmergencyReq;
import Business.WorkQueue.RecieverWorkReq;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author chief_kmv
 */
public class EmergencyServicesMainArea extends javax.swing.JPanel {

    /**
     * Creates new form EmergencyServicesMainArea
     */
    private JPanel userProcessContainer;
    private EmergencyServicesOrganization organization;
    private GenerateEmail sendEmail=new GenerateEmail();
    private UserAccount userAccount;
    private EcoSystem business;

    public EmergencyServicesMainArea(JPanel userProcessContainer, UserAccount account, Organization organization, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.business = business;
        this.organization = (EmergencyServicesOrganization) organization;
        populateRequestTable();
        populateCombo();
        populateAmbulanceTable();
    }

    public void populateRequestTable() {
        DefaultTableModel model = (DefaultTableModel) workrequestTable.getModel();

        model.setRowCount(0);
        for (Network net : business.getNetworkList()) {
            for (Enterprise ent : net.getEnterpriseDirectory().getEnterpriseList()) {
                for (Organization organization : ent.getOrganizationDirectory().getOrganizationList()) {
                    for (WorkRequest request : organization.getWorkQueue().getWorkRequestList()) {
                        if (request.getStatus().equals("Sent to OPTC") || request.getStatus().equals("Sent Reciever") && request.getSender().getUsername().equals(userAccount.getUsername())) {

                            Object[] row = new Object[5];
                            row[0] = request;
                            row[1] = ((RecieverWorkReq) request).getDonor();
                            row[2] = ((RecieverWorkReq) request).getOrganReciever();
                            row[3] = request.getStatus();
                            model.addRow(row);
                        }
                    }
                }
            }
        }
    }

    public void populateAmbulanceTable() {
        DefaultTableModel model = (DefaultTableModel) emergencyRequestTable1.getModel();

        model.setRowCount(0);
        for (WorkRequest r : organization.getWorkQueue().getWorkRequestList()) {
            //System.out.println(r.getRequest_id());
            Object[] row = new Object[4];
            row[0] = r;
            row[1] = ((EmergencyReq) r).getOrganReciever();
            row[2] = ((EmergencyReq) r).getReceiver();
            row[3] = r.getStatus();
            model.addRow(row);
        }
    }

    public void populateCombo() {
        ambulanceCombo.removeAllItems();

        for (UserAccount user : organization.getUserAccountDirectory().getUserAccountList()) {
//            System.out.println(user.getRole().toString());
            if (user.getRole().toString().equals("Business.Role.EmergencyServicesRole")) {
                ambulanceCombo.addItem(user);
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        workrequestTable = new javax.swing.JTable();
        assignWork = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        emergencyRequestTable1 = new javax.swing.JTable();
        ambulanceCombo = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(247, 23, 53));
        jButton1.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jButton1.setText("Check Donor and Send Request");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, -1, -1));

        workrequestTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Request ID", "Donor Name", "Organ Reciever", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workrequestTable);
        if (workrequestTable.getColumnModel().getColumnCount() > 0) {
            workrequestTable.getColumnModel().getColumn(1).setHeaderValue("Organ Re");
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, -1, 90));

        assignWork.setBackground(new java.awt.Color(255, 159, 28));
        assignWork.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        assignWork.setText("Assign Work To Ambulance");
        assignWork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignWorkActionPerformed(evt);
            }
        });
        add(assignWork, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 360, -1, -1));

        emergencyRequestTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Request ID", "Organ Reciever", "Ambulance Driver", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(emergencyRequestTable1);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 430, -1, 90));

        ambulanceCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(ambulanceCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 300, 150, -1));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel1.setText("Assign Ambulance Driver:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, -1, -1));

        jButton2.setBackground(new java.awt.Color(255, 159, 28));
        jButton2.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jButton2.setText("Confirm Delivery");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 560, -1, -1));

        jButton3.setBackground(new java.awt.Color(65, 234, 212));
        jButton3.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jButton3.setText("Refresh Tables");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 210, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        CheckDonor processWorkRequestJPanel = new CheckDonor(userProcessContainer, userAccount, organization, business);
        userProcessContainer.add("processWorkRequestJPanel", processWorkRequestJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void assignWorkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignWorkActionPerformed
        // TODO add your handling code here:
        int selectedRow = workrequestTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row from the table to view details", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {

            RecieverWorkReq req = (RecieverWorkReq) workrequestTable.getValueAt(selectedRow, 0);
            if (req.getStatus().equals("Sent Reciever")) {
                EmergencyReq emergency = new EmergencyReq();
                emergency.setSender(userAccount);
                emergency.setReceiver((UserAccount) ambulanceCombo.getSelectedItem());
                emergency.setOrganReciever(req.getOrganReciever());
                emergency.setStatus("Requested Ambulance to Pick up Organ Reciever");
                organization.getWorkQueue().addRequest(emergency);
                sendEmail.generateEmail(req.getOrganReciever().getInfo().getEmail(), "Good News !!! We found organ for you. Get Ready. Ambulance will be at your door step soon ");
                populateAmbulanceTable();
            } else {
                JOptionPane.showMessageDialog(null, "Awaiting Reciever's Information from OPTC ");
            }

        }
    }//GEN-LAST:event_assignWorkActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int selectedRow = emergencyRequestTable1.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row from the table to view details", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {

            EmergencyReq emergency = (EmergencyReq) emergencyRequestTable1.getValueAt(selectedRow, 0);

            if (emergency.getStatus().equals("Organ Reciever Dropped at Hospital")) {
                emergency.setStatus("Go for the Operation !!!");
                ConfirmDelivery manageEmployeeJPanel = new ConfirmDelivery(userProcessContainer);
                userProcessContainer.add("manageEmployeeJPanel", manageEmployeeJPanel);

                CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                layout.next(userProcessContainer);
            } else if(emergency.getStatus().equals("Go for the Operation !!!")){
                JOptionPane.showMessageDialog(null, " Organ Reciever Processed");
            }else{
                JOptionPane.showMessageDialog(null, "Awaiting Organ Reciever");
            }

            populateAmbulanceTable();

        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        populateAmbulanceTable();
        populateRequestTable();
        populateCombo();
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox ambulanceCombo;
    private javax.swing.JButton assignWork;
    private javax.swing.JTable emergencyRequestTable1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable workrequestTable;
    // End of variables declaration//GEN-END:variables
}