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
import lk.ijse.Sms.Modal.Subject;
import lk.ijse.Sms.db.DBConnection;
import lk.ijse.Sms.view.AddSubjects;

/**
 *
 * @author Rukz
 */
public class SubjectController {

    public static String generatesubid() throws ClassNotFoundException, SQLException {
       Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery("SELECT subid FROM subject ORDER BY subid DESC LIMIT 1");

        if (rst.next()) {
            String batchID = rst.getString(1);
          batchID= batchID.split("[A-Z]")[1];
           batchID = (Integer.parseInt(batchID) + 1) + "";
            return "S0" +batchID;
        } else {
            return "S01";
        } 
    }

    public static ArrayList<Subject> getAllSubjects() throws ClassNotFoundException, SQLException {
       Connection connection=DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery("Select * From subject");
        ArrayList<Subject> SubjectList=new ArrayList<>();
        while(rst.next()){

            Subject sub=new Subject();
            sub.setSubid(rst.getString("subid"));
            sub.setSub_name(rst.getString("sub_name"));
            
           
            SubjectList.add(sub);
           
        }
        return SubjectList;
    }

    public boolean saveSubject(Subject s1) throws ClassNotFoundException, SQLException {
        
        Connection con=DBConnection.getInstance().getConnection();
        PreparedStatement stm= con.prepareStatement("insert into subject values(?,?)");
        stm.setString(1,s1.getSubid());
        stm.setString(2,s1.getSub_name());
        
        
        return stm.executeUpdate()>0;

    }

    public boolean dropSubject(String requestsid) throws ClassNotFoundException, SQLException {
        Connection connection=DBConnection.getInstance().getConnection();
        return connection.prepareStatement("delete from subject where subid='"+requestsid+"'").executeUpdate()>0;
    }

  public Subject getSubject(String requestsid) throws ClassNotFoundException, SQLException, SQLException {
         Connection connection=DBConnection.getInstance().getConnection();
        ResultSet set= connection.prepareStatement("select * from subject where subid=+'"+requestsid+"'").executeQuery();
        
        if(set.next()){
            return  new   Subject(
            
            set.getString(1),
            set.getString(2)
            
            
            );

        }
        return  null;
  }

    public boolean updatesubject(Subject s1) throws ClassNotFoundException, SQLException {
       Connection connection=DBConnection.getInstance().getConnection();
      PreparedStatement stm=  connection.prepareStatement("update subject set sub_name=? where subid=?");
        
   
      stm.setObject(1, s1.getSub_name());
      stm.setObject(2, s1.getSubid());
      
      
      return stm.executeUpdate()>0;
    }

    public boolean dropBatch(String requestBid) throws ClassNotFoundException, SQLException {
        Connection connection=DBConnection.getInstance().getConnection();
        return connection.prepareStatement("delete from batch where bid='"+requestBid+"'").executeUpdate()>0;
    }

    public List<Subject> getAllSubject() throws ClassNotFoundException, SQLException {
        Connection connection=DBConnection.getInstance().getConnection();
        ResultSet set=  connection.prepareStatement("select * from subject").executeQuery();
        
        List<Subject>  tempList=new ArrayList();
        while(set.next()){
            tempList.add(new Subject(
            
            
            set.getString(1),
            set.getString(2)
            )
            
            
            
                   
            );
            
        }
        return tempList;
    
    }
    

    }
