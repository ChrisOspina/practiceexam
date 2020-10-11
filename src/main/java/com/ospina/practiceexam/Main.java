/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ospina.practiceexam;

import Buisness.Guest;
import Buisness.Resort;
import java.util.Scanner;

/**
 *
 * @author cospina
 */
public class Main {
    public static void main(String args[])
    {
        int days = 0;
        
        Guest g = new Guest();
        Resort r = new Resort();
        
        Scanner choice = new Scanner(System.in);
        Scanner in = new Scanner(System.in);
        
        String injson;
        String outjson;
        
        System.out.println("Welcome to Walt Disney World Resorts");
        System.out.println("------------------------------------");
        System.out.println("1 - Read guest data from file as JSON");
        System.out.println("2 - Write guest data to file to JSON");
        System.out.println("3 - Check into a hotel room at any of our resorts");
        System.out.println("4 - Calculate your total vacation expense");
        System.out.println("5 - Display any rooms you've selected");
        
        
        
    }
    
}
