public class pattern {


public static void butterfly(int n){

    //top
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= i; j++) {
            System.out.print("*");
        }
        for (int j2 = 1; j2 <=2*(n-i) ; j2++) {
            System.out.print(" ");
            
        }
        for (int j = 0; j < i; j++) {
            System.out.print("*");
        
        
    }
    System.out.println();

}

//bottom
for (int i = n; i >=1; i--) {
    for (int j = 1; j <=i; j++) {
        System.out.print("*");

        
        
    }
    for (int j2= 1; j2 <=2*(n-i); j2++) {
        System.out.print(" ");
        
    }
    for (int j = 1; j <=i; j++) {
        System.out.print("*");

        
        
    }
    System.out.println();

    
}


}


public static void diamond(int n){

    //top half
    for (int i = 1; i <=n; i++) {
        for (int j = 1; j <=n-i; j++) {
            System.out.print("  ");
            
        }
        for (int k = 1; k<=2*(i)-1; k++) {
            System.out.print("* ");

            
        }
        System.out.println();
        
    }
    //bottom half
    for (int i = n; i >=1; i--) {
        for (int j = 1; j <=n-i; j++) {
            System.out.print("  ");
            
        }
        for (int k = 1; k<=2*(i)-1; k++) {
            System.out.print("* ");

            
        }
        System.out.println();
        
    }

}

public static boolean palindrome(String word){
    int n=word.length();
    for (int i = 0; i < n/2; i++) {
        if(word.charAt(i)!=word.charAt(n-i-1)){
            return false;
        }
        
        
    }
    return true;
}

public static void compressor(String word){
    int n=word.length();
    String compressedString="";
    Integer count=1;
    for (int i = 0; i <n; i++) {
        
        while (i < n-1 && word.charAt(i)==word.charAt(i+1)) {
            
            count++;
            i++;
            
            
        }
        compressedString+=word.charAt(i);
        if(count>1){
            count++;
            compressedString+=count.toString(i);
        }
        
        
    }
    System.out.println(compressedString);

}

    public static void main(String[] args) {

        String word="aaaawwwss";
        compressor(word);

       
     
       
        
    }
    
}
