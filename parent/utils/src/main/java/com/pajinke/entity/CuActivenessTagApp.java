package com.pajinke.entity;

import java.util.Date;

/**
 * Created by Leo on 16/4/13.
 */
public class CuActivenessTagApp {

    /** 活跃程度(高频:注距离当天15日内登陆5次以上，一般:15日内登陆2-5次，登陆一次，轻度睡眠，睡眠) */
    private String app_activity_range;

    /** App首次登陆日期 */
    private Date app_first_logon_dt;

    /** App最后一次登陆日期 */
    private Date app_latest_logon_dt;

    /** App当天最活跃渠道 */
    private String app_activity_channel;

    /** App当天最活跃渠道登陆次数 */
    private int app_activity_logins_cnt;

    public String getApp_activity_range() {
        return app_activity_range;
    }

    public void setApp_activity_range(String app_activity_range) {
        this.app_activity_range = app_activity_range;
    }

    public Date getApp_first_logon_dt() {
        return app_first_logon_dt;
    }

    public void setApp_first_logon_dt(Date app_first_logon_dt) {
        this.app_first_logon_dt = app_first_logon_dt;
    }

    public Date getApp_latest_logon_dt() {
        return app_latest_logon_dt;
    }

    public void setApp_latest_logon_dt(Date app_latest_logon_dt) {
        this.app_latest_logon_dt = app_latest_logon_dt;
    }

    public String getApp_activity_channel() {
        return app_activity_channel;
    }

    public void setApp_activity_channel(String app_activity_channel) {
        this.app_activity_channel = app_activity_channel;
    }

    public int getApp_activity_logins_cnt() {
        return app_activity_logins_cnt;
    }

    public void setApp_activity_logins_cnt(int app_activity_logins_cnt) {
        this.app_activity_logins_cnt = app_activity_logins_cnt;
    }

    @Override
    public String toString() {
        return "CuActivenessJsonApp{" +
                "app_activity_range='" + app_activity_range + '\'' +
                ", app_first_logon_dt=" + app_first_logon_dt +
                ", app_latest_logon_dt=" + app_latest_logon_dt +
                ", app_activity_channel='" + app_activity_channel + '\'' +
                ", app_activity_logins_cnt=" + app_activity_logins_cnt +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CuActivenessTagApp that = (CuActivenessTagApp) o;

        if (app_activity_logins_cnt != that.app_activity_logins_cnt) return false;
        if (!app_activity_range.equals(that.app_activity_range)) return false;
        if (!app_first_logon_dt.equals(that.app_first_logon_dt)) return false;
        if (!app_latest_logon_dt.equals(that.app_latest_logon_dt)) return false;
        return app_activity_channel.equals(that.app_activity_channel);

    }

    @Override
    public int hashCode() {
        int result = app_activity_range.hashCode();
        result = 31 * result + app_first_logon_dt.hashCode();
        result = 31 * result + app_latest_logon_dt.hashCode();
        result = 31 * result + app_activity_channel.hashCode();
        result = 31 * result + app_activity_logins_cnt;
        return result;
    }
}
