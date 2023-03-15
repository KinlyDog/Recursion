import java.util.ArrayList;

public class Ex6 {
    public static void evenIndex(ArrayList<Integer> list) {
        evenIndexRec(list, 0);
    }

    public static void evenIndexRec(ArrayList<Integer> list, int index) {
        if (index >= list.size()) return;

        System.out.println(list.get(index));

        evenIndexRec(list, index + 2);
    }
}
