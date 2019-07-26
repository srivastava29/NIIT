
package day2;
import java.util.Scanner;
public class Account {
     public static void main(String[] args){
     char c1;//for continue yes or no
     Double bal;//availabl balance
     int wbal,dbal;//input for withdraw and deposit amount
     Bankaccount b=new Bankaccount(100.00);
    Scanner sc=  new Scanner(System.in);
    do
    {
    System.out.println("1. withdrawl");
    System.out.println("2. deposit");
    System.out.println("enter your choice");
    int ch=sc.nextInt();//variable for switch cases
    switch(ch)
    {
        case 1: System.out.println("enter withdrwal amount");
                 wbal=sc.nextInt();
                 b.withdrawl(wbal);//method for withdrawal in bankaccount
                
                break;
        case 2 :System.out.println("enter deposit amount"); 
                dbal=sc.nextInt();
                b.deposit(dbal);//method for deposit in bankaccount
                break;
        
    }
    System.out.println("do you want to continue - y/n");
     c1=sc.next().charAt(0);
            }
    while(c1!='n');
   b.display();
    }
}
