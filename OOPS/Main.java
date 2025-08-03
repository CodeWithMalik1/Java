import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       
        Casio calculator=new Casio();
        calculator.add(2, 40);  
        calculator.subtract(9, 100);
        calculator.multiply(3, 90);
        calculator.divide(100, 5);
        System.out.println("Sum is: " + calculator.sum);        
        System.out.println("Subtraction is: " + calculator.sub);
        System.out.println("Multiplication is: " + calculator.mul);
        System.out.println("dovision is: " + calculator.div);
        Circle circle = new Circle(5);
        System.out.println("Area of circle: " + circle.area());
        System.out.println("Circumference of circle: " + circle.circumference());
        System.out.println("Radius of circle: " + circle.radius);
        System.out.println("Diameter of circle: " + circle.diameter());
        Bank b1=new Bank();
        
        System.out.println("total amount after withdraw is :"+b1.withdraw(9000));
        System.out.println("balace amount is :"+b1.accountBalace());
        System.out.println("total amount after deposit "+4000+ " of is :"+b1.deposit(4000));
        
    }
    
}
class Bank{
   
    float accountBalance=10000;
    
    
    
    float accountBalace(){
        return accountBalance;

    }
    float deposit(float deposit){
        float total=accountBalance+deposit;
        accountBalance=total;
        return total;
    }
    float withdraw(float withdraw){
        float total=accountBalance-withdraw;
        accountBalance=total;
        return total;
    }
    


}

class Casio{
    int sum;
    int sub;
    int mul;
    float div;

    void add(int a, int b) {
        sum = a + b;
    }

    void subtract(int a, int b) {
        sub = a - b;
    }

    void multiply(int a, int b) {
        mul = a * b;
    }

    void divide(int a, int b) {
        div = (float) a / b;
    }
}
class Circle{
    
     int radius;
   
     Circle(int r) {
        radius = r;
    }
    double area() {
        return Math.PI * radius * radius;
    }
    double circumference() {
        return 2 * Math.PI * radius;
    }
    float diameter(){
        return  2 * radius;
    }

}
