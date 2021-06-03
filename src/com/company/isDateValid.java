package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter date; use '/' for DD/MM/YYYY and '-' for MM-DD-YYYY ");
        String rawDate = scanner.nextLine();
        System.out.println(rawDate);
        if (rawDate.contains("/") && !rawDate.contains("-") && rawDate.length() == 10) {
            //System.out.println("You entered DD/MM/YYYY");
            String monthString = rawDate.substring(3,5);
            int monthNum = Integer.parseInt(monthString);
            checkSeason(monthNum);
            //System.out.println(monthNum);
        } else if (rawDate.contains("-") && !rawDate.contains("/") && rawDate.length() == 10) {
            //System.out.println("You entered MM-DD-YYYY");
            String monthString = rawDate.substring(0,2);
            int monthNum = Integer.parseInt(monthString);
            checkSeason(monthNum);
            //System.out.println(monthNum);
        } else {
            System.out.println("You entered invalid date format, try again ");
            return;
        }
    }
    public static void checkSeason (int seasonNum) {
        if (seasonNum == 1 || seasonNum ==2 || seasonNum ==12) {
            System.out.println("It is winter");
        } else if (seasonNum >= 3 && seasonNum <=5 ) {
            System.out.println("It is spring");
        } else if (seasonNum >= 6 && seasonNum <=8 ) {
            System.out.println("It is summer");
        } else if (seasonNum >= 9 && seasonNum <=11 ) {
            System.out.println("It is autumn");
        } else {
            System.out.println("Invalid date");
        }
    }
}

