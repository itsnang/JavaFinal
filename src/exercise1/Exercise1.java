package exercise1;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        InputNumber();
    }

    public static void InputNumber() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many numbers do you want to input? ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.println("You entered:");
        for (int number : numbers) {
            System.out.println(number);
        }

        scanner.close();
    }
}
