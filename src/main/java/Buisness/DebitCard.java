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
public class DebitCard 
{
    private Account account;
    private String cardnumber;
    private double balance;
    
    public DebitCard()
    {
        account = new Account();
        cardnumber = "";
        balance = 0;
              
    };
    
    public DebitCard(int n, String un, int p, String cn, double b)
    {
        account.setNum(n);
        account.setUserName(un);
        account.setpin(p);
        
        cardnumber = cn;
        balance = b;
    }
    
    public void setCardNum(String cn){cardnumber = cn;}
    public void setbalance(double b){balance = b;}
    public String getCardNum(){return cardnumber;}
    public double getbalance(){return balance;}
    
    public void Deposit(double amt)
    {
        balance = balance + amt;
    }
    
    public void Withdraw(double amt)
    {
        balance = balance - amt;
    }
    
    public void showbalance()
    {
       System.out.printf("Your balance is $ %.2f\n",balance);
    }
    
    
    
}
