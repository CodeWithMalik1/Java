public class ContinuousSubStrings {

    // Method to recursively print substrings starting from 'start' to 'end'
    public static void PrintSubStrings(String str, int start, int end, int[] count) {
        // Base case: if 'start' exceeds the string's length, stop recursion
        if (start >= str.length()) {
            return;
        }

        // If 'end' exceeds the string's length, reset 'end' and move to the next 'start'
        if (end > str.length()) {
            PrintSubStrings(str, start + 1, start + 1 + 1, count); // Move to next starting index
        } else {
            // Print the substring from 'start' to 'end'
            System.out.println(str.substring(start, end));
            count[0]++; // Increment the counter
            // Recursive call to extend the substring by increasing 'end'
            PrintSubStrings(str, start, end + 1, count);
        }
    }

    public static void main(String[] args) {
        // Input string
        String str = "abc";

        // Counter array to store the number of substrings
        int[] count = {0};

        // Start generating substrings with initial indices
        PrintSubStrings(str, 0, 1, count);

        // Print the total number of substrings
        System.out.println("Total number of substrings: " + count[0]);
    }
}
