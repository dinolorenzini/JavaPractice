public class usernameValidatorPractice {
    public static void main(String[] args) {
        testUsername("Bob123", true);
        testUsername("bad username", false);
        testUsername("A", false);
        testUsername("Cool_User", false);
        testUsername("JavaMaster16", true);
        testUsername("ABC123", true);
        testUsername("ABCDEFGHIJKLMNOP", true);
        testUsername("ABCDEFGHIJKLMNOPQ", false);
        testUsername("Bob 123", false);
    }

    public static void testUsername(String username, boolean expected) {
        boolean result = usernameValidator(username);

        if (result == expected) {
            System.out.println("Correct!");
        } else {
            System.out.println("Incorrect!");
            System.out.println("Username: " + username);
            System.out.println("Expected: " + expected);
            System.out.println("Got: " + result);
        }
    }

    public static boolean usernameValidator(String username) {
        // Their code
    }
}
