/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ospina.practiceexam;

import Buisness.Guest;
import Buisness.Resort;
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
        
        Guest g = new Guest();
        Resort r = new Resort();
        
        Scanner keypad = new Scanner(System.in);
        Scanner in = new Scanner(System.in);
        String inname;
        
        String injson;
        String outjson;
        
        System.out.println("Welcome to Walt Disney World Resorts");
        System.out.println("------------------------------------");
        System.out.println("1 - Read guest data from file as JSON");
        System.out.println("2 - Write guest data to file to JSON");
        System.out.println("3 - Check into a hotel room at any of our resorts");
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
                  System.out.println(" Enter Shift JSON Output Filename");
                  outjson = in.nextLine();
                  PrintStream pr = new PrintStream(outjson);
                  g.WriteJSON(pr);
                  break;
                case 3: 
                    System.out.println("What hotel would you like to check into");
                    r.setName(in.nextLine());
                    System.out.println("How many days are you staying");
                    days = in.nextInt();
                    System.out.println("Please show us your reservation");
                    inname = in.nextLine();
                    
                    break;
                case 4:
                    int total = days*r.getRoom(i).fee();
                    System.out.printf("Your total is" + "%.2f",total);
                    break;
                case 5:
                    r.display();
                    break;
                case 6:
                    System.out.println("See ya Real Soon!");
                    break;
                default:
                    
                
                    
             }
            
        }
     
        
        
        
    }
    
}
