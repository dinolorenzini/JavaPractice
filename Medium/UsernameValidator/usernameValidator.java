public class UV
{
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
