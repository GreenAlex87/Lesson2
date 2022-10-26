package lesson8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Strings {

    public static char[] elems = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '(', ')', '+', '-', ' ' };

    public static void main(String[] args) {

//                                             Task1

//        String dateString = "15 июля 2016";
//
//        Pattern pattern = Pattern.compile("\\s|,|!|\\.");
//        String[] arrayDate = pattern.split(dateString);
//        Pattern pattern2 = Pattern.compile("[а-я]");
//        Matcher matcher = pattern2.matcher(arrayDate[1]);
//        while (matcher.find()) {
//            for (Month month : Month.values()) {
//                if (month.name().equalsIgnoreCase(arrayDate[1])) {
////                    System.out.println(month.name());
////                    System.out.println(month.getNumberOfmonth());
//                    System.out.printf("%s.%s.%s.", arrayDate[0], month.getNumberOfmonth(), arrayDate[arrayDate.length - 1]);
//                    return;
//                }
//            }
//        }
//        System.out.println("");

//                                            Task2

//        String str = "16.07.2015";
//
//        String[] arrayDate2 = str.split("\\s|,|!|\\.");
//        if (arrayDate2[1].matches("\\d+")) {
//
//            for (Month month : Month.values()) {
//                if (month.getNumberOfmonth().equals(arrayDate2[1])) {
//                    System.out.printf("%s %s %s", arrayDate2[0], month.name(), arrayDate2[arrayDate2.length - 1]);
//                }
//            }
//        } else {
//            System.out.println("");
//        }

//                                             Task3

//        StringBuilder phone = new StringBuilder(" + k { ? / 7 (921) 123-45-67 ");
        String phone = "+7(921)123-45-67";

        if (isPhoneNumberValid(phone)){
            System.out.println(stringBuilder(phone));
        }else{
            System.out.println("Wrong Input");
        }

//        for (int i = 0; i < phone.length(); i++) {
//
//            if (IsCharValid(phone.charAt(i))) {
//                stringBuilder(phone);
//            } else {
//                System.out.println("Bad string");
//            }
//
//        }


    }

    public static boolean isPhoneNumberValid(String phoneNumber){
        if (phoneNumber.matches("\\s*-*(\\+\\d{1,3})?\\s*-*(\\(\\d{1,3}\\))?\\s*-*(\\d*\\s*-*)*")){
            Pattern pattern = Pattern.compile("\\d");//\s*\d|\d
            Matcher matcher = pattern.matcher(phoneNumber);
            return true;
        }else{
            return false;
        }
    }
//    public static boolean IsCharValid(char newchar) {
//        for (int i = 0; i < elems.length; i++) {
//            if (newchar == elems[i]) {
//                return true;
//            }
//        }
//        return false;
//    }

    static public StringBuilder stringBuilder(String string) {

        Pattern pattern = Pattern.compile("\\s*\\+\\d+|\\d+");
        Matcher matcher = pattern.matcher(string);
        StringBuilder stringBuilder = new StringBuilder(string);
        while (matcher.find()) {
            stringBuilder.append(matcher.group());
        }

        return stringBuilder;
    }

}