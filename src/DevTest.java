import java.util.Scanner;
public class DevTest
{
    public static void main(String[] args)
    {
        //declaring variables
        Scanner in = new Scanner(System.in);

        // you should only have the method here, most of what you did needs to go into the method - I should only see 'prettyHeader("The message"), where the message is something you either hard code or ask from the user via Scanner
        for(int row = 1; row <= 1; row ++){
            for(int col = 1; col <= 60; col ++){
                prettyHeader("*");
            }
            System.out.println();
        }
        for(int row = 1; row <= 1; row ++){
            for(int col = 1; col <= 1; col ++){
                prettyHeader("***                  Message Centered Here               ***");
            }
            System.out.println();
        }
        for( int row = 1; row <= 1; row ++){
            for(int col = 1; col <= 60; col ++){
                prettyHeader("*");
            }
            System.out.println();
        }
    }
//need ***18Message Centered Here18***

    public static void prettyHeader(String msg){
        System.out.print(msg);

        //we want to be able to draw the ENTIRE header here with this method, even the lines before and after the message
        //we need to ingest the message, I'll call it 'msg' like you did for the method
        //I'll give you the steps we need:
        //Lets assume we have 60 spaces for our console.  That is the limit
        int CHAR_COUNT = 60;
        //We are going to have 3 *** on each side, that leaves 60 - 6 or 54 spaces a user can use for a message
        //So, 56 whitespace total, but we need it centered - need to determine HOW LONG the message is
        int totalSpaces = CHAR_COUNT - 6 - message.length;
        //now I need to calculate the spaces to the left and right of the message so I can draw " " for whitespace
        int leftSpace;
        int rightSpace;
        //but it might be an odd or even number, and that messes up where exactly our center is...
        if(totalSpaces % 2 ++0){ //this is even
            leftSpace = rightSpace = totalSpaces / 2;  //this is the easy one, left and right are equal and half of what our total whitespace is going to be
        }
        else{
            //this is the odd
            rightSpace = totalSpaces /2;
            leftSpace = rightSpace +1;  //not really much I can do other than just add one and hope for the best, can't perfectly center it

        }

        //from here you have the numbers you need to draw whitespace left, then the message, then whitespace right.  The top and bottom of the headers should be easy.  Remember the difference between println and print for console out commands.
    }
}
