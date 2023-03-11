public class Ex2 {
    public static int sumOfDigits (int number) {
        if (number <= 0) return number;

        return number % 10 + sumOfDigits(number / 10);
    }
}
