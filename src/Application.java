import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {

  public static void main(String[] args) {
    List<String> notes = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    boolean isDone = false;

    while(!isDone) {
      System.out.print("Add new noteeee: ");
      String note = scanner.nextLine();

      if(note.equals("quit")) {
        isDone = true;
      } else {
        notes.add(note);
      }
    }

  }
}
