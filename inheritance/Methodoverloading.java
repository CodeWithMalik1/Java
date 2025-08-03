public class Methodoverloading {

    
    public static void main(String[] args) {
        Calc calc1=new Calc();
        calc1.sum((float)2.3,(float)2.2);

        
    }
    
}
class Calc{
  void sum(int a,int b){
        int sum=a+b;
        System.out.println(sum);
     }
      void sum(float a,float b){
         float sum=a+b;
         System.out.println(sum);
      }
}


