package com.company.Model.entity;

/**
 * Created by Sara on 12/31/2019.
 */
public class SREntity implements User {
    private String sname;
    private String rname;
    private String radd;
    private long rdate;
    private long spcode;
    private long rpcode;
    private long sdate;
    private long stime;

    public String getSname() {
        return sname;
    }

    public SREntity setSname(String sname) {
        this.sname = sname;
        return this;
    }
    public String getRname(){return  rname;}
    public SREntity setRname(String rname){
        this.rname=rname;
        return this;
    }

    public String getRadd() {
        return radd;
    }

    public SREntity setRadd(String radd) {
        this.radd = radd;
        return this;
    }

    public long getRdate() {
        return rdate;
    }

    public SREntity setRdate(long rdate) {
        this.rdate = rdate;
        return this;
    }
    public long getSpcode() {
        return spcode;
    }

    public SREntity setSpcode(long spcode) {
        this.spcode = spcode;
        return this;
    }
    public long getRpcode() {
        return rpcode;
    }

    public SREntity setRpcode(long rpcode) {
        this.rpcode = rpcode;
        return this;
    }
    public long getSdate(){ return sdate; }

    public SREntity setSdate(long sdate){
        this.sdate=sdate;
        return this;

    }
    public long getStime(){ return stime; }

    public SREntity setStime(long stime){
        this.stime=stime;
        return this;
    }

}
