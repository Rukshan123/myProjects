/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.Sms.Modal;


public class Semester {
    private String semid;
    private String cid;
    private String subid;
    private String sem_name;

    public Semester() {
    }

    public Semester(String semid, String cid, String subid, String sem_name) {
        this.semid = semid;
        this.cid = cid;
        this.subid = subid;
        this.sem_name = sem_name;
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
     * @return the sem_name
     */
    public String getSem_name() {
        return sem_name;
    }

    /**
     * @param sem_name the sem_name to set
     */
    public void setSem_name(String sem_name) {
        this.sem_name = sem_name;
    }
    
}
