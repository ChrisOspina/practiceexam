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
public class Guest {
    @SerializedName("Name")
    private String name;
    @SerializedName("Guest id")
    private int id;
    @SerializedName("Age")
    private int age;
    
    public Guest(){};
    
    public Guest(String n,int i, int a)
    {
        name = n;
        id =i;
        age = a;
    }
    
    public void setName(String n){name = n;}
    public void setid(int i){id = i;}
    public void setage(int a){age = a;}
    public String getName(){return name;}
    public int getId(){return id;}
    public int getAge(){return age;}
 
    public void ReadJSON(FileReader fr)
    {
       GsonBuilder builder = new GsonBuilder();
       builder.setPrettyPrinting();
       Gson gson = builder.create();
       
       Guest g = gson.fromJson(fr, Guest.class);
       
       this.setName(g.getName());
       this.setid(g.getId());
       this.setage(g.getAge());
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
        String s = name + "\n" + "Age:"+age+ "\n"
                + "Id:" + age;
        return s;
    }
   
}
