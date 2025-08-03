public class linearsearch {
    public static int search(int mark[],int key){
        for (int i = 0; i < mark.length; i++) {
            if(mark[i]==key){
                return i;
            }
            
            
        }
        return -1;
    }
    public static void main(String[] args) {
        int marks[]={1,2,3,4,5,6,7,8,9};
        int key=1;
        int index=search(marks,key);
        if(index==-1){
            System.out.println("key not found");
        }
        else{
            System.out.println("at index "+index+" key "+key + " is found");
        }
    }
    
}
