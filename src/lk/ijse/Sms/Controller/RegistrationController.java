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
import lk.ijse.Sms.Modal.Registration;
import lk.ijse.Sms.db.DBConnection;

/**
 *
 * @author Rukz
 */
public class RegistrationController {

    public static String generateregID() throws ClassNotFoundException, SQLException {
       Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery("SELECT rid FROM registration ORDER BY rid DESC LIMIT 1");

        if (rst.next()) {
            String batchID = rst.getString(1);
          batchID= batchID.split("[A-Z]")[1];
           batchID = (Integer.parseInt(batchID) + 1) + "";
            return "R0" +batchID;
        } else {
            return "R01";
        }
    }

    public static ArrayList<Registration> getAllRegistrations() throws SQLException, ClassNotFoundException {
        Connection connection=DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery("Select * From registration");
        ArrayList<Registration> RegList=new ArrayList<>();
        while(rst.next()){
            Registration reg =new Registration();
            
            reg.setRid(rst.getString("rid"));
            reg.setSid(rst.getString("sid"));
            reg.setBid(rst.getString("bid"));
            reg.setReg_date(rst.getString("reg_date"));
            reg.setReg_fee(rst.getString("reg_fee"));
           
            
           
            RegList.add(reg);
            //customerList.add(new Customer(rst.getString("id"),rst.getString("name"),rst.getString("address"),rst.getDouble("salary")));
        }
        return RegList;
    }

    public boolean savePatient(Registration r1) throws ClassNotFoundException, SQLException {
        Connection con=DBConnection.getInstance().getConnection();
        PreparedStatement stm= con.prepareStatement("insert into registration values(?,?,?,?,?)");
        
        stm.setString(1,r1.getRid());
        stm.setString(2,r1.getSid());
        stm.setString(3,r1.getBid());
        stm.setString(4,r1.getReg_date());
        stm.setString(5,r1.getReg_fee());
        
        return stm.executeUpdate()>0;
    }

    public Registration getRegistration(String requestrid) throws ClassNotFoundException, SQLException {
        Connection connection=DBConnection.getInstance().getConnection();
        ResultSet set= connection.prepareStatement("select * from registration where rid=+'"+requestrid+"'").executeQuery();
        
        if(set.next()){
            return  new Registration(
                   set.getString(1),
                    set.getString(2),
                    set.getString(3),
                    set.getString(4),
                    set.getString(5)
            );
        }
        return  null;
    }
 public boolean dropStudent(String requestRid) throws ClassNotFoundException, SQLException {
        Connection connection=DBConnection.getInstance().getConnection();
        return connection.prepareStatement("delete from registration where rid='"+requestRid+"'").executeUpdate()>0;
        
        
    }

    public boolean updateState(Registration r1) throws ClassNotFoundException, SQLException {
        Connection connection=DBConnection.getInstance().getConnection();
      PreparedStatement stm=  connection.prepareStatement("update registration set sid=?,bid=?,reg_date=?,reg_fee=? where rid=?");
        
     
      stm.setObject(1, r1.getSid());
      stm.setObject(2, r1.getBid());
      stm.setObject(3, r1.getReg_date());
      stm.setObject(4, r1.getReg_fee());
      stm.setObject(5, r1.getRid());
      
      return stm.executeUpdate()>0;
    }
    
}
    

