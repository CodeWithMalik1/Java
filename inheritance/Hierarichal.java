public class Hierarichal {
    public static void main(String[] args) {
        Birds sparrow=new Birds();
        sparrow.eat();
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
