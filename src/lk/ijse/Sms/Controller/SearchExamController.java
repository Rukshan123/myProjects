/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.Sms.Controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import lk.ijse.Sms.Modal.Exams;
import lk.ijse.Sms.db.DBConnection;


/**
 *
 * @author Rukz
 */
public class SearchExamController {

    public Exams getAll(String id) throws ClassNotFoundException, SQLException {
        Connection conn = DBConnection.getInstance().getConnection();
        ResultSet rst = conn.prepareStatement("select e.eid, e.rid, e.semid, e.exam_name, e.exam_date, e.start_time, e.end_time, e.marks, e.results from exam e,registration r where e.rid=r.rid and e.rid='" + id + "'").executeQuery();
        
        if(rst.next()){
            return new Exams(
            
            
            rst.getString(1),
            rst.getString(2),
            rst.getString(3),
            rst.getString(4),
            rst.getString(5),
            rst.getString(6),
            rst.getString(7),
            rst.getString(8),
            rst.getString(9)
            
            
            );
        }
        return null;

    }
    
}
