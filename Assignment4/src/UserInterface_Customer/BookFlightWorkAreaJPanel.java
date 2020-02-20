/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface_Customer;



/**
 *
 * @author Abhi
 */
public class BookFlightWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form BookFlightWorkAreaJPanel
     */
    
    
     
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBack = new javax.swing.JButton();
        lblFrom = new javax.swing.JLabel();
        lblMinPrice = new javax.swing.JLabel();
        lblMaxPrice = new javax.swing.JLabel();
        lblTo = new javax.swing.JLabel();
        lblTime = new javax.swing.JLabel();
        btnBookAFlight = new javax.swing.JButton();
        lblPastBookings = new javax.swing.JLabel();
        txtMinPrice = new javax.swing.JTextField();
        txtMaxPrice = new javax.swing.JTextField();
        comboBoxTime = new javax.swing.JComboBox<String>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbltravelagency = new javax.swing.JTable();
        btnSearchFlight = new javax.swing.JButton();
        comboBoxDestination = new javax.swing.JComboBox<String>();
        comboBoxSource = new javax.swing.JComboBox<String>();
        btnClear = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1111, 765));

        btnBack.setBackground(new java.awt.Color(245, 245, 246));
        btnBack.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnBack.setForeground(new java.awt.Color(78, 114, 175));
        btnBack.setText("< Back");
        btnBack.setPreferredSize(new java.awt.Dimension(93, 31));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblFrom.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lblFrom.setForeground(new java.awt.Color(78, 114, 175));
        lblFrom.setText("From ");

        lblMinPrice.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lblMinPrice.setForeground(new java.awt.Color(78, 114, 175));
        lblMinPrice.setText("Min Price");

        lblMaxPrice.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lblMaxPrice.setForeground(new java.awt.Color(78, 114, 175));
        lblMaxPrice.setText("Max Price");

        lblTo.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lblTo.setForeground(new java.awt.Color(78, 114, 175));
        lblTo.setText("To");

        lblTime.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lblTime.setForeground(new java.awt.Color(78, 114, 175));
        lblTime.setText("Time");

        btnBookAFlight.setBackground(new java.awt.Color(245, 245, 246));
        btnBookAFlight.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnBookAFlight.setForeground(new java.awt.Color(78, 114, 175));
        btnBookAFlight.setText("Book Flight");
        btnBookAFlight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookAFlightActionPerformed(evt);
            }
        });

        lblPastBookings.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        lblPastBookings.setForeground(new java.awt.Color(78, 114, 175));
        lblPastBookings.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastBookings.setText("SELECT BEST FLIGHT");

        txtMinPrice.setBackground(new java.awt.Color(245, 245, 246));
        txtMinPrice.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtMinPrice.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtMaxPrice.setBackground(new java.awt.Color(245, 245, 246));
        txtMaxPrice.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtMaxPrice.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        comboBoxTime.setBackground(new java.awt.Color(245, 245, 246));
        comboBoxTime.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        comboBoxTime.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Morning", "Afternoon", "Evening ", "Night" }));

        tbltravelagency.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Airliner", "Flight Number", "Source", "Destination", "Departure time", "Arrival Time", "Price", "Available Seats"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tbltravelagency);
        if (tbltravelagency.getColumnModel().getColumnCount() > 0) {
            tbltravelagency.getColumnModel().getColumn(1).setResizable(false);
            tbltravelagency.getColumnModel().getColumn(2).setResizable(false);
            tbltravelagency.getColumnModel().getColumn(3).setResizable(false);
            tbltravelagency.getColumnModel().getColumn(4).setResizable(false);
            tbltravelagency.getColumnModel().getColumn(5).setResizable(false);
            tbltravelagency.getColumnModel().getColumn(6).setResizable(false);
            tbltravelagency.getColumnModel().getColumn(7).setResizable(false);
        }

        btnSearchFlight.setBackground(new java.awt.Color(245, 245, 246));
        btnSearchFlight.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnSearchFlight.setForeground(new java.awt.Color(78, 114, 175));
        btnSearchFlight.setText("Search Flight");
        btnSearchFlight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchFlightActionPerformed(evt);
            }
        });

        comboBoxDestination.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxDestinationActionPerformed(evt);
            }
        });

        comboBoxSource.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxSourceActionPerformed(evt);
            }
        });

        btnClear.setBackground(new java.awt.Color(245, 245, 246));
        btnClear.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnClear.setForeground(new java.awt.Color(78, 114, 175));
        btnClear.setText("Clear Search");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblPastBookings, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 117, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 825, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(btnBookAFlight, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(450, 450, 450))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblMinPrice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblTime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(40, 40, 40)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(comboBoxSource, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtMinPrice, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(comboBoxTime, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(170, 170, 170)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblTo, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblMaxPrice))
                                    .addGap(45, 45, 45)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(comboBoxDestination, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtMaxPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnSearchFlight, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnClear)))
                            .addGap(141, 141, 141)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPastBookings)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBoxDestination, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxSource, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMaxPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMinPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMinPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMaxPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(lblTime, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(comboBoxTime)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnSearchFlight, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(btnBookAFlight, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnBookAFlightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookAFlightActionPerformed
        // TODO add your handling code here:
        
         
    }//GEN-LAST:event_btnBookAFlightActionPerformed

    private void btnSearchFlightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchFlightActionPerformed
        // TODO add your handling code here:
     
    }//GEN-LAST:event_btnSearchFlightActionPerformed

    private void comboBoxDestinationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxDestinationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxDestinationActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_btnClearActionPerformed

    private void comboBoxSourceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxSourceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxSourceActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnBookAFlight;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnSearchFlight;
    private javax.swing.JComboBox<String> comboBoxDestination;
    private javax.swing.JComboBox<String> comboBoxSource;
    private javax.swing.JComboBox<String> comboBoxTime;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblFrom;
    private javax.swing.JLabel lblMaxPrice;
    private javax.swing.JLabel lblMinPrice;
    private javax.swing.JLabel lblPastBookings;
    private javax.swing.JLabel lblTime;
    private javax.swing.JLabel lblTo;
    private javax.swing.JTable tbltravelagency;
    private javax.swing.JTextField txtMaxPrice;
    private javax.swing.JTextField txtMinPrice;
    // End of variables declaration//GEN-END:variables
}