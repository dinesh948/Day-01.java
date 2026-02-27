import java.util.Scanner;

public class Quantum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read 64-bit long value
        long number = sc.nextLong();

        // Extract bits (0-indexed)
        int bit4  = (int)((number >> 4) & 1);
        int bit16 = (int)((number >> 16) & 1);
        int bit32 = (int)((number >> 32) & 1);

        // Print results
        System.out.println("4th bit  : " + bit4);
        System.out.println("16th bit : " + bit16);
        System.out.println("32nd bit : " + bit32);

        sc.close();
    }
}