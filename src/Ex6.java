import java.util.ArrayList;

public class Ex6 {
    public static void evenIndex(ArrayList<Integer> list) {
        int index = 0;

        evenIndexRec(list, index);
    }

    public static void evenIndexRec(ArrayList<Integer> list, int index) {
        if (index >= list.size()) return;

        System.out.println(list.get(index));

        evenIndexRec(list, index + 2);
    }
}
