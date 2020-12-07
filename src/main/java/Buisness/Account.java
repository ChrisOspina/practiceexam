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
public class Account
{
    private int number;
    private String UserName;
    private int pin;
    
    public Account(){}
    
    public Account(int n, String un, int p){number = n; UserName = un; 
    pin = p;}
    
    public void setNum(int n){number = n;}
    public void setUserName(String un){UserName = un;}
    public void setpin(int p){pin = p;}
   
    public int getNum(){return number;}
    public String getUserName(){return UserName;}
    public int getpin(){return pin;}
}
