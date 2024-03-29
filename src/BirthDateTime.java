//importing scanner
import java.util.Scanner;
public class BirthDateTime {
    public static void main(String[] args)
    {
        //declaring variables
        Scanner in = new Scanner(System.in);
        int year = 0;
        int month = 0;
        int day = 0;
        int hours = 0;
        int minutes = 0;

        //calling SafeInput getRangedInt methods for user prompt and input
        year = SafeInput.getRangedInt(in, "Enter the year you were born: ", 1950, 2015);
        month = SafeInput.getRangedInt(in, "Enter the month you were born: ", 1, 12);
        //switch selector to limit day range depending on month entered
        switch (month)
        {
            case 2:
                day = SafeInput.getRangedInt(in, "Enter the day you were born: ", 1, 29);
                break;
            case 1,3,5,7,8,10,12:
                day = SafeInput.getRangedInt(in,"Enter the day you were born: ", 1,31);
                break;
            case 4,6,9,11:
                day = SafeInput.getRangedInt(in,"Enter the day you were born: ", 1, 30);
        }
        hours = SafeInput.getRangedInt(in, "Enter the hour you were born: ", 1, 24);
        minutes = SafeInput.getRangedInt(in, "Enter the minute you were born: ", 1, 59);

        //output results from input above
        System.out.println("\nYou were born " + year + " - " + month + " - " + day + " at " + hours + ":" + minutes);
    }
}
