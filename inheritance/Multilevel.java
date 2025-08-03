public class Multilevel {

    public static void main(String[] args) {
        Dogs d1=new Dogs();
        d1.eat();
        
    }
    
}

class Animal{
    void eat(){
        System.out.println("eats");
    }
}

class Mammels extends Animal{
    void legs(){
        System.out.println("has legs");
    }
}
class Dogs extends Mammels{
    void breed(){
        System.out.println("breed");
    }
}
