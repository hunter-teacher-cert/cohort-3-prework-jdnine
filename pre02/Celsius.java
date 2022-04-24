import java.util.Scanner;

//convert celsius to fahrenheit

public class Celsius {
  
  public static void main(String[] args) {
    
    double degreesCelsius;
    double degreesFahrenheit;
    Scanner in = new Scanner(System.in);

    //prompt user for value
    System.out.print("Enter a temperature in Celsius: ");
    degreesCelsius = in.nextDouble();

    //convert and output
    degreesFahrenheit = degreesCelsius * 1.8 + 32;
    System.out.printf("%.1f C = %.1f F \n", degreesCelsius, degreesFahrenheit);
  }
}