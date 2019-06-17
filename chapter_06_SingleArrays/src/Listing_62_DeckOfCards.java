public class Listing_62_DeckOfCards {
    public static void main(String[] args) {
        int[] deck = new int[52];
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

        // Initialize the cards
        for (int i = 0; i < deck.length; i++) {
            deck[i] = i;
        }

        // Shuffle the cards
        for (int i = 0; i < deck.length; i++) {
            // Generate an index randomly
            int index = (int)(Math.random() * deck.length);
            int temp = deck[i];
            deck[i] = deck[index];
            deck[index] = temp;
        }

        // Display the first four cards
        for (int i = 0; i < 4; i++) {
            String suit = suits[deck[i] / 13];
            String rank = ranks[deck[i] % 13];
            System.out.println("Card number " + deck[i] + ": " + rank + " of " + suit);
        }
    }
}

/**
 * Створюємо масив стрінгів suits для 4-ох мастей і масив ranks для 13ти карт в масті. Кожен елемент масиву є стрінгом.
 * Програма створює інтовий масив на 52 місця (0 до 51). Нульовий елемент - Туз хрестовий, перший - 2 хреста.
 * 13-й Туз черви, 14-й  - 2 черви.
 * Через масив тусуємо випадково колоду.
 * Визначаємо по якійсь карті масть (ділимо індекс на 13 - залишок 0, 1, 2, 3)
 * Визначаємо карту (остача від ділення на 13 - залишок від 0 до 12)
 * Виводимо результат
 */