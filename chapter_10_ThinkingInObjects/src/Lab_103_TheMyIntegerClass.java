public class Lab_103_TheMyIntegerClass {
    public static void main(String[] args) {
        System.out.println(MyInteger.parseInt(new char[]{'1', '6', '0', '4'}));
        System.out.println(MyInteger.parseInt("1987503"));
    }
}

class MyInteger {
    private int value;

    public MyInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public boolean isEven() {
        return MyInteger.isEven(value);
    }

    public boolean isOdd() {
        return MyInteger.isOdd(value);
    }

    public boolean isPrime() {
        return MyInteger.isPrime(value);
    }

    public static boolean isEven(int value) {
        return (value % 2) == 0;
    }

    public static boolean isOdd(int value) {
        return (value % 2) == 1;
    }

    public static boolean isPrime(int value) {
        //check if n is a multiple of 2
        if (value % 2 == 0) return false;
        //if not, then just check the odds
        for (int i = 3; i * i <= value; i += 2) {
            if (value % i == 0)
                return false;
        }
        return true;
    }

    public static boolean isEven(MyInteger myInteger) {
        return MyInteger.isEven(myInteger.getValue());
    }

    public static boolean isOdd(MyInteger myInteger) {
        return MyInteger.isOdd(myInteger.getValue());
    }

    public static boolean isPrime(MyInteger myInteger) {
        return MyInteger.isPrime(myInteger.getValue());
    }

    public boolean equals(int value) {
        return this.value == value;
    }

    public boolean equals(MyInteger myInteger) {
        return this.value == myInteger.value;
    }

    public String toString() {
        return String.valueOf(value);
    }

    public static MyInteger parseInt(char[] charValue) {
        int result = 0;
        for (int i = charValue.length - 1, dec = 1; i >= 0; i--, dec *= 10) {
            result += Character.getNumericValue(charValue[i]) * dec;
        }
        return new MyInteger(result);
    }

    public static MyInteger parseInt(String stringValue) {
        return parseInt(stringValue.toCharArray());
    }
}