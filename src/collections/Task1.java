package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Task1 {

    public static ArrayList<String> litera = new ArrayList<>();

    public static void main(String[] args) {

        litera.add("a");
        litera.add("b");
        litera.add("b");
        litera.add("c");
        litera.add("d");
        litera.add("d");
        litera.add("d");
        litera.add("a");

        countFrequencies(litera);
    }

    public static void countFrequencies(ArrayList<String> list) {
        HashMap<String, Integer> numberOfRepeats = new HashMap<String, Integer>();

        for (String i : list) {
            System.out.print("i = " + i + " ");
            Integer j = numberOfRepeats.get(i);
            System.out.print("j = " + j + " ");

            numberOfRepeats.put(i, (j == null) ? 1 : j + 1);
            System.out.println(numberOfRepeats);
        }
        for (Map.Entry<String, Integer> val : numberOfRepeats.entrySet()) {
            if (val.getValue() <= 1) {
                numberOfRepeats.remove(val);
            } else {
                System.out.println("Litera " + val.getKey() + " " + "occurs" + ": " + val.getValue() + " times");
            }
        }
    }

}

