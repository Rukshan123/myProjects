
package lk.ijse.Sms.Modal;


public class Exams {
    
            private String eid;
            private String rid;
            private String semid;
            private String examName;
            private String examDate;
            private String startTme;
            private String endTime;
            private String marks;
            private String results;

    public Exams() {
    }

    public Exams(String eid, String rid, String semid, String examName, String examDate, String startTme, String endTime, String marks, String results) {
        this.eid = eid;
        this.rid = rid;
        this.semid = semid;
        this.examName = examName;
        this.examDate = examDate;
        this.startTme = startTme;
        this.endTime = endTime;
        this.marks = marks;
        this.results = results;
    }

    public Exams(String string, String string0, String string1, String string2, String string3, String string4, String string5, String string6) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @return the eid
     */
    public String getEid() {
        return eid;
    }

    /**
     * @param eid the eid to set
     */
    public void setEid(String eid) {
        this.eid = eid;
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
     * @return the examName
     */
    public String getExamName() {
        return examName;
    }

    /**
     * @param examName the examName to set
     */
    public void setExamName(String examName) {
        this.examName = examName;
    }

    /**
     * @return the examDate
     */
    public String getExamDate() {
        return examDate;
    }

    /**
     * @param examDate the examDate to set
     */
    public void setExamDate(String examDate) {
        this.examDate = examDate;
    }

    /**
     * @return the startTme
     */
    public String getStartTme() {
        return startTme;
    }

    /**
     * @param startTme the startTme to set
     */
    public void setStartTme(String startTme) {
        this.startTme = startTme;
    }

    /**
     * @return the endTime
     */
    public String getEndTime() {
        return endTime;
    }

    /**
     * @param endTime the endTime to set
     */
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    /**
     * @return the marks
     */
    public String getMarks() {
        return marks;
    }

    /**
     * @param marks the marks to set
     */
    public void setMarks(String marks) {
        this.marks = marks;
    }

    /**
     * @return the results
     */
    public String getResults() {
        return results;
    }

    /**
     * @param results the results to set
     */
    public void setResults(String results) {
        this.results = results;
    }
            
            
    
}
