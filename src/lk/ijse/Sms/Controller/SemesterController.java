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
import lk.ijse.Sms.Modal.Semester;
import lk.ijse.Sms.db.DBConnection;

/**
 *
 * @author Rukz
 */
public class SemesterController {

    public static String generatesemid() throws ClassNotFoundException, SQLException {
      Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery("SELECT semid FROM semester ORDER BY semid DESC LIMIT 1");

        if (rst.next()) {
            String batchID = rst.getString(1);
          batchID= batchID.split("[A-Z]")[1];
           batchID = (Integer.parseInt(batchID) + 1) + "";
            return "S0" +batchID;
        } else {
            return "S01";
        }
    }

    public static ArrayList<Semester> getAllSemesters() throws ClassNotFoundException, SQLException {
        Connection connection=DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery("Select * From semester");
        ArrayList<Semester> List=new ArrayList<>();
        while(rst.next()){
            Semester sem=new Semester();

            sem.setSemid(rst.getString("semid"));
            sem.setCid(rst.getString("cid"));
            sem.setSubid(rst.getString("subid"));
            sem.setSem_name(rst.getString("sem_name"));
           
            
           
            List.add(sem);
            //customerList.add(new Customer(rst.getString("id"),rst.getString("name"),rst.getString("address"),rst.getDouble("salary")));
        }
        return List;
    }

    public boolean saveSemester(Semester s1) throws ClassNotFoundException, SQLException {
       Connection con=DBConnection.getInstance().getConnection();
        PreparedStatement stm= con.prepareStatement("insert into semester values(?,?,?,?)");
        stm.setString(1,s1.getSemid());
        stm.setString(2,s1.getCid());
        stm.setString(3,s1.getSubid());
        stm.setString(4,s1.getSem_name());
       
        
        
        return stm.executeUpdate()>0;
    }

    public Semester getSemester(String requestsid) throws ClassNotFoundException, SQLException {
        Connection connection=DBConnection.getInstance().getConnection();
        ResultSet set= connection.prepareStatement("select * from semester where semid=+'"+requestsid+"'").executeQuery();
        
        if(set.next()){
            return  new Semester(
            
            set.getString(1),
            set.getString(2),
            set.getString(3),
            set.getString(4)
            
            
            );
                   
                   
          
            
                    
        }
        return  null;
}

    public boolean dropSemester(String requestsemID) throws ClassNotFoundException, SQLException {
        Connection connection=DBConnection.getInstance().getConnection();
        return connection.prepareStatement("delete from semester where semid='"+requestsemID+"'").executeUpdate()>0;
    }

        public boolean updateSemester(Semester s1) throws ClassNotFoundException, SQLException, SQLException {
        Connection connection=DBConnection.getInstance().getConnection();
      PreparedStatement stm=  connection.prepareStatement("update semester set cid=?,subid=?,sem_name=? where semid=?");
        
      stm.setObject(1, s1.getCid());
      stm.setObject(2, s1.getSubid());
      stm.setObject(3, s1.getSem_name());
       stm.setObject(4,s1.getSemid());
       
       return stm.executeUpdate()>0;
    }

    public List<Semester> getAllSemester() throws ClassNotFoundException, SQLException {
        Connection connection=DBConnection.getInstance().getConnection();
        ResultSet set=  connection.prepareStatement("select * from semester").executeQuery();
        
        List<Semester>  tempList=new ArrayList();
        while(set.next()){
            tempList.add(new Semester(
            
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

