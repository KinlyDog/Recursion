import java.util.ArrayList;

public class Ex5 {
    public static void evenValues(ArrayList<Integer> list) {
        evenValuesRec(list, 0);
    }

    public static void evenValuesRec(ArrayList<Integer> list, int index) {
        if (index >= list.size()) return;

        if (list.get(index) % 2 == 0) {
            System.out.println(list.get(index));
        }

        evenValuesRec(list, index + 1);
    }
}
