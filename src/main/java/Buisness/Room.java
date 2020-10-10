/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buisness;

import com.google.gson.annotations.SerializedName;

/**
 *
 * @author cospina
 */
public class Room {
    @SerializedName("Room #:")
    private int number;
    @SerializedName("Guests:")
    private Guest[] guests;
    @SerializedName("Days staying:")
    private int days;
    @SerializedName("Room fee:")
    private double fee;
    
    public Room()
    {
       guests = new Guest[4];
        
        for(int i = 0; i<guests.length;i++)
        {
            guests[i] = new Guest();
            this.guests[i].setName("NONAME");
            this.guests[i].setid(0);
            this.guests[i].setage(0);
        }};
    public void setNum(int n){number = n;}
    public void setDays(int d) {days = d;}
    public void setfee(double f){fee = f;}
    public void setGuests(int i, Guest g)
    {
        guests[i] = g; 
    }
    public int getNum(){return number;}
    public int getDays(){return days;}
    public double getFee(){return fee;}
    public Guest getGuests(int i)
    {
        return guests[i];
    }
    public double calcttotal(double total)
    {
        total = guests.length*fee*days;
        return total;
    }
    
    
    
       
}
