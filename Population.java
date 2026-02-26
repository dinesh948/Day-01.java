import java.math.BigInteger;
import java.util.Scanner;

public class Population {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter population of Planet 1:");
        BigInteger planet1 = sc.nextBigInteger();

        System.out.println("Enter population of Planet 2:");
        BigInteger planet2 = sc.nextBigInteger();

        System.out.println("Enter population of Planet 3:");
        BigInteger planet3 = sc.nextBigInteger();

        BigInteger totalPopulation = planet1.add(planet2).add(planet3);

        System.out.println("Total Galactic Population: " + totalPopulation);

        sc.close();
    }
}