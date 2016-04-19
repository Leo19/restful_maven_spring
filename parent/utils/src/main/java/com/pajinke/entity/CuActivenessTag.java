package com.pajinke.entity;

/**
 * DW_CU_ACTIVENESS_TAG 客户活跃程度标签
 * Created by Leo on 16/4/13.
 */
public class CuActivenessTag {

    /** 注册时间代码(A:注册时间距离当天1-5天，B:6-15，C:16-30，D:31-60) */
    private String reg_time_range_cd;

    /** 活跃程度(高频:注距离当天15日内登陆5次以上，一般:15日内登陆2-5次，登陆一次，轻度睡眠，睡眠) */
    private String activity_range;

    /** 当天最活跃渠道 */
    private String activity_channel;

    /** 最活跃渠道登陆次数 */
    private int activity_logins_cnt;

    public String getReg_time_range_cd() {
        return reg_time_range_cd;
    }

    public void setReg_time_range_cd(String reg_time_range_cd) {
        this.reg_time_range_cd = reg_time_range_cd;
    }

    public String getActivity_range() {
        return activity_range;
    }

    public void setActivity_range(String activity_range) {
        this.activity_range = activity_range;
    }

    public String getActivity_channel() {
        return activity_channel;
    }

    public void setActivity_channel(String activity_channel) {
        this.activity_channel = activity_channel;
    }

    public int getActivity_logins_cnt() {
        return activity_logins_cnt;
    }

    public void setActivity_logins_cnt(int activity_logins_cnt) {
        this.activity_logins_cnt = activity_logins_cnt;
    }

    @Override
    public String toString() {
        return "CuActivenessJson{" +
                "reg_time_range_cd='" + reg_time_range_cd + '\'' +
                ", activity_range='" + activity_range + '\'' +
                ", activity_channel='" + activity_channel + '\'' +
                ", activity_logins_cnt=" + activity_logins_cnt +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CuActivenessTag that = (CuActivenessTag) o;

        if (activity_logins_cnt != that.activity_logins_cnt) return false;
        if (!reg_time_range_cd.equals(that.reg_time_range_cd)) return false;
        if (!activity_range.equals(that.activity_range)) return false;
        return activity_channel.equals(that.activity_channel);

    }

    @Override
    public int hashCode() {
        int result = reg_time_range_cd.hashCode();
        result = 31 * result + activity_range.hashCode();
        result = 31 * result + activity_channel.hashCode();
        result = 31 * result + activity_logins_cnt;
        return result;
    }
}
