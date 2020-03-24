package com.app.model;

import javax.persistence.*;

@Entity
@Table(name="user")
public class User
{
    @Id
    @Column(name="account_no")
    private int accountNo;

    @Column(name="full_name")
    private String fullName;

    @Column(name="adhar_no")
    private double adharNo;

    @Column(name="balance")
    private int balance;

    public User(){}

    public User(int accountNo, String fullName, double adharNo, int balance)
    {
        this.accountNo = accountNo;
        this.fullName = fullName;
        this.adharNo = adharNo;
        this.balance = balance;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public double getAdharNo() {
        return adharNo;
    }

    public void setAdharNo(double adharNo) {
        this.adharNo = adharNo;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }


}
