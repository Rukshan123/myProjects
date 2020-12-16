 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.Sms.Controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import lk.ijse.Sms.Modal.Registration;
import lk.ijse.Sms.db.DBConnection;

/**
 *
 * @author Rukz
 */
public class AllRegistrationDetailSController {
   
    

    public List<Registration> getAllRegistration() throws ClassNotFoundException, SQLException {
         Connection connection=DBConnection.getInstance().getConnection();
        ResultSet set=  connection.prepareStatement("select * from registration").executeQuery();
        
        List<Registration>  tempList=new ArrayList();
        while(set.next()){
            tempList.add(new Registration(
                    set.getString(1),
                    set.getString(2),
                    set.getString(3),
                    set.getString(4),
                    set.getString(5)
            
            
                   
            ));
            
        }
        return tempList;
    }
    
    
}
