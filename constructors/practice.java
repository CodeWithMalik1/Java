public class practice {



    public static void main(String[] args) {
        Student s1=new Student("malik");
       

       
       
        s1.password=789;
        s1.roll_no=5655;
        s1.marks[0]=99;
        s1.marks[1]=89;
        s1.marks[2]=97;

        
        
        System.out.println(s1.name);
        System.out.println(s1.roll_no);
        System.out.println(s1.password);
        Student s2=new Student(s1);
        System.out.println(s2.name);
        System.out.println(s2.roll_no);
        s2.password=999;
        System.out.println(s2.password);
        s1.marks[2]=100;


        for (int i = 0; i < 3; i++) {

            System.out.println(s2.marks[i]);
            
        }

    }
    
}

class Student{
    String name;
    int roll_no;
    int password;
    int marks[];

    Student(String name){
        this.name=name;
        marks=new int[3];
    }
    Student(int roll_no){
        this.roll_no=roll_no;
        marks=new int[3];
    }


    Student(Student s1){
        this.name=s1.name;
        this.roll_no=s1.roll_no;
        marks=new int[3];

        for (int i = 0; i < marks.length; i++) {
            this.marks[i]=s1.marks[i];
            
        }
    }

   
}
