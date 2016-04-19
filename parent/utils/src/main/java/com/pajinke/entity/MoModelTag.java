package com.pajinke.entity;

/**
 * DW_MO_MODEL_TAG 客户模型标签
 * Created by Leo on 16/4/12.
 */
public class MoModelTag {
    /** 客户价值 */
    private String cmv;

    /** 客户价值可靠标识 */
    private String cmv_cal_ind;

    /** 货币类增益系数 */
    private double cash_correlation;

    /** 固定收入类增益系数 */
    private double fixed_correlation;

    /** 股票类增益系数 */
    private double equity_correlation;

    /** 客户风险偏好(A~E 保守型，稳健型等等) */
    private String risk_cluster;

    /** 客户流失分 */
    private double churn_score;

    /** 客户流失分为区间 */
    private int churn_decile;

    /** 一账通宝开户倾向分 */
    private double ztb_prop_score;

    /** 一账通宝开户倾向分位区间 */
    private int ztb_prop_decile;

    /** 股票型基金倾向分 */
    private double stockf_prop_score;

    /** 股票型基金倾向分位区间 */
    private int stockf_prop_decile;

    /** 保本型基金倾向分 */
    private double presf_prop_score;

    /** 保本型基金倾向分位区间 */
    private int presf_prop_decile;

    /** 债券型基金倾向分 */
    private double bondf_prop_score;

    /** 债券型基金倾向分位区间 */
    private int bondf_prop_decile;

    /** 货币型基金倾向分 */
    private double cashf_prop_score;

    /** 货币型基金倾向分位区间 */
    private int cashf_prop_decile;

    /** 混合型基金倾向分 */
    private double mixedf_prop_score;

    /** 混合型基金倾向分位区间 */
    private int mixexf_prop_decile;

    /** 陆金所资产倾向分 */
    private double lufax_prop_score;

    /** 陆金所资产倾向分位区间 */
    private int lufax_prop_decile;

    public String getCmv() {
        return cmv;
    }

    public void setCmv(String cmv) {
        this.cmv = cmv;
    }

    public String getCmv_cal_ind() {
        return cmv_cal_ind;
    }

    public void setCmv_cal_ind(String cmv_cal_ind) {
        this.cmv_cal_ind = cmv_cal_ind;
    }

    public double getCash_correlation() {
        return cash_correlation;
    }

    public void setCash_correlation(double cash_correlation) {
        this.cash_correlation = cash_correlation;
    }

    public double getFixed_correlation() {
        return fixed_correlation;
    }

    public void setFixed_correlation(double fixed_correlation) {
        this.fixed_correlation = fixed_correlation;
    }

    public double getEquity_correlation() {
        return equity_correlation;
    }

    public void setEquity_correlation(double equity_correlation) {
        this.equity_correlation = equity_correlation;
    }

    public String getRisk_cluster() {
        return risk_cluster;
    }

    public void setRisk_cluster(String risk_cluster) {
        this.risk_cluster = risk_cluster;
    }

    public double getChurn_score() {
        return churn_score;
    }

    public void setChurn_score(double churn_score) {
        this.churn_score = churn_score;
    }

    public int getChurn_decile() {
        return churn_decile;
    }

    public void setChurn_decile(int churn_decile) {
        this.churn_decile = churn_decile;
    }

    public double getZtb_prop_score() {
        return ztb_prop_score;
    }

    public void setZtb_prop_score(double ztb_prop_score) {
        this.ztb_prop_score = ztb_prop_score;
    }

    public int getZtb_prop_decile() {
        return ztb_prop_decile;
    }

    public void setZtb_prop_decile(int ztb_prop_decile) {
        this.ztb_prop_decile = ztb_prop_decile;
    }

    public double getStockf_prop_score() {
        return stockf_prop_score;
    }

    public void setStockf_prop_score(double stockf_prop_score) {
        this.stockf_prop_score = stockf_prop_score;
    }

    public int getStockf_prop_decile() {
        return stockf_prop_decile;
    }

    public void setStockf_prop_decile(int stockf_prop_decile) {
        this.stockf_prop_decile = stockf_prop_decile;
    }

    public double getPresf_prop_score() {
        return presf_prop_score;
    }

    public void setPresf_prop_score(double presf_prop_score) {
        this.presf_prop_score = presf_prop_score;
    }

    public int getPresf_prop_decile() {
        return presf_prop_decile;
    }

    public void setPresf_prop_decile(int presf_prop_decile) {
        this.presf_prop_decile = presf_prop_decile;
    }

    public double getBondf_prop_score() {
        return bondf_prop_score;
    }

    public void setBondf_prop_score(double bondf_prop_score) {
        this.bondf_prop_score = bondf_prop_score;
    }

    public int getBondf_prop_decile() {
        return bondf_prop_decile;
    }

    public void setBondf_prop_decile(int bondf_prop_decile) {
        this.bondf_prop_decile = bondf_prop_decile;
    }

    public double getCashf_prop_score() {
        return cashf_prop_score;
    }

    public void setCashf_prop_score(double cashf_prop_score) {
        this.cashf_prop_score = cashf_prop_score;
    }

    public int getCashf_prop_decile() {
        return cashf_prop_decile;
    }

    public void setCashf_prop_decile(int cashf_prop_decile) {
        this.cashf_prop_decile = cashf_prop_decile;
    }

    public double getMixedf_prop_score() {
        return mixedf_prop_score;
    }

    public void setMixedf_prop_score(double mixedf_prop_score) {
        this.mixedf_prop_score = mixedf_prop_score;
    }

    public int getMixexf_prop_decile() {
        return mixexf_prop_decile;
    }

    public void setMixexf_prop_decile(int mixexf_prop_decile) {
        this.mixexf_prop_decile = mixexf_prop_decile;
    }

    public double getLufax_prop_score() {
        return lufax_prop_score;
    }

    public void setLufax_prop_score(double lufax_prop_score) {
        this.lufax_prop_score = lufax_prop_score;
    }

    public int getLufax_prop_decile() {
        return lufax_prop_decile;
    }

    public void setLufax_prop_decile(int lufax_prop_decile) {
        this.lufax_prop_decile = lufax_prop_decile;
    }

    @Override
    public String toString() {
        return "MoModelJson{" +
                "cmv='" + cmv + '\'' +
                ", cmv_cal_ind='" + cmv_cal_ind + '\'' +
                ", cash_correlation=" + cash_correlation +
                ", fixed_correlation=" + fixed_correlation +
                ", equity_correlation=" + equity_correlation +
                ", risk_cluster='" + risk_cluster + '\'' +
                ", churn_score=" + churn_score +
                ", churn_decile=" + churn_decile +
                ", ztb_prop_score=" + ztb_prop_score +
                ", ztb_prop_decile=" + ztb_prop_decile +
                ", stockf_prop_score=" + stockf_prop_score +
                ", stockf_prop_decile=" + stockf_prop_decile +
                ", presf_prop_score=" + presf_prop_score +
                ", presf_prop_decile=" + presf_prop_decile +
                ", bondf_prop_score=" + bondf_prop_score +
                ", bondf_prop_decile=" + bondf_prop_decile +
                ", cashf_prop_score=" + cashf_prop_score +
                ", cashf_prop_decile=" + cashf_prop_decile +
                ", mixedf_prop_score=" + mixedf_prop_score +
                ", mixexf_prop_decile=" + mixexf_prop_decile +
                ", lufax_prop_score=" + lufax_prop_score +
                ", lufax_prop_decile=" + lufax_prop_decile +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MoModelTag that = (MoModelTag) o;

        if (Double.compare(that.cash_correlation, cash_correlation) != 0) return false;
        if (Double.compare(that.fixed_correlation, fixed_correlation) != 0) return false;
        if (Double.compare(that.equity_correlation, equity_correlation) != 0) return false;
        if (Double.compare(that.churn_score, churn_score) != 0) return false;
        if (churn_decile != that.churn_decile) return false;
        if (Double.compare(that.ztb_prop_score, ztb_prop_score) != 0) return false;
        if (ztb_prop_decile != that.ztb_prop_decile) return false;
        if (Double.compare(that.stockf_prop_score, stockf_prop_score) != 0) return false;
        if (stockf_prop_decile != that.stockf_prop_decile) return false;
        if (Double.compare(that.presf_prop_score, presf_prop_score) != 0) return false;
        if (presf_prop_decile != that.presf_prop_decile) return false;
        if (Double.compare(that.bondf_prop_score, bondf_prop_score) != 0) return false;
        if (bondf_prop_decile != that.bondf_prop_decile) return false;
        if (Double.compare(that.cashf_prop_score, cashf_prop_score) != 0) return false;
        if (cashf_prop_decile != that.cashf_prop_decile) return false;
        if (Double.compare(that.mixedf_prop_score, mixedf_prop_score) != 0) return false;
        if (mixexf_prop_decile != that.mixexf_prop_decile) return false;
        if (Double.compare(that.lufax_prop_score, lufax_prop_score) != 0) return false;
        if (lufax_prop_decile != that.lufax_prop_decile) return false;
        if (!cmv.equals(that.cmv)) return false;
        if (!cmv_cal_ind.equals(that.cmv_cal_ind)) return false;
        return risk_cluster.equals(that.risk_cluster);

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = cmv.hashCode();
        result = 31 * result + cmv_cal_ind.hashCode();
        temp = Double.doubleToLongBits(cash_correlation);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(fixed_correlation);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(equity_correlation);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + risk_cluster.hashCode();
        temp = Double.doubleToLongBits(churn_score);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + churn_decile;
        temp = Double.doubleToLongBits(ztb_prop_score);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + ztb_prop_decile;
        temp = Double.doubleToLongBits(stockf_prop_score);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + stockf_prop_decile;
        temp = Double.doubleToLongBits(presf_prop_score);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + presf_prop_decile;
        temp = Double.doubleToLongBits(bondf_prop_score);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + bondf_prop_decile;
        temp = Double.doubleToLongBits(cashf_prop_score);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + cashf_prop_decile;
        temp = Double.doubleToLongBits(mixedf_prop_score);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + mixexf_prop_decile;
        temp = Double.doubleToLongBits(lufax_prop_score);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + lufax_prop_decile;
        return result;
    }
}
