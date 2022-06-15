package com.bridgelabz;

public class Stock {

    private String shareName;
    private int numberofShare;
    private int sharePrice;
    private int numberofStock;

    public Stock() {
        this.shareName = shareName;
        this.numberofShare = numberofShare;
        this.sharePrice = sharePrice;
    }

    public String getShareName() {
        return shareName;
    }

    public void setShareName(String shareName) {
        this.shareName = shareName;
    }

    public int getNumberofShare() {
        return numberofShare;
    }

    public void setNumberofShare(int numberofShare) {
        this.numberofShare = numberofShare;
    }

    public int getSharePrice() {
        return sharePrice;
    }

    public void setSharePrice(int sharePrice) {
        this.sharePrice = sharePrice;
    }

    public int getNumberofStock() {
        return numberofStock;
    }

    public void setNumberofStock(int numberofStock) {
        this.numberofStock = numberofStock;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "shareName='" + shareName + '\'' +
                ", numberofShare=" + numberofShare +
                ", sharePrice=" + sharePrice +
                ", numberofStock=" + numberofStock +
                '}';
    }
}

