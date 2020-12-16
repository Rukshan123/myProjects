
package lk.ijse.Sms.Modal;


public class Registration {
    private String rid;
    private String sid;
    private String bid;
    private String reg_date;
    private String reg_fee;

    public Registration() {
    }

    public Registration(String rid, String sid, String bid, String reg_date, String reg_fee) {
        this.rid = rid;
        this.sid = sid;
        this.bid = bid;
        this.reg_date = reg_date;
        this.reg_fee = reg_fee;
    }

    public Registration(String string, String string0, String string1, String string2, String string3, String string4, String string5, String string6) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
     * @return the sid
     */
    public String getSid() {
        return sid;
    }

    /**
     * @param sid the sid to set
     */
    public void setSid(String sid) {
        this.sid = sid;
    }

    /**
     * @return the bid
     */
    public String getBid() {
        return bid;
    }

    /**
     * @param bid the bid to set
     */
    public void setBid(String bid) {
        this.bid = bid;
    }

    /**
     * @return the reg_date
     */
    public String getReg_date() {
        return reg_date;
    }

    /**
     * @param reg_date the reg_date to set
     */
    public void setReg_date(String reg_date) {
        this.reg_date = reg_date;
    }

    /**
     * @return the reg_fee
     */
    public String getReg_fee() {
        return reg_fee;
    }

    /**
     * @param reg_fee the reg_fee to set
     */
    public void setReg_fee(String reg_fee) {
        this.reg_fee = reg_fee;
    }
    
}
