import java.util.*;

class hide{
    Scanner sc = new Scanner(System.in);

    int []count = new int[6];

    int read(){
        System.out.println("Caste your vote:");
        int vote = sc.nextInt();
        return vote;
    }

    void counter(){
        System.out.println("Enter a number of voters:");
        int n = sc.nextInt();

        for(int i=0;i<n;i++){
           int a = read();
           if(a>0 && a<=5){
               count[a]++;
           }

           else{
               count[0]++;
           }
        }
    }

    void display(){
        for(int j=0;j<5;j++){
            System.out.println("Candidate "+(j+1)+" = "+count[j+1]);
        }

        System.out.println("The spoiled vote is "+count[0]);
    }
}

public class Election {

    public static void main(String []args){
        hide a = new hide();
        a.counter();
        a.display();
    }
}
