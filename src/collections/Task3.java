package collections;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Task3 {
    public static ArrayList<Integer> list1 = new ArrayList<>();
    public static LinkedList<Integer> list2 = new LinkedList<>();

    public static void main(String[] args) {

        getTimeMsOfInsert(list1);
        getTimeMsOfInsert(list2);

    }

    public static long getTimeMsOfInsert(List list) {
        Date currentTime = new Date();
        fillTheList(list);
        random(list);
        Date newTime = new Date();
        long msDelay = newTime.getTime() - currentTime.getTime();
        System.out.println("Result in milliseconds: " + msDelay);
        return msDelay;
    }

    public static void fillTheList(List list) {
        for (int i = 0; i < 1000000; i++) {
            list.add(0,1);

        }
    }

    public static void random(List list) {
        for (int i = 0; i < 100000; i++) {
            list.get((int) Math.random() * 1000000);
        }

    }

}