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
        day = SafeInput.getRangedInt(in, "Enter the day you were born: ", 1, 31);
        switch (day)
        {
            case 29:

        }
        hours = SafeInput.getRangedInt(in, "Enter the hour you were born: ", 1, 24);
        minutes = SafeInput.getRangedInt(in, "Enter the minute you were born: ", 1, 59);

        System.out.println("\nYou were born " + year + " - " + month + " - " + day + " at " + hours + ":" + minutes);
    }
}
