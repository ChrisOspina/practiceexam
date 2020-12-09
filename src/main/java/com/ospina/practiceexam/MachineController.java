/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ospina.practiceexam;

import Buisness.DebitCard;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;

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
   
   
    
    
}
