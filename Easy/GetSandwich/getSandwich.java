public class getSandwich {
  public static int correct = 0;
  public static int incorrect = 0;
/**
 * Returns the text between the first two occurrences of "bread".
 *
 * @param str the input string containing zero or more occurrences of "bread"
 * @return the text between the first two occurrences of "bread", or "" if fewer than two exist
 *
 */
  public static String getSandwich(String str) {
    // Your code here



    
  }


  // DO NOT MODIFY BELOW
  public static void main(String[] args) {
    System.out.println("Java Practice | github.com/dinolorenzini/JavaPractice");
    tester("webreadyonthisbread", "yonthis");
    tester("xxbreadjambreadyy", "jam");
    tester("breadjambread", "jam");
    tester("breadjam", "");
    tester("breadbread", "");
    tester("breadpeanut butterbread", "peanut butter");
    tester("breadonebreadtwobread", "one");
    tester("nothing here", "");
    tester("BreadjamBread", "");
    tester("bread123bread", "123");
    tester("bread!@#$%bread", "!@#$%");
    tester("breadhello worldbread", "hello world");
    tester("xxbreadbreadyy", "");
    tester("breadabread", "a");
    tester("breadbreadbread", "");
    tester("breadonebreadbreadtwo", "one");
    tester("breadonebreadtwo", "one");
    tester("breadbreadonebread", "");
    tester("BREADjamBREAD", "");
    tester("breadJamBread", "");
    tester("breadjamBREAD", "");
    tester("Breadbreadjam bread", "jam ");
    tester("bread  bread", "  ");
    tester("bread\nbread", "\n");
    tester("", "");
    tester("bread", "");
    tester("breadbreadbreadbread", "");
    tester("xxbread123bread456bread789", "123");
    tester("bread! bread? bread.", "! ");
    tester("bread 123 bread", " 123 ");
    System.out.println("getSandwich (Easy) Results:\nCorrect: " + correct + "\nIncorrect: " + incorrect);
  }
    /**
    * Helper function for testing getSandwich()
    * @param testStr the string to test against
    * @param requiredOutput the string to check for as the returned value
    */
  public static void tester(String testStr, String requiredOutput) {
      String response = getSandwich(testStr);
    if (!response.equals(requiredOutput)) { 
        System.out.println("Test Failed - \"" + testStr + "\" requires an output of \"" + requiredOutput + "\" but instead it got \"" + response + "\".");
        incorrect++;
    } else {
        correct++;
    }
  }
}

    
