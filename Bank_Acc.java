//Qn number ---> 2

import java.util.*;
import java.lang.*;

class Account{
    String name;
    double acc_no;
    int type;
    double balance;

    Account(String name, double acc_no,int type, double balance){
        this.name = name;
        this.acc_no = acc_no;
        this.type = type;
        this.balance = balance;
    }

    double withdraw(double amt){
        balance = balance - amt;
        return balance;
    }

    double deposit(double amt){
        balance = balance + amt;
        return balance;
    }

    void checkbalance(){
        System.out.println("Name: "+name);
        System.out.println("Balance: "+balance);
    }
}

public class Bank_Acc {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number of Acount holders in a bank: ");
        
        int n = sc.nextInt();
        Account[] a = new Account[n];

        for(int i=0;i<n;i++){
            System.out.println("Enter a name of a Account Holder "+(i+1)+" :");
            String name = sc.next();
            
            System.out.println("Enter a Account number : ");
            double acc_no = sc.nextDouble();

            System.out.println("Enter a type of a Account : ");
            System.out.format("1.Saving account\n2.Current account\n3.Salary account\n4.FD account\n");
            int type = sc.nextInt();

            System.out.println("Enter a balance of bank account : ");
            double balance = sc.nextDouble();

            a[i] = new Account(name,acc_no,type,balance);
        }

        while(true){
            int choice = 1;
            System.out.println("Choose a name of a account holders :");
            for(int i=0;i<n;i++){
                System.out.println(i+1+"."+a[i].name);
            }

            System.out.println("To Exit --> 99");

            int j = sc.nextInt();
            j = j-1;

            if(j==98){
                System.exit(0);
            }

            if(!(j<n)){
                System.out.println("Invalid Selection");
                choice = 0;
            }

            while(choice==1){
                System.out.format("1.Withdraw\n2.Deposit\n3.Check balance\n4.Main Menu\n5.Exit\nEnter your choice : ");
                int k = sc.nextInt();

                switch(k){
                    case 1:{
                        System.out.println("Enter a amount to be withdrawn: ");
                        double amt = sc.nextDouble();
                        double bal = a[j].withdraw(amt);
                        System.out.println("Balance : "+bal);
                        break;
                    }

                    case 2:{
                        System.out.println("Enter a amount to be deposited: ");
                        double amt1 = sc.nextDouble();
                        double bal = a[j].deposit(amt1);
                        System.out.println("Balance : "+bal);
                        break;
                    }

                    case 3:a[j].checkbalance();
                    break;

                    case 4: choice = 0;
                    break;

                    case 5: System.exit(0);
                    break;

                    default: System.out.println("Invalid Input");
                    break;
                }
            }
        }
    }
}
