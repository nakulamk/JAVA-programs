 //To calculate Total marks, highest marks and tabulate a marks of n students

import java.util.*;

class Student{
    String name;
    char grade;
    int t1,t2,t3,hightotal,total,hight1,hight2,hight3,avg;
    int rollno,r1,r2,r3,r4;
    Scanner in = new Scanner(System.in);
    void read(){
       System.out.println("Enter a details of student: ");
       System.out.println("Enter a name of student: ");
       name = in.next();

       System.out.println("Enter a roll number of a student:");
       rollno = in.nextInt();
       System.out.println("Enter a marks of three subject:");
       t1 = in.nextInt();
       t2 = in.nextInt();
       t3 = in.nextInt();
    }

    void calculate(){
       total = t1+t2+t3;
       avg =(total)/3;
       if(t1<35 || t2<35 || t3<35){
          grade = 'F';
       }

       else if(avg>=35 && avg<60){
          grade = 'C';
       }

       else if(avg>=60 && avg<75){
          grade = 'B';
       }

       else if(avg>=75 && avg<90){
          grade = 'A';
       }

       else if(avg>=90 && avg<100){
          grade = 'S';
       }
    }
    
    void high(Student A[],int n ){
       hight1 = A[1].t1;
       for(int i=0;i<n;i++){
           if(hight1<A[i].t1){
              hight1 = A[i].t1;
           }

           if(hight1==A[i].t1){
            r1=A[i].rollno;
         }
       }

       System.out.println("\nThe highest marks in Subject 1 is "+hight1+" by roll no "+r1);

       hight1 = A[1].t2;
       for(int i=0;i<n;i++){
           if(hight2<A[i].t2){
              hight2 = A[i].t2;
           }

           if(hight2==A[i].t2){
            r2=A[i].rollno;
         }
       }

       System.out.println("The highest marks in Subject 2 is "+hight2+" by roll no "+r2);

       hight1 = A[1].t3;
       for(int i=0;i<n;i++){
           if(hight3<A[i].t3){
              hight3 = A[i].t3;
           }

           if(hight3==A[i].t3){
            r3=A[i].rollno;
         }
       }

       System.out.println("The highest marks in Subject 3 is "+hight3+" by roll no "+r3);

       hightotal = A[1].total;
       for(int i=0;i<n;i++){
           if(hightotal<A[i].total){
              hightotal = A[i].total;
           }

           if(hightotal==A[i].total){
            r4=A[i].rollno;
         }
       }

       System.out.println("...The highest Total marks is "+hightotal+" by roll no "+r4+"...");

    }

    void display(){
       System.out.format("|%-10s | %-10d | %-10d | %-10d | %-10d | %-10d| %-10d| %-9s|\n",name,rollno,t1,t2,t3,total,avg,grade);
    }
 }

 public class StudentTab{
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a number of students in a Class:");
       int m = sc.nextInt();

       Student []S = new Student[m];
       Student obj = new Student();

       for(int i=0;i<m;i++){
          S[i] = new Student();
       }

       for(int i=0;i<m;i++){
          S[i].read();
       }

       for(int i=0;i<m;i++){
           S[i].calculate();
       }

       System.out.println("|  Name     |  Roll No   |  Subject 1 |  Subject 2 |  Subject 3 |   Total   |  Average  |   Grade  |");

       for(int i=0;i<m;i++){
          S[i].display();
       }

       obj.high(S,m);
    }
 }
   