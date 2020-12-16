/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.Sms.Modal;

/**
 *
 * @author Rukz
 */
public class Attendance {
    
    private String aid;
    private String rid;
    private String semid;
    private String in_time;
    private String out_time;
    private String att_date;
    private String details;

    public Attendance() {
    }

    public Attendance(String aid, String rid, String semid, String in_time, String out_time, String att_date, String details) {
        this.aid = aid;
        this.rid = rid;
        this.semid = semid;
        this.in_time = in_time;
        this.out_time = out_time;
        this.att_date = att_date;
        this.details = details;
    }

    /**
     * @return the aid
     */
    public String getAid() {
        return aid;
    }

    /**
     * @param aid the aid to set
     */
    public void setAid(String aid) {
        this.aid = aid;
    }

    /**
     * @return the rid
     */
    public String getRid() {
        return rid;
    }

    /**
     * @param rid the rid to set
     */
    public void setRid(String rid) {
        this.rid = rid;
    }

    /**
     * @return the semid
     */
    public String getSemid() {
        return semid;
    }

    /**
     * @param semid the semid to set
     */
    public void setSemid(String semid) {
        this.semid = semid;
    }

    /**
     * @return the in_time
     */
    public String getIn_time() {
        return in_time;
    }

    /**
     * @param in_time the in_time to set
     */
    public void setIn_time(String in_time) {
        this.in_time = in_time;
    }

    /**
     * @return the out_time
     */
    public String getOut_time() {
        return out_time;
    }

    /**
     * @param out_time the out_time to set
     */
    public void setOut_time(String out_time) {
        this.out_time = out_time;
    }

    /**
     * @return the att_date
     */
    public String getAtt_date() {
        return att_date;
    }

    /**
     * @param att_date the att_date to set
     */
    public void setAtt_date(String att_date) {
        this.att_date = att_date;
    }

    /**
     * @return the details
     */
    public String getDetails() {
        return details;
    }

    /**
     * @param details the details to set
     */
    public void setDetails(String details) {
        this.details = details;
    }
    
    
}

