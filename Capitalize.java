class Main {
  public static void main(String[] args) {

    // create a string
    String name = "programiz";

    String firstLetter = name.substring(0, 1);
    String remainingLetters = name.substring(1, name.length());

    // change the first letter to uppercase
    firstLetter = firstLetter.toUpperCase();

    // join the two substrings
    name = firstLetter + remainingLetters;
    System.out.println("Name: " + name);

  }
}
