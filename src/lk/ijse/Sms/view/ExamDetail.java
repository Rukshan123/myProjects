/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.Sms.view;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import lk.ijse.Sms.Controller.ExamsController;
import lk.ijse.Sms.Controller.RegistrationController;
import lk.ijse.Sms.Controller.SemesterController;
import lk.ijse.Sms.Modal.Exams;
import lk.ijse.Sms.Modal.Registration;
import lk.ijse.Sms.Modal.Semester;

/**
 *
 * @author Rukz
 */
public class ExamDetail extends javax.swing.JPanel {

    /**
     * Creates new form ExamDetail
     */
    public ExamDetail() {
        initComponents();
        
        genarateExamID();
        loadRid();
        loadSemID();
        loadAllExam();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        txtEID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtExamName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtDate = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtStartTime = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtEndTime = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtMarks = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        cmbResults = new javax.swing.JComboBox<>();
        cmbRID = new javax.swing.JComboBox<>();
        cmbSEMID = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtableExam = new javax.swing.JTable();
        txtRfresh1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(236, 240, 241));
        setForeground(new java.awt.Color(0, 0, 0));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setBackground(java.awt.Color.white);
        jLabel4.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("EID (exam ID)");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 130, 20));

        txtEID.setBackground(java.awt.Color.white);
        txtEID.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtEID.setForeground(new java.awt.Color(0, 0, 0));
        txtEID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEIDActionPerformed(evt);
            }
        });
        add(txtEID, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 220, 40));

        jLabel2.setBackground(java.awt.Color.white);
        jLabel2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("RID (registration ID)");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, 130, 20));

        jLabel5.setBackground(java.awt.Color.white);
        jLabel5.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("SEMID (semester ID)");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 130, 20));

        jLabel7.setBackground(java.awt.Color.white);
        jLabel7.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("EXAM NAME");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, 130, 20));

        txtExamName.setBackground(java.awt.Color.white);
        txtExamName.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtExamName.setForeground(new java.awt.Color(0, 0, 0));
        add(txtExamName, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 150, 220, 40));

        jLabel3.setBackground(java.awt.Color.white);
        jLabel3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("DATE (year-month-date)");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 140, 20));

        txtDate.setBackground(java.awt.Color.white);
        txtDate.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtDate.setForeground(new java.awt.Color(0, 0, 0));
        add(txtDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 220, 40));

        jLabel8.setBackground(java.awt.Color.white);
        jLabel8.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("START TIME");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 200, 130, 20));

        txtStartTime.setBackground(java.awt.Color.white);
        txtStartTime.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtStartTime.setForeground(new java.awt.Color(0, 0, 0));
        add(txtStartTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 220, 220, 40));

        jLabel14.setBackground(java.awt.Color.white);
        jLabel14.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("END TIME");
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 130, 20));

        txtEndTime.setBackground(java.awt.Color.white);
        txtEndTime.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtEndTime.setForeground(new java.awt.Color(0, 0, 0));
        txtEndTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEndTimeActionPerformed(evt);
            }
        });
        add(txtEndTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 220, 40));

        jLabel17.setBackground(java.awt.Color.white);
        jLabel17.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("MARKS");
        add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 270, 130, 20));

        txtMarks.setBackground(java.awt.Color.white);
        txtMarks.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtMarks.setForeground(new java.awt.Color(0, 0, 0));
        add(txtMarks, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 290, 220, 40));

        jLabel6.setBackground(java.awt.Color.white);
        jLabel6.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("RESULTS");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 130, 20));

        jButton3.setBackground(new java.awt.Color(46, 204, 113));
        jButton3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 0));
        jButton3.setText("SAVE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 80, 130, 40));

        jButton4.setBackground(new java.awt.Color(231, 76, 60));
        jButton4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 0, 0));
        jButton4.setText("DELETE");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 160, 130, 40));

        jButton2.setBackground(new java.awt.Color(41, 128, 185));
        jButton2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("UPDATE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 240, 130, 40));

        cmbResults.setBackground(java.awt.Color.white);
        cmbResults.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        cmbResults.setForeground(new java.awt.Color(0, 0, 0));
        cmbResults.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pass", "Fail", "Repeat" }));
        add(cmbResults, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 220, 40));

        cmbRID.setBackground(java.awt.Color.white);
        cmbRID.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        cmbRID.setForeground(new java.awt.Color(0, 0, 0));
        add(cmbRID, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, 220, 40));

        cmbSEMID.setBackground(java.awt.Color.white);
        cmbSEMID.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        cmbSEMID.setForeground(new java.awt.Color(0, 0, 0));
        add(cmbSEMID, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 220, 40));

        jPanel1.setBackground(new java.awt.Color(155, 89, 182));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(java.awt.Color.white);
        jLabel1.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        jLabel1.setForeground(java.awt.Color.white);
        jLabel1.setText("Add Exam Details");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 220, 40));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 40));

        jtableExam.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jtableExam.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Exam ID", "Registration ID", "Semester ID", "Exam Name", "Date", "Start Time", "End Time", "Marks", "Results"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtableExam);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 970, 200));

        txtRfresh1.setBackground(new java.awt.Color(211, 84, 0));
        txtRfresh1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtRfresh1.setForeground(new java.awt.Color(0, 0, 0));
        txtRfresh1.setText("REFRESH");
        txtRfresh1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRfresh1ActionPerformed(evt);
            }
        });
        add(txtRfresh1, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 630, 110, 40));

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/Sms/view/icons8-ok-50.png"))); // NOI18N
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 70, 50, 60));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/Sms/view/icons8-delete-50.png"))); // NOI18N
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 150, 50, 60));

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/Sms/view/icons8-synchronize-45.png"))); // NOI18N
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 230, 50, 60));
    }// </editor-fold>//GEN-END:initComponents

    private void txtEndTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEndTimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEndTimeActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            
            String eid=txtEID.getText();
             String rid= cmbRID.getSelectedItem().toString();
            String semid=cmbSEMID.getSelectedItem().toString();
            String examName=txtExamName.getText();
            String examDate=txtDate.getText();
            String startTme=txtStartTime.getText();
            String endTime=txtEndTime.getText();
            String marks=txtMarks.getText();
            String results=cmbResults.getSelectedItem().toString();

            
            
            Exams e1=new Exams(eid, rid, semid, examName, examDate, startTme, endTime, marks, results);

            boolean isSaved ;
            
                isSaved = new ExamsController().saveExams(e1);
             
                
           

            if(isSaved){
                JOptionPane.showMessageDialog(null,"Saved");
            }else{
                JOptionPane.showMessageDialog(null,"Try Again","Error",JOptionPane.ERROR_MESSAGE);
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(StudentManage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(StudentManage.class.getName()).log(Level.SEVERE, null, ex);
        }

                                
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtEIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEIDActionPerformed
       if(txtEID.getText().trim().length()>0){
           try {
               
               Exams OBJ=new ExamsController().getExams(txtEID.getText().trim());
           
               if(OBJ!=null){
                   
                   
                   cmbRID.setSelectedItem(OBJ.getRid());
                   cmbSEMID.setSelectedItem(OBJ.getRid());
                   txtExamName.setText(OBJ.getExamName());
                   txtDate.setText(OBJ.getExamDate());
                   txtStartTime.setText(OBJ.getStartTme());
                   txtEndTime.setText(OBJ.getEndTime());
                   txtMarks.setText(OBJ.getMarks());
                   cmbResults.setSelectedItem(OBJ.getResults());
                   txtEID.setText(OBJ.getEid());
               }else{
                   JOptionPane.showMessageDialog(this,"No Results Fount","Warning",JOptionPane.WARNING_MESSAGE);
               }
           
           } catch (ClassNotFoundException ex) {
               Logger.getLogger(ExamDetail.class.getName()).log(Level.SEVERE, null, ex);
           } catch (SQLException ex) {
               Logger.getLogger(ExamDetail.class.getName()).log(Level.SEVERE, null, ex);
           }
       }else{
            JOptionPane.showMessageDialog(this,"Try Again","Error",JOptionPane.ERROR_MESSAGE);
       }
            
                           
    }//GEN-LAST:event_txtEIDActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        
        if(txtEID.getText().trim().length()>0){

            try {
                if(new ExamsController().dropExams(txtEID.getText().trim())){
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
            JOptionPane.showMessageDialog(this,"Please insert an SID","ERROR",JOptionPane.ERROR_MESSAGE);
        }      
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       if(txtEID.getText().trim().length()>0){
            String eid=txtEID.getText();
            String rid= cmbRID.getSelectedItem().toString();
            String semid=cmbSEMID.getSelectedItem().toString();
            String examName=txtExamName.getText();
            String examDate=txtDate.getText();
            String startTme=txtStartTime.getText();
            String endTime=txtEndTime.getText();
            String marks=txtMarks.getText();
            String results=cmbResults.getSelectedItem().toString();
            
            Exams e1=new Exams(eid, rid, semid, examName, examDate, startTme, endTime, marks, results);
            
           try {
               if(new ExamsController().updateExam(e1)){
                   JOptionPane.showMessageDialog(null,"Success");
               }else{
                   JOptionPane.showMessageDialog(null,"Please Try Again","WARNING",JOptionPane.WARNING_MESSAGE);
               }
           } catch (ClassNotFoundException ex) {
               Logger.getLogger(ExamDetail.class.getName()).log(Level.SEVERE, null, ex);
           } catch (SQLException ex) {
               Logger.getLogger(ExamDetail.class.getName()).log(Level.SEVERE, null, ex);
           }
       }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtRfresh1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRfresh1ActionPerformed
        try {
            List<Exams> SubjectList= new ExamsController().getAllExam();
            DefaultTableModel modal=(DefaultTableModel)jtableExam.getModel();
            modal.setRowCount(0);
            for(Exams sub:SubjectList){
                Object[] rowData={
                    sub.getEid(),
                    sub.getRid(),
                    sub.getSemid(),
                    sub.getExamName(),
                    sub.getExamDate(),
                    sub.getStartTme(),
                    sub.getEndTime(),
                    sub.getMarks(),
                    sub.getResults()};
                    
                modal.addRow(rowData);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AddSubjects.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AddSubjects.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txtRfresh1ActionPerformed

                    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbRID;
    private javax.swing.JComboBox<String> cmbResults;
    private javax.swing.JComboBox<String> cmbSEMID;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtableExam;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtEID;
    private javax.swing.JTextField txtEndTime;
    private javax.swing.JTextField txtExamName;
    private javax.swing.JTextField txtMarks;
    private javax.swing.JButton txtRfresh1;
    private javax.swing.JTextField txtStartTime;
    // End of variables declaration//GEN-END:variables

    private void genarateExamID() {
       try {
            String EID = ExamsController.generateEID();
            txtEID.setText(EID);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AddCourses.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AddCourses.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void loadRid() {
        try {
            ArrayList<Registration> AllCourses=RegistrationController.getAllRegistrations();
            for(Registration reg:AllCourses){
                cmbRID.addItem(reg.getRid());
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AddBatches.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AddBatches.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void loadSemID() {
   try {
            ArrayList<Semester> AllSemesters=SemesterController.getAllSemesters();
            for(Semester sem:AllSemesters){
                cmbSEMID.addItem(sem.getSemid());
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AddBatches.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AddBatches.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void loadAllExam() {
        try {
            List<Exams> ExamList= new ExamsController().getAllExam();
            DefaultTableModel modal=(DefaultTableModel)jtableExam.getModel();
            for(Exams tempExams:ExamList){
                
                modal.addRow(new Object[]{
                   
                    tempExams.getEid(),
                    tempExams.getRid(),
                    tempExams.getSemid(),
                    tempExams.getExamName(),
                    tempExams.getExamDate(),
                    tempExams.getStartTme(),
                    tempExams.getEndTime(),
                    tempExams.getMarks(),
                    tempExams.getResults(),
                    
                
                });
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ExamDetail.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ExamDetail.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
