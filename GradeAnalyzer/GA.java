package GA;

public class GA {
    public static void main(String[] args) {
        testGrades(new int[]{72, 91, 63, 84, 55, 98, 76});
        testGrades(new int[]{100, 100, 100});
        testGrades(new int[]{50, 60, 70});
        testGrades(new int[]{65});
        testGrades(new int[]{0, 64, 65, 100});
        testGrades(new int[]{});
    }

    public static void testGrades(int[] grades) {
        String actual = gradeAnalyzer(grades);

        String expected;

        if (grades.length == 0) {
            expected = "No grades";
        } else {
            int sum = 0;
            int highest = grades[0];
            int lowest = grades[0];
            int passing = 0;
            int failing = 0;

            for (int grade : grades) {
                sum += grade;

                if (grade > highest) {
                    highest = grade;
                }

                if (grade < lowest) {
                    lowest = grade;
                }

                if (grade >= 65) {
                    passing++;
                } else {
                    failing++;
                }
            }

            double average = (double) sum / grades.length;

            expected = "Average: " + average
                    + " | Highest: " + highest
                    + " | Lowest: " + lowest
                    + " | Passing: " + passing
                    + " | Failing: " + failing;
        }

        if (actual.equals(expected)) {
            System.out.println("Correct!");
        } else {
            System.out.println("Incorrect!");
            System.out.println("Expected: " + expected);
            System.out.println("Got: " + actual);
        }
    }

    public static String gradeAnalyzer(int[] grades) {
        // Their code
    }
}
