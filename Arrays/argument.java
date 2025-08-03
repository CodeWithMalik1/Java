public class argument {
    //array as argument
    public static void update(int marks[]){
        for (int i = 0; i < marks.length; i++) {

            System.out.println(marks[i]+2);
            
        }
    }
    public static void main(String[] args) {
        
        int marks[]={99,97,90};
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
            
        }
        update(marks);
    }
    
}
