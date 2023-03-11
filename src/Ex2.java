public class Ex2 {
    public static int sumOfDigits (int number) {
        if (number <= 0) return number;

        return number % 10 + sumOfDigits(number / 10);
    }

    public static void main(String[] args) {
        int num = 1235324;
        int sum = 0;

        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        System.out.println(sum);

        System.out.println(sumOfDigits(1235324));
    }
}
