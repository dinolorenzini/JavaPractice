public class UV
{
    /**
     * Check if a username meets the following requirements:
     * - Accept a String username and return true if valid, false otherwise.
     * - Valid usernames are 3–16 characters long, letters and numbers only.
     * - Use length(), charAt(), and toLowerCase().
     * - Do not hard-code the results.
     * @param String username
     * @return true/false (boolean) if the user is not taken
     */
    public static boolean usernameValidator(String username)
    {

    }

    public static void main(String[] args)
    {
        if(usernameValidator("Bob123") == true)
            System.out.println("correct");
        else
            System.out.println("incorrect");

        if(usernameValidator("Bo") == false)
            System.out.println("correct");
        else
            System.out.println("incorrect");

        if(usernameValidator("Bob Smith") == false)
            System.out.println("correct");
        else
            System.out.println("incorrect");

        if(usernameValidator("Bob!") == false)
            System.out.println("correct");
        else
            System.out.println("incorrect");

        if(usernameValidator("ABCDEFGHIJKLMNOP") == true)
            System.out.println("correct");
        else
            System.out.println("incorrect");

        if(usernameValidator("ABCDEFGHIJKLMNOPQ") == false)
            System.out.println("correct");
        else
            System.out.println("incorrect");
    }
}
