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
public class Payments {
    
    private String pid;
    private String rid;
    private String pdate;
    private String total_amount;
    private String paying_amount;
    private String remaining_payment;
    private String detail;

    public Payments() {
    }

    public Payments(String pid, String rid, String pdate, String total_amount, String paying_amount, String remaining_payment, String detail) {
        this.pid = pid;
        this.rid = rid;
        this.pdate = pdate;
        this.total_amount = total_amount;
        this.paying_amount = paying_amount;
        this.remaining_payment = remaining_payment;
        this.detail = detail;
    }

   

    /**
     * @return the pid
     */
    public String getPid() {
        return pid;
    }

    /**
     * @param pid the pid to set
     */
    public void setPid(String pid) {
        this.pid = pid;
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
     * @return the pdate
     */
    public String getPdate() {
        return pdate;
    }

    /**
     * @param pdate the pdate to set
     */
    public void setPdate(String pdate) {
        this.pdate = pdate;
    }

    /**
     * @return the total_amount
     */
    public String getTotal_amount() {
        return total_amount;
    }

    /**
     * @param total_amount the total_amount to set
     */
    public void setTotal_amount(String total_amount) {
        this.total_amount = total_amount;
    }

    /**
     * @return the paying_amount
     */
    public String getPaying_amount() {
        return paying_amount;
    }

    /**
     * @param paying_amount the paying_amount to set
     */
    public void setPaying_amount(String paying_amount) {
        this.paying_amount = paying_amount;
    }

    /**
     * @return the remaining_payment
     */
    public String getRemaining_payment() {
        return remaining_payment;
    }

    /**
     * @param remaining_payment the remaining_payment to set
     */
    public void setRemaining_payment(String remaining_payment) {
        this.remaining_payment = remaining_payment;
    }

    /**
     * @return the detail
     */
    public String getDetail() {
        return detail;
    }

    /**
     * @param detail the detail to set
     */
    public void setDetail(String detail) {
        this.detail = detail;
    }
    
}
