package com.pajinke.entity;

/**
 * DW_MO_PROPENSITY_TAG_GBD 倾向性模型标签
 * Created by Leo on 16/4/12.
 */
public class MoPropensityTag {

    /** 车险倾向分 */
    private double autoins_score;

    /** 车险倾向分位区间 */
    private int autoins_decile;

    /** 贷款倾向分 */
    private double loan_score;

    /** 贷款倾向分位区间 */
    private int loan_decile;

    /** 银行理财产品倾向分 */
    private double fiscalprd_score;

    /** 银行理财产品倾向分位区间 */
    private int fiscalprd_decile;

    /** 信用卡倾向分 */
    private double credit_score;

    /** 信用卡倾向分位区间 */
    private int credit_decile;

    /** 基金倾向分 */
    private double fund_score;

    /** 基金倾向分位区间 */
    private int fund_decile;

    /** 证券倾向分 */
    private double bond_score;

    /** 证券倾向分位区间 */
    private int bond_decile;

    /** 信托倾向分 */
    private double trust_score;

    /** 信托倾向分位区间 */
    private int trust_decile;

    /** 小消倾向分 */
    private double smallpur_score;

    /** 小消倾向分位区间 */
    private int smallpur_decile;

    /** 家财险倾向分 */
    private double familyproins_score;

    /** 家财险倾向分位区间 */
    private int familyproins_decile;

    /** 养老险倾向分 */
    private double pension_score;

    /** 养老险倾向分位区间 */
    private int pension_decile;

    public double getAutoins_score() {
        return autoins_score;
    }

    public void setAutoins_score(double autoins_score) {
        this.autoins_score = autoins_score;
    }

    public int getAutoins_decile() {
        return autoins_decile;
    }

    public void setAutoins_decile(int autoins_decile) {
        this.autoins_decile = autoins_decile;
    }

    public double getLoan_score() {
        return loan_score;
    }

    public void setLoan_score(double loan_score) {
        this.loan_score = loan_score;
    }

    public int getLoan_decile() {
        return loan_decile;
    }

    public void setLoan_decile(int loan_decile) {
        this.loan_decile = loan_decile;
    }

    public double getFiscalprd_score() {
        return fiscalprd_score;
    }

    public void setFiscalprd_score(double fiscalprd_score) {
        this.fiscalprd_score = fiscalprd_score;
    }

    public int getFiscalprd_decile() {
        return fiscalprd_decile;
    }

    public void setFiscalprd_decile(int fiscalprd_decile) {
        this.fiscalprd_decile = fiscalprd_decile;
    }

    public double getCredit_score() {
        return credit_score;
    }

    public void setCredit_score(double credit_score) {
        this.credit_score = credit_score;
    }

    public int getCredit_decile() {
        return credit_decile;
    }

    public void setCredit_decile(int credit_decile) {
        this.credit_decile = credit_decile;
    }

    public double getFund_score() {
        return fund_score;
    }

    public void setFund_score(double fund_score) {
        this.fund_score = fund_score;
    }

    public int getFund_decile() {
        return fund_decile;
    }

    public void setFund_decile(int fund_decile) {
        this.fund_decile = fund_decile;
    }

    public double getBond_score() {
        return bond_score;
    }

    public void setBond_score(double bond_score) {
        this.bond_score = bond_score;
    }

    public int getBond_decile() {
        return bond_decile;
    }

    public void setBond_decile(int bond_decile) {
        this.bond_decile = bond_decile;
    }

    public double getTrust_score() {
        return trust_score;
    }

    public void setTrust_score(double trust_score) {
        this.trust_score = trust_score;
    }

    public int getTrust_decile() {
        return trust_decile;
    }

    public void setTrust_decile(int trust_decile) {
        this.trust_decile = trust_decile;
    }

    public double getSmallpur_score() {
        return smallpur_score;
    }

    public void setSmallpur_score(double smallpur_score) {
        this.smallpur_score = smallpur_score;
    }

    public int getSmallpur_decile() {
        return smallpur_decile;
    }

    public void setSmallpur_decile(int smallpur_decile) {
        this.smallpur_decile = smallpur_decile;
    }

    public double getFamilyproins_score() {
        return familyproins_score;
    }

    public void setFamilyproins_score(double familyproins_score) {
        this.familyproins_score = familyproins_score;
    }

    public int getFamilyproins_decile() {
        return familyproins_decile;
    }

    public void setFamilyproins_decile(int familyproins_decile) {
        this.familyproins_decile = familyproins_decile;
    }

    public double getPension_score() {
        return pension_score;
    }

    public void setPension_score(double pension_score) {
        this.pension_score = pension_score;
    }

    public int getPension_decile() {
        return pension_decile;
    }

    public void setPension_decile(int pension_decile) {
        this.pension_decile = pension_decile;
    }

    @Override
    public String toString() {
        return "MoPropensityJson{" +
                "autoins_score=" + autoins_score +
                ", autoins_decile=" + autoins_decile +
                ", loan_score=" + loan_score +
                ", loan_decile=" + loan_decile +
                ", fiscalprd_score=" + fiscalprd_score +
                ", fiscalprd_decile=" + fiscalprd_decile +
                ", credit_score=" + credit_score +
                ", credit_decile=" + credit_decile +
                ", fund_score=" + fund_score +
                ", fund_decile=" + fund_decile +
                ", bond_score=" + bond_score +
                ", bond_decile=" + bond_decile +
                ", trust_score=" + trust_score +
                ", trust_decile=" + trust_decile +
                ", smallpur_score=" + smallpur_score +
                ", smallpur_decile=" + smallpur_decile +
                ", familyproins_score=" + familyproins_score +
                ", familyproins_decile=" + familyproins_decile +
                ", pension_score=" + pension_score +
                ", pension_decile=" + pension_decile +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MoPropensityTag that = (MoPropensityTag) o;

        if (Double.compare(that.autoins_score, autoins_score) != 0) return false;
        if (autoins_decile != that.autoins_decile) return false;
        if (Double.compare(that.loan_score, loan_score) != 0) return false;
        if (loan_decile != that.loan_decile) return false;
        if (Double.compare(that.fiscalprd_score, fiscalprd_score) != 0) return false;
        if (fiscalprd_decile != that.fiscalprd_decile) return false;
        if (Double.compare(that.credit_score, credit_score) != 0) return false;
        if (credit_decile != that.credit_decile) return false;
        if (Double.compare(that.fund_score, fund_score) != 0) return false;
        if (fund_decile != that.fund_decile) return false;
        if (Double.compare(that.bond_score, bond_score) != 0) return false;
        if (bond_decile != that.bond_decile) return false;
        if (Double.compare(that.trust_score, trust_score) != 0) return false;
        if (trust_decile != that.trust_decile) return false;
        if (Double.compare(that.smallpur_score, smallpur_score) != 0) return false;
        if (smallpur_decile != that.smallpur_decile) return false;
        if (Double.compare(that.familyproins_score, familyproins_score) != 0) return false;
        if (familyproins_decile != that.familyproins_decile) return false;
        if (Double.compare(that.pension_score, pension_score) != 0) return false;
        return pension_decile == that.pension_decile;

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(autoins_score);
        result = (int) (temp ^ (temp >>> 32));
        result = 31 * result + autoins_decile;
        temp = Double.doubleToLongBits(loan_score);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + loan_decile;
        temp = Double.doubleToLongBits(fiscalprd_score);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + fiscalprd_decile;
        temp = Double.doubleToLongBits(credit_score);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + credit_decile;
        temp = Double.doubleToLongBits(fund_score);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + fund_decile;
        temp = Double.doubleToLongBits(bond_score);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + bond_decile;
        temp = Double.doubleToLongBits(trust_score);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + trust_decile;
        temp = Double.doubleToLongBits(smallpur_score);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + smallpur_decile;
        temp = Double.doubleToLongBits(familyproins_score);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + familyproins_decile;
        temp = Double.doubleToLongBits(pension_score);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + pension_decile;
        return result;
    }
}
