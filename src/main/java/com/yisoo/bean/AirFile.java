package com.yisoo.bean;

import java.util.Date;

public class AirFile {
    private Integer airId;

    private String airName;

    private String airMd5;

    private Integer airNum;

    private String airPath;

    private Date airDate;

    private Integer airLong;

    private String airShare;

    private Integer airSize;

    public Integer getAirId() {
        return airId;
    }

    public void setAirId(Integer airId) {
        this.airId = airId;
    }

    public String getAirName() {
        return airName;
    }

    public void setAirName(String airName) {
        this.airName = airName == null ? null : airName.trim();
    }

    public String getAirMd5() {
        return airMd5;
    }

    public void setAirMd5(String airMd5) {
        this.airMd5 = airMd5 == null ? null : airMd5.trim();
    }

    public Integer getAirNum() {
        return airNum;
    }

    public void setAirNum(Integer airNum) {
        this.airNum = airNum;
    }

    public String getAirPath() {
        return airPath;
    }

    public void setAirPath(String airPath) {
        this.airPath = airPath == null ? null : airPath.trim();
    }

    public Date getAirDate() {
        return airDate;
    }

    public void setAirDate(Date airDate) {
        this.airDate = airDate;
    }

    public Integer getAirLong() {
        return airLong;
    }

    public void setAirLong(Integer airLong) {
        this.airLong = airLong;
    }

    public String getAirShare() {
        return airShare;
    }

    public void setAirShare(String airShare) {
        this.airShare = airShare == null ? null : airShare.trim();
    }

    public Integer getAirSize() {
        return airSize;
    }

    public void setAirSize(Integer airSize) {
        this.airSize = airSize;
    }
}