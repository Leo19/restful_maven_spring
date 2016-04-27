package com.pajinke.entity;

import java.util.Date;

/**
 * Created by Leo on 16/4/12.
 */
public class LabelData {
	
	// dw_cu_attr_tag 客户属性标签表 BEGIN
    /** 一账通客户号 */
    private String client_no;

    /** 集团客户号 */
    private String party_no;

    /** 性别 */
    private String attr_gender;

    /** 年龄 */
    private Integer attr_age;

    /** 年龄分段(0~25|25~35|35~45|45~55|55~65|65+) */
    private String attr_age_range;

    /** 星座 */
    private String attr_constellation;

    /** 属相 */
    private String attr_zodiac;

    /** 出生省份-城市和现居住省份-城市 */
    private String attr_birth_province;

    /** 出生城市 */
    private String attr_birth_city;

    /** 居住省份 */
    private String attr_live_province;

    /** 居住城市 */
    private String attr_live_city;

    /** 城市等级代码 */
    private String attr_city_level_cd;

    /** 婚姻状况代码(01~06 NA==不详) */
    private String attr_marital_status_cd;

    /** 家庭年收入 */
    private Integer attr_family_income;

    /** 注册渠道代码(01网注，02柜面注册，03电话注册，04密码注册，05系统注册，06WAP注册，NA不详) */
    private String attr_reg_channel_cd;

    /** 注册来源 */
    private String attr_reg_source;

    /** 用户等级代码(大概4个等级 01~04) */
    private String attr_customer_level_cd;

    /** 升级渠道代码(和注册渠道是一样的) */
    private String attr_upgraded_reg_source;

    /** iOS注册标识 */
    private String attr_reg_ios_ind;

    /** 安卓注册标识 */
    private String attr_reg_andriod_ind;

    /** web注册且使用过app标识 */
    private String attr_reg_web_app_ind;

    /** 一账通黑名单客户标识 */
    private String attr_blacklist_ind;

    /** 注册日期 */
    private Date attr_reg_dt;

    /** 升级标识 */
    private String attr_upgraded_ind;

    /** 升级日期 */
    private Date attr_upgraded_date;

    /** 是否刷机 */
    private String attr_isrobot_ind;

    /** 电话号码 */
    private String attr_iphone;
    // dw_cu_attr_tag 客户属性标签表 END

    
    // dw_cu_activeness_tag 客户活跃度标签 BEGIN
	/** 注册时间代码(A:注册时间距离当天1-5天，B:6-15，C:16-30，D:31-60) */
    private String reg_time_range_cd;

    /** 活跃程度(高频:注距离当天15日内登陆5次以上，一般:15日内登陆2-5次，登陆一次，轻度睡眠，睡眠) */
    private String activity_range;

    /** 当天最活跃渠道 */
    private String activity_channel;

    /** 最活跃渠道登陆次数 */
    private Integer activity_logins_cnt;
    // dw_cu_activeness_tag 客户活跃度标签 END
    

    // dw_cu_activeness_tag_app 端客户活跃度标签 BEGIN
    /** 活跃程度(高频:注距离当天15日内登陆5次以上，一般:15日内登陆2-5次，登陆一次，轻度睡眠，睡眠) */
    private String app_activity_range;

    /** App首次登陆日期 */
    private Date app_first_logon_dt;

    /** App最后一次登陆日期 */
    private Date app_latest_logon_dt;

    /** App当天最活跃渠道 */
    private String app_activity_channel;

    /** App当天最活跃渠道登陆次数 */
    private Integer app_activity_logins_cnt;
    // dw_cu_activeness_tag_app 端客户活跃度标签 END
    
    
    // dw_cu_prd_bind tag 用户加挂标签表 BEGIN
    /** 加挂年金标识 */
    private String bind_annuity_ind;

    /** 加挂团险标识 */
    private String bind_group_ind;

    /** 加挂健康险标识 */
    private String bind_health_ind;

    /** 加挂养老险标识 */
    private String bind_pension_ind;

    /** 加挂寿险标识 */
    private String bind_life_ind;

    /** 加挂产险标识 */
    private String bind_property_ind;

    /** 加挂基金标识 */
    private String bind_fund_ind;

    /** 加挂股票标识 */
    private String bind_stock_ind;

    /** 加挂信托标识 */
    private String bind_trust_ind;

    /** 加挂银行标识 */
    private String bind_bank_ind;

    /** 加挂信用卡标识 */
    private String bind_credit_ind;

    /** 加挂财富E标识 */
    private String bind_ewealth_ind;

    /** 加挂壹钱包标识 */
    private String bind_yqb_ind;

    /** 加挂理财宝标识 */
    private String bind_lcb_ind;

    /** 加挂万里通标识 */
    private String bind_wlt_ind;

    /** 加挂好房标识 */
    private String bind_haofang_ind;

    /** 加挂橙子银行标识 */
    private String bind_orange_ind;

    /** 加挂一账通宝标识 */
    private String bind_yzbt_ind;

    /** 加挂陆金所标识 */
    private String bind_lufax_ind;

    /** 加挂车标识 */
    private String bind_car_ind;

    /** 加挂房标识 */
    private String bind_house_ind;

    /** 加挂外部信用卡标识 */
    private String bind_ex_credit_ind;

    /** 加挂外部银行标识 */
    private String bind_ex_bank_ind;

    /** 加挂身份证标识 */
    private String bind_id_card_ind;

    /** 加挂户口本标识 */
    private String bind_booklet_ind;

    /** 加挂驾驶证标识 */
    private String bind_driving_license_ind;

    /** 加挂护照标识 */
    private String bind_passport_ind;

    /** 加挂港澳通行证标识 */
    private String bind_permits_ind;

    /** 加挂行驶证标识 */
    private String bind_vehicle_license_ind;

    /** 加挂房产标识 */
    private String bind_housing_property_ind;

    /** 加挂名片标识 */
    private String bind_buz_card_ind;

    /** 加挂会员标识 */
    private String bind_mem_card_ind;

    /** 加挂优惠券标识 */
    private String bind_coupon_ind;

    /** 加挂票据标识 */
    private String bind_bill_ind;

    /** 加挂其他标识 */
    private String bind_oth_card_ind;

    /** 加挂外部账号数 */
    private Integer bind_ex_account_cnt;

    /** 加挂车数 */
    private Integer bind_car_cnt;

    /** 加挂房数 */
    private Integer bind_house_cnt;
    // dw_cu_prd_bind tag 用户加挂标签表 END

    
    // dw_mo_model_tag 用户加挂标签表 BEGIN
    private String model_cmv;

    /** 客户价值可靠标识 */
    private String model_cmv_cal_ind;

    /** 货币类增益系数 */
    private Double model_cash_correlation;

    /** 固定收入类增益系数 */
    private Double model_fixed_correlation;

    /** 股票类增益系数 */
    private Double model_equity_correlation;

    /** 客户风险偏好(A~E 保守型，稳健型等等) */
    private String model_risk_cluster;

    /** 客户流失分 */
    private Double model_churn_score;

    /** 客户流失分为区间 */
    private Integer model_churn_decile;

    /** 一账通宝开户倾向分 */
    private Double model_1ztb_prop_score;

    /** 一账通宝开户倾向分位区间 */
    private Integer model_1ztb_prop_decile;

    /** 股票型基金倾向分 */
    private Double model_stockf_prop_score;

    /** 股票型基金倾向分位区间 */
    private Integer model_stockf_prop_decile;

    /** 保本型基金倾向分 */
    private Double model_presf_prop_score;

    /** 保本型基金倾向分位区间 */
    private Integer model_presf_prop_decile;

    /** 债券型基金倾向分 */
    private Double model_bondf_prop_score;

    /** 债券型基金倾向分位区间 */
    private Integer model_bondf_prop_decile;

    /** 货币型基金倾向分 */
    private Double model_cashf_prop_score;

    /** 货币型基金倾向分位区间 */
    private Integer model_cashf_prop_decile;

    /** 混合型基金倾向分 */
    private Double model_mixedf_prop_score;

    /** 混合型基金倾向分位区间 */
    private Integer model_mixexf_prop_decile;

    /** 陆金所资产倾向分 */
    private Double model_lufax_prop_score;

    /** 陆金所资产倾向分位区间 */
    private Integer model_lufax_prop_decile;
    // dw_mo_model_tag 用户加挂标签表 END

    
    // dw_mo_propensity_tag_gbd 倾向性模型标签 BEGIN
    /** 车险倾向分 */
    private Double propensity_autoins_score;

    /** 车险倾向分位区间 */
    private Integer propensity_autoins_decile;

    /** 贷款倾向分 */
    private Double propensity_loan_score;

    /** 贷款倾向分位区间 */
    private Integer propensity_loan_decile;

    /** 银行理财产品倾向分 */
    private Double propensity_fiscalprd_score;

    /** 银行理财产品倾向分位区间 */
    private Integer propensity_fiscalprd_decile;

    /** 信用卡倾向分 */
    private Double propensity_credit_score;

    /** 信用卡倾向分位区间 */
    private Integer propensity_credit_decile;

    /** 基金倾向分 */
    private Double propensity_fund_score;

    /** 基金倾向分位区间 */
    private Integer propensity_fund_decile;

    /** 证券倾向分 */
    private Double propensity_bond_score;

    /** 证券倾向分位区间 */
    private Integer propensity_bond_decile;

    /** 信托倾向分 */
    private Double propensity_trust_score;

    /** 信托倾向分位区间 */
    private Integer propensity_trust_decile;

    /** 小消倾向分 */
    private Double propensity_smallpur_score;

    /** 小消倾向分位区间 */
    private Integer propensity_smallpur_decile;

    /** 家财险倾向分 */
    private Double propensity_familyproins_score;

    /** 家财险倾向分位区间 */
    private Integer propensity_familyproins_decile;

    /** 养老险倾向分 */
    private Double propensity_pension_score;

    /** 养老险倾向分位区间 */
    private Integer propensity_pension_decile;
    // dw_mo_propensity_tag_gbd 倾向性模型标签 END
    
    private Date created_date;

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

	public String getAttr_gender() {
		return attr_gender;
	}

	public void setAttr_gender(String attr_gender) {
		this.attr_gender = attr_gender;
	}

	public Integer getAttr_age() {
		return attr_age;
	}

	public void setAttr_age(Integer attr_age) {
		this.attr_age = attr_age;
	}

	public String getAttr_age_range() {
		return attr_age_range;
	}

	public void setAttr_age_range(String attr_age_range) {
		this.attr_age_range = attr_age_range;
	}

	public String getAttr_constellation() {
		return attr_constellation;
	}

	public void setAttr_constellation(String attr_constellation) {
		this.attr_constellation = attr_constellation;
	}

	public String getAttr_zodiac() {
		return attr_zodiac;
	}

	public void setAttr_zodiac(String attr_zodiac) {
		this.attr_zodiac = attr_zodiac;
	}

	public String getAttr_birth_province() {
		return attr_birth_province;
	}

	public void setAttr_birth_province(String attr_birth_province) {
		this.attr_birth_province = attr_birth_province;
	}

	public String getAttr_birth_city() {
		return attr_birth_city;
	}

	public void setAttr_birth_city(String attr_birth_city) {
		this.attr_birth_city = attr_birth_city;
	}

	public String getAttr_live_province() {
		return attr_live_province;
	}

	public void setAttr_live_province(String attr_live_province) {
		this.attr_live_province = attr_live_province;
	}

	public String getAttr_live_city() {
		return attr_live_city;
	}

	public void setAttr_live_city(String attr_live_city) {
		this.attr_live_city = attr_live_city;
	}

	public String getAttr_city_level_cd() {
		return attr_city_level_cd;
	}

	public void setAttr_city_level_cd(String attr_city_level_cd) {
		this.attr_city_level_cd = attr_city_level_cd;
	}

	public String getAttr_marital_status_cd() {
		return attr_marital_status_cd;
	}

	public void setAttr_marital_status_cd(String attr_marital_status_cd) {
		this.attr_marital_status_cd = attr_marital_status_cd;
	}

	public Integer getAttr_family_income() {
		return attr_family_income;
	}

	public void setAttr_family_income(Integer attr_family_income) {
		this.attr_family_income = attr_family_income;
	}

	public String getAttr_reg_channel_cd() {
		return attr_reg_channel_cd;
	}

	public void setAttr_reg_channel_cd(String attr_reg_channel_cd) {
		this.attr_reg_channel_cd = attr_reg_channel_cd;
	}

	public String getAttr_reg_source() {
		return attr_reg_source;
	}

	public void setAttr_reg_source(String attr_reg_source) {
		this.attr_reg_source = attr_reg_source;
	}

	public String getAttr_customer_level_cd() {
		return attr_customer_level_cd;
	}

	public void setAttr_customer_level_cd(String attr_customer_level_cd) {
		this.attr_customer_level_cd = attr_customer_level_cd;
	}

	public String getAttr_upgraded_reg_source() {
		return attr_upgraded_reg_source;
	}

	public void setAttr_upgraded_reg_source(String attr_upgraded_reg_source) {
		this.attr_upgraded_reg_source = attr_upgraded_reg_source;
	}

	public String getAttr_reg_ios_ind() {
		return attr_reg_ios_ind;
	}

	public void setAttr_reg_ios_ind(String attr_reg_ios_ind) {
		this.attr_reg_ios_ind = attr_reg_ios_ind;
	}

	public String getAttr_reg_andriod_ind() {
		return attr_reg_andriod_ind;
	}

	public void setAttr_reg_andriod_ind(String attr_reg_andriod_ind) {
		this.attr_reg_andriod_ind = attr_reg_andriod_ind;
	}

	public String getAttr_reg_web_app_ind() {
		return attr_reg_web_app_ind;
	}

	public void setAttr_reg_web_app_ind(String attr_reg_web_app_ind) {
		this.attr_reg_web_app_ind = attr_reg_web_app_ind;
	}

	public String getAttr_blacklist_ind() {
		return attr_blacklist_ind;
	}

	public void setAttr_blacklist_ind(String attr_blacklist_ind) {
		this.attr_blacklist_ind = attr_blacklist_ind;
	}

	public Date getAttr_reg_dt() {
		return attr_reg_dt;
	}

	public void setAttr_reg_dt(Date attr_reg_dt) {
		this.attr_reg_dt = attr_reg_dt;
	}

	public String getAttr_upgraded_ind() {
		return attr_upgraded_ind;
	}

	public void setAttr_upgraded_ind(String attr_upgraded_ind) {
		this.attr_upgraded_ind = attr_upgraded_ind;
	}

	public Date getAttr_upgraded_date() {
		return attr_upgraded_date;
	}

	public void setAttr_upgraded_date(Date attr_upgraded_date) {
		this.attr_upgraded_date = attr_upgraded_date;
	}

	public String getAttr_isrobot_ind() {
		return attr_isrobot_ind;
	}

	public void setAttr_isrobot_ind(String attr_isrobot_ind) {
		this.attr_isrobot_ind = attr_isrobot_ind;
	}

	public String getAttr_iphone() {
		return attr_iphone;
	}

	public void setAttr_iphone(String attr_iphone) {
		this.attr_iphone = attr_iphone;
	}

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

	public Integer getActivity_logins_cnt() {
		return activity_logins_cnt;
	}

	public void setActivity_logins_cnt(Integer activity_logins_cnt) {
		this.activity_logins_cnt = activity_logins_cnt;
	}

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

	public Integer getApp_activity_logins_cnt() {
		return app_activity_logins_cnt;
	}

	public void setApp_activity_logins_cnt(Integer app_activity_logins_cnt) {
		this.app_activity_logins_cnt = app_activity_logins_cnt;
	}

	public String getBind_annuity_ind() {
		return bind_annuity_ind;
	}

	public void setBind_annuity_ind(String bind_annuity_ind) {
		this.bind_annuity_ind = bind_annuity_ind;
	}

	public String getBind_group_ind() {
		return bind_group_ind;
	}

	public void setBind_group_ind(String bind_group_ind) {
		this.bind_group_ind = bind_group_ind;
	}

	public String getBind_health_ind() {
		return bind_health_ind;
	}

	public void setBind_health_ind(String bind_health_ind) {
		this.bind_health_ind = bind_health_ind;
	}

	public String getBind_pension_ind() {
		return bind_pension_ind;
	}

	public void setBind_pension_ind(String bind_pension_ind) {
		this.bind_pension_ind = bind_pension_ind;
	}

	public String getBind_life_ind() {
		return bind_life_ind;
	}

	public void setBind_life_ind(String bind_life_ind) {
		this.bind_life_ind = bind_life_ind;
	}

	public String getBind_property_ind() {
		return bind_property_ind;
	}

	public void setBind_property_ind(String bind_property_ind) {
		this.bind_property_ind = bind_property_ind;
	}

	public String getBind_fund_ind() {
		return bind_fund_ind;
	}

	public void setBind_fund_ind(String bind_fund_ind) {
		this.bind_fund_ind = bind_fund_ind;
	}

	public String getBind_stock_ind() {
		return bind_stock_ind;
	}

	public void setBind_stock_ind(String bind_stock_ind) {
		this.bind_stock_ind = bind_stock_ind;
	}

	public String getBind_trust_ind() {
		return bind_trust_ind;
	}

	public void setBind_trust_ind(String bind_trust_ind) {
		this.bind_trust_ind = bind_trust_ind;
	}

	public String getBind_bank_ind() {
		return bind_bank_ind;
	}

	public void setBind_bank_ind(String bind_bank_ind) {
		this.bind_bank_ind = bind_bank_ind;
	}

	public String getBind_credit_ind() {
		return bind_credit_ind;
	}

	public void setBind_credit_ind(String bind_credit_ind) {
		this.bind_credit_ind = bind_credit_ind;
	}

	public String getBind_ewealth_ind() {
		return bind_ewealth_ind;
	}

	public void setBind_ewealth_ind(String bind_ewealth_ind) {
		this.bind_ewealth_ind = bind_ewealth_ind;
	}

	public String getBind_yqb_ind() {
		return bind_yqb_ind;
	}

	public void setBind_yqb_ind(String bind_yqb_ind) {
		this.bind_yqb_ind = bind_yqb_ind;
	}

	public String getBind_lcb_ind() {
		return bind_lcb_ind;
	}

	public void setBind_lcb_ind(String bind_lcb_ind) {
		this.bind_lcb_ind = bind_lcb_ind;
	}

	public String getBind_wlt_ind() {
		return bind_wlt_ind;
	}

	public void setBind_wlt_ind(String bind_wlt_ind) {
		this.bind_wlt_ind = bind_wlt_ind;
	}

	public String getBind_haofang_ind() {
		return bind_haofang_ind;
	}

	public void setBind_haofang_ind(String bind_haofang_ind) {
		this.bind_haofang_ind = bind_haofang_ind;
	}

	public String getBind_orange_ind() {
		return bind_orange_ind;
	}

	public void setBind_orange_ind(String bind_orange_ind) {
		this.bind_orange_ind = bind_orange_ind;
	}

	public String getBind_yzbt_ind() {
		return bind_yzbt_ind;
	}

	public void setBind_yzbt_ind(String bind_yzbt_ind) {
		this.bind_yzbt_ind = bind_yzbt_ind;
	}

	public String getBind_lufax_ind() {
		return bind_lufax_ind;
	}

	public void setBind_lufax_ind(String bind_lufax_ind) {
		this.bind_lufax_ind = bind_lufax_ind;
	}

	public String getBind_car_ind() {
		return bind_car_ind;
	}

	public void setBind_car_ind(String bind_car_ind) {
		this.bind_car_ind = bind_car_ind;
	}

	public String getBind_house_ind() {
		return bind_house_ind;
	}

	public void setBind_house_ind(String bind_house_ind) {
		this.bind_house_ind = bind_house_ind;
	}

	public String getBind_ex_credit_ind() {
		return bind_ex_credit_ind;
	}

	public void setBind_ex_credit_ind(String bind_ex_credit_ind) {
		this.bind_ex_credit_ind = bind_ex_credit_ind;
	}

	public String getBind_ex_bank_ind() {
		return bind_ex_bank_ind;
	}

	public void setBind_ex_bank_ind(String bind_ex_bank_ind) {
		this.bind_ex_bank_ind = bind_ex_bank_ind;
	}

	public String getBind_id_card_ind() {
		return bind_id_card_ind;
	}

	public void setBind_id_card_ind(String bind_id_card_ind) {
		this.bind_id_card_ind = bind_id_card_ind;
	}

	public String getBind_booklet_ind() {
		return bind_booklet_ind;
	}

	public void setBind_booklet_ind(String bind_booklet_ind) {
		this.bind_booklet_ind = bind_booklet_ind;
	}

	public String getBind_driving_license_ind() {
		return bind_driving_license_ind;
	}

	public void setBind_driving_license_ind(String bind_driving_license_ind) {
		this.bind_driving_license_ind = bind_driving_license_ind;
	}

	public String getBind_passport_ind() {
		return bind_passport_ind;
	}

	public void setBind_passport_ind(String bind_passport_ind) {
		this.bind_passport_ind = bind_passport_ind;
	}

	public String getBind_permits_ind() {
		return bind_permits_ind;
	}

	public void setBind_permits_ind(String bind_permits_ind) {
		this.bind_permits_ind = bind_permits_ind;
	}

	public String getBind_vehicle_license_ind() {
		return bind_vehicle_license_ind;
	}

	public void setBind_vehicle_license_ind(String bind_vehicle_license_ind) {
		this.bind_vehicle_license_ind = bind_vehicle_license_ind;
	}

	public String getBind_housing_property_ind() {
		return bind_housing_property_ind;
	}

	public void setBind_housing_property_ind(String bind_housing_property_ind) {
		this.bind_housing_property_ind = bind_housing_property_ind;
	}

	public String getBind_buz_card_ind() {
		return bind_buz_card_ind;
	}

	public void setBind_buz_card_ind(String bind_buz_card_ind) {
		this.bind_buz_card_ind = bind_buz_card_ind;
	}

	public String getBind_mem_card_ind() {
		return bind_mem_card_ind;
	}

	public void setBind_mem_card_ind(String bind_mem_card_ind) {
		this.bind_mem_card_ind = bind_mem_card_ind;
	}

	public String getBind_coupon_ind() {
		return bind_coupon_ind;
	}

	public void setBind_coupon_ind(String bind_coupon_ind) {
		this.bind_coupon_ind = bind_coupon_ind;
	}

	public String getBind_bill_ind() {
		return bind_bill_ind;
	}

	public void setBind_bill_ind(String bind_bill_ind) {
		this.bind_bill_ind = bind_bill_ind;
	}

	public String getBind_oth_card_ind() {
		return bind_oth_card_ind;
	}

	public void setBind_oth_card_ind(String bind_oth_card_ind) {
		this.bind_oth_card_ind = bind_oth_card_ind;
	}

	public Integer getBind_ex_account_cnt() {
		return bind_ex_account_cnt;
	}

	public void setBind_ex_account_cnt(Integer bind_ex_account_cnt) {
		this.bind_ex_account_cnt = bind_ex_account_cnt;
	}

	public Integer getBind_car_cnt() {
		return bind_car_cnt;
	}

	public void setBind_car_cnt(Integer bind_car_cnt) {
		this.bind_car_cnt = bind_car_cnt;
	}

	public Integer getBind_house_cnt() {
		return bind_house_cnt;
	}

	public void setBind_house_cnt(Integer bind_house_cnt) {
		this.bind_house_cnt = bind_house_cnt;
	}

	public String getModel_cmv() {
		return model_cmv;
	}

	public void setModel_cmv(String model_cmv) {
		this.model_cmv = model_cmv;
	}

	public String getModel_cmv_cal_ind() {
		return model_cmv_cal_ind;
	}

	public void setModel_cmv_cal_ind(String model_cmv_cal_ind) {
		this.model_cmv_cal_ind = model_cmv_cal_ind;
	}

	public Double getModel_cash_correlation() {
		return model_cash_correlation;
	}

	public void setModel_cash_correlation(Double model_cash_correlation) {
		this.model_cash_correlation = model_cash_correlation;
	}

	public Double getModel_fixed_correlation() {
		return model_fixed_correlation;
	}

	public void setModel_fixed_correlation(Double model_fixed_correlation) {
		this.model_fixed_correlation = model_fixed_correlation;
	}

	public Double getModel_equity_correlation() {
		return model_equity_correlation;
	}

	public void setModel_equity_correlation(Double model_equity_correlation) {
		this.model_equity_correlation = model_equity_correlation;
	}

	public String getModel_risk_cluster() {
		return model_risk_cluster;
	}

	public void setModel_risk_cluster(String model_risk_cluster) {
		this.model_risk_cluster = model_risk_cluster;
	}

	public Double getModel_churn_score() {
		return model_churn_score;
	}

	public void setModel_churn_score(Double model_churn_score) {
		this.model_churn_score = model_churn_score;
	}

	public Integer getModel_churn_decile() {
		return model_churn_decile;
	}

	public void setModel_churn_decile(Integer model_churn_decile) {
		this.model_churn_decile = model_churn_decile;
	}

	public Double getModel_1ztb_prop_score() {
		return model_1ztb_prop_score;
	}

	public void setModel_1ztb_prop_score(Double model_1ztb_prop_score) {
		this.model_1ztb_prop_score = model_1ztb_prop_score;
	}

	public Integer getModel_1ztb_prop_decile() {
		return model_1ztb_prop_decile;
	}

	public void setModel_1ztb_prop_decile(Integer model_1ztb_prop_decile) {
		this.model_1ztb_prop_decile = model_1ztb_prop_decile;
	}

	public Double getModel_stockf_prop_score() {
		return model_stockf_prop_score;
	}

	public void setModel_stockf_prop_score(Double model_stockf_prop_score) {
		this.model_stockf_prop_score = model_stockf_prop_score;
	}

	public Integer getModel_stockf_prop_decile() {
		return model_stockf_prop_decile;
	}

	public void setModel_stockf_prop_decile(Integer model_stockf_prop_decile) {
		this.model_stockf_prop_decile = model_stockf_prop_decile;
	}

	public Double getModel_presf_prop_score() {
		return model_presf_prop_score;
	}

	public void setModel_presf_prop_score(Double model_presf_prop_score) {
		this.model_presf_prop_score = model_presf_prop_score;
	}

	public Integer getModel_presf_prop_decile() {
		return model_presf_prop_decile;
	}

	public void setModel_presf_prop_decile(Integer model_presf_prop_decile) {
		this.model_presf_prop_decile = model_presf_prop_decile;
	}

	public Double getModel_bondf_prop_score() {
		return model_bondf_prop_score;
	}

	public void setModel_bondf_prop_score(Double model_bondf_prop_score) {
		this.model_bondf_prop_score = model_bondf_prop_score;
	}

	public Integer getModel_bondf_prop_decile() {
		return model_bondf_prop_decile;
	}

	public void setModel_bondf_prop_decile(Integer model_bondf_prop_decile) {
		this.model_bondf_prop_decile = model_bondf_prop_decile;
	}

	public Double getModel_cashf_prop_score() {
		return model_cashf_prop_score;
	}

	public void setModel_cashf_prop_score(Double model_cashf_prop_score) {
		this.model_cashf_prop_score = model_cashf_prop_score;
	}

	public Integer getModel_cashf_prop_decile() {
		return model_cashf_prop_decile;
	}

	public void setModel_cashf_prop_decile(Integer model_cashf_prop_decile) {
		this.model_cashf_prop_decile = model_cashf_prop_decile;
	}

	public Double getModel_mixedf_prop_score() {
		return model_mixedf_prop_score;
	}

	public void setModel_mixedf_prop_score(Double model_mixedf_prop_score) {
		this.model_mixedf_prop_score = model_mixedf_prop_score;
	}

	public Integer getModel_mixexf_prop_decile() {
		return model_mixexf_prop_decile;
	}

	public void setModel_mixexf_prop_decile(Integer model_mixexf_prop_decile) {
		this.model_mixexf_prop_decile = model_mixexf_prop_decile;
	}

	public Double getModel_lufax_prop_score() {
		return model_lufax_prop_score;
	}

	public void setModel_lufax_prop_score(Double model_lufax_prop_score) {
		this.model_lufax_prop_score = model_lufax_prop_score;
	}

	public Integer getModel_lufax_prop_decile() {
		return model_lufax_prop_decile;
	}

	public void setModel_lufax_prop_decile(Integer model_lufax_prop_decile) {
		this.model_lufax_prop_decile = model_lufax_prop_decile;
	}

	public Double getPropensity_autoins_score() {
		return propensity_autoins_score;
	}

	public void setPropensity_autoins_score(Double propensity_autoins_score) {
		this.propensity_autoins_score = propensity_autoins_score;
	}

	public Integer getPropensity_autoins_decile() {
		return propensity_autoins_decile;
	}

	public void setPropensity_autoins_decile(Integer propensity_autoins_decile) {
		this.propensity_autoins_decile = propensity_autoins_decile;
	}

	public Double getPropensity_loan_score() {
		return propensity_loan_score;
	}

	public void setPropensity_loan_score(Double propensity_loan_score) {
		this.propensity_loan_score = propensity_loan_score;
	}

	public Integer getPropensity_loan_decile() {
		return propensity_loan_decile;
	}

	public void setPropensity_loan_decile(Integer propensity_loan_decile) {
		this.propensity_loan_decile = propensity_loan_decile;
	}

	public Double getPropensity_fiscalprd_score() {
		return propensity_fiscalprd_score;
	}

	public void setPropensity_fiscalprd_score(Double propensity_fiscalprd_score) {
		this.propensity_fiscalprd_score = propensity_fiscalprd_score;
	}

	public Integer getPropensity_fiscalprd_decile() {
		return propensity_fiscalprd_decile;
	}

	public void setPropensity_fiscalprd_decile(Integer propensity_fiscalprd_decile) {
		this.propensity_fiscalprd_decile = propensity_fiscalprd_decile;
	}

	public Double getPropensity_credit_score() {
		return propensity_credit_score;
	}

	public void setPropensity_credit_score(Double propensity_credit_score) {
		this.propensity_credit_score = propensity_credit_score;
	}

	public Integer getPropensity_credit_decile() {
		return propensity_credit_decile;
	}

	public void setPropensity_credit_decile(Integer propensity_credit_decile) {
		this.propensity_credit_decile = propensity_credit_decile;
	}

	public Double getPropensity_fund_score() {
		return propensity_fund_score;
	}

	public void setPropensity_fund_score(Double propensity_fund_score) {
		this.propensity_fund_score = propensity_fund_score;
	}

	public Integer getPropensity_fund_decile() {
		return propensity_fund_decile;
	}

	public void setPropensity_fund_decile(Integer propensity_fund_decile) {
		this.propensity_fund_decile = propensity_fund_decile;
	}

	public Double getPropensity_bond_score() {
		return propensity_bond_score;
	}

	public void setPropensity_bond_score(Double propensity_bond_score) {
		this.propensity_bond_score = propensity_bond_score;
	}

	public Integer getPropensity_bond_decile() {
		return propensity_bond_decile;
	}

	public void setPropensity_bond_decile(Integer propensity_bond_decile) {
		this.propensity_bond_decile = propensity_bond_decile;
	}

	public Double getPropensity_trust_score() {
		return propensity_trust_score;
	}

	public void setPropensity_trust_score(Double propensity_trust_score) {
		this.propensity_trust_score = propensity_trust_score;
	}

	public Integer getPropensity_trust_decile() {
		return propensity_trust_decile;
	}

	public void setPropensity_trust_decile(Integer propensity_trust_decile) {
		this.propensity_trust_decile = propensity_trust_decile;
	}

	public Double getPropensity_smallpur_score() {
		return propensity_smallpur_score;
	}

	public void setPropensity_smallpur_score(Double propensity_smallpur_score) {
		this.propensity_smallpur_score = propensity_smallpur_score;
	}

	public Integer getPropensity_smallpur_decile() {
		return propensity_smallpur_decile;
	}

	public void setPropensity_smallpur_decile(Integer propensity_smallpur_decile) {
		this.propensity_smallpur_decile = propensity_smallpur_decile;
	}

	public Double getPropensity_familyproins_score() {
		return propensity_familyproins_score;
	}

	public void setPropensity_familyproins_score(Double propensity_familyproins_score) {
		this.propensity_familyproins_score = propensity_familyproins_score;
	}

	public Integer getPropensity_familyproins_decile() {
		return propensity_familyproins_decile;
	}

	public void setPropensity_familyproins_decile(Integer propensity_familyproins_decile) {
		this.propensity_familyproins_decile = propensity_familyproins_decile;
	}

	public Double getPropensity_pension_score() {
		return propensity_pension_score;
	}

	public void setPropensity_pension_score(Double propensity_pension_score) {
		this.propensity_pension_score = propensity_pension_score;
	}

	public Integer getPropensity_pension_decile() {
		return propensity_pension_decile;
	}

	public void setPropensity_pension_decile(Integer propensity_pension_decile) {
		this.propensity_pension_decile = propensity_pension_decile;
	}

	public Date getCreated_date() {
		return created_date;
	}

	public void setCreated_date(Date created_date) {
		this.created_date = created_date;
	}
}
