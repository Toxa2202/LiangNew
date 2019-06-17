import java.util.Scanner;

public class Listing_61_LottoNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean[] isCovered = new boolean[99]; // default is false

        // Read each number and mark its corresponding element covered
        System.out.println("Enter some integers from 0 to 99: ");
        int number = input.nextInt();
        while (number != 0){
            isCovered[number - 1] = true;
            number = input.nextInt();
        }

        // Check whether all covered
        boolean allCovered = true; // Assume all covered initially
        for (int i = 0; i < isCovered.length; i++) {
            if (isCovered[i]){
                allCovered = false;
                break;
            }

        }

        // Display result
        if (allCovered){
            System.out.println("The ticket cover all numbers");
        } else {
            System.out.println("The tickets don't cover all numbers");
        }
    }
}

/**
 * Підключаємо сканер.
 * Створюємо Boolean масив на 100 значень.
 * Туди будемо вносити перевірку чи відповідна цифра була в списку.
 * Створюємо інтове значення для занесення інформації від користувача.
 * В циклі перебираємо значення і записуємо в масив True, якщо є співпадіння.
 * Коли вводиться нуль - масив зупиняється
 * Створюємо значення для перевірки чи всі числа зі списку були дані користувачем.
 * Через масив перевіряємо це. Всі значення в такому випадку будуть true.
 * Якщо так - виводимо один текст. Якщо ні - інший.
 */