/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.UNOS_Registry;



import Business.UserAccount.Donor;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author chief_kmv
 */
public class SeeDetails extends javax.swing.JPanel {

    /**
     * Creates new form SeeDetails
     */
    private JPanel userProcessContainer;
    private Donor account;
    public SeeDetails(Donor user,JPanel userProcessContainer ) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.account=user;
        populateFields();
    }

    public void populateFields(){
         nameTxt.setText(account.getInfo().getName());
        jXDatePicker1.setDate(account.getInfo().getDob());
        organTxt.setText(account.getMessage());
        resultTxt.setText(account.getLabTest().getTestResult());
        ssnTxt.setText(account.getInfo().getSsn());
        
        
        nameTxt.setEnabled(false);
        jXDatePicker1.setEnabled(false);
        organTxt.setEnabled(false);
        resultTxt.setEnabled(false);
        ssnTxt.setEnabled(false);

        try {
            String path = account.getInfo().getImage();

            if (path.isEmpty() || path == null || path.equals("")) {
                imageLabel.setText("Image Not Uploaded");
            } else {
                ImageIcon image = new ImageIcon(path);
                image.setImage(image.getImage().getScaledInstance(100, 150, Image.SCALE_DEFAULT));
                imageLabel.setIcon(image);
            }
            imageLabel.setText("");
        } catch (Exception e) {
            System.out.println("error");
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

        jLabel1 = new javax.swing.JLabel();
        resultTxt = new javax.swing.JTextField();
        nameTxt = new javax.swing.JTextField();
        organTxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        jXDatePicker1 = new org.jdesktop.swingx.JXDatePicker();
        jLabel7 = new javax.swing.JLabel();
        ssnTxt = new javax.swing.JTextField();
        imageLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel1.setText("Lab Test Result");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 340, -1, -1));
        add(resultTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 330, 120, -1));

        nameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTxtActionPerformed(evt);
            }
        });
        add(nameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 190, 120, -1));
        add(organTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 280, 120, -1));

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel2.setText("Name:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, -1, -1));

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel3.setText("Date of Birth:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, -1, -1));

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel4.setText("Organ Needed:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, -1, -1));

        backJButton.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        backJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/Images/Go-back-icon.png"))); // NOI18N
        backJButton.setText("Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 90, -1));
        add(jXDatePicker1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 240, -1, -1));

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel7.setText("SSN:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, -1, -1));
        add(ssnTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 150, 120, -1));

        imageLabel.setText("No Image Found");
        add(imageLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void nameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTxtActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel imageLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private org.jdesktop.swingx.JXDatePicker jXDatePicker1;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JTextField organTxt;
    private javax.swing.JTextField resultTxt;
    private javax.swing.JTextField ssnTxt;
    // End of variables declaration//GEN-END:variables
}
