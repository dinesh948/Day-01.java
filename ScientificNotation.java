import java.util.Scanner;
import java.math.BigDecimal;

public class ScientificNotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read scientific notation as string
        String input = sc.nextLine();

        // Convert using BigDecimal
        BigDecimal number = new BigDecimal(input);

        // Print in plain decimal format
        System.out.println(number.toPlainString());

        sc.close();
    }
}