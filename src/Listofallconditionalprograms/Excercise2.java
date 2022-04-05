package Listofallconditionalprograms;
//find the number of days in a month
import java.util.*;
public class Excercise2 {
    public static void main(String[] strings) {
        Scanner scan = new Scanner(System.in);
        int numberOfDaysInMonth = 0;
        String MonthName = "Unknown";

        System.out.print("Input a month number: ");
        int month = scan.nextInt();

        System.out.print("Input a year: ");
        int year = scan.nextInt();

        switch (month) {
            case 1:
                MonthName = "January";
                numberOfDaysInMonth = 31;
                break;
            case 2:
                MonthName = "February";
                if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                    numberOfDaysInMonth = 29;
                } else {
                    numberOfDaysInMonth = 28;
                }
                break;
            case 3:
                MonthName = "March";
                numberOfDaysInMonth = 31;
                break;
            case 4:
                MonthName = "April";
                numberOfDaysInMonth = 30;
                break;
            case 5:
                MonthName = "May";
                numberOfDaysInMonth = 31;
                break;
            case 6:
                MonthName = "June";
                numberOfDaysInMonth = 30;
                break;
            case 7:
                MonthName = "July";
                numberOfDaysInMonth = 31;
                break;
            case 8:
                MonthName = "August";
                numberOfDaysInMonth = 31;
                break;
            case 9:
                MonthName = "September";
                numberOfDaysInMonth = 30;
                break;
            case 10:
                MonthName = "October";
                numberOfDaysInMonth = 31;
                break;
            case 11:
                MonthName = "November";
                numberOfDaysInMonth = 30;
                break;
            case 12:
                MonthName = "December";
                numberOfDaysInMonth = 31;
        }
        System.out.println(MonthName + " " + year + " has " + numberOfDaysInMonth + " days");
    }
}



