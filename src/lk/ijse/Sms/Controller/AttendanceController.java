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
import lk.ijse.Sms.Modal.Attendance;
import lk.ijse.Sms.db.DBConnection;

/**
 *
 * @author Rukz
 */
public class AttendanceController {

    public static String generateAID() throws ClassNotFoundException, SQLException {
       Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery("SELECT aid FROM attendance ORDER BY aid DESC LIMIT 1");

        if (rst.next()) {
            String batchID = rst.getString(1);
          batchID= batchID.split("[A-Z]")[1];
           batchID = (Integer.parseInt(batchID) + 1) + "";
            return "A0" +batchID;
        } else {
            return "A01";
        }
    }

    public boolean saveAttendance(Attendance a1) throws ClassNotFoundException, SQLException {
       Connection con=DBConnection.getInstance().getConnection();
        PreparedStatement stm= con.prepareStatement("insert into attendance values(?,?,?,?,?,?,?)");
        stm.setString(1,a1.getAid());
        stm.setString(2,a1.getRid());
        stm.setString(3,a1.getSemid());
        stm.setString(4,a1.getIn_time());
        stm.setString(5,a1.getOut_time());
        stm.setString(6,a1.getAtt_date());
        stm.setString(7,a1.getDetails());
        
        
        return stm.executeUpdate()>0;
    }   

    public boolean dropAttendance(String requestaid) throws ClassNotFoundException, SQLException {
        Connection connection=DBConnection.getInstance().getConnection();
        return connection.prepareStatement("delete from attendance where aid='"+requestaid+"'").executeUpdate()>0;
    }

    public Attendance getAttendance(String requestaid)  throws ClassNotFoundException, SQLException, SQLException {
        Connection connection=DBConnection.getInstance().getConnection();
        ResultSet set= connection.prepareStatement("select * from attendance where aid=+'"+requestaid+"'").executeQuery();
        
        if(set.next()){
        return new Attendance(
        
        set.getString(1),
                    set.getString(2),
                    set.getString(3),
                    set.getString(4),
                    set.getString(5),
                    set.getString(6),
                    set.getString(7)
        
        
        );
        }
        return  null;
    }

    public boolean updateAttendance(Attendance a1) throws ClassNotFoundException, SQLException {
        Connection connection=DBConnection.getInstance().getConnection();
      PreparedStatement stm=  connection.prepareStatement("update attendance set rid=?,semid=?,in_time=?,out_time=?,att_date=?,details=? where aid=?");
        
      stm.setObject(1, a1.getRid());
      stm.setObject(2, a1.getSemid());
      stm.setObject(3, a1.getIn_time());
      stm.setObject(4, a1.getOut_time());
      stm.setObject(5, a1.getAtt_date());
      stm.setObject(6, a1.getDetails());
      stm.setObject(7, a1.getAid());

      
      return stm.executeUpdate()>0;
    }

    public List<Attendance> getAllAttendance() throws ClassNotFoundException, SQLException {
        Connection connection=DBConnection.getInstance().getConnection();
        ResultSet set=  connection.prepareStatement("select * from attendance").executeQuery();
        
        List<Attendance>  tempList=new ArrayList();
        while(set.next()){
            tempList.add(new Attendance(
            
            set.getString(1),
            set.getString(2),
            set.getString(3),
            set.getString(4),
            set.getString(5),
            set.getString(6),
            set.getString(7)
            
            
            
            )
            
            
                   
            );
            
        }
        return tempList;

    
    }
    
}
