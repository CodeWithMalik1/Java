import java.util.Scanner;

public class range {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range: ");
        int n = sc.nextInt();
        sc.close();  // Close scanner to avoid memory leak
        
        String primeNumbers = "";
        
        for (int i = 2; i <= n; i++) {  // Start from 2, since 1 is not prime
            int count = 0;
            
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            
            if (count == 2) {  // A number is prime if it has exactly 2 divisors (1 and itself)
                primeNumbers += i + " ";
            }
        }
        
        System.out.println("Prime numbers from 1 to " + n + " are:");
        System.out.println(primeNumbers);
    }
}
