package thinkjava;

/**
 * Created by Lemme on 18/10/2016.
 * Exercise 2.2
 */
class Date {
    public static void java() {
        System.out.println("Second program");

        //declaring variables

        String day = "Tuesday";
        int date = 18;
        String month = "October";
        int year = 2016;

        //printing out variables on separate lines

        System.out.println(day);
        System.out.println(date);
        System.out.println(month);
        System.out.println(year);

        // Print out Tuesday, October 18, 2016.

        System.out.println(day + ", " + month + " " + date + ", " + year + ".");

        //Display same info in European format: Thursday 16 July 2015

        System.out.println(day + " " + date + " " + month + " " + year);
    }
}
