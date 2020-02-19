package entity;

import java.io.Serializable;
import java.util.List;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

/**
 * Author unknown
 * Date  2020-02-19
 */
public class Student implements Serializable {
    private static final long serialVersionUID = 1L;
    private String sId;
    private String sName;
    private String sBirth;
    private String sSex;


    public Student(){
    }

    public void setSId (String sId) {this.sId = sId;} 
    public String getSId(){ return sId;} 
    public void setSName (String sName) {this.sName = sName;} 
    public String getSName(){ return sName;} 
    public void setSBirth (String sBirth) {this.sBirth = sBirth;} 
    public String getSBirth(){ return sBirth;} 
    public void setSSex (String sSex) {this.sSex = sSex;} 
    public String getSSex(){ return sSex;} 

}