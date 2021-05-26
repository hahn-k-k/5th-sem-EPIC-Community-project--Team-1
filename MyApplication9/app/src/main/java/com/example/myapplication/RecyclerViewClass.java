package com.example.myapplication;

public class RecyclerViewClass {
    private int rvImageView1;
    private String rvTextView1;
    private String rvTextView2;
    private String rvTextView3;
    private String divider;

    RecyclerViewClass(int rvImageView1,String rvTextView1,String rvTextView2,String rvTextView3, String divider){
        this.rvImageView1=rvImageView1;
        this.rvTextView1=rvTextView1;
        this.rvTextView2=rvTextView2;
        this.rvTextView3=rvTextView3;
        this.divider=divider;
    }

    public int getRvImageView1() {
        return rvImageView1;
    }

    public String getRvTextView1() {
        return rvTextView1;
    }

    public String getRvTextView2() {
        return rvTextView2;
    }

    public String getRvTextView3() {
        return rvTextView3;
    }

    public String getDivider() {
        return divider;
    }
}
