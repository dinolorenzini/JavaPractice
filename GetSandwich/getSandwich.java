public class getSandwich() {
  public static int correct = 0;
  public static int incorrect = 0;
/**
 * Returns the text between the first two occurrences of "bread".
 *
 * @param str the input string containing zero or more occurrences of "bread"
 * @return the text between the first two occurrences of "bread", or "" if fewer than two exist
 *
 * Examples:
 * getSandwich("xxbreadjambreadyy") returns "jam"
 * getSandwich("breadjambread") returns "jam"
 * getSandwich("breadjam") returns ""
 */
  public static String getSandwich(String str) {
    // Your code here



    
  }


  // DO NOT MODIFY BELOW
  public static void main(String[] args) {
    System.out.println("Java Practice | github.com/dinolorenzini/JavaPractice");
    tester("webreadyonthisbread", "yonthis");
    if (!getSandwich("webreadyonthisbread").equals("yonthis")) {
      incorrect++;
      System.out.println(
  }
    /**
    * Helper function for testing getSandwich()
    * @param testStr the string to test against
    * @param requiredOutput the string to check for as the returned value
    */
  public static void tester(String testStr, String requiredOutput) {
    if (!getSandwich(testStr").equals(requiredOutput)) {
      
}
    
