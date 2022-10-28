import java.nio.file.*;

class Main {
  public static void main(String[] args) {

    try {


      Path file = Paths.get("input.txt");

      long count = Files.lines(file).count();
      System.out.println("Total Lines: " + count);

    } catch (Exception e) {
      e.getStackTrace();
    }
  }
}