/**
 * Temperature stores a temperature in Fahrenhite , Celsius , and kelvin scales.
 * @Version 1.0.0
 * @author Moe Elmursi
 * Created by ja on 7/3/2017.
 */
public class Temperature {

    private double degreeFahrenhite; // Fahrenhite Temperature
    private double degreeCelsius;  // Celsius Temperature
    private double degreeKelvin;   // Kelvin Temperature

    // constructors


 public Temperature (String type, double degrees){
     if (type.equalsIgnoreCase("F"))
         setDegreeFahrenheit(degrees);
     else if (type.equalsIgnoreCase("c"))
         setDegreeCelsius(degrees);
     else if (type.equalsIgnoreCase("k"))
         setDegreeKelvin(degrees);
 }


    //Methods
    /**
     * getDegreeCelsius    retrieves the celsius temperature value
     * @ return a double value containing the celsius temperature
     */

    public double getDegreeCelsius (){
        return degreeCelsius;

    }
    /**
     * getDegreeFahrenheit   retrieves the celsius temperature value
     * @ return a double value containing the Fahrenheit temperature
     */

    public double getDegreeFahrenhite (){
        return degreeFahrenhite;

    }

    /**
     * getDegreeKelvin    retrieves the kelvin temperature value
     * @return a double value containing kelvin temperature
     */

    public double getDegreeKelvin(){
        return degreeKelvin;
    }

    /**
     * The setDegreeFahrenheit method sets the fahrenhite temperature
     * @param degrees the Fahrenhite value to store
     */

    public void setDegreeFahrenheit(double degrees){
        degreeFahrenhite = degrees ;    // sets the Fahrenhite value
        degreeCelsius = (degreeFahrenhite -32.0)* 5.0 / 9.0; // set Celsius
        degreeKelvin = degreeCelsius + 2733.15 ; // set Kelvin Value

    }
    public void setDegreeCelsius(double degrees){
        degreeCelsius = degrees ;    // sets the Fahrenhite value
        degreeFahrenhite = ((degreeCelsius*9)/ 5.0)+32; // set Celsius
        degreeKelvin = degreeCelsius + 273.15 ; // set Kelvin Value

    }
    public void setDegreeKelvin(double degrees){
        degreeKelvin = degrees ;    // sets the Fahrenhite value
        degreeFahrenhite = (degreeKelvin - 2733.15 )*9/5+32; // set Kelvin Value

        degreeCelsius = degreeKelvin - 273.15; // set Celsius

    }

}
