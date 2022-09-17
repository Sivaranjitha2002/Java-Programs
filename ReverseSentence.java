public class Reverse {

  public static void main(String[] args) {
    String sentence;
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the Sentence:");
    sentence=s.nextline();
    String reversed = reverse(sentence);
    System.out.println("The reversed sentence is: " + reversed);
  }

  public static String reverse(String sentence) {
    if (sentence.isEmpty())
      return sentence;

    return reverse(sentence.substring(1)) + sentence.charAt(0);
  }
}
