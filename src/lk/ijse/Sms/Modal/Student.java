
package lk.ijse.Sms.Modal;


public class Student {
    
               private String sid ;
	       private String fname;
	       private String lname;
	       private String address;
               private String nic;
	       private String contact_num;
	       private String dob;
               private String gender;

    public Student() {
    }

    public Student(String sid, String fname, String lname, String address, String nic, String contact_num, String dob, String gender) {
        this.sid = sid;
        this.fname = fname;
        this.lname = lname;
        this.address = address;
        this.nic = nic;
        this.contact_num = contact_num;
        this.dob = dob;
        this.gender = gender;
    }

    public Student(String string, String string0, String string1, String string2, String string3, String string4, String string5, String string6, String string7, String string8) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
     * @return the fname
     */
    public String getFname() {
        return fname;
    }

    /**
     * @param fname the fname to set
     */
    public void setFname(String fname) {
        this.fname = fname;
    }

    /**
     * @return the lname
     */
    public String getLname() {
        return lname;
    }

    /**
     * @param lname the lname to set
     */
    public void setLname(String lname) {
        this.lname = lname;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the nic
     */
    public String getNic() {
        return nic;
    }

    /**
     * @param nic the nic to set
     */
    public void setNic(String nic) {
        this.nic = nic;
    }

    /**
     * @return the contact_num
     */
    public String getContact_num() {
        return contact_num;
    }

    /**
     * @param contact_num the contact_num to set
     */
    public void setContact_num(String contact_num) {
        this.contact_num = contact_num;
    }

    /**
     * @return the dob
     */
    public String getDob() {
        return dob;
    }

    /**
     * @param dob the dob to set
     */
    public void setDob(String dob) {
        this.dob = dob;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }
               
 
    
}
