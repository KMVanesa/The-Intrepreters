/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface_Airline;
import Business.Users.Admin;
import javax.swing.JPanel;
import Business.Users.Airliner;
import Business.Flight;
import UserInterface_Admin.AdminMngWorkAreaJPanel;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Abhi
 */
public class AirlinerScreen extends javax.swing.JPanel {

    /**
     * Creates new form AirlinerScreen
     */
    private JPanel rightPanel;
    private Admin travelAgency;
    public AirlinerScreen(JPanel rightPanel,Admin travelAgency){
        this.rightPanel=rightPanel;
        this.travelAgency=travelAgency;
        initComponents();
        
    }
    
     public void populateAirlinersTable(){
        DefaultTableModel dtm = (DefaultTableModel) tblAirliner.getModel();
        dtm.setRowCount(0);
        for(Airliner airliner: travelAgency.getAirDir().getAirlinerList()) {
            Object[] row = new Object[3];
            row[0]=airliner;
            row[1]=airliner.getAirlinerHeadquaters();
            row[2]=airliner.getAirlinerFleetSize();
            
            dtm.addRow(row);
        }
    }
         public void calculateFleetSize(){
        int count = 0;
        for(Airliner airliner: travelAgency.getAirDir().getAirlinerList()){
            for(Flight flight:airliner.getFlightList()){
                if(airliner.getAirlinerName().equals(flight.getAirlinerName())){
                    count++;
                }
            }
            airliner.setAirlinerFleetSize(count);
            count = 0;
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblAirliner = new javax.swing.JTable();
        lblHeading = new javax.swing.JLabel();
        btnCreateNewAirliner = new javax.swing.JButton();
        btnViewAirlinerDetails = new javax.swing.JButton();
        btnDeleteAirliner = new javax.swing.JButton();
        btnSearchAirliner = new javax.swing.JButton();
        txtSearchAirliner = new javax.swing.JTextField();
        btnAddFlight = new javax.swing.JButton();
        btnClearSearch = new javax.swing.JButton();

        tblAirliner.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Headquarters", "Fleet Size"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblAirliner);

        lblHeading.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        lblHeading.setForeground(new java.awt.Color(78, 114, 175));
        lblHeading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHeading.setText("MANAGE AIRLINERS");

        btnCreateNewAirliner.setBackground(new java.awt.Color(245, 245, 246));
        btnCreateNewAirliner.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnCreateNewAirliner.setForeground(new java.awt.Color(78, 114, 175));
        btnCreateNewAirliner.setText("Create new Airliner");
        btnCreateNewAirliner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateNewAirlinerActionPerformed(evt);
            }
        });

        btnViewAirlinerDetails.setBackground(new java.awt.Color(245, 245, 246));
        btnViewAirlinerDetails.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnViewAirlinerDetails.setForeground(new java.awt.Color(78, 114, 175));
        btnViewAirlinerDetails.setText("View Airliner Details");
        btnViewAirlinerDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewAirlinerDetailsActionPerformed(evt);
            }
        });

        btnDeleteAirliner.setBackground(new java.awt.Color(245, 245, 246));
        btnDeleteAirliner.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnDeleteAirliner.setForeground(new java.awt.Color(78, 114, 175));
        btnDeleteAirliner.setText("Delete Airliner");
        btnDeleteAirliner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteAirlinerActionPerformed(evt);
            }
        });

        btnSearchAirliner.setBackground(new java.awt.Color(245, 245, 246));
        btnSearchAirliner.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnSearchAirliner.setForeground(new java.awt.Color(78, 114, 175));
        btnSearchAirliner.setText("Search Airliner");
        btnSearchAirliner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchAirlinerActionPerformed(evt);
            }
        });

        txtSearchAirliner.setBackground(new java.awt.Color(245, 245, 246));
        txtSearchAirliner.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        btnAddFlight.setBackground(new java.awt.Color(245, 245, 246));
        btnAddFlight.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnAddFlight.setForeground(new java.awt.Color(78, 114, 175));
        btnAddFlight.setText("Add Flight to Airliner");
        btnAddFlight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddFlightActionPerformed(evt);
            }
        });

        btnClearSearch.setBackground(new java.awt.Color(245, 245, 246));
        btnClearSearch.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnClearSearch.setForeground(new java.awt.Color(78, 114, 175));
        btnClearSearch.setText("Clear Search");
        btnClearSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblHeading, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(245, 245, 245)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane1)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnCreateNewAirliner)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnViewAirlinerDetails)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btnDeleteAirliner, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(btnAddFlight, javax.swing.GroupLayout.PREFERRED_SIZE, 684, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtSearchAirliner, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnClearSearch, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnSearchAirliner, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(236, 236, 236)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(lblHeading)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCreateNewAirliner, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnViewAirlinerDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeleteAirliner, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearchAirliner, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearchAirliner, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnClearSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAddFlight, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(106, 106, 106))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateNewAirlinerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateNewAirlinerActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout)rightPanel.getLayout();
        rightPanel.add(new NewAirline(rightPanel, travelAgency));
        layout.next(rightPanel);
      
    }//GEN-LAST:event_btnCreateNewAirlinerActionPerformed

    private void btnViewAirlinerDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewAirlinerDetailsActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout)rightPanel.getLayout();
        rightPanel.add(new UpdateFlight(rightPanel, travelAgency));
        layout.next(rightPanel);
      
    }//GEN-LAST:event_btnViewAirlinerDetailsActionPerformed

    private void btnDeleteAirlinerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteAirlinerActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblAirliner.getSelectedRow();
        if(selectedRow  >= 0) {
           int dialogButton = JOptionPane.YES_NO_OPTION;
           int dialogResult = JOptionPane.showConfirmDialog(null,"Would you like to delete the airliner details ?","Warning",dialogButton);
           if(dialogResult == JOptionPane.YES_OPTION) {
               Airliner airliner = (Airliner)tblAirliner.getValueAt(selectedRow,0);
               travelAgency.getAirDir().deleteAirliner(airliner);
               populateAirlinersTable();
            }
        }
        else {
            JOptionPane.showMessageDialog(null, "Please select a row from table first","Warning",JOptionPane.WARNING_MESSAGE);
        }
       
    }//GEN-LAST:event_btnDeleteAirlinerActionPerformed

    private void btnSearchAirlinerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchAirlinerActionPerformed
        // TODO add your handling code here:
        try{
           
        int selectedRow = tblAirliner.getSelectedRow();
        if(selectedRow<0) {
             JOptionPane.showMessageDialog(null, "Please select a row from table first to view flight details","Warning",JOptionPane.WARNING_MESSAGE);
         }
        else{
        Airliner airliner = (Airliner)tblAirliner.getValueAt(selectedRow,0);
        CardLayout layout = (CardLayout)rightPanel.getLayout();
        rightPanel.add(new NewFlight(rightPanel, travelAgency));
        layout.next(rightPanel);
        
        }

        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Please select a row from table first to view flight details","Warning",JOptionPane.WARNING_MESSAGE);
        }
      
        
    }//GEN-LAST:event_btnSearchAirlinerActionPerformed

    private void btnAddFlightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddFlightActionPerformed
        // TODO add your handling code here:
         try{
           
        int selectedRow = tblAirliner.getSelectedRow();
        if(selectedRow<0) {
             JOptionPane.showMessageDialog(null, "Please select a row from table first to view flight details","Warning",JOptionPane.WARNING_MESSAGE);
         }
        else{
        Airliner airliner = (Airliner)tblAirliner.getValueAt(selectedRow,0);
        CardLayout layout = (CardLayout)rightPanel.getLayout();
        rightPanel.add(new NewFlight(rightPanel, travelAgency));
        layout.next(rightPanel);
        }

        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Please select a row from table first to view flight details","Warning",JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_btnAddFlightActionPerformed

    private void btnClearSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearSearchActionPerformed
        // TODO add your handling code here:
      populateAirlinersTable();
        btnClearSearch.setEnabled(false);
        btnSearchAirliner.setEnabled(true);
        txtSearchAirliner.setText("");
    }//GEN-LAST:event_btnClearSearchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddFlight;
    private javax.swing.JButton btnClearSearch;
    private javax.swing.JButton btnCreateNewAirliner;
    private javax.swing.JButton btnDeleteAirliner;
    private javax.swing.JButton btnSearchAirliner;
    private javax.swing.JButton btnViewAirlinerDetails;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblHeading;
    private javax.swing.JTable tblAirliner;
    private javax.swing.JTextField txtSearchAirliner;
    // End of variables declaration//GEN-END:variables
}
