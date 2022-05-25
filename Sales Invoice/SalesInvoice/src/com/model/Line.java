
package com.model;

public class Line {
    private String item;
    private double price;
    private int count;
    private Invoice header;

    public Line() {
    }

    public Line(String item, double price, int count, Invoice header) {
        this.item = item;
        this.price = price;
        this.count = count;
        this.header = header;
    }

    public Invoice getHeader() {
        return header;
    }

    public void setHeader(Invoice header) {
        this.header = header;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
    
    public double getLineTotal() {
        return price * count;
    }
    
}
