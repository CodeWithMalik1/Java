public class Copyconstructor {

    public static void main(String[] args) {

        Student s1=new Student("Malik");
        s1.rollno=565;
        s1.password=345;

        System.out.println(s1.name);
        System.out.println(s1.rollno);
        System.out.println(s1.password);

        Student s2=new Student(s1);
        s2.password=909;

        System.out.println(s2.password);
        System.out.println(s2.name);
        System.out.println(s2.rollno);

        //marks from arr

        s1.marks[0]=100;
        s1.marks[1]=90;
        s1.marks[2]=80;
        s1.marks[2]=100;
        for (int i = 0; i < 3; i++) {

            System.out.println(s2.marks[i]);
            
        }

       
        
    }
    
}

class Student{
    String name;
    int rollno;
    int password;

    int marks[];

    //shallow copyconstructor
    Student(Student s1){
        this.name=s1.name;
        this.rollno=s1.rollno;
        marks=new int[3];
        this.marks=s1.marks;
    }

    //constructor
    Student(String name){

        this.name=name;
        marks=new int[3];

    }
    Student(int rollno){

        this.rollno=rollno;
        marks=new int[3];

    }


}
