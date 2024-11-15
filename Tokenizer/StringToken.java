import java.util.Scanner;
import java.util.StringTokenizer;

public class StringToken {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int num, sum = 0;

    System.out.println("Enter some numbers separated with space: ");
    String example = scanner.nextLine();

    StringTokenizer newString = new StringTokenizer(example, " ");
    while(newString.hasMoreTokens()){
      num = Integer.parseInt(newString.nextToken());
      System.out.println(num);
      sum += num;
    }
    System.out.println("Sum: "+sum);
    scanner.close();
  }
}

/*
Step 1: Start
Step 2: Import all classes of package java.util.
Step 3: Create object of stringTokenizer class using constructor with delimiter argument as space for separating tokens.
Step 4: Enter numbers separated by space.
Step 5: Using appropriate methods, separate tokens (integers)
Step 6: Display the tokens and find the sum of all integers.
Step 7: Stop
 */