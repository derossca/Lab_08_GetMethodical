import java.util.Scanner;

public class PrettyHeader {
    public static void main(String[] args)
    {
        //declaring variables
        Scanner in = new Scanner(System.in);;
        String prettyHeader = "";

        //calling method to automate process and output a centered pretty header
        prettyHeader = SafeInput.prettyHeader(in,"What is your Header ");
    }
}
