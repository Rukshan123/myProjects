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
import lk.ijse.Sms.Modal.Student;
import lk.ijse.Sms.db.DBConnection;

/**
 *
 * @author Rukz
 */
public class StudentController {

    public static ArrayList<Student> getAllStudents() throws ClassNotFoundException, SQLException {
        Connection connection=DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery("Select * From student");
        ArrayList<Student> StudentList=new ArrayList<>();
        while(rst.next()){
            Student student =new Student();
                
            student.setSid(rst.getString("sid"));
            student.setFname(rst.getString("fname"));
            student.setLname(rst.getString("lname"));
            student.setAddress(rst.getString("address"));
            student.setNic(rst.getString("nic"));
            student.setContact_num(rst.getString("contact_num"));
            student.setDob(rst.getString("dob"));
            student.setGender(rst.getString("gender"));
            
           
            StudentList.add(student);
            //customerList.add(new Customer(rst.getString("id"),rst.getString("name"),rst.getString("address"),rst.getDouble("salary")));
        }
        return StudentList;
    
    }

    public static String generatereSID() throws ClassNotFoundException, SQLException {
      Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery("SELECT sid FROM student ORDER BY sid DESC LIMIT 1");

        if (rst.next()) {
            String sid = rst.getString(1);
           sid=sid.split("[A-Z]")[1];
           sid = (Integer.parseInt(sid) + 1) + "";
            return "S0" +sid;
        } else {
            return "S01";
        }
    }

    public static ArrayList<Student> getSID() throws ClassNotFoundException, SQLException {
       Connection connection=DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery("select * from student");
        ArrayList<Student> RegList=new ArrayList<>();
        while(rst.next()){
            Student s1=new Student();

            s1.setSid(rst.getString("sid"));
            s1.setFname(rst.getString("fname"));
            s1.setLname(rst.getString("lname"));
            s1.setAddress(rst.getString("address"));
            s1.setNic(rst.getString("nic"));
            s1.setContact_num(rst.getString("contact_num"));
            s1.setDob(rst.getString("dob"));
            s1.setGender(rst.getString("gender"));

            
           
            RegList.add(s1);
            //customerList.add(new Customer(rst.getString("id"),rst.getString("name"),rst.getString("address"),rst.getDouble("salary")));
        }
        return RegList;
    }


    

    public boolean saveStudent(Student s1) throws ClassNotFoundException, SQLException {
        Connection con=DBConnection.getInstance().getConnection();
        PreparedStatement stm= con.prepareStatement("insert into student values(?,?,?,?,?,?,?,?)");
        stm.setString(1,s1.getSid());
        stm.setString(2,s1.getFname());
        stm.setString(3,s1.getLname());
        stm.setString(4,s1.getAddress());
        stm.setString(5,s1.getNic());
        stm.setString(6,s1.getContact_num());
        stm.setString(7,s1.getDob());
        stm.setString(8,s1.getGender());
        
        return stm.executeUpdate()>0;
    }

    public Student getStudent(String requestsid) throws ClassNotFoundException, SQLException {
        Connection connection=DBConnection.getInstance().getConnection();
        ResultSet set= connection.prepareStatement("select * from student where sid=+'"+requestsid+"'").executeQuery();
        
        if(set.next()){
            return  new Student(
                    set.getString(1),
                    set.getString(2),
                    set.getString(3),
                    set.getString(4),
                    set.getString(5),
                    set.getString(6),
                    set.getString(7),
                    set.getString(8)
            );
        }
        return  null;
    }

    public boolean dropStudent(String requestSid) throws ClassNotFoundException, SQLException {
        Connection connection=DBConnection.getInstance().getConnection();
        return connection.prepareStatement("delete from student where sid='"+requestSid+"'").executeUpdate()>0;
        
        
    }

    public boolean updateState(Student s1) throws ClassNotFoundException, SQLException {
        Connection connection=DBConnection.getInstance().getConnection();
      PreparedStatement stm=  connection.prepareStatement("update student set fname=?,lname=?,address=?,nic=?,contact_num=?,dob=?,gender=? where sid=?");
        
      stm.setObject(1, s1.getFname());
      stm.setObject(2, s1.getLname());
      stm.setObject(3, s1.getAddress());
      stm.setObject(4, s1.getNic());
      stm.setObject(5, s1.getContact_num());
      stm.setObject(6, s1.getDob());
      stm.setObject(7, s1.getGender());
      stm.setObject(8, s1.getSid());
      
      return stm.executeUpdate()>0;
    }

    public Student getAll(String requestsid) throws ClassNotFoundException, SQLException {
         Connection connection=DBConnection.getInstance().getConnection();
        ResultSet set= connection.prepareStatement("SELECT s.fname, s.lname, s.address, s.nic, s.contact_num, s.dob, s.gender ,b.batch_num ,c.cname \n" +
"FROM Student s , Registration r ,Batch b ,Course c where s.sid = r.sid AND r.bid = b.bid AND \n" +
"b.cid = c.cid AND s.sid=+'"+requestsid+"'").executeQuery();
        
        if(set.next()){
        return new Student(
        
                set.getString(1),
                set.getString(2),
                set.getString(3),
                set.getString(4),
                set.getString(5),
                set.getString(6),
                set.getString(7),
                set.getString(8)
               
        
        
        
        );
        }
        return  null;
    }

    
}
