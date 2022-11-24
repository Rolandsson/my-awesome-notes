import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {

  public static void main(String[] args) {
    List<String> notes = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    System.out.println("Add new note: ");
    String note = scanner.nextLine();

    notes.add(note);
  }
}
