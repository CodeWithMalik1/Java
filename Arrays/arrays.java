import java.util.*;
import java.util.Scanner;

class arrays{
    public static void main(String[] args) {
        int marks[]=new int[10];
        Scanner sc=new Scanner(System.in);
        System.out.println("enter marks: ");
        marks[0]=sc.nextInt();
        marks[1]=sc.nextInt();
        marks[2]=sc.nextInt();
        marks[2]=marks[2]+2;
        System.out.println("physics : "+marks[0]);
        System.out.println("physics : "+marks[1]);
        System.out.println("physics : "+marks[2]);
    }
}