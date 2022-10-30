package lesson13;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LambdaApp {

    public static List<Phone> phones = new ArrayList<>();

    public static void main(String[] args) {


        phones.add(new Phone(1200, "Xiaomi 11 Lite 5G"));
        phones.add(new Phone(2300, "Iphone 13"));
        phones.add(new Phone(2500, "Samsung S22"));
        phones.add(new Phone(2200, "Google Pixel 7"));

        String season = "winter";

        phones.stream().sorted(new PhoneComparator()).forEach(p -> System.out.println("Price without discount : " + p.getName() + " - " + p.getPrice()));

        System.out.println("");

        phones.stream().sorted(new PhoneComparator()).forEach(p -> System.out.println("Price with discount in " + season + " : " + p.getName() + " - " + p.chooseAndGetSeasonPrice(season)));
    }

    static class PhoneComparator implements Comparator<Phone> {

        @Override
        public int compare(Phone a, Phone b) {
            if (a.getPrice() > b.getPrice()) {
                return 1;
            } else if (a.getPrice() == b.getPrice()) {
                return 0;
            } else {
                return -1;
            }
        }
    }
}