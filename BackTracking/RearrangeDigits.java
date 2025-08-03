public class RearrangeDigits {
    public static void main(String[] args) {
        int num = 123456;

        String str = Integer.toString(num);  // Convert number to string
        int mid = str.length() / 2;

        String firstHalf = str.substring(0, mid);   // "123"
        String secondHalf = str.substring(mid);     // "456"

        String reversedFirst = new StringBuilder(firstHalf).reverse().toString();   // "321"
        String reversedSecond = new StringBuilder(secondHalf).reverse().toString(); // "654"

        String result = reversedFirst + reversedSecond;  // "321654"
        System.out.println(result);
    }
}
