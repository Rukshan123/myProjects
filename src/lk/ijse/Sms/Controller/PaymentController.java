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
import lk.ijse.Sms.Modal.Payments;
import lk.ijse.Sms.db.DBConnection;

/**
 *
 * @author Rukz
 */
public class PaymentController {

    public static String generatePID() throws ClassNotFoundException, SQLException {
         Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery("SELECT pid FROM payment ORDER BY pid DESC LIMIT 1");

        if (rst.next()) {
            String batchID = rst.getString(1);
          batchID= batchID.split("[A-Z]")[1];
           batchID = (Integer.parseInt(batchID) + 1) + "";
            return "P0" +batchID;
        } else {
            return "P01";
        }
    }

    public boolean savePayment(Payments p1) throws ClassNotFoundException, SQLException {
        Connection con=DBConnection.getInstance().getConnection();
        PreparedStatement stm= con.prepareStatement("insert into payment values(?,?,?,?,?,?,?)");
        
        stm.setString(1, p1.getPid());
        stm.setString(2,p1.getRid());
        stm.setString(3,p1.getPdate());
        stm.setString(4, p1.getTotal_amount());
        stm.setString(5,p1.getPaying_amount());
        stm.setString(6,p1.getRemaining_payment());
        stm.setString(7,p1.getDetail());
       
        
        
        return stm.executeUpdate()>0;
    }

    public Payments getPayment(String requestPid) throws ClassNotFoundException, SQLException {
         Connection connection=DBConnection.getInstance().getConnection();
        ResultSet set= connection.prepareStatement("select * from payment where pid=+'"+requestPid+"'").executeQuery();
        
        if(set.next()){
            return  new Payments(
            
            
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

    public boolean dropPayment(String requestPid) throws ClassNotFoundException, SQLException {
        Connection connection=DBConnection.getInstance().getConnection();
        return connection.prepareStatement("delete from payment where pid='"+requestPid+"'").executeUpdate()>0;
    }

    public boolean updatePayment(Payments p1) throws ClassNotFoundException, SQLException {
        Connection connection=DBConnection.getInstance().getConnection();
      PreparedStatement stm=  connection.prepareStatement("update payment set rid=?,pdate=?,total_amount=?,paying_amount=?,remaining_payment=?,detail=? where pid=?");
        
      stm.setObject(1, p1.getRid());
      stm.setObject(2, p1.getPdate());
      stm.setObject(3, p1.getTotal_amount());
      stm.setObject(4, p1.getPaying_amount());
      stm.setObject(5, p1.getRemaining_payment());
      stm.setObject(6, p1.getDetail());
      stm.setObject(7, p1.getPid());

     
      
      
      return stm.executeUpdate()>0;
    }

    public List<Payments> getAllPayments() throws ClassNotFoundException, SQLException {
         Connection connection=DBConnection.getInstance().getConnection();
        ResultSet set=  connection.prepareStatement("select * from payment").executeQuery();
        
        List<Payments>  tempList=new ArrayList();
        while(set.next()){
            tempList.add(new Payments(
            
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
