
package com.model;

import java.util.ArrayList;
import java.util.Date;

public class Invoice {
    private int num;
    private String customer;
    private Date invDate;
    private ArrayList<Line> lines;

    public Invoice() {
    }

    public Invoice(int num, String customer, Date invDate) {
        this.num = num;
        this.customer = customer;
        this.invDate = invDate;
    }

    public Date getInvDate() {
        return invDate;
    }

    public void setInvDate(Date invDate) {
        this.invDate = invDate;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public ArrayList<Line> getLines() {
        return lines;
    }

    public void setLines(ArrayList<Line> lines) {
        this.lines = lines;
    }
    
    public double getInvoiceTotal() {
        double total = 0.0;
        
        for (int i = 0; i < lines.size(); i++) {
            total += lines.get(i).getLineTotal();
        }
        
        return total;
    }
    
}
