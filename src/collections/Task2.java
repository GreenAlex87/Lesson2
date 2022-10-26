package collections;

import java.util.ArrayList;
import java.util.HashSet;


public class Task2 {
    public static void main(String[] args) {

        ArrayList<String> line = new ArrayList<String>();
        line.add("one, two, two, three, three, four, four, four");
        System.out.println(listToHashSet(line));

    }


    public static HashSet<String> listToHashSet(ArrayList<String> line) {
        HashSet<String> hashSet = new HashSet<>();
        String [] strings = convertToArray(line);

        for (int i = 0; i < strings.length; i++) {
            hashSet.add(strings[i]);
        }
        return hashSet;
    }

    public static String[] convertToArray(ArrayList<String> line){
        String[] words = (line.toArray(new String[0]));
        String[] wordsArray = words[0].split(", ");
        return wordsArray;
    }

}
