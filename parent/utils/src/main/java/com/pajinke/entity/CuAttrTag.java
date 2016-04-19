package com.pajinke.entity;

import java.util.Date;

/**
 * DW_CU_ATTR_TAG 客户属性标签表
 * Created by liushun on 16/4/12.
 */
public class CuAttrTag {
    /** 一账通客户号 */
    private String client_no;

    /** 集团客户号 */
    private String party_no;

    /** 性别 */
    private String gender;

    /** 年龄 */
    private int age;

    /** 年龄分段(0~25|25~35|35~45|45~55|55~65|65+) */
    private String age_range;

    /** 星座 */
    private String constellation;

    /** 属相 */
    private String zodiac;

    /** 出生省份-城市和现居住省份-城市 */
    private String birth_province;

    /** 出生城市 */
    private String birth_city;

    /** 居住省份 */
    private String live_province;

    /** 居住城市 */
    private String live_city;

    /** 城市等级代码 */
    private String city_level_cd;

    /** 婚姻状况代码(01~06 NA==不详) */
    private String marital_status_cd;

    /** 家庭年收入 */
    private int family_income;

    /** 注册渠道代码(01网注，02柜面注册，03电话注册，04密码注册，05系统注册，06WAP注册，NA不详) */
    private String reg_channel_cd;

    /** 注册来源 */
    private String reg_source;

    /** 用户等级代码(大概4个等级 01~04) */
    private String customer_level_cd;

    /** 升级渠道代码(和注册渠道是一样的) */
    private String upgraded_reg_source;

    /** iOS注册标识 */
    private String reg_ios_ind;

    /** 安卓注册标识 */
    private String reg_andriod_ind;

    /** web注册且使用过app标识 */
    private String reg_web_app_ind;

    /** 一账通黑名单客户标识 */
    private String blacklist_ind;

    /** 注册日期 */
    private Date reg_dt;

    /** 升级标识 */
    private String upgraded_ind;

    /** 升级日期 */
    private Date upgraded_date;

    /** 是否刷机 */
    private String isrobot_ind;

    /** 电话号码 */
    private String iphone;

    public String getClient_no() {
        return client_no;
    }

    public void setClient_no(String client_no) {
        this.client_no = client_no;
    }

    public String getParty_no() {
        return party_no;
    }

    public void setParty_no(String party_no) {
        this.party_no = party_no;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAge_range() {
        return age_range;
    }

    public void setAge_range(String age_range) {
        this.age_range = age_range;
    }

    public String getConstellation() {
        return constellation;
    }

    public void setConstellation(String constellation) {
        this.constellation = constellation;
    }

    public String getZodiac() {
        return zodiac;
    }

    public void setZodiac(String zodiac) {
        this.zodiac = zodiac;
    }

    public String getBirth_province() {
        return birth_province;
    }

    public void setBirth_province(String birth_province) {
        this.birth_province = birth_province;
    }

    public String getBirth_city() {
        return birth_city;
    }

    public void setBirth_city(String birth_city) {
        this.birth_city = birth_city;
    }

    public String getLive_province() {
        return live_province;
    }

    public void setLive_province(String live_province) {
        this.live_province = live_province;
    }

    public String getLive_city() {
        return live_city;
    }

    public void setLive_city(String live_city) {
        this.live_city = live_city;
    }

    public String getCity_level_cd() {
        return city_level_cd;
    }

    public void setCity_level_cd(String city_level_cd) {
        this.city_level_cd = city_level_cd;
    }

    public String getMarital_status_cd() {
        return marital_status_cd;
    }

    public void setMarital_status_cd(String marital_status_cd) {
        this.marital_status_cd = marital_status_cd;
    }

    public int getFamily_income() {
        return family_income;
    }

    public void setFamily_income(int family_income) {
        this.family_income = family_income;
    }

    public String getReg_channel_cd() {
        return reg_channel_cd;
    }

    public void setReg_channel_cd(String reg_channel_cd) {
        this.reg_channel_cd = reg_channel_cd;
    }

    public String getReg_source() {
        return reg_source;
    }

    public void setReg_source(String reg_source) {
        this.reg_source = reg_source;
    }

    public String getCustomer_level_cd() {
        return customer_level_cd;
    }

    public void setCustomer_level_cd(String customer_level_cd) {
        this.customer_level_cd = customer_level_cd;
    }

    public String getUpgraded_reg_source() {
        return upgraded_reg_source;
    }

    public void setUpgraded_reg_source(String upgraded_reg_source) {
        this.upgraded_reg_source = upgraded_reg_source;
    }

    public String getReg_ios_ind() {
        return reg_ios_ind;
    }

    public void setReg_ios_ind(String reg_ios_ind) {
        this.reg_ios_ind = reg_ios_ind;
    }

    public String getReg_andriod_ind() {
        return reg_andriod_ind;
    }

    public void setReg_andriod_ind(String reg_andriod_ind) {
        this.reg_andriod_ind = reg_andriod_ind;
    }

    public String getReg_web_app_ind() {
        return reg_web_app_ind;
    }

    public void setReg_web_app_ind(String reg_web_app_ind) {
        this.reg_web_app_ind = reg_web_app_ind;
    }

    public String getBlacklist_ind() {
        return blacklist_ind;
    }

    public void setBlacklist_ind(String blacklist_ind) {
        this.blacklist_ind = blacklist_ind;
    }

    public Date getReg_dt() {
        return reg_dt;
    }

    public void setReg_dt(Date reg_dt) {
        this.reg_dt = reg_dt;
    }

    public String getUpgraded_ind() {
        return upgraded_ind;
    }

    public void setUpgraded_ind(String upgraded_ind) {
        this.upgraded_ind = upgraded_ind;
    }

    public Date getUpgraded_date() {
        return upgraded_date;
    }

    public void setUpgraded_date(Date upgraded_date) {
        this.upgraded_date = upgraded_date;
    }

    public String getIsrobot_ind() {
        return isrobot_ind;
    }

    public void setIsrobot_ind(String isrobot_ind) {
        this.isrobot_ind = isrobot_ind;
    }

    public String getIphone() {
        return iphone;
    }

    public void setIphone(String iphone) {
        this.iphone = iphone;
    }

    @Override
    public String toString() {
        return "CuAttrJson{" +
                "client_no='" + client_no + '\'' +
                ", party_no='" + party_no + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", age_range='" + age_range + '\'' +
                ", constellation='" + constellation + '\'' +
                ", zodiac='" + zodiac + '\'' +
                ", birth_province='" + birth_province + '\'' +
                ", birth_city='" + birth_city + '\'' +
                ", live_province='" + live_province + '\'' +
                ", live_city='" + live_city + '\'' +
                ", city_level_cd='" + city_level_cd + '\'' +
                ", marital_status_cd='" + marital_status_cd + '\'' +
                ", family_income=" + family_income +
                ", reg_channel_cd='" + reg_channel_cd + '\'' +
                ", reg_source='" + reg_source + '\'' +
                ", customer_level_cd='" + customer_level_cd + '\'' +
                ", upgraded_reg_source='" + upgraded_reg_source + '\'' +
                ", reg_ios_ind='" + reg_ios_ind + '\'' +
                ", reg_andriod_ind='" + reg_andriod_ind + '\'' +
                ", reg_web_app_ind='" + reg_web_app_ind + '\'' +
                ", blacklist_ind='" + blacklist_ind + '\'' +
                ", reg_dt=" + reg_dt +
                ", upgraded_ind='" + upgraded_ind + '\'' +
                ", upgraded_date=" + upgraded_date +
                ", isrobot_ind='" + isrobot_ind + '\'' +
                ", iphone='" + iphone + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CuAttrTag that = (CuAttrTag) o;

        if (age != that.age) return false;
        if (family_income != that.family_income) return false;
        if (!client_no.equals(that.client_no)) return false;
        if (!party_no.equals(that.party_no)) return false;
        if (!gender.equals(that.gender)) return false;
        if (!age_range.equals(that.age_range)) return false;
        if (!constellation.equals(that.constellation)) return false;
        if (!zodiac.equals(that.zodiac)) return false;
        if (!birth_province.equals(that.birth_province)) return false;
        if (!birth_city.equals(that.birth_city)) return false;
        if (!live_province.equals(that.live_province)) return false;
        if (!live_city.equals(that.live_city)) return false;
        if (!city_level_cd.equals(that.city_level_cd)) return false;
        if (!marital_status_cd.equals(that.marital_status_cd)) return false;
        if (!reg_channel_cd.equals(that.reg_channel_cd)) return false;
        if (!reg_source.equals(that.reg_source)) return false;
        if (!customer_level_cd.equals(that.customer_level_cd)) return false;
        if (!upgraded_reg_source.equals(that.upgraded_reg_source)) return false;
        if (!reg_ios_ind.equals(that.reg_ios_ind)) return false;
        if (!reg_andriod_ind.equals(that.reg_andriod_ind)) return false;
        if (!reg_web_app_ind.equals(that.reg_web_app_ind)) return false;
        if (!blacklist_ind.equals(that.blacklist_ind)) return false;
        if (!reg_dt.equals(that.reg_dt)) return false;
        if (!upgraded_ind.equals(that.upgraded_ind)) return false;
        if (!upgraded_date.equals(that.upgraded_date)) return false;
        if (!isrobot_ind.equals(that.isrobot_ind)) return false;
        return iphone.equals(that.iphone);

    }

    @Override
    public int hashCode() {
        int result = client_no.hashCode();
        result = 31 * result + party_no.hashCode();
        result = 31 * result + gender.hashCode();
        result = 31 * result + age;
        result = 31 * result + age_range.hashCode();
        result = 31 * result + constellation.hashCode();
        result = 31 * result + zodiac.hashCode();
        result = 31 * result + birth_province.hashCode();
        result = 31 * result + birth_city.hashCode();
        result = 31 * result + live_province.hashCode();
        result = 31 * result + live_city.hashCode();
        result = 31 * result + city_level_cd.hashCode();
        result = 31 * result + marital_status_cd.hashCode();
        result = 31 * result + family_income;
        result = 31 * result + reg_channel_cd.hashCode();
        result = 31 * result + reg_source.hashCode();
        result = 31 * result + customer_level_cd.hashCode();
        result = 31 * result + upgraded_reg_source.hashCode();
        result = 31 * result + reg_ios_ind.hashCode();
        result = 31 * result + reg_andriod_ind.hashCode();
        result = 31 * result + reg_web_app_ind.hashCode();
        result = 31 * result + blacklist_ind.hashCode();
        result = 31 * result + reg_dt.hashCode();
        result = 31 * result + upgraded_ind.hashCode();
        result = 31 * result + upgraded_date.hashCode();
        result = 31 * result + isrobot_ind.hashCode();
        result = 31 * result + iphone.hashCode();
        return result;
    }
}



















