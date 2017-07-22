import java.util.Scanner;

/**
 * Created by M.Elmursi on 7/3/2017.
 */
public class TemperatureDriver {
    public static void main(String[] args) {
        double inputTemperature = 0.0;
        Scanner keyboard = new Scanner(System.in);
        Temperature t1;

        String temperatureType = " ";
        boolean moreTemperature = true;
        boolean goodType = false;
        boolean goodTemperature = false;

        while (moreTemperature) {
            System.out.println("please enter the temperature type ( C for Celsius , " + " K for Kelvin , " + " F for Fahrenheit" + "Q for quitting)");
            temperatureType = keyboard.next();
            while (!goodType) {
                if (temperatureType.equalsIgnoreCase("Q") ||
                        temperatureType.equalsIgnoreCase("K") ||
                        temperatureType.equalsIgnoreCase("F") ||
                        temperatureType.equalsIgnoreCase("C")) {
                    goodType = true;
                } else {
                    System.out.println("You entered an invalid temperature type !! ");
                    System.out.println("The type must be [ C , K , F ,Q ]");
                    System.out.println("Please Enter a valid temperature type : ");
                    temperatureType = keyboard.next();
                }
            }
            if (temperatureType.equalsIgnoreCase("Q")) {
                moreTemperature = false;
                System.out.println("\nProgram ended.");
            } else {
                goodTemperature = false;

                do {
                    System.out.println("Enter a temperature : ");

                    if (keyboard.hasNextInt()) {
                        inputTemperature = keyboard.nextDouble();

                        if ((temperatureType.equalsIgnoreCase("C") && inputTemperature >= -273.15) ||
                                (temperatureType.equalsIgnoreCase("F") && inputTemperature >= -459.67) ||
                                (temperatureType.equalsIgnoreCase("K") && inputTemperature >= 0)
                                )
                            goodTemperature = true;
                        else {
                            System.out.println("You entered invalid temperature");
                            System.out.println("the temperature must be above absoulte zero [C >= -273.15 ]  , [F >= -459.67],[K >= 0]");
                            System.out.println("Try again");
                        }

                    } else {
                        System.out.println("You entered an invalid temperature ");
                        System.out.println("Please Enter a valid numeric");
                        System.out.println("Try again");
                        keyboard.nextDouble();
                    }


                } while (!goodTemperature);


                t1 = new Temperature(temperatureType, inputTemperature);

                if (temperatureType.equalsIgnoreCase("F")) {
                    System.out.println("You Entered " + inputTemperature + "Degrees Fahrenhite");
                    System.out.println("which is " + t1.getDegreeCelsius() + " Degrees Celsius");
                    System.out.println("And " + t1.getDegreeKelvin() + " Degrees Kelvin .");
                } else if (temperatureType.equalsIgnoreCase("C")) {
                    System.out.println("You Entered " + inputTemperature + "Degrees Celsius");
                    System.out.println("which is " + t1.getDegreeFahrenhite() + " Degrees Fahrenheit");
                    System.out.println("And " + t1.getDegreeKelvin() + " Degrees Kelvin .");
                } else if (temperatureType.equalsIgnoreCase("K")) {
                    System.out.println("You Entered " + inputTemperature + "Degrees Kelvin");
                    System.out.println("which is " + t1.getDegreeCelsius() + " Degrees Celsius");
                    System.out.println("And " + t1.getDegreeFahrenhite() + " Degrees Fahrenheit .");
                } else {
                    System.out.println(" You have entered an invalid temperature type " + temperatureType);
                    System.out.println("the temperature type must be  \"c\", \"f\" , \"k\". please try again ");
                }
            }
        }
    }
}
