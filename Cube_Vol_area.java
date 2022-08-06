import java.util.*;

class Cube{
    double l;

    Cube(double l){
        this.l = l;
    } 

    double volume(){
        return l*l*l;
    }

    double area(){
        return 6*l*l;
    }
}

public class Cube_Vol_area {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number of Cubes: ");
        int n = sc.nextInt();

        Cube[] c = new Cube[n];
        
        for(int i=0;i<n;i++){
            System.out.println("Enter a lenght of a Cube "+(i+1)+" : ");
            double l = sc.nextInt();
            System.out.println();
            c[i] = new Cube(l);
        }

        for(int i=0;i<n;i++){
            System.out.println("The Volume of Cube "+(i+1)+" is "+c[i].volume());
            System.out.println("The Outer area of Cube "+(i+1)+" is "+c[i].area());
            System.out.println();
        }
    }
}
