package com.yisoo.bean;

import java.util.Date;

public class AirLog {
    private Integer airId;

    private String airAdress;

    private Date airTime;

    private String airFlag;

    public Integer getAirId() {
        return airId;
    }

    public void setAirId(Integer airId) {
        this.airId = airId;
    }

    public String getAirAdress() {
        return airAdress;
    }

    public void setAirAdress(String airAdress) {
        this.airAdress = airAdress == null ? null : airAdress.trim();
    }

    public Date getAirTime() {
        return airTime;
    }

    public void setAirTime(Date airTime) {
        this.airTime = airTime;
    }

    public String getAirFlag() {
        return airFlag;
    }

    public void setAirFlag(String airFlag) {
        this.airFlag = airFlag == null ? null : airFlag.trim();
    }
}