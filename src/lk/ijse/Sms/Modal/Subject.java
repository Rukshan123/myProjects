/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.Sms.Modal;


public class Subject {
    private String subid;
    private String sub_name;

    public Subject() {
    }

    public Subject(String subid, String sub_name) {
        this.subid = subid;
        this.sub_name = sub_name;
    }

    /**
     * @return the subid
     */
    public String getSubid() {
        return subid;
    }

    /**
     * @param subid the subid to set
     */
    public void setSubid(String subid) {
        this.subid = subid;
    }

    /**
     * @return the sub_name
     */
    public String getSub_name() {
        return sub_name;
    }

    /**
     * @param sub_name the sub_name to set
     */
    public void setSub_name(String sub_name) {
        this.sub_name = sub_name;
    }
    
    
}
