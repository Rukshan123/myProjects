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
public class Batches {
    private String bid;
    private String cid;
    private String batch_num;

    public Batches() {
    }

    public Batches(String bid, String cid, String batch_num) {
        this.bid = bid;
        this.cid = cid;
        this.batch_num = batch_num;
    }

    public Batches(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Batches(String bid, String batchNum) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
     * @return the batch_num
     */
    public String getBatch_num() {
        return batch_num;
    }

    /**
     * @param batch_num the batch_num to set
     */
    public void setBatch_num(String batch_num) {
        this.batch_num = batch_num;
    }
    
    
}
