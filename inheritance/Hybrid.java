public class Hybrid {
    public static void main(String[] args) {
        
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

class Birds extends Animal{
    void wings(){
        System.out.println("wings");
    }
}
class Dogs extends Mammels{
    void breed(){
        System.out.println("breed");
    }
}