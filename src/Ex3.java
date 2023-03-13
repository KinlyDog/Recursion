import java.util.ArrayList;

public class Ex3 {
    public static int lenghtCalc(ArrayList<Integer> list) {
        if (list.isEmpty()) return 0;

        list.remove(0);

        return 1 + lenghtCalc(list);
    }
}