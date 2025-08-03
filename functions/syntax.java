class syntax {
    public static void hello(){
        System.out.println("hello world");

    }
    public static void sum(int num1,int num2){
        int sum=num1+num2;
        System.out.println(sum);

    }
    public static int mul(int num1,int num2){
        int mul=num1 *num2;
        return mul;
    }

    public static void main(String[] args) {
        hello();
        int a=3;
        int b=3;
      
       int mul= mul(a,b);
       System.out.println(mul);

      


    }

}