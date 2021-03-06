/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lk.ijse.Sms.view;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import lk.ijse.Sms.Controller.RegistrationController;
import lk.ijse.Sms.Controller.SearchSudentController;
import lk.ijse.Sms.Modal.Registration;
import lk.ijse.Sms.Modal.Student;

/**
 *
 * @author Rukz
 */
public class SearchStudent extends javax.swing.JPanel {

    /** Creates new form SearchStudent */
    public SearchStudent() {
        initComponents();
        loadRid();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        CmbRid = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        txtSId = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtNic = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtFname = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtLname = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtBirthday = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtGender = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtTelePhone = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtBatchNUm = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtBID = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtCID = new javax.swing.JTextField();

        setBackground(java.awt.Color.white);
        setForeground(new java.awt.Color(0, 0, 0));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(155, 89, 182));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(java.awt.Color.white);
        jLabel1.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        jLabel1.setForeground(java.awt.Color.white);
        jLabel1.setText("Search  Students");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 250, 40));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1170, 40));

        jLabel2.setBackground(java.awt.Color.white);
        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("ENTER  THE  RID");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 120, 30));

        CmbRid.setBackground(java.awt.Color.white);
        CmbRid.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        CmbRid.setForeground(java.awt.Color.black);
        CmbRid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmbRidActionPerformed(evt);
            }
        });
        add(CmbRid, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 210, 40));

        jLabel11.setBackground(java.awt.Color.white);
        jLabel11.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("SID");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 120, 30));

        txtSId.setBackground(java.awt.Color.white);
        txtSId.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtSId.setForeground(new java.awt.Color(0, 0, 0));
        add(txtSId, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, 210, 40));

        jLabel7.setBackground(java.awt.Color.white);
        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("NIC");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 80, 120, 30));

        txtNic.setBackground(java.awt.Color.white);
        txtNic.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtNic.setForeground(new java.awt.Color(0, 0, 0));
        add(txtNic, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 110, 210, 40));

        jLabel3.setBackground(java.awt.Color.white);
        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("FIRST  NAME");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 120, 30));

        txtFname.setBackground(java.awt.Color.white);
        txtFname.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtFname.setForeground(new java.awt.Color(0, 0, 0));
        add(txtFname, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 210, 40));

        jLabel6.setBackground(java.awt.Color.white);
        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("LAST  NAME");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, 120, 30));

        txtLname.setBackground(java.awt.Color.white);
        txtLname.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtLname.setForeground(new java.awt.Color(0, 0, 0));
        add(txtLname, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, 210, 40));

        jLabel5.setBackground(java.awt.Color.white);
        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("ADDRESS");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 180, 120, 30));

        txtAddress.setBackground(java.awt.Color.white);
        txtAddress.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtAddress.setForeground(new java.awt.Color(0, 0, 0));
        add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 210, 210, 40));

        jLabel8.setBackground(java.awt.Color.white);
        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("BIRTHDAY");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 120, 30));

        txtBirthday.setBackground(java.awt.Color.white);
        txtBirthday.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtBirthday.setForeground(new java.awt.Color(0, 0, 0));
        add(txtBirthday, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 210, 40));

        jLabel10.setBackground(java.awt.Color.white);
        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("GENDER");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 280, 120, 30));

        txtGender.setBackground(java.awt.Color.white);
        txtGender.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtGender.setForeground(new java.awt.Color(0, 0, 0));
        txtGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGenderActionPerformed(evt);
            }
        });
        add(txtGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, 210, 40));

        jLabel9.setBackground(java.awt.Color.white);
        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("TELEPHONE");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 280, 120, 30));

        txtTelePhone.setBackground(java.awt.Color.white);
        txtTelePhone.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtTelePhone.setForeground(new java.awt.Color(0, 0, 0));
        add(txtTelePhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 310, 210, 40));

        jLabel12.setBackground(java.awt.Color.white);
        jLabel12.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("BATCH_NUMBER");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 380, 120, 30));

        txtBatchNUm.setBackground(java.awt.Color.white);
        txtBatchNUm.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtBatchNUm.setForeground(new java.awt.Color(0, 0, 0));
        add(txtBatchNUm, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 410, 210, 40));

        jLabel13.setBackground(java.awt.Color.white);
        jLabel13.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("BID");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 380, 120, 30));

        txtBID.setBackground(java.awt.Color.white);
        txtBID.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtBID.setForeground(new java.awt.Color(0, 0, 0));
        add(txtBID, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 410, 210, 40));

        jLabel14.setBackground(java.awt.Color.white);
        jLabel14.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("CID");
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 120, 30));

        txtCID.setBackground(java.awt.Color.white);
        txtCID.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtCID.setForeground(new java.awt.Color(0, 0, 0));
        add(txtCID, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 210, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void CmbRidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmbRidActionPerformed

       
        try {
            Student ob=new SearchSudentController().getAll(CmbRid.getSelectedItem().toString());
            txtSId.setText(ob.getSid());
            txtFname.setText(ob.getFname());
            txtLname.setText(ob.getLname());
            txtAddress.setText(ob.getAddress());
            txtNic.setText(ob.getNic());
            txtTelePhone.setText(ob.getContact_num());
            txtBirthday.setText(ob.getDob());
            txtGender.setText(ob.getGender());

            lk.ijse.Sms.Modal.Batches b1= new SearchSudentController().getAllBatchNum(CmbRid.getSelectedItem().toString());
            txtBID.setText(b1.getBid());
            txtCID.setText(b1.getCid());
            txtBatchNUm.setText(b1.getBatch_num());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SearchStudent.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(SearchStudent.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_CmbRidActionPerformed

    private void txtGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGenderActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CmbRid;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtBID;
    private javax.swing.JTextField txtBatchNUm;
    private javax.swing.JTextField txtBirthday;
    private javax.swing.JTextField txtCID;
    private javax.swing.JTextField txtFname;
    private javax.swing.JTextField txtGender;
    private javax.swing.JTextField txtLname;
    private javax.swing.JTextField txtNic;
    private javax.swing.JTextField txtSId;
    private javax.swing.JTextField txtTelePhone;
    // End of variables declaration//GEN-END:variables

    private void loadRid() {
       
 
        try {
            ArrayList<Registration> AllCourses=RegistrationController.getAllRegistrations( );
            for(Registration reg:AllCourses){
                CmbRid.addItem(reg.getRid());
            
            }
        } catch (SQLException ex) {
            Logger.getLogger(SearchStudent.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SearchStudent.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


}
