class Calculator{
    public static void main(String[] args) {
        Add c1=new Add();
        c1.add(2, 40);
        System.out.println("Sum is: " + c1.sum);
        Subtract s1=new Subtract();
        s1.subtract(9, 100);
        System.out.println("Subtraction is: " + s1.sub);
        Multiply m1=new Multiply();
        m1.multiply(10, 20);            
        System.out.println("Multiplication is: " + m1.mul);
        Divide d1=new Divide(); 
        d1.divide(100, 5);
        System.out.println("Division is: " + d1.div);

        
    }
}
class Add{
    int sum;
    void add(int a,int b){
        sum=a+b;

    }

}
class Subtract{
    int sub;
    void subtract(int a,int b){
        sub=a-b;
    }
}
class Multiply{
    int mul;
    void multiply(int a,int b){
        mul=a*b;
    }
}
class Divide{
    float div;
    void divide(int a,int b){
        div=a/b;
    }
}