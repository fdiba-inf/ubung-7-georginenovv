package exercise7;

import java.util.Scanner;

public class TimeValidation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter hours: ");
        int hours = input.nextInt();

        System.out.print("Enter minutes: ");
        int minutes = input.nextInt();

        boolean timeValid = areHoursValid(hours)&&areMinutesValid(minutes);
        // Call validation methods
        System.out.println("Time valid: " + timeValid);
    }


    public static boolean areHoursValid(int hours) {
        // Implement method
         boolean hourValid;
        if (hours>= 0 && hours <24){
         hourValid = true;
          
        }else {
          hourValid= false;
        }
        return hourValid;
    }


    public static boolean areMinutesValid(int minutes) {
        // Implement method
        boolean  minutesValid;
        if(minutes>=0 && minutes <60){
          minutesValid=true;

        }else{
          minutesValid=false;
        }
        return minutesValid;
    }
}
