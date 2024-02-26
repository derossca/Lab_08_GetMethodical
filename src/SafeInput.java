import java.util.Scanner;

public class SafeInput {

    //Part A getNonZeroLenString
    public static String getNonZeroLenString(Scanner pipe, String prompt)
    {
        String retString = ""; //Set this to zero length. Loops until it isn't
        do
        {
            System.out.print("\n" + prompt + ": "); //show prompt add space
            retString = pipe.nextLine();
        } while(retString.length() == 0);

        return retString;
    }

    //Part B getInt
    public static int getInt(Scanner pipe, String prompt)
    {
        int retVal = 0;
        String trash = "";
        boolean done = false;

        do
        {
            System.out.print("\n" + prompt + ": ");
            if(pipe.hasNextInt())
            {
                retVal = pipe.nextInt();
                pipe.nextLine();
                done = true;
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("You must enter an int: " + trash);
            }
        } while(!done);

        return retVal;
    }

    //Part C getDouble
    public static double getDouble(Scanner pipe, String prompt)
    {
        double retVal = 0;
        String trash = "";
        boolean done = false;

        do
        {
            System.out.print("\n" + prompt + ": ");
            if(pipe.hasNextDouble())
            {
                retVal = pipe.nextDouble();
                pipe.nextLine();
                done = true;
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("You must enter a double: " + trash);
            }
        } while(!done);

        return retVal;
    }


}
