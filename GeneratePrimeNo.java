import java.util.*;

public class GeneratePrimeNo{
    public static void main(String[] args){
         System.out.println("Enter a starting value:");
         Scanner sc = new Scanner(System.in);
         int a = sc.nextInt();
         System.out.println("Enter a Ending value:");
         int b = sc.nextInt();

         System.out.println("The Prime numbers between "+a+" and "+b+" is :");

         for(int i=a;i<=b;i++){
             int flag = 0;
             for(int j=2;j<=i/2;j++){
                 if(i%j == 0){
                    flag = 1;
                     break;
                 }
             }
             
             if(flag == 0)
             System.out.println(i);
         }
    }
}