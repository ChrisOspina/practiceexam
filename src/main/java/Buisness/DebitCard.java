/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buisness;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.SerializedName;
import java.io.FileReader;
import java.io.PrintStream;

/**
 *
 * @author cospina
 */
public class DebitCard 
{
    @SerializedName("Account")
    private Account account;
    @SerializedName("Card #")
    private String cardnumber;
    @SerializedName("Balance")
    private double balance;
    
    public DebitCard()
    {
        account = new Account();
        cardnumber = "";
        balance = 0;
              
    };
    
    public DebitCard(int n, String un, int p, String cn, double b)
    {
        account.setNum(n);
        account.setUserName(un);
        account.setpin(p);
        
        cardnumber = cn;
        balance = b;
    }
    
    public void setCardNum(String cn){cardnumber = cn;}
    public void setbalance(double b){balance = b;}
    public String getCardNum(){return cardnumber;}
    public double getbalance(){return balance;}
    
    public void Deposit(double amt)
    {
        balance = balance + amt;
    }
    
    public void Withdraw(double amt)
    {
        balance = balance - amt;
    }   
    
    public void readJSON(FileReader fr) {
        //***********************
        //In order to read to JSON we need a new instance
        //of GSONBuilder. We also need to call the setPrettyPrinting
        //and create methods while we are at it
        //********************************************
        GsonBuilder builder = new GsonBuilder();
        builder.setPrettyPrinting();
        Gson gson = builder.create();
        //******************************************
        //We then must create an instance of MyDate in order to use as
        //a refrence for the JSON file to read
        //****************************************
        DebitCard dc = gson.fromJson(fr, DebitCard.class);
        //Finally we will set each member variable to the returned values from get
        account = dc.account;
        this.setCardNum(dc.getCardNum());
        this.setbalance(dc.getbalance());
    }
    
     public void writeJSON(PrintStream ps) 
     {
        GsonBuilder builder = new GsonBuilder();
        builder.setPrettyPrinting();
        Gson gson = builder.create();      
        String jsonString = gson.toJson(this);
        ps.println(jsonString);
    }
    
    public void print(PrintStream ps)
    {
        ps.println("ATM Transaction Report");
        ps.println("-----------------------");
        ps.println(account.getUserName());
        ps.printf("Account id:%d\n",account.getNum());
        ps.printf("Card#: %s\n",cardnumber);
        ps.printf("Current Balance: %.2f\n",balance);
        
    }
    
    @Override
    public String toString()
    {
        String s = this.account.toString() + "\n"+
                "Card #: " + this.cardnumber + "\n"+
                "Balance:" + this.balance;
        return s;
    }
    
    @Override
    public boolean equals(Object obj) {
        DebitCard other = (DebitCard) obj; // Copy to Employee var
        if (this.account.equals(other.account) == false) {
            return false;}
        return true;
    }
}
