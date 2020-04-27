package com.jack.demo;

import java.io.Serializable;
import java.util.Objects;

/**
 * 户号列表页缓存实例
 */
public class PowerUserIdDo implements Serializable {

    public PowerUserIdDo(String consNo, String consName, String elecAddr, String proNo, String elecType) {
        this.consNo = consNo;
        this.consName = consName;
        this.elecAddr = elecAddr;
        this.proNo = proNo;
        this.elecType = elecType;
    }

    private static final long serialVersionUID = 1L;
    private String consNo; // 户号
    private String consName; // 客户姓名
    private String elecAddr; // 用电地址
    private String proNo; // 省码
    private String elecType; // 高低压

    @Override
    public String toString() {
        return "PowerUserIdDo{" +
                "consNo='" + consNo + '\'' +
                ", consName='" + consName + '\'' +
                ", elecAddr='" + elecAddr + '\'' +
                ", proNo='" + proNo + '\'' +
                ", elecType='" + elecType + '\'' +
                '}';
    }

    public String getElecType() {
        return elecType;
    }

    public void setElecType(String elecType) {
        this.elecType = elecType;
    }


    public String getProNo() {
        return proNo;
    }

    public void setProNo(String proNo) {
        this.proNo = proNo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PowerUserIdDo that = (PowerUserIdDo) o;
        return Objects.equals(consNo, that.consNo) &&
                Objects.equals(proNo, that.proNo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(consNo, proNo);
    }

    public String getConsNo() {
        return consNo;
    }

    public void setConsNo(String consNo) {
        this.consNo = consNo;
    }

    public String getConsName() {
        return consName;
    }

    public void setConsName(String consName) {
        this.consName = consName;
    }

    public String getElecAddr() {
        return elecAddr;
    }

    public void setElecAddr(String elecAddr) {
        this.elecAddr = elecAddr;
    }
}
