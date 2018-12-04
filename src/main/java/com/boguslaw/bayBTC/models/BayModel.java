package com.boguslaw.bayBTC.models;

public class BayModel {

    private double[][] bids;
    private double [][] asks;

    public double[][] getBids() {
        return bids;
    }

    public void setBids(double[][] bids) {
        this.bids = bids;
    }

    public double[][] getAsks() {
        return asks;
    }

    public void setAsks(double[][] asks) {
        this.asks = asks;
    }
}
