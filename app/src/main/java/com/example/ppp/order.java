package com.example.ppp;

public class order {

    String cusname;
    String cusdest;
    String orderprice;
    String pheight;
    String pwidth;

    public order(String cusname, String cusdest, String orderprice, String pheight, String pwidth) {
        this.cusname = cusname;
        this.cusdest = cusdest;
        this.orderprice = orderprice;
        this.pheight = pheight;
        this.pwidth = pwidth;
    }

    public String getCusname() {
        return cusname;
    }

    public String getCusdest() {
        return cusdest;
    }

    public String getOrderprice() {
        return orderprice;
    }

    public String getPheight() {
        return pheight;
    }

    public String getPwidth() {
        return pwidth;
    }
}
