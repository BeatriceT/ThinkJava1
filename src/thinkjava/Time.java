package thinkjava;

/**
 * Created by Lemme on 18/10/2016.
 * Exercise 2.3
 */
 class Time {
    public static void java() {
        //test the program
        System.out.println("Time program is a go");

        //declaring variables

        int hour = 22;
        int minute = 41;
        int second = 59;

        // Calculate and print out how many seconds has it been from midnight

        System.out.print("It has been ");
        System.out.print(hour*60*60 + minute*60 +second);
        System.out.println(" seconds from midnight");

        //Calculate and print out how many seconds there are to midnight

        int hoursLeft = 23 - hour;
        int minutesLeft = 59-minute;
        int secondsLeft = 60-second;
        System.out.print("There are ");
        System.out.print(hoursLeft*60*60 + minutesLeft*60 + secondsLeft);
        System.out.println(" seconds remaining in the day");

        //Calculate and display the percentage of the day that has passed.

        double secondsPast = hour*60*60 + minute*60 +second;
        int secondsInDay = 24*60*60;

        System.out.print(secondsPast*100/secondsInDay);
        System.out.println(" percent of the day has passed");

        //write code to compute the elapsed time since you started working on this exercise.

        int startedHour = 22;
        int startedMinutes = 11;
        int startedSeconds = 15;

        System.out.print("It has been ");
        System.out.print(hour - startedHour);
        System.out.print(" hours ");
        System.out.print(minute - startedMinutes);
        System.out.print(" minutes and ");
        System.out.print(second - startedSeconds);
        System.out.print(" seconds from the start of the exercise");



    }
}
