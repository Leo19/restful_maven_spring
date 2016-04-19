package com.pajinke.entity;

import java.util.Date;

import com.pajinke.mock.MockMeta;
import com.pajinke.mock.data.annotation.MockList;
import com.pajinke.mock.data.annotation.MockNumber;

public class LabelData2 extends LabelData {

	@Override
	@MockMeta(type=MockMeta.TYPE_STRING, length=20)
	public String getClient_no() {
		// TODO Auto-generated method stub
		return super.getClient_no();
	}

	@Override
	public String getParty_no() {
		// TODO Auto-generated method stub
		return super.getParty_no();
	}

	@MockList(value = "1,2")
	public String getAttr_gender() {
		// TODO Auto-generated method stub
		return super.getAttr_gender();
	}

	@Override
	@MockNumber(min=0, max=100)
	public Integer getAttr_age() {
		// TODO Auto-generated method stub
		return super.getAttr_age();
	}

    /** 年龄分段(0~25|25~35|35~45|45~55|55~65|65+) */
	@MockList(value = "0~25,25~35,35~45,45~55,55~65,65+")
	public String getAttr_age_range() {
		return super.getAttr_age_range();
	}


    /** 星座 */
	@MockList(value="白羊座,金牛座,双子座,巨蟹座,狮子座,处女座,天秤座,天蝎座,射手座,摩羯座,水瓶座,双鱼座")
	public String getAttr_constellation() {
		// TODO Auto-generated method stub
		return super.getAttr_constellation();
	}

    /** 属相 */
	@MockList(value="鼠,牛,虎,兔,龙,蛇,马,羊,候,鸡,狗,猪")
	public String getAttr_zodiac() {
		// TODO Auto-generated method stub
		return super.getAttr_zodiac();
	}
	
	/** 出生省份-城市和现居住省份-城市 */
	@MockList(value="北京,上海,广州,深圳")
	public String getAttr_birth_province() {
		// TODO Auto-generated method stub
		return super.getAttr_birth_province();
	}

    /** 出生城市 */
	@MockList(value="北京,上海,广州,深圳")
	public String getAttr_birth_city() {
		// TODO Auto-generated method stub
		return super.getAttr_birth_city();
	}

    /** 居住省份 */
	@MockList(value="北京,上海,广州,深圳")
	public String getAttr_live_province() {
		// TODO Auto-generated method stub
		return super.getAttr_live_province();
	}

    /** 居住城市 */
	@MockList(value="北京,上海,广州,深圳")
	public String getAttr_live_city() {
		// TODO Auto-generated method stub
		return super.getAttr_live_city();
	}

    /** 城市等级代码 */
	@MockList(value="01,02,03,04")
	public String getAttr_city_level_cd() {
		// TODO Auto-generated method stub
		return super.getAttr_city_level_cd();
	}

    /** 婚姻状况代码(01~06 NA==不详) */
	@MockList(value="01,02,03,04,05,06")
	public String getAttr_marital_status_cd() {
		// TODO Auto-generated method stub
		return super.getAttr_marital_status_cd();
	}

    /** 家庭年收入 */
	@MockNumber(min=10000, max=1000000)
	public Integer getAttr_family_income() {
		// TODO Auto-generated method stub
		return super.getAttr_family_income();
	}

    /** 注册渠道代码(01网注，02柜面注册，03电话注册，04密码注册，05系统注册，06WAP注册，NA不详) */
	@MockList(value="01,02,03,04,05,06,NA")
	public String getAttr_reg_channel_cd() {
		// TODO Auto-generated method stub
		return super.getAttr_reg_channel_cd();
	}

    /** 注册来源 */
	@MockList(value="网注,柜面注册,电话注册,密码注册,系统注册,WAP注册,不详")
	public String getAttr_reg_source() {
		// TODO Auto-generated method stub
		return super.getAttr_reg_source();
	}

    /** 用户等级代码(大概4个等级 01~04) */
	@MockList(value="01,02,03,04")
	public String getAttr_customer_level_cd() {
		// TODO Auto-generated method stub
		return super.getAttr_customer_level_cd();
	}

    /** 升级渠道代码(和注册渠道是一样的) */
	@MockList(value="01,02,03,04,05,06,NA")
	public String getAttr_upgraded_reg_source() {
		// TODO Auto-generated method stub
		return super.getAttr_upgraded_reg_source();
	}

    /** iOS注册标识 */
	@MockList(value="1,0")
	public String getAttr_reg_ios_ind() {
		// TODO Auto-generated method stub
		return super.getAttr_reg_ios_ind();
	}

    /** 安卓注册标识 */
	@MockList(value="1,0")
	public String getAttr_reg_andriod_ind() {
		return super.getAttr_reg_andriod_ind();
	}

    /** web注册且使用过app标识 */
	@MockList(value="1,0")
	public String getAttr_reg_web_app_ind() {
		return super.getAttr_reg_web_app_ind();
	}

	@Override
	public String getAttr_blacklist_ind() {
		// TODO Auto-generated method stub
		return super.getAttr_blacklist_ind();
	}

	@Override
	public Date getAttr_reg_dt() {
		// TODO Auto-generated method stub
		return super.getAttr_reg_dt();
	}

	@Override
	public String getAttr_upgraded_ind() {
		// TODO Auto-generated method stub
		return super.getAttr_upgraded_ind();
	}

	@Override
	public Date getAttr_upgraded_date() {
		// TODO Auto-generated method stub
		return super.getAttr_upgraded_date();
	}

	@Override
	public String getAttr_isrobot_ind() {
		// TODO Auto-generated method stub
		return super.getAttr_isrobot_ind();
	}

	@Override
	public String getAttr_iphone() {
		// TODO Auto-generated method stub
		return super.getAttr_iphone();
	}

	@Override
	public String getReg_time_range_cd() {
		// TODO Auto-generated method stub
		return super.getReg_time_range_cd();
	}

	@Override
	public String getActivity_range() {
		// TODO Auto-generated method stub
		return super.getActivity_range();
	}

	@Override
	public String getActivity_channel() {
		// TODO Auto-generated method stub
		return super.getActivity_channel();
	}

	@Override
	public Integer getActivity_logins_cnt() {
		// TODO Auto-generated method stub
		return super.getActivity_logins_cnt();
	}

	@Override
	public String getApp_activity_range() {
		// TODO Auto-generated method stub
		return super.getApp_activity_range();
	}

	@Override
	public Date getApp_first_logon_dt() {
		// TODO Auto-generated method stub
		return super.getApp_first_logon_dt();
	}

	@Override
	public Date getApp_latest_logon_dt() {
		// TODO Auto-generated method stub
		return super.getApp_latest_logon_dt();
	}

	@Override
	public String getApp_activity_channel() {
		// TODO Auto-generated method stub
		return super.getApp_activity_channel();
	}

	@Override
	public Integer getApp_activity_logins_cnt() {
		// TODO Auto-generated method stub
		return super.getApp_activity_logins_cnt();
	}

	@Override
	public String getBind_annuity_ind() {
		// TODO Auto-generated method stub
		return super.getBind_annuity_ind();
	}

	@Override
	public String getBind_group_ind() {
		// TODO Auto-generated method stub
		return super.getBind_group_ind();
	}

	@Override
	public String getBind_health_ind() {
		// TODO Auto-generated method stub
		return super.getBind_health_ind();
	}

	@Override
	public String getBind_pension_ind() {
		// TODO Auto-generated method stub
		return super.getBind_pension_ind();
	}

	@Override
	public String getBind_life_ind() {
		// TODO Auto-generated method stub
		return super.getBind_life_ind();
	}

	@Override
	public String getBind_property_ind() {
		// TODO Auto-generated method stub
		return super.getBind_property_ind();
	}

	@Override
	public String getBind_fund_ind() {
		// TODO Auto-generated method stub
		return super.getBind_fund_ind();
	}

	@Override
	public String getBind_stock_ind() {
		// TODO Auto-generated method stub
		return super.getBind_stock_ind();
	}

	@Override
	public String getBind_trust_ind() {
		// TODO Auto-generated method stub
		return super.getBind_trust_ind();
	}

	@Override
	public String getBind_bank_ind() {
		// TODO Auto-generated method stub
		return super.getBind_bank_ind();
	}

	@Override
	public String getBind_credit_ind() {
		// TODO Auto-generated method stub
		return super.getBind_credit_ind();
	}

	@Override
	public String getBind_ewealth_ind() {
		// TODO Auto-generated method stub
		return super.getBind_ewealth_ind();
	}

	@Override
	public String getBind_yqb_ind() {
		// TODO Auto-generated method stub
		return super.getBind_yqb_ind();
	}

	@Override
	public String getBind_lcb_ind() {
		// TODO Auto-generated method stub
		return super.getBind_lcb_ind();
	}

	@Override
	public String getBind_wlt_ind() {
		// TODO Auto-generated method stub
		return super.getBind_wlt_ind();
	}

	@Override
	public String getBind_haofang_ind() {
		// TODO Auto-generated method stub
		return super.getBind_haofang_ind();
	}

	@Override
	public String getBind_orange_ind() {
		// TODO Auto-generated method stub
		return super.getBind_orange_ind();
	}

	@Override
	public String getBind_yzbt_ind() {
		// TODO Auto-generated method stub
		return super.getBind_yzbt_ind();
	}

	@Override
	public String getBind_lufax_ind() {
		// TODO Auto-generated method stub
		return super.getBind_lufax_ind();
	}

	@Override
	public String getBind_car_ind() {
		// TODO Auto-generated method stub
		return super.getBind_car_ind();
	}

	@Override
	public String getBind_house_ind() {
		// TODO Auto-generated method stub
		return super.getBind_house_ind();
	}

	@Override
	public String getBind_ex_credit_ind() {
		// TODO Auto-generated method stub
		return super.getBind_ex_credit_ind();
	}

	@Override
	public String getBind_ex_bank_ind() {
		// TODO Auto-generated method stub
		return super.getBind_ex_bank_ind();
	}

	@Override
	public String getBind_id_card_ind() {
		// TODO Auto-generated method stub
		return super.getBind_id_card_ind();
	}

	@Override
	public String getBind_booklet_ind() {
		// TODO Auto-generated method stub
		return super.getBind_booklet_ind();
	}

	@Override
	public String getBind_driving_license_ind() {
		// TODO Auto-generated method stub
		return super.getBind_driving_license_ind();
	}

	@Override
	public String getBind_passport_ind() {
		// TODO Auto-generated method stub
		return super.getBind_passport_ind();
	}

	@Override
	public String getBind_permits_ind() {
		// TODO Auto-generated method stub
		return super.getBind_permits_ind();
	}

	@Override
	public String getBind_vehicle_license_ind() {
		// TODO Auto-generated method stub
		return super.getBind_vehicle_license_ind();
	}

	@Override
	public String getBind_housing_property_ind() {
		// TODO Auto-generated method stub
		return super.getBind_housing_property_ind();
	}

	@Override
	public String getBind_buz_card_ind() {
		// TODO Auto-generated method stub
		return super.getBind_buz_card_ind();
	}

	@Override
	public String getBind_mem_card_ind() {
		// TODO Auto-generated method stub
		return super.getBind_mem_card_ind();
	}

	@Override
	public String getBind_coupon_ind() {
		// TODO Auto-generated method stub
		return super.getBind_coupon_ind();
	}

	@Override
	public String getBind_bill_ind() {
		// TODO Auto-generated method stub
		return super.getBind_bill_ind();
	}

	@Override
	public String getBind_oth_card_ind() {
		// TODO Auto-generated method stub
		return super.getBind_oth_card_ind();
	}

	@Override
	public Integer getBind_ex_account_cnt() {
		// TODO Auto-generated method stub
		return super.getBind_ex_account_cnt();
	}

	@Override
	public Integer getBind_car_cnt() {
		// TODO Auto-generated method stub
		return super.getBind_car_cnt();
	}

	@Override
	public Integer getBind_house_cnt() {
		// TODO Auto-generated method stub
		return super.getBind_house_cnt();
	}

	@Override
	public String getModel_cmv() {
		// TODO Auto-generated method stub
		return super.getModel_cmv();
	}

	@Override
	public String getModel_cmv_cal_ind() {
		// TODO Auto-generated method stub
		return super.getModel_cmv_cal_ind();
	}

	@Override
	public Double getModel_cash_correlation() {
		// TODO Auto-generated method stub
		return super.getModel_cash_correlation();
	}

	@Override
	public Double getModel_fixed_correlation() {
		// TODO Auto-generated method stub
		return super.getModel_fixed_correlation();
	}

	@Override
	public Double getModel_equity_correlation() {
		// TODO Auto-generated method stub
		return super.getModel_equity_correlation();
	}

	@Override
	public String getModel_risk_cluster() {
		// TODO Auto-generated method stub
		return super.getModel_risk_cluster();
	}

	@Override
	public Double getModel_churn_score() {
		// TODO Auto-generated method stub
		return super.getModel_churn_score();
	}

	@Override
	public Integer getModel_churn_decile() {
		// TODO Auto-generated method stub
		return super.getModel_churn_decile();
	}

	@Override
	public Double getModel_1ztb_prop_score() {
		// TODO Auto-generated method stub
		return super.getModel_1ztb_prop_score();
	}

	@Override
	public Integer getModel_1ztb_prop_decile() {
		// TODO Auto-generated method stub
		return super.getModel_1ztb_prop_decile();
	}

	@Override
	public Double getModel_stockf_prop_score() {
		// TODO Auto-generated method stub
		return super.getModel_stockf_prop_score();
	}

	@Override
	public Integer getModel_stockf_prop_decile() {
		// TODO Auto-generated method stub
		return super.getModel_stockf_prop_decile();
	}

	@Override
	public Double getModel_presf_prop_score() {
		// TODO Auto-generated method stub
		return super.getModel_presf_prop_score();
	}

	@Override
	public Integer getModel_presf_prop_decile() {
		// TODO Auto-generated method stub
		return super.getModel_presf_prop_decile();
	}

	@Override
	public Double getModel_bondf_prop_score() {
		// TODO Auto-generated method stub
		return super.getModel_bondf_prop_score();
	}

	@Override
	public Integer getModel_bondf_prop_decile() {
		// TODO Auto-generated method stub
		return super.getModel_bondf_prop_decile();
	}

	@Override
	public Double getModel_cashf_prop_score() {
		// TODO Auto-generated method stub
		return super.getModel_cashf_prop_score();
	}

	@Override
	public Integer getModel_cashf_prop_decile() {
		// TODO Auto-generated method stub
		return super.getModel_cashf_prop_decile();
	}

	@Override
	public Double getModel_mixedf_prop_score() {
		// TODO Auto-generated method stub
		return super.getModel_mixedf_prop_score();
	}

	@Override
	public Integer getModel_mixexf_prop_decile() {
		// TODO Auto-generated method stub
		return super.getModel_mixexf_prop_decile();
	}

	@Override
	public Double getModel_lufax_prop_score() {
		// TODO Auto-generated method stub
		return super.getModel_lufax_prop_score();
	}

	@Override
	public Integer getModel_lufax_prop_decile() {
		// TODO Auto-generated method stub
		return super.getModel_lufax_prop_decile();
	}

	@Override
	public Double getPropensity_autoins_score() {
		// TODO Auto-generated method stub
		return super.getPropensity_autoins_score();
	}

	@Override
	public Integer getPropensity_autoins_decile() {
		// TODO Auto-generated method stub
		return super.getPropensity_autoins_decile();
	}

	@Override
	public Double getPropensity_loan_score() {
		// TODO Auto-generated method stub
		return super.getPropensity_loan_score();
	}

	@Override
	public Integer getPropensity_loan_decile() {
		// TODO Auto-generated method stub
		return super.getPropensity_loan_decile();
	}

	@Override
	public Double getPropensity_fiscalprd_score() {
		// TODO Auto-generated method stub
		return super.getPropensity_fiscalprd_score();
	}

	@Override
	public Integer getPropensity_fiscalprd_decile() {
		// TODO Auto-generated method stub
		return super.getPropensity_fiscalprd_decile();
	}

	@Override
	public Double getPropensity_credit_score() {
		// TODO Auto-generated method stub
		return super.getPropensity_credit_score();
	}

	@Override
	public Integer getPropensity_credit_decile() {
		// TODO Auto-generated method stub
		return super.getPropensity_credit_decile();
	}

	@Override
	public Double getPropensity_fund_score() {
		// TODO Auto-generated method stub
		return super.getPropensity_fund_score();
	}

	@Override
	public Integer getPropensity_fund_decile() {
		// TODO Auto-generated method stub
		return super.getPropensity_fund_decile();
	}

	@Override
	public Double getPropensity_bond_score() {
		// TODO Auto-generated method stub
		return super.getPropensity_bond_score();
	}

	@Override
	public Integer getPropensity_bond_decile() {
		// TODO Auto-generated method stub
		return super.getPropensity_bond_decile();
	}

	@Override
	public Double getPropensity_trust_score() {
		// TODO Auto-generated method stub
		return super.getPropensity_trust_score();
	}

	@Override
	public Integer getPropensity_trust_decile() {
		// TODO Auto-generated method stub
		return super.getPropensity_trust_decile();
	}

	@Override
	public Double getPropensity_smallpur_score() {
		// TODO Auto-generated method stub
		return super.getPropensity_smallpur_score();
	}

	@Override
	public Integer getPropensity_smallpur_decile() {
		// TODO Auto-generated method stub
		return super.getPropensity_smallpur_decile();
	}

	@Override
	public Double getPropensity_familyproins_score() {
		// TODO Auto-generated method stub
		return super.getPropensity_familyproins_score();
	}

	@Override
	public Integer getPropensity_familyproins_decile() {
		// TODO Auto-generated method stub
		return super.getPropensity_familyproins_decile();
	}

	@Override
	public Double getPropensity_pension_score() {
		// TODO Auto-generated method stub
		return super.getPropensity_pension_score();
	}

	@Override
	public Integer getPropensity_pension_decile() {
		// TODO Auto-generated method stub
		return super.getPropensity_pension_decile();
	}

	@Override
	public Date getCreated_date() {
		// TODO Auto-generated method stub
		return super.getCreated_date();
	}

}
