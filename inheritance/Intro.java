public class Intro{
    public static void main(String[] args) {
        Fish tuna=new Fish();
        tuna.eat();

        
    }
}

//sinle level inheritance


    //base class
    class Animal{
        void eat(){
            System.out.println("eating");
        }

        void breath(){
            System.out.println("breath");
        }
    }

    //derived class
    class Fish extends Animal{
        int wings;
        void swim(){
            System.out.println("swim");
        }

    }


    
