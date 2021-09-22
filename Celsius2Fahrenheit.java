/*
Landen Mick
08/20/21
This program recieves a value in celsius and then converts it to a fahrenheit value.
 */
package testdata;
import java.util.Scanner;
public class celsiustofahrenheit
{
    public static void main(String[] args)
    {
        //Declaration
        Scanner kb = new Scanner(System.in);
        double temperature;
        //Prompting the User with Question and Input
        System.out.println("What temperature would you like to know in fahrenheit? ");
        temperature = kb.nextDouble();
        //Defining celcius and farenheit variables
        double celsius = temperature, fahrenheit = 0.0;
        fahrenheit = (temperature * 1.8) + 32;
        //Finally Prompting User with Output
        System.out.println("Your celsius value of " +temperature + " is equal to " + fahrenheit );

        
    }
}
//        System.out.println(" value of temperature in fahrenheit: " + fahrenheit);