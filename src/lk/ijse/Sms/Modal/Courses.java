/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.Sms.Modal;


public class Courses {
    private String cid;
    private String cname;
    private String duration;
    private String cfee;

    public Courses() {
    }

    public Courses(String cid, String cname, String duration, String cfee) {
        this.cid = cid;
        this.cname = cname;
        this.duration = duration;
        this.cfee = cfee;
    }

    /**
     * @return the cid
     */
    public String getCid() {
        return cid;
    }

    /**
     * @param cid the cid to set
     */
    public void setCid(String cid) {
        this.cid = cid;
    }

    /**
     * @return the cname
     */
    public String getCname() {
        return cname;
    }

    /**
     * @param cname the cname to set
     */
    public void setCname(String cname) {
        this.cname = cname;
    }

    /**
     * @return the duration
     */
    public String getDuration() {
        return duration;
    }

    /**
     * @param duration the duration to set
     */
    public void setDuration(String duration) {
        this.duration = duration;
    }

    /**
     * @return the cfee
     */
    public String getCfee() {
        return cfee;
    }

    /**
     * @param cfee the cfee to set
     */
    public void setCfee(String cfee) {
        this.cfee = cfee;
    }
    
    
}
