//importing scanner
import java.util.Scanner;

public class CheckOut {
    public static void main(String[] args)
    {
        //declaring variables
        Scanner in = new Scanner(System.in);
        double itemPrice = 0;
        double totalPrice = 0;
        boolean doneYN = false;

        //making a do while loop to ask for user to enter price of items until they confirm they are done
        do
        {
            //asks user for price of an item, allows them to input within range
            itemPrice = SafeInput.getRangedDouble(in, "What is the price of the item from .50 cents to $10.00?", .5, 10);
            //the total price will continue to add up the item prices with each loop
            totalPrice = totalPrice + itemPrice;
            //prompts user to input whether they are done, if Y the loop ends and outputs total, if no it loops back again
            doneYN = SafeInput.getYNConfirm(in, "Are you done? Yes or No?");
        } while (!doneYN);

        System.out.printf(totalPrice); //outputs total price after all items are added up
    }
}
