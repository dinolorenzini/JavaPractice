public class SCP
{
    public static String commandParser(String command)
    {

    }

    public static void main(String[] args)
    {
        if(commandParser("hello").equals("Hello!"))
            System.out.println("correct");
        else
            System.out.println("incorrect");

        if(commandParser("add 5 10").equals("15"))
            System.out.println("correct");
        else
            System.out.println("incorrect");

        if(commandParser("add 100 25").equals("125"))
            System.out.println("correct");
        else
            System.out.println("incorrect");

        if(commandParser("reverse Java").equals("avaJ"))
            System.out.println("correct");
        else
            System.out.println("incorrect");

        if(commandParser("reverse Bob").equals("boB"))
            System.out.println("correct");
        else
            System.out.println("incorrect");

        if(commandParser("user Bob123").equals("Bob123"))
            System.out.println("correct");
        else
            System.out.println("incorrect");

        if(commandParser("dance").equals("Unknown command"))
            System.out.println("correct");
        else
            System.out.println("incorrect");

        if(commandParser("add 5").equals("Invalid command"))
            System.out.println("correct");
        else
            System.out.println("incorrect");

        if(commandParser("add hello 10").equals("Invalid command"))
            System.out.println("correct");
        else
            System.out.println("incorrect");

        if(commandParser("reverse").equals("Invalid command"))
            System.out.println("correct");
        else
            System.out.println("incorrect");
    }
}
