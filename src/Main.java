import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        System.out.println("=== RELIC EXPEDITION ===");
        System.out.println("1. New Game");
        System.out.println("2. Exit");

        System.out.print("Choose an option: ");
        choice = sc.nextInt();

        if(choice == 1) {
            System.out.println("New Game selected.");
        } else if (choice == 2) {
            System.out.println("Goodbye!");
        } else {
            System.out.println("Invalid choice.");
        }
    }
}