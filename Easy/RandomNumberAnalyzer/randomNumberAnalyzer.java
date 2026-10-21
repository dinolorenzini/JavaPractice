public class randomNumberAnalyzer
{
    /**
     * Randomly generate 10 random numbers from 1 to 100 (inclusive)
     *
     * 1 <= x <= 100
     * [1, 100]
     *
     * @return 10 randomly generated numbers as an array of ints int[]
     */
    public static int[] randomNumberAnalyzer()
    {

    }

    public static void main(String[] args)
    {
        int[] nums = randomNumberAnalyzer();

        if(nums.length == 10)
            System.out.println("correct");
        else
            System.out.println("incorrect");

        boolean correct = true;
        for(int n : nums)
            if(n < 1 || n > 100)
                correct = false;

        if(correct)
            System.out.println("correct");
        else
            System.out.println("incorrect");
    }
}
