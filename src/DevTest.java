import java.util.Scanner;
public class DevTest
{
    public static void main(String[] args)
    {
        //declaring variables
        Scanner in = new Scanner(System.in);

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
    }
}
