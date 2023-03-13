public class Ex4 {
    public static boolean palindrome (String str) {
        if (str.length() == 1 || str.length() == 2 && str.charAt(0) == str.charAt(1)) {
            return true;
        }

        if (str.charAt(0) != str.charAt(str.length() - 1)) {
            return false;
        }

        return palindrome(str.substring(1, str.length() - 1));
    }
}