class subSet {
    public static void printSub(String str, String newSub, int i) {
        if (i == str.length()) {
            if (newSub.length() == 0) {
                System.out.println("null");
                return;
            } else {
                String rev = "";
                int n = newSub.length();
                for (int j = n - 1; j >= 0; j--) {
                    rev = rev + newSub.charAt(j);

                }

                if (rev.equals(newSub)) {
                    if(rev.length()>1)
                    System.out.println(newSub + " is a palindrome");
                } else {
                    System.out.println(newSub + " is not a palindrome");
                }
                return;
            }
        }
        printSub(str, newSub + str.charAt(i), i + 1);
        printSub(str, newSub, i + 1);
    }

    public static void main(String[] args) {
        printSub("malim", "", 0);

    }
}