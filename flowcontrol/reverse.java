class reverse {
    public static void main(String[] args) {
        int n = 123456,lastDigit;
          // Using a for loop to reverse the number
          for (; n > 0; n /= 10) { // No initialization; loop runs while n > 0; n is updated inside
            lastDigit = n % 10;  // Extract last digit
            System.out.print(lastDigit); // Print the digit
        }
        // int last1;
        // while(n>0){

        // last1=n%10;
        // n=n/10;
        // System.out.print(last1);

        // }

    }
}