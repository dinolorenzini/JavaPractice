public class usernameValidatorPractice {
    public static void main(String[] args) {
        testUsername("Bob123");
        testUsername("bad username");
        testUsername("A");
        testUsername("Cool_User");
        testUsername("JavaMaster16");
        testUsername("ABC");
        testUsername("1234567890123456");
        testUsername("12345678901234567");
    }

    public static void testUsername(String username) {
        boolean actual = usernameValidator(username);

        boolean expected = true;

        if (username.length() < 3) {
            expected = false;
        } else if (username.length() > 16) {
            expected = false;
        } else {
            String lowercase = username.toLowerCase();

            for (int i = 0; i < lowercase.length(); i++) {
                char c = lowercase.charAt(i);

                if (!((c >= 'a' && c <= 'z') || (c >= '0' && c <= '9'))) {
                    expected = false;
                }
            }
        }

        if (actual == expected) {
            System.out.println("Correct: " + username);
        } else {
            System.out.println("Incorrect: " + username);
            System.out.println("Expected: " + expected);
            System.out.println("Got: " + actual);
        }
    }

    public static boolean usernameValidator(String username) {
        // Their code
    }
}
