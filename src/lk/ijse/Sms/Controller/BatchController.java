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
import lk.ijse.Sms.Modal.Batches;
import lk.ijse.Sms.Modal.Courses;
import lk.ijse.Sms.db.DBConnection;


public class BatchController {

    public static String generateBatchID() throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery("SELECT bid FROM batch ORDER BY bid DESC LIMIT 1");

        if (rst.next()) {
            String batchID = rst.getString(1);
          batchID= batchID.split("[A-Z]")[1];
           batchID = (Integer.parseInt(batchID) + 1) + "";
            return "B0" +batchID;
        } else {
            return "B01";
        }
    }

    public static ArrayList<Batches> getAllBid() throws ClassNotFoundException, SQLException {
        Connection connection=DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery("Select * From batch");
        ArrayList<Batches> BatchtList=new ArrayList<>();
        while(rst.next()){
            Batches batch =new Batches();

            batch.setBid(rst.getString("bid"));
            batch.setCid(rst.getString("cid"));
            batch.setBatch_num(rst.getString("batch_num"));
            
            
           
           BatchtList.add(batch);
            //customerList.add(new Customer(rst.getString("id"),rst.getString("name"),rst.getString("address"),rst.getDouble("salary")));
        }
        return BatchtList;
    }

    public static ArrayList<Batches> getBatchID() throws ClassNotFoundException, SQLException {
        Connection connection=DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery("select b.batch_num from batch b, student s ,registration r where s.sid=r.sid AND r.bid=b.bid AND s.sid='S02'");
        ArrayList<Batches> RegList=new ArrayList<>();
        while(rst.next()){
            Batches b1=new Batches();
            
            b1.setBatch_num(rst.getString("batch_num"));

            
           
            RegList.add(b1);
            //customerList.add(new Customer(rst.getString("id"),rst.getString("name"),rst.getString("address"),rst.getDouble("salary")));
        }
        return RegList;
    }

 

    public boolean saveBatches(Batches b1) throws ClassNotFoundException, SQLException {
       Connection con=DBConnection.getInstance().getConnection();
        PreparedStatement stm= con.prepareStatement("insert into batch values(?,?,?)");
        stm.setString(1,b1.getBid());
        stm.setString(2,b1.getCid());
        stm.setString(3,b1.getBatch_num());
       
        
        
        return stm.executeUpdate()>0;
    }

    public Batches getBatches(String requestBid) throws ClassNotFoundException, SQLException {
        Connection connection=DBConnection.getInstance().getConnection();
        ResultSet set= connection.prepareStatement("select * from batch where bid=+'"+requestBid+"'").executeQuery();
        
        if(set.next()){
            return  new Batches(
            
            
                    set.getString(1),
                    set.getString(2),
                    set.getString(3)
            
            );
                   
                   
          
            
                    
        }
        return  null;
    }

    public boolean updateBatch(Batches b1) throws ClassNotFoundException, SQLException {
         Connection connection=DBConnection.getInstance().getConnection();
      PreparedStatement stm=  connection.prepareStatement("update batch set cid=?,batch_num=? where bid=?");
        
      stm.setObject(1, b1.getCid());
      stm.setObject(2, b1.getBatch_num());
      stm.setObject(3, b1.getBid());
     
      
      
      return stm.executeUpdate()>0;
    }

    public boolean dropBatch(String requestBid) throws ClassNotFoundException, SQLException {
        Connection connection=DBConnection.getInstance().getConnection();
        return connection.prepareStatement("delete from batch where bid='"+requestBid+"'").executeUpdate()>0;
    }

    public List<Batches> getAllBatches() throws ClassNotFoundException, SQLException {
        Connection connection=DBConnection.getInstance().getConnection();
        ResultSet set=  connection.prepareStatement("select * from batch").executeQuery();
        
        List<Batches>  tempList=new ArrayList();
        while(set.next()){
            tempList.add(new Batches(
            
            
            set.getString(1),
            set.getString(2),
            set.getString(3)
                    
            )
            
            
            
                   
            );
            
        }
        return tempList;
    
    }
}
        
    

   

    
    

 