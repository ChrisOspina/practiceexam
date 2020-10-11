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
public class Resort {
    @SerializedName("Resort:")
    private String Name;
    @SerializedName("Available Rooms:")
    private Room[] rooms;
    
    public Resort()
    {
        rooms = new Room[5];
        for(int i = 0; i<rooms.length ; i++)
        {
            rooms[i] = new Room();
            this.rooms[i].setNum(0);
            this.rooms[i].setfee(0.00);
        }
    }
    public void setName(String n){Name =n;}
    public void setRoom(int i, Room r)
    {
        rooms[i] = r;
    }
    public String getName(){return Name;}
    public Room getRoom(int i)
    {
        return rooms[i];
    }
    public void readJSON(FileReader fr)
    {
       GsonBuilder builder = new GsonBuilder();
       builder.setPrettyPrinting();
       Gson gson = builder.create();
       
       Resort r = gson.fromJson(fr, Resort.class);
       
       this.setName(r.getName());
       this.setRoom(0, r.getRoom(0));
    }
    
    public void writeJSON(PrintStream ps)
    {
       GsonBuilder builder = new GsonBuilder();
       builder.setPrettyPrinting();
       Gson gson = builder.create();
       
       String jsonString = gson.toJson(this);
       ps.println(jsonString);
    }
    
    public void display()
    {
        System.out.println(getName());
        for(int i = 0; i< rooms.length; i++)
        {
            System.out.printf("%d\n",rooms[i].getNum());
        }
    }
    
    
}
