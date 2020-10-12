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
public class Room {
    private int number;
    private double fee;
    
    public Room(){};
    public Room(int n, double f)
    {
     number = n;
     fee = f;
    }
    public void setNum(int n){number = n;}
    public void setfee(double f){fee = f;}
    public int getNum(){return number;}
    public double getFee(){return fee;}
 
     @Override
     public String toString()
     {
         String s = "Room: " + number + "\n"+
               "Fee: "+ fee;
         return s;
     }
     
     
    
    
       
}
