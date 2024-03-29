//importing scanner
import java.util.Scanner;
public class Reggie
{
    public static void main(String[] args)
    {
       //declaring variables
       Scanner in = new Scanner(System.in);
       String sSN = "";
       String uCStudent = "";
       String menuChoice = "";

       //calling safeinput getRegExString method to prompt user, get input for each variable, and display in specified RegExString
        sSN = SafeInput.getRegExString(in,"Enter your Social Security Number", "^\\d{3}-\\d{2}-\\d{4}$");
        System.out.println("You said your SSN is: " + sSN);
        uCStudent = SafeInput.getRegExString(in, "Enter your UC Student M number", "^(M|m)\\d{5}$");
        System.out.println("You said your UC Student M number is " + uCStudent);
        menuChoice = SafeInput.getRegExString(in,"Select your choice from the menu Open [O] - Save [S] - View [V] - Quit [Q]", "^[OoSsVvQq]$");
        System.out.println("You selected " + menuChoice);
    }
}
