public class GA
{
    public static String gradeAnalyzer(int[] grades)
    {

    }

    public static void main(String[] args)
    {
        if(gradeAnalyzer(new int[]{65}).equals("Average: 65.0 | Highest: 65 | Lowest: 65 | Passing: 1 | Failing: 0"))
            System.out.println("correct");
        else
            System.out.println("incorrect");

        if(gradeAnalyzer(new int[]{100, 50}).equals("Average: 75.0 | Highest: 100 | Lowest: 50 | Passing: 1 | Failing: 1"))
            System.out.println("correct");
        else
            System.out.println("incorrect");

        if(gradeAnalyzer(new int[]{90, 80, 70}).equals("Average: 80.0 | Highest: 90 | Lowest: 70 | Passing: 3 | Failing: 0"))
            System.out.println("correct");
        else
            System.out.println("incorrect");

        if(gradeAnalyzer(new int[]{60, 64, 65, 100}).equals("Average: 72.25 | Highest: 100 | Lowest: 60 | Passing: 2 | Failing: 2"))
            System.out.println("correct");
        else
            System.out.println("incorrect");

        if(gradeAnalyzer(new int[]{0, 100}).equals("Average: 50.0 | Highest: 100 | Lowest: 0 | Passing: 1 | Failing: 1"))
            System.out.println("correct");
        else
            System.out.println("incorrect");
    }
}
