package pack2;
import java.util.*;

class Balance{
     float balance = 10000;
}

class ATMUI extends Balance{
     void withdraw(float amount ){
       if(balance-amount <= 5000) {
           System.out.println("Amount cannot be debited because it has reached the minimum balance ");
       }
       else {
            balance = balance - amount;
            System.out.println("The amount has been debited successfully");
       }
     }

     void  deposit(float amount){
        balance=balance+amount;
     }
     float Balance(){
         return balance;
     }
   }



public class ATM {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ATMUI ob1 = new ATMUI();
        while (true) {
        System.out.println("---------->WELCOME TO SBI ***<----------");
        System.out.println(" 1.WITHDRAW\n 2.DEPOSIT\n 3.CHECK BALANCE\n 4.EXIT\n");


        System.out.println("Please Enter your choice");
        int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("You have selected withdraw , Please enter the amount to be debited");
                    float debit = sc.nextFloat();
                    System.out.println("The amount entered is :" + debit);
                    ob1.withdraw(debit);
                    System.out.println("The Remaining balance is  " + ob1.Balance());
                    System.out.println("Thank you for visiting SBI..");
                    break;

                case 2:
                    System.out.println("You have selected to Deposit , Please enter the amount to be credited");
                    float credit = sc.nextFloat();
                    System.out.println("The amount entered is :" + credit);
                    ob1.deposit(credit);
                    System.out.println("The amount has been debited successfully");
                    System.out.println("The Remaining balance is  " + ob1.Balance());
                    System.out.println("Thank you for visiting SBI..");
                    break;

                case 3:
                    System.out.println("You have selected to check the balance of your account ");
                    System.out.println("The Balance of your account is " + ob1.Balance());
                    System.out.println("Thank you for visiting SBI..");
                    break;

                case 4:
                    System.out.println("Thanks for visiting SBI . Have a great Day");
                    System.exit(0);
                    break;

            }

        }
    }
}
