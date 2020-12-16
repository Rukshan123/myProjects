/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.Sms.Controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import lk.ijse.Sms.Modal.Exams;
import lk.ijse.Sms.db.DBConnection;

public class ExamsController {

    public static String generateEID() throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery("SELECT eid FROM exam ORDER BY eid DESC LIMIT 1");

        if (rst.next()) {
            String EID = rst.getString(1);
          EID= EID.split("[A-Z]")[1];
           EID = (Integer.parseInt(EID) + 1) + "";
            return "E0" +EID;
        } else {
            return "E01";
        }
    }

    public static ArrayList<Exams> getAllExams() throws ClassNotFoundException, SQLException {
         Connection connection=DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery("Select * From exam");
        ArrayList<Exams> RegList=new ArrayList<>();
        while(rst.next()){
            Exams exam =new Exams();
            
            exam.setEid(rst.getString("eid"));
            exam.setRid(rst.getString("rid"));
            exam.setSemid(rst.getString("semid"));
            exam.setExamName(rst.getString("exam_name"));
            exam.setExamDate(rst.getString("exam_date"));
            exam.setStartTme(rst.getString("start_time"));
            exam.setEndTime(rst.getString("end_time"));
            exam.setMarks(rst.getString("marks"));
            exam.setResults(rst.getString("results"));
           
            
           
            RegList.add(exam);
            //customerList.add(new Customer(rst.getString("id"),rst.getString("name"),rst.getString("address"),rst.getDouble("salary")));
        }
        return RegList;
    }

    public boolean saveExams(Exams e1) throws ClassNotFoundException, SQLException {
        
 
        Connection con=DBConnection.getInstance().getConnection();
        PreparedStatement stm= con.prepareStatement("insert into exam values(?,?,?,?,?,?,?,?,?)");
        stm.setString(1,e1.getEid());
        stm.setString(2,e1.getRid());
        stm.setString(3,e1.getSemid());
        stm.setString(4,e1.getExamName());
        stm.setString(5,e1.getExamDate());
        stm.setString(6,e1.getStartTme());
        stm.setString(7,e1.getEndTime());
        stm.setString(8,e1.getMarks());
        stm.setString(9,e1.getResults());
        
        return stm.executeUpdate()>0;
       }

    public Exams getExams(String requesteid) throws ClassNotFoundException, SQLException {
        Connection connection=DBConnection.getInstance().getConnection();
        ResultSet set= connection.prepareStatement("select * from exam where eid=+'"+requesteid+"'").executeQuery();
        
        if(set.next()){
            return new Exams(
            
            set.getString(1),
            set.getString(2),
            set.getString(3),
            set.getString(4),
            set.getString(5),
            set.getString(6),
            set.getString(7),
            set.getString(8),
            set.getString(9)        
            );
        }
        return null;
        
        
        
    }

    public boolean dropExams(String requesteid) throws ClassNotFoundException, SQLException {
        Connection connection=DBConnection.getInstance().getConnection();
        return connection.prepareStatement("delete from exam where eid='"+requesteid+"'").executeUpdate()>0;
    }

    public boolean updateExam(Exams e1) throws ClassNotFoundException, SQLException {
        Connection connection=DBConnection.getInstance().getConnection();
      PreparedStatement stm=  connection.prepareStatement("update exam set rid=?,semid=?,exam_name=?,exam_date=?,start_time=?,end_time=?,marks=?,results=? where eid=?");
      
       stm.setObject(1, e1.getRid());
       stm.setObject(2, e1.getSemid());
       stm.setObject(3, e1.getExamName());
       stm.setObject(4, e1.getExamDate());
       stm.setObject(5, e1.getStartTme());
       stm.setObject(6, e1.getEndTime());
       stm.setObject(7, e1.getMarks());
       stm.setObject(8, e1.getResults());
       stm.setObject(9, e1.getEid());
       
       return stm.executeUpdate()>0;
    }

    public List<Exams> getAllExam() throws ClassNotFoundException, SQLException {
        
         Connection connection=DBConnection.getInstance().getConnection();
        ResultSet set=  connection.prepareStatement("select * from exam").executeQuery();
        
        List<Exams>  tempList=new ArrayList();
        while(set.next()){
            tempList.add(new Exams(
            
            set.getString(1),
            set.getString(2),
            set.getString(3),
            set.getString(4),
            set.getString(5),
            set.getString(6),
            set.getString(7),       
            set.getString(8), 
            set.getString(9)
                    
            )
            
            
                   
            );
            
        }
        return tempList;
    }
       
    

    
}
