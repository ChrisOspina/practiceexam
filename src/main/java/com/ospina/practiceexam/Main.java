/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ospina.practiceexam;

import Buisness.Guest;
import Buisness.Resort;
import Buisness.Room;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintStream;
import java.util.Scanner;

/**
 *
 * @author cospina
 */
public class Main {
    public static void main(String args[]) throws FileNotFoundException
    {
        int days = 0;
        int rmindex = 0;
        double total = 0.00;
        
        Guest g = new Guest();
        Resort h = new Resort();
        Room r = new Room();
        
        Scanner keypad = new Scanner(System.in);
        Scanner in = new Scanner(System.in);
        
        String injson;
        String outjson;
        String roomjson;
        FileReader fr1;
        
       
        
        System.out.println("Welcome to Walt Disney World Resorts");
        System.out.println("------------------------------------");
        System.out.println("1 - Read guest data from file as JSON");
        System.out.println("2 - Write guest data to file to JSON");
        System.out.println("3 - Check into a room at any of our resorts");
        System.out.println("4 - Calculate your total vacation expense");
        System.out.println("5 - Display any rooms you've selected");
        System.out.println("6 - Cancel");
       
        int choice = 0; 
        while (choice !=6)
        {
            choice = keypad.nextInt();
            switch(choice)
             {
                case 1:
                  System.out.println(" Enter Guest JSON Input Filename");
                  injson = in.nextLine();
                  FileReader fr = new FileReader(injson);
                  g.ReadJSON(fr);
                  break;
                case 2:
                  System.out.println(" Enter Guest JSON Output Filename");
                  outjson = in.nextLine();
                  PrintStream pr = new PrintStream(outjson);
                  g.WriteJSON(pr);
                  break;
                case 3: 
                    System.out.println("What resort would you like to check into");
                    h.setName(in.nextLine());
                    System.out.println("How many days are you staying");
                    days = in.nextInt();
                    System.out.println("Please show us your reservation");
                    roomjson = in.nextLine();
                    fr1 = new FileReader(roomjson);
                    r.ReadJSON(fr1);
                    System.out.println("Choose a room index 0-4");
                    rmindex = in.nextInt();
                    h.setRoom(rmindex, r); 
                    System.out.println("Your room is ready"); 
                    break;
                case 4:
                    total = days*r.getFee();
                    System.out.printf("Your total is " + "%.2f\n",total);
                    break;
                case 5:
                    h.display();
                    break;
                case 6:
                    System.out.println("See ya Real Soon!");
                    break;
                default:
                   System.out.println("Invalid choice, please try again");
                   break;                
             }
            
        }
        
    }
    
}
