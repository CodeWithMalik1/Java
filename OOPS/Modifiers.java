public class Modifiers {
    public static void main(String[] args) {
        // Create an object of Bank class
        Bank b1 = new Bank();
        
        // Set values for name and password
        b1.name = "malik";
        b1.setPassword("Yaseen");
        
        // Print values
        System.out.println("Name: " + b1.name);
        System.out.println("Password: " + b1.getPassword());
    }
}

class Bank {
    // Public field for name
    public String name;
    
    // Private field for password
    private String password;

    // Method to set password
    public void setPassword(String pswd) {
        password = pswd;
    }

    // Method to get password
    public String getPassword() {
        return password;
    }
}
