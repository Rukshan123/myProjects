/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.Sms.Controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import lk.ijse.Sms.Modal.Batches;
import lk.ijse.Sms.Modal.Student;
import lk.ijse.Sms.db.DBConnection;

/**
 *
 * @author Rukz
 */
public class SearchSudentController {

    public Student getAll(String id) throws ClassNotFoundException, SQLException {
        
        
        Connection conn = DBConnection.getInstance().getConnection();
        ResultSet rst = conn.prepareStatement("SELECT * FROM student cross join registration on student.sid=registration.sid and rid='" + id + "'").executeQuery();
        
        if(rst.next()){
            return new Student(
            
            rst.getString(1),
            rst.getString(2),
            rst.getString(3),
            rst.getString(4),
            rst.getString(5),
            rst.getString(6),
            rst.getString(7),
            rst.getString(8)
       
            
            );
        }
        return null;
        
    }

    public Batches getAllBatchNum(String id) throws ClassNotFoundException, SQLException {
       Connection conn = DBConnection.getInstance().getConnection();
        ResultSet rst = conn.prepareStatement("SELECT * FROM batch cross join registration on batch.bid=registration.bid and rid='" + id + "'").executeQuery();
        
        if(rst.next()){
            return new Batches(
            
            rst.getString(1),
            rst.getString(2),
            rst.getString(3)
                    
            );
        }
        return null;
    }
}
    

