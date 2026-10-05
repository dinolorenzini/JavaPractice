package RandomNumberAnalyzer;

public class RNA {
    public static void main(String[] args) {
        int[] numbers = randomNumberAnalyzer();

        boolean correct = true;

        if (numbers.length != 10) {
            correct = false;
        } else {
            for (int number : numbers) {
                if (number < 1 || number > 100) {
                    correct = false;
                }
            }
        }

        if (correct) {
            System.out.println("Correct!");
        } else {
            System.out.println("Incorrect!");
        }
    }

    public static int[] randomNumberAnalyzer() {
        // Their code
    }
}
