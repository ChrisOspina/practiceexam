/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ospina.practiceexam;

import Buisness.DebitCard;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintStream;
import java.util.Scanner;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.stage.FileChooser;

/**
 *
 * @author cospina
 */
public class MachineController 
{
   private DebitCard d = new DebitCard();
   
   @FXML
   private MenuItem openmenuitem;
   
   @FXML
   private MenuItem saveasmenuitem;
   
   @FXML
   private MenuItem savemenuitem;
   
   @FXML
   private MenuItem closemenuitem;
   
   @FXML
   private Button depositbtn;
   
   @FXML
   private Button withdrawbtn;
   
   @FXML
   private Button checkbalbtn;
   
   @FXML
   private Button exitbtn;
   
   @FXML
   private TextArea txtarea;
   
   @FXML
   protected void handleopenaction() throws FileNotFoundException
   {
       try
       {
           FileChooser filechooser = new FileChooser();
           filechooser.setTitle("Open debit card JSON file");
           File file = filechooser.showOpenDialog(null);
           FileReader fr = new FileReader(file);
           d.readJSON(fr);
           txtarea.setText("Read succesful");
       }
      catch(Exception e) 
       {
           txtarea.setText("File read failure");
       }
     
   }
   
   @FXML
   protected void handlesaveasaction() throws FileNotFoundException
   {
       FileChooser fileChooser = new FileChooser();
       fileChooser.setTitle("Save as TimeSheet");
       File file = fileChooser.showOpenDialog(null);
       PrintStream ps = new PrintStream(file);
       d.writeJSON(ps);
       txtarea.setText("Save succesful");
   }
   
   @FXML
   protected void handlesaveaction() throws FileNotFoundException
   {
       FileChooser fileChooser = new FileChooser();
       fileChooser.setTitle("Save as TimeSheet");
       File file = fileChooser.showOpenDialog(null);
       PrintStream ps = new PrintStream(file);
       d.print(ps);
       txtarea.setText("Save succesful");
   }
   
   @FXML
   protected void handleexit()
   {
       System.exit(0);
   }
   
   @FXML
   protected void handledepositaction()
   {
       double depositamt;
       Scanner in = new Scanner(System.in);
       System.out.println("How much would you like to deposit?");
       depositamt = in.nextFloat();
       d.Deposit(depositamt);
       txtarea.setText("deposit complete");
   }
   
   @FXML
   protected void handlewithdrawaction()
   {
       double withdrawamt;
       Scanner in = new Scanner(System.in);
       System.out.println("How much would you like to withdraw?");
       withdrawamt = in.nextFloat();
       d.Withdraw(withdrawamt);
       txtarea.setText("withdraw complete");
   }
   
   @FXML
   protected void handlecheckbal()
   {
       txtarea.setText(String.valueOf(d.getbalance()));
   }
   
    
    
}
