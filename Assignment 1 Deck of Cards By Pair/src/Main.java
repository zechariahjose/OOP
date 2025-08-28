import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Deck deck = new Deck();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Menu:");
            System.out.println("1. Create Deck");
            System.out.println("2. Shuffle Deck");
            System.out.println("3. Deal Cards");
            System.out.println("4. Display Deck");
            System.out.println("5. Exit");
            System.out.print("Select an action: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    deck = new Deck();
                    System.out.println("Deck created.");
                    break;
                case 2:
                    deck.shuffle();
                    System.out.println("Deck shuffled.");
                    break;
                case 3:
                    System.out.print("How many cards to deal? ");
                    int numberOfCards = scanner.nextInt();
                    List<Card> dealtCards = deck.deal(numberOfCards);
                    System.out.println("Dealt Cards:");
                    for (Card card : dealtCards) {
                        System.out.println(card);
                    }
                    break;
                case 4:
                    deck.display();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid action.");
            }
        } while (choice != 5);

        scanner.close();
    }
}
