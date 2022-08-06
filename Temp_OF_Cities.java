import java.util.*;

class City{
    double[] t = new double[6];
    String name;

    Scanner sc = new Scanner(System.in);

    void read(){
        System.out.println("Enter a name of a city: ");
        name = sc.next();

        for(int i=0;i<6;i++){
            System.out.println("Enter a temp of city on Jan "+(i+1)+" :");
            t[i] = sc.nextDouble();
        }
    }
}

public class Temp_OF_Cities {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number of Cities : ");
        int n = sc.nextInt();

        City[] c = new City[n];

        for(int i=0;i<n;i++){
            c[i] = new City();
            c[i].read();
        }

        double high = c[0].t[0], low = c[0].t[0];
        String city1 = c[0].name, city2 = c[0].name;
        int day1 = 0, day2 = 0;

        for(int i=0;i<n;i++)
            for(int j=0;j<6;j++)
                if(high <c[i].t[j]){
                    high = c[i].t[j];
                    city1 = c[i].name;
                    day1 = (j+1);
                }

        for(int i=0;i<n;i++)
            for(int j=0;j<6;j++)
                if(low > c[i].t[j]){
                    low = c[i].t[j];
                    city2 = c[i].name;
                    day2 = (j+1);
                }

        System.out.println("The City "+city1+" has highest temperature of "+high+" celsius on January "+day1);
        System.out.println("The City "+city2+" has lowest temperature of "+low+" celsius on January "+day2);
    }
}
