import java.util.Scanner;

/**
 * Created by ja on 7/3/2017.
 */
public class TemperatureDriver {
    public static void main(String [] args){
        double inputTemperature = 0.0;
        Scanner keyboard = new Scanner(System.in);

        String temperatureType = " ";
        System.out.print("please enter the temperature type ( C for Celsius , " + " K for Kelvin , "+ " F for Fahrenheit");
        temperatureType = keyboard.next();

        if (temperatureType.equalsIgnoreCase("C")||
                temperatureType.equalsIgnoreCase("F")||
                temperatureType.equalsIgnoreCase("K")){

        System.out.print("Please Enter temperature to convert : ");
        inputTemperature = keyboard.nextDouble();
        Temperature t1  = new Temperature(temperatureType,inputTemperature);

        if (temperatureType.equalsIgnoreCase("f")){
            System.out.println("You entered  : " + inputTemperature + " Degrees Fahrenheit");
            System.out.println("The celsius degree equivalent is : " + t1.getDegreeCelsius());
            System.out.println("AND : " + t1.getDegreeKelvin() + " degrees Kelvin .");

        }else if (temperatureType.equalsIgnoreCase("c")){
            System.out.println("You entered  : " + inputTemperature + " Degrees Celsius");
            System.out.println("the fahrenheit degree equivalent " + t1.getDegreeFahrenhite());
            System.out.println("and the kelvin degrees equivalent is " + t1.getDegreeKelvin());

        }else if (temperatureType.equalsIgnoreCase("K")){
            System.out.println("you have entered " + inputTemperature + " degrees kelvin");
            System.out.println(" which equals to " + t1.getDegreeFahrenhite()+ " fahrenheit " + " and equals " +
                    "to "+ t1.getDegreeCelsius()+ " degrees Celsius" );
        }




    }else{
            System.out.println(" You have entered an invalid temperature type "  + temperatureType);
            System.out.println("the temperature type must be  \"c\", \"f\" , \"k\". please try again ");
        }
}}

