public class Constructor{
    public static void main(String[] args) {
        Student s1=new Student("Malik");
        System.out.println(s1.name);
        Student s2=new Student();
        Student s3=new Student(565);
        System.out.println(s3.rollno);
        
    }


    
}
class Student{
   String name;
   int rollno;

   //parameterized Constructor
   Student(String name){
    this.name=name;

   }

   Student(int rollno){
    this.rollno=rollno;

   }


   //non-parameterized Constructor
   Student(){
    System.out.println("iam in constructor");
   }

   
    
}

