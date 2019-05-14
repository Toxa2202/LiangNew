import java.util.Scanner;

public class Lab_105_DisplayingThePrimeFactors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a positive integer: ");
        int userInput = input.nextInt();
        input.close();
        StackOfIntegers stack = new StackOfIntegers();
        for (int i = 2; i <= userInput; i++) {
            if (userInput % i == 0) {
                stack.push(i);
                userInput /= i;
                i = 1;
            }
        }
        while (!stack.empty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}

class StackOfIntegers {
    private int[] elements;
    private int size;
    public static final int DEFAULT_CAPACITY = 16;

    public StackOfIntegers() {
        this(DEFAULT_CAPACITY);
    }

    public StackOfIntegers(int capacity) {
        elements = new int[capacity];
    }

    public void push(int value) {
        if (size >= elements.length) {
            int[] temp = new int[elements.length * 2];
            System.arraycopy(elements, 0, temp, 0, elements.length);
            elements = temp;
        }
        elements[size++] = value;
    }

    public int pop() {
        return elements[--size];
    }

    public int peek() {
        return elements[size - 1];
    }

    public boolean empty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }
}

