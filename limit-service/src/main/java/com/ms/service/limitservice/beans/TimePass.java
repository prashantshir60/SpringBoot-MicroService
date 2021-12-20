package com.ms.service.limitservice.beans;

public class TimePass {

    public TimePass(String tp1, String tp2, int t1, double t2) {
        this.tp1 = tp1;
        this.tp2 = tp2;
        this.t1 = t1;
        this.t2 = t2;
    }

    public String getTp1() {
        return tp1;
    }

    public void setTp1(String tp1) {
        this.tp1 = tp1;
    }

    public String getTp2() {
        return tp2;
    }

    public void setTp2(String tp2) {
        this.tp2 = tp2;
    }

    public int getT1() {
        return t1;
    }

    public void setT1(int t1) {
        this.t1 = t1;
    }

    public double getT2() {
        return t2;
    }

    public void setT2(double t2) {
        this.t2 = t2;
    }

    private String tp1;
    private String tp2;
    private int t1 ;
    private double t2;

}
