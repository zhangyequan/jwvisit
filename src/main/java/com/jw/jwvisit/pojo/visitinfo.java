package com.jw.jwvisit.pojo;

import java.util.Date;

public class visitinfo {
    private int id;
    private String visitedname;
    private String visitedpnum;
    private String visitedevent;
    private Date visittime;
    private Date lefttime;
    private String visitorname;
    private String visitorpnum;
    private String identitynum;
    private String platenum;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVisitedname() {
        return visitedname;
    }

    public void setVisitedname(String visitedname) {
        this.visitedname = visitedname;
    }

    public String getVisitedpnum() {
        return visitedpnum;
    }

    public void setVisitedpnum(String visitedpnum) {
        this.visitedpnum = visitedpnum;
    }

    public String getVisitedevent() {
        return visitedevent;
    }

    public void setVisitedevent(String visitedevent) {
        this.visitedevent = visitedevent;
    }

    public Date getVisittime() {
        return visittime;
    }

    public void setVisittime(Date visittime) {
        this.visittime = visittime;
    }

    public Date getLefttime() {
        return lefttime;
    }

    public void setLefttime(Date lefttime) {
        this.lefttime = lefttime;
    }

    public String getVisitorname() {
        return visitorname;
    }

    public void setVisitorname(String visitorname) {
        this.visitorname = visitorname;
    }

    public String getVisitorpnum() {
        return visitorpnum;
    }

    public void setVisitorpnum(String visitorpnum) {
        this.visitorpnum = visitorpnum;
    }

    public String getIdentitynum() {
        return identitynum;
    }

    public void setIdentitynum(String identitynum) {
        this.identitynum = identitynum;
    }

    public String getPlatenum() {
        return platenum;
    }

    public void setPlatenum(String platenum) {
        this.platenum = platenum;
    }
}
