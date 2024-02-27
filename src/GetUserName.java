import java.util.Scanner; //importing scanner

public class GetUserName
{
    public static void main(String[] args)
    {
        //declaring variables
        Scanner in = new Scanner(System.in);
        String firstName = "";
        String lastName = "";

        //both below call the safeinput method getNonZeroLenString for input and prompts to return and output the user's full name below
        firstName = SafeInput.getNonZeroLenString(in, "Enter your first name ");
        lastName = SafeInput.getNonZeroLenString(in, "Enter your last name ");

        System.out.println("\n Your full name is: " + firstName + " " + lastName);
    }
}
