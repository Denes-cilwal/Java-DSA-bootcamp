
import java.util.Scanner;

public class Area {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    float rad = sc.nextFloat();

    // double > float
    // widening conversion | implicit conversion |

    double area = 3.14 * rad * rad;
    System.out.println(area);

    // type casting

    int marks = (int) (99.99f); // loss of data
    char ch = 'a';
    int number = ch;
    System.out.println(number);
  }

}
