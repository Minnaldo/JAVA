package week3.hw;

import java.io.Serializable;

public class TV extends Product implements Serializable{
    private String dpType;
    private int inch;
 
    public TV() { }
    public TV(String proNum, String name, int price, int stock, String dpType, int inch) {
        super(proNum, name, price, stock);
        this.dpType = dpType;
        this.inch = inch;
    }
    public String getDpType() {
        return dpType;
    }
    public void setDpType(String dpType) {
        this.dpType = dpType;
    }
     
    public int getInch() {
        return inch;
    }
    public void setInch(int inch) {
        this.inch = inch;
    }
    @Override
    public String toString() {
        return "TV [��ǰ��ȣ=" + super.getProNum() + ", �̸�=" + super.getName() + ", ����=" + super.getPrice() + ", ���=" + super.getStock() + ", ���÷���Ÿ��=" + dpType + ", ���÷���ũ��=" + inch + "]";
    }
     
 
}