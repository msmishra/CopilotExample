import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // Create a program that asks the user for a number and then prints the even numbers from 0 to the given number
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int counter = 0;
        while (counter <= number) {
            if (counter % 2 == 0) {
                System.out.println(counter);
            }
            counter++;
        }
    }
}