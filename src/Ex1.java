public class Ex1 {
    public static int exponent(int number, int degree) {
        if (degree == 1) return number;

        return number * exponent(number, degree - 1);
    }
}
