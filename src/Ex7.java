import java.util.ArrayList;
import java.util.Random;

public class Ex7 {
    public static int secondMaxSearch(ArrayList<Integer> list) {
        if (list.size() == 1) {
            return list.get(0);
        }

        ArrayList<Integer> sortedList = new ArrayList<>(list);

        secondMaxSearchRec(sortedList, 0, false);

        return sortedList.get(1);
    }

    public static void secondMaxSearchRec(ArrayList<Integer> list, int i, boolean flag) {
        if (i > list.size() - 2 && !flag) {
            return;
        }

        if (i > list.size() - 2 && flag) {
            i = 0;
            flag = false;
        }

        if (list.get(i + 1) > list.get(i)) {
            flag = true;

            int t = list.get(i);

            list.set(i, list.get(i + 1));
            list.set(i + 1, t);
        }


        secondMaxSearchRec(list, i + 1, flag);
    }

    public static void main(String[] args) {
        Random rand = new Random();

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(rand.nextInt(10) + 1);
        }

        System.out.println(secondMaxSearch(list));


    }
}
