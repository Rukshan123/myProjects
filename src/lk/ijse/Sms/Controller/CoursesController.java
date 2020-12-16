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
import lk.ijse.Sms.Modal.Courses;
import lk.ijse.Sms.db.DBConnection;


public class CoursesController {

    public static ArrayList<Courses> getAllCourses() throws ClassNotFoundException, SQLException {
         Connection connection=DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery("Select * From course");
        ArrayList<Courses> courseList=new ArrayList<>();
        while(rst.next()){
            Courses course=new Courses();
            
            course.setCid(rst.getString("cid"));
            course.setCname(rst.getString("cname"));
            course.setDuration(rst.getString("duration"));
            course.setCfee(rst.getString("cfee"));
            
           
            courseList.add(course);
  
        }
        return courseList;
    
    }

    public static String generateCourseID() throws ClassNotFoundException, SQLException, SQLException, SQLException, SQLException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery("SELECT cid FROM course ORDER BY cid DESC LIMIT 1");

        if (rst.next()) {
            String courseID = rst.getString(1);
           courseID= courseID.split("[A-Z]")[1];
           courseID = (Integer.parseInt(courseID) + 1) + "";
            return "C0" +courseID;
        } else {
            return "C01";
        }
    }

    public boolean saveCourse(Courses c1) throws ClassNotFoundException, SQLException {
        Connection con=DBConnection.getInstance().getConnection();
        PreparedStatement stm= con.prepareStatement("insert into course values(?,?,?,?)");
        stm.setString(1,c1.getCid());
        stm.setString(2,c1.getCname());
        stm.setString(3,c1.getDuration());
        stm.setString(4,c1.getCfee());
        
        
        return stm.executeUpdate()>0;
    }

    public boolean dropCourse(String requestCid)throws ClassNotFoundException, SQLException {
       Connection connection=DBConnection.getInstance().getConnection();
        return connection.prepareStatement("delete from course where cid='"+requestCid+"'").executeUpdate()>0;
    }

    public Courses getCourses(String requestCid) throws ClassNotFoundException, SQLException {
        Connection connection=DBConnection.getInstance().getConnection();
        ResultSet set= connection.prepareStatement("select * from course where cid=+'"+requestCid+"'").executeQuery();
        
        if(set.next()){
            return  new Courses(          
                    set.getString(1),
                    set.getString(2),
                    set.getString(3),
                    set.getString(4)
          
            );
                    
        }
        return  null;
    }

    public boolean updateCourse(Courses c1) throws ClassNotFoundException, SQLException {
        Connection connection=DBConnection.getInstance().getConnection();
      PreparedStatement stm=  connection.prepareStatement("update course set cname=?,duration=?,cfee=? where cid=?");
        
      stm.setObject(1, c1.getCname());
      stm.setObject(2, c1.getDuration());
      stm.setObject(3, c1.getCfee());
      stm.setObject(4, c1.getCid());
      
      
      return stm.executeUpdate()>0;
    }

    public List<Courses> getAllCourse() throws ClassNotFoundException, SQLException, SQLException, SQLException {
        Connection connection=DBConnection.getInstance().getConnection();
        ResultSet set=  connection.prepareStatement("select * from course").executeQuery();
        
        List<Courses>  tempList=new ArrayList();
        while(set.next()){
            tempList.add(new Courses(
            
            
            set.getString(1),
            set.getString(2),
            set.getString(3),
            set.getString(4)
            
            
            
            )
            
            
                   
            );
            
        }
        return tempList;
    
    }
}
