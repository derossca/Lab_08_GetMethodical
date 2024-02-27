//importing scanner
import java.util.Scanner;

public class CheckOut {
    public static void main(String[] args)
    {
        //declaring variables
        Scanner in = new Scanner(System.in);
        double itemPrice = 0;
        double totalPrice = totalPrice + itemPrice;
        boolean continueYN = false;

        //making a do while loop to ask for user to enter price of items until they confirm they are done
        do
        {
            itemPrice = SafeInput.getRangedDouble(in, "What is the price of the item from .50 cents to $10.00?", .50, 10.00);

        } while (!continueYN);
    }
}
