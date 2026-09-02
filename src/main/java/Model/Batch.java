package Model;

import java.sql.Date;

public class Batch {

    private int bId;
    private String bName;
    private Date bStartDate;
    private int tId;
    private String bStatus;

    // Default constructor
    public Batch() {
    }

    // Parameterized constructor
    public Batch(int bId, String bName, Date bStartDate,
                 int tId, String bStatus) {

        this.bId = bId;
        this.bName = bName;
        this.bStartDate = bStartDate;
        this.tId = tId;
        this.bStatus = bStatus;
    }
    
    
    public int getBId() {
        return this.bId;
    }

    public String getBName() {
        return this.bName;
    }

    public Date getBStartDate() {
        return this.bStartDate;
    }

    public int getTId() {
        return this.tId;
    }

    public String getBStatus() {
        return this.bStatus;
    }
    
    
    
    
    public void setBId(int bId) {
        this.bId = bId;
    }

    public void setBName(String bName) {
        this.bName = bName;
    }

    public void setBStartDate(Date bStartDate) {
        this.bStartDate = bStartDate;
    }

    public void setTId(int tId) {
        this.tId = tId;
    }

    public void setBStatus(String bStatus) {
        this.bStatus = bStatus;
    }
    
    
}
