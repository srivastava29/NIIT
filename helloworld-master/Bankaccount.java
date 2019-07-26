
package day2;
public class Bankaccount { 
    int flag=-1;
    Double balance;
    public Bankaccount(Double balance){
        this.balance=balance;
    }
    //for checking successive transactions
     public void withdrawl(int withdraw_bal)
     {
          if(flag==1){
             balance=balance-(0.004*withdraw_bal+withdraw_bal); //for 2nd case of withdrawal
           
             
          }
          else{
          balance=balance-(0.005*withdraw_bal+withdraw_bal);//for 1st case of withdrawal
         
          }
          flag=0;
          
         }
   public void deposit(int deposit_bal)
   {
      if(flag==0)  {
      balance=balance+(0.002*deposit_bal+deposit_bal);//for 2nd case of deposit
     }
      else {
       balance=balance+(0.0025*deposit_bal+deposit_bal);//for 1st case of deposit
       
      }
      flag=1;
    
   }

 public void display(){
 System.out.println("Total balance"+balance);}
}




