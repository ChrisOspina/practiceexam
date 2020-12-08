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
public class Account
{
    @SerializedName("Account #")
    private int number;
    @SerializedName("User Name")
    private String UserName;
    @SerializedName("pin")
    private int pin;
    
    public Account(){}
    
    public Account(int n, String un, int p){number = n; UserName = un; 
    pin = p;}
    
    public void setNum(int n){number = n;}
    public void setUserName(String un){UserName = un;}
    public void setpin(int p){pin = p;}
   
    public int getNum(){return number;}
    public String getUserName(){return UserName;}
    public int getpin(){return pin;}
    
     public void readJSON(FileReader fr) {
        GsonBuilder builder = new GsonBuilder();
        builder.setPrettyPrinting();
        Gson gson = builder.create();
        
        Account a = gson.fromJson(fr, Account.class);
        
        this.setNum(a.getNum());
        this.setUserName(a.getUserName());
        this.setpin(a.getpin());
    }
     public void writeJSON(PrintStream ps) {
        GsonBuilder builder = new GsonBuilder();
        builder.setPrettyPrinting();
        Gson gson = builder.create();
        String jsonString = gson.toJson(this);
        ps.println(jsonString);
    }

     @Override
     public String toString()
     { 
         String s = this.UserName + "\n"
                 + "Account #: " + this.number;
         return s;
     }
    
}
