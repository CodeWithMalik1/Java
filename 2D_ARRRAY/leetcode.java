class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder mergedString = new StringBuilder();

        int i = 0;
        while (i < word1.length() && i < word2.length()) {
            mergedString.append(word1.charAt(i));
            mergedString.append(word2.charAt(i));
            i++;
        }

        while (i < word1.length()) {
            mergedString.append(word1.charAt(i));
            i++;
        }

        while (i < word2.length()) {
            mergedString.append(word2.charAt(i));
            i++;
        }

        return mergedString.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String word1 = "abc";
        String word2 = "pqr";
        System.out.println(solution.mergeAlternately(word1, word2));  // Output: "apbqcr"
    }
}
