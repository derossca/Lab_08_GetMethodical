//importing scanner
import java.util.Scanner;
public class CtoFTableDisplay
{
    public static void main(String[] args)
    {

        System.out.println("Celsius     Fahrenheit");

        for(double tempC = -100; tempC <= 100; tempC += 1)
        {
            System.out.printf("%5f\t%5f\n", tempC, cToF(tempC));
        }
    }

    private static double cToF(double tempC)
    {
        double tempF = (tempC * 9/5) + 32;

        return tempF;
    }
}
