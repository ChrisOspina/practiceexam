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
public class Date {
    @SerializedName("month")
    private int month;
    @SerializedName("day")
    private int day;
    @SerializedName("year")
    private int year;
    
    public Date(){}
    public Date(int m, int d, int y)
    {
        month = m;
        day = d;
        year = y;
    }
    public void setMonth(int m){month = m;}
    public void setDay(int d){day = d;}
    public void setYear(int y){year =y;}
    public int getMonth(){return month;}
    public int getDay(){return day;}
    public int getYear(){return year;}
    
       public void ReadJSON(FileReader fr)
    {
       GsonBuilder builder = new GsonBuilder();
       builder.setPrettyPrinting();
       Gson gson = builder.create();
       
       Date d = gson.fromJson(fr, Date.class);
       
       this.setMonth(d.getMonth());
       this.setDay(d.getDay());
       this.setYear(d.getYear());
    }
    public void WriteJSON(PrintStream ps)
    {
       GsonBuilder builder = new GsonBuilder();
       builder.setPrettyPrinting();
       Gson gson = builder.create();
       
       String jsonString = gson.toJson(this);
       ps.println(jsonString);
    }
    
    @Override
    public String toString()
    {
        String s = month + "/" + day + "/" + year; 
        return s;
    }
}
