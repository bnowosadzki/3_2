// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    System.out.println("Podaj rozmiar kwadratu");
    int size = new Scanner(System.in).nextInt();;
    
    Scanner scanner = new Scanner(System.in);

    System.out.print("Podaj swój znak ");
    String name = scanner.next();
    for (int row = 1; row <= size; row++){
      for (int col = 1; col <= row; col++){
        System.out.print(name);
      }
      System.out.println();
    }
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}