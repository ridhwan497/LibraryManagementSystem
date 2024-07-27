/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarymanagement;

import connection.ConnectionProvider;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author ridhub
 */
public class SignUp extends javax.swing.JFrame {

    /**
     * Creates new form SignUp
     */
    public SignUp() {
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

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtpassword = new javax.swing.JTextField();
        txtname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtlibid = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtmobile = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        txtgender = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Malayalam MN", 1, 16)); // NOI18N
        jLabel2.setText("SIGN UP FORM");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(637, 56, 147, -1));

        jLabel1.setFont(new java.awt.Font("Malayalam MN", 0, 13)); // NOI18N
        jLabel1.setText("NAME");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 185, -1, -1));

        txtpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpasswordActionPerformed(evt);
            }
        });
        getContentPane().add(txtpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(832, 456, 326, 34));
        getContentPane().add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 223, 326, 34));

        jLabel3.setFont(new java.awt.Font("Malayalam MN", 0, 13)); // NOI18N
        jLabel3.setText("LIBRARY ID");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 298, -1, -1));

        jLabel4.setFont(new java.awt.Font("Malayalam MN", 0, 13)); // NOI18N
        jLabel4.setText("EMAIL ADDRESS");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 418, -1, -1));
        getContentPane().add(txtlibid, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 348, 326, 34));

        jLabel5.setFont(new java.awt.Font("Malayalam MN", 0, 13)); // NOI18N
        jLabel5.setText("GENDER");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(832, 185, -1, -1));

        jLabel6.setFont(new java.awt.Font("Malayalam MN", 0, 13)); // NOI18N
        jLabel6.setText("MOBILE NUMBER");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(832, 298, -1, -1));
        getContentPane().add(txtmobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(832, 348, 326, 34));

        jLabel7.setFont(new java.awt.Font("Malayalam MN", 0, 13)); // NOI18N
        jLabel7.setText("PASSWORD");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(832, 418, -1, -1));

        txtemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtemailActionPerformed(evt);
            }
        });
        getContentPane().add(txtemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 456, 326, 34));

        jButton1.setText("SIGN UP");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 580, 650, 37));

        txtgender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"Female", "Male" }));
        txtgender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtgenderActionPerformed(evt);
            }
        });
        getContentPane().add(txtgender, new org.netbeans.lib.awtextra.AbsoluteConstraints(832, 228, 326, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Signup_background.png"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpasswordActionPerformed

    private void txtemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtemailActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        submitData();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtgenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtgenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtgenderActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUp().setVisible(true);
            }
        });
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
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUp().setVisible(true);
            }
        });
    }
    private void submitData() {
        String name = txtname.getText();
        String libid = txtlibid.getText();
        String email = txtemail.getText();
        String gender = txtgender.getSelectedItem().toString(); // Get the selected item as a String
        String mobile = txtmobile.getText();
        String password = txtpassword.getText();

        try {
            Connection cn = ConnectionProvider.getConnection();
            PreparedStatement st = cn.prepareStatement("INSERT INTO libuser (name, libid, email, gender, mobilenumber, password) VALUES (?, ?, ?, ?, ?, ?)");

            st.setString(1, name);
            st.setString(2, libid);
            st.setString(3, email);
            st.setString(4, gender); // Set the gender value
            st.setString(5, mobile);
            st.setString(6, password);

            int rowsAffected = st.executeUpdate();
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(this, "Sign Up successful!");
            } else {
                JOptionPane.showMessageDialog(this, "Sign Up failed. Please try again.");
            }

            st.close();
            cn.close();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtemail;
    private javax.swing.JComboBox<String> txtgender;
    private javax.swing.JTextField txtlibid;
    private javax.swing.JTextField txtmobile;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtpassword;
    // End of variables declaration//GEN-END:variables

   /** private void submitdata() {
        try {
            Connection cn = ConnectionProvider.getConnection();
            PreparedStatement st = cn.prepareStatement("Insert into libuser values (?, ?, ?, ?, ?, ?)");

            st.setString(1, txtname.getText());
            st.setString(2, txtlibid.getText());
            st.setString(3, txtemail.getText());
            //st.setString(4, txt.getText()); //gender
            st.setString(5, txtmobile.getText());
            st.setString(6, txtpassword.getText());

            pst.executeUpdate();
        } catch (Exception e) {
            System.out.print(e);
        }
    }
    **/
}