//importing scanner
import java.util.Scanner;

public class FavNumbers
{
    public static void main(String[] args)
    {
        //declaring variables
        Scanner in = new Scanner(System.in);
        int favInt = 0;
        double favDouble = 0;

        //prompts user for favorite integer and favorite double, allows for input for each after calling for the SafeInput method
        favInt = SafeInput.getInt(in, "What is your favorite integer: ");
        favDouble = SafeInput.getDouble(in, "What is your favorite double: ");

        //outputs what the user entered for each input above
        System.out.println("\nYour favorite integer is " + favInt + " and your favorite double " + favDouble);
    }
}
