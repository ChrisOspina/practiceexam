/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buisness;
/**
 *
 * @author cospina
 */
public class Resort {
    private String Name;
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
    public void display()
    {
        System.out.println(getName());
        for(int i = 0; i< rooms.length; i++)
        {
            System.out.printf("%d\n",rooms[i].getNum());
        }
    }
    
    
}
