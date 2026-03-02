import java.util.Scanner;
import java.util.Random;
public class taskEight {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        String keepGoing = "y";

        while (keepGoing.equalsIgnoreCase("y") ) {
            System.out.println("Roll\t\tDie1\t\tDie2\t\tDie3\t\tSum");
            System.out.println("----------------------------------------------------------");

            int die1, die2, die3;
            int roll = 1;

            do {
                die1 = rand.nextInt(6) + 1;
                die2 = rand.nextInt(6) + 1;
                die3 = rand.nextInt(6) + 1;
                int sum = die1 + die2 + die3;

                System.out.printf("%4d\t\t%4d\t\t%4d\t\t%4d\t\t%4d\n", roll, die1, die2, die3, sum);
                roll++;
            } while (!(die1 == die2 && die2 == die3));

            System.out.print("\nDo you want to continue? (y/n): ");
            keepGoing = scan.nextLine();
        }
    }
}
