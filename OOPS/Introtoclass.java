import java.util.*;
public class Introtoclass{
    public static void main(String[] args) {
        Pen p1=new Pen();
        p1.setColor("red");
        p1.setTip(5);
        System.out.println(p1.color);
        System.out.println(p1.tip);
        //student

        Student s1=new Student();
        s1.average(99,99,99);
        System.out.println("Marks :"+s1.avg);
        
    }
}

    class Pen{
        String color;
        int tip;
        void setColor(String newColor){
            color=newColor;
        }
        void setTip(int newTip){
            tip=newTip;
        }
    }

    class Student{
        String name;
        float avg;
        void average(int math,int sci,int eng){
            Scanner sc=new Scanner(System.in);
            String name=sc.nextLine();
            avg=(math+sci+eng)/3;
        }
    }
