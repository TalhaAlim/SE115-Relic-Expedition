import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
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