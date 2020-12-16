/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.Sms.Controller;

import com.sun.imageio.plugins.jpeg.JPEG;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import lk.ijse.Sms.db.DBConnection;

/**
 *
 * @author Rukz
 */
public class LoginController {

    public static boolean login(String user, String password) throws ClassNotFoundException, SQLException {
        Connection connection=DBConnection.getInstance().getConnection();
        PreparedStatement stm=null;
        ResultSet rst=null;
       
        String sql="select * from login where userName=? and userpassword=?";
        stm=connection.prepareStatement(sql);
        stm.setString(1, user);
        stm.setString(2,password);
       try{ 
        rst=stm.executeQuery();
            if(rst.next()){
                return true;
            }else{
                return false; 
           
     
            }
            
         }catch(Exception ex){
             
             return false;
         }finally{
           
           rst.close();
       }
            
           
    }
}
