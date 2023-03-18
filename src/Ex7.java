import java.util.ArrayList;
import java.util.Random;

public class Ex7 {
    public static int secondMaxSearch(ArrayList<Integer> list) {
        int max1;
        int max2;

        if (list.get(0) > list.get(1)) {
            max1 = list.get(0);
            max2 = list.get(1);
        } else {
            max1 = list.get(1);
            max2 = list.get(0);
        }

        return secondMaxSearchRec(list, max1, max2, 2);
    }

    public static int secondMaxSearchRec(ArrayList<Integer> list, int max1, int max2, int i) {
        if (i > list.size() - 1) return max2;

        if (list.get(i) >= max1) {
            max2 = max1;
            max1 = list.get(i);
        } else if (list.get(i) > max2) {
            max2 = list.get(i);
        }

        return secondMaxSearchRec(list, max1, max2, i + 1);
    }
}
