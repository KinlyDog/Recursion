import java.util.Stack;

public class Ex3 {
    public static int lenghtCalc(Stack stack) {
        if (stack.size() == 0) {
            return 0;
        }

        stack.pop();

        return 1 + lenghtCalc(stack);
    }
}