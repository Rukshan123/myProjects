/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.Sms.view;

import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import lk.ijse.Sms.Controller.CoursesController;
import lk.ijse.Sms.Modal.Courses;

/**
 *
 * @author Rukz
 */
public class AddCourses extends javax.swing.JPanel {

    /**
     * Creates new form AddCourses
     */
    public AddCourses() {
        initComponents();
        
        genarateCourseID();
        loadAllCourses();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCID = new javax.swing.JLabel();
        txtCid = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtDuration = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtCourseFee = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        txtCourseName = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jcourseTable = new javax.swing.JTable();
        txtRfresh1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(236, 240, 241));
        setForeground(new java.awt.Color(0, 0, 0));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCID.setBackground(java.awt.Color.white);
        lblCID.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblCID.setForeground(new java.awt.Color(0, 0, 0));
        lblCID.setText("CID (course ID)");
        add(lblCID, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 90, 30));

        txtCid.setBackground(java.awt.Color.white);
        txtCid.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtCid.setForeground(new java.awt.Color(0, 0, 0));
        txtCid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCidActionPerformed(evt);
            }
        });
        add(txtCid, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 240, 40));

        jLabel3.setBackground(java.awt.Color.white);
        jLabel3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("COURSE  NAME");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, 90, 30));

        jLabel4.setBackground(java.awt.Color.white);
        jLabel4.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("DURATION");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 90, 30));

        txtDuration.setBackground(java.awt.Color.white);
        txtDuration.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtDuration.setForeground(new java.awt.Color(0, 0, 0));
        add(txtDuration, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 240, 40));

        jLabel5.setBackground(java.awt.Color.white);
        jLabel5.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("COURSE FEE");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, 90, 30));

        txtCourseFee.setBackground(java.awt.Color.white);
        txtCourseFee.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtCourseFee.setForeground(new java.awt.Color(0, 0, 0));
        add(txtCourseFee, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 230, 240, 40));

        jButton1.setBackground(new java.awt.Color(41, 128, 185));
        jButton1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("UPDATE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 290, 120, 40));

        jButton2.setBackground(new java.awt.Color(46, 204, 113));
        jButton2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("SAVE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 130, 120, 40));

        jButton3.setBackground(new java.awt.Color(231, 76, 60));
        jButton3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 0));
        jButton3.setText("DELETE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 210, 120, 40));

        txtCourseName.setBackground(java.awt.Color.white);
        txtCourseName.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtCourseName.setForeground(new java.awt.Color(0, 0, 0));
        add(txtCourseName, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, 240, 40));

        jPanel1.setBackground(new java.awt.Color(155, 89, 182));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(java.awt.Color.white);
        jLabel1.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        jLabel1.setForeground(java.awt.Color.white);
        jLabel1.setText("Add  Courses");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 190, 40));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1110, 40));

        jcourseTable.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jcourseTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Course ID", "Course Name", "Course Duration", "Course Fee"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jcourseTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 540, 230));

        txtRfresh1.setBackground(new java.awt.Color(211, 84, 0));
        txtRfresh1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtRfresh1.setForeground(new java.awt.Color(0, 0, 0));
        txtRfresh1.setText("REFRESH");
        txtRfresh1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRfresh1ActionPerformed(evt);
            }
        });
        add(txtRfresh1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 580, 110, 40));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/Sms/view/icons8-ok-50.png"))); // NOI18N
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 120, 50, 60));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/Sms/view/icons8-delete-50.png"))); // NOI18N
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 200, 50, 60));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/Sms/view/icons8-synchronize-45.png"))); // NOI18N
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 280, 50, 60));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            String cid=txtCid.getText();
            String cname=txtCourseName.getText();
            String duration=txtDuration.getText();
            String cfee=txtCourseFee.getText();
           

           
           
            Courses c1=new Courses(cid, cname, duration, cfee);
            boolean isSaved=new CoursesController().saveCourse(c1);
            if(isSaved){
                JOptionPane.showMessageDialog(null,"Saved");
            }else{
                JOptionPane.showMessageDialog(null,"Try Again","Error",JOptionPane.ERROR_MESSAGE);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AddRegistration.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AddRegistration.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if(txtCid.getText().trim().length()>0){

            try {
                if(new CoursesController().dropCourse(txtCid.getText().trim())){
                    JOptionPane.showMessageDialog(null,"Deleted");
                }else{
                    JOptionPane.showMessageDialog(null,"Something Went Wrong","Warning",JOptionPane.WARNING_MESSAGE);
                }

            } catch (ClassNotFoundException ex) {
                Logger.getLogger(StudentManage.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(StudentManage.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            JOptionPane.showMessageDialog(this,"Please insert an CID","ERROR",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtCidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCidActionPerformed
        if(txtCid.getText().trim().length()>0){
            try {
              
                Courses OBj;
                OBj = new CoursesController().getCourses(txtCid.getText().trim());

                if(OBj!=null){
                    
                    
                     txtCourseName.setText(OBj.getCname());
                     txtDuration.setText(OBj.getDuration());
                     txtCourseFee.setText(OBj.getCfee());

                }else{
                    JOptionPane.showMessageDialog(this,"No Results Fount","Warning",JOptionPane.WARNING_MESSAGE);
                }

            } catch (ClassNotFoundException ex) {
                Logger.getLogger(StudentManage.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(StudentManage.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            JOptionPane.showMessageDialog(this,"Try Again","Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_txtCidActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
                if(txtCid.getText().trim().length()>0){
            try {
                String cid=txtCid.getText();
            String cname=txtCourseName.getText();
            String duration=txtDuration.getText();
            String cfee=txtCourseFee.getText();

                
                Courses c1= new Courses(cid, cname, duration, cfee);

                if(new CoursesController().updateCourse(c1)){
                    JOptionPane.showMessageDialog(null,"Success");
                }else{
                    JOptionPane.showMessageDialog(null,"Please Try Again","WARNING",JOptionPane.WARNING_MESSAGE);
                }

            } catch (ClassNotFoundException ex) {
                Logger.getLogger(StudentManage.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(StudentManage.class.getName()).log(Level.SEVERE, null, ex);
            }

        }else{
            JOptionPane.showMessageDialog(null,"Please Insert An SID","ERROR",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtRfresh1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRfresh1ActionPerformed
        try {
            List<Courses> SubjectList= new CoursesController().getAllCourse();
            DefaultTableModel modal=(DefaultTableModel)jcourseTable.getModel();
            modal.setRowCount(0);
            for(Courses sub:SubjectList){
                Object[] rowData={
                    sub.getCid(),
                    sub.getCname(),
                    sub.getDuration(),
                    sub.getCfee()};
                modal.addRow(rowData);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AddSubjects.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AddSubjects.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_txtRfresh1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jcourseTable;
    private javax.swing.JLabel lblCID;
    private javax.swing.JTextField txtCid;
    private javax.swing.JTextField txtCourseFee;
    private javax.swing.JTextField txtCourseName;
    private javax.swing.JTextField txtDuration;
    private javax.swing.JButton txtRfresh1;
    // End of variables declaration//GEN-END:variables

    private void genarateCourseID() {
        try {
            String CourseID = CoursesController.generateCourseID();
            txtCid.setText(CourseID);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AddCourses.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AddCourses.class.getName()).log(Level.SEVERE, null, ex);
        }
}

    private void loadAllCourses() {
        
        try {
            List<Courses> CourseList= new CoursesController().getAllCourse();
            DefaultTableModel modal=(DefaultTableModel)jcourseTable.getModel();
            for(Courses tempCourses:CourseList){
                
                modal.addRow(new Object[]{
                    
                    tempCourses.getCid(),
                    tempCourses.getCname(),
                    tempCourses.getDuration(),
                    tempCourses.getCfee(),
                    
                    
                    
                
                });
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AddCourses.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AddCourses.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}