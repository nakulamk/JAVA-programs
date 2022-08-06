import java.util.*;

class Generate{
    void display(int n){
        int a=0,b=1,c=0;
        System.out.println(n+" Fibonacci numbers are :");

        for(int i=0;i<n;i++){
            System.out.println(" "+a);
            c = a+b;
            a = b;
            b = c;
        }
    }
}

public class Fibonacci2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of Fibonacci numbers: ");
        int a = in.nextInt();
        Generate F = new Generate();
        F.display(a);
    }
}
