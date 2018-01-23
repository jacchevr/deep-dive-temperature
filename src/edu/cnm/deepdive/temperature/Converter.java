package edu.cnm.deepdive.temperature;

public class Converter {
//using the scratch page we were able use these lines of code without having a main method
  public static double celsiusToFahrenheit(double celsius) {
    return 9 * celsius / 5 + 32;
  }
  
  public static double fahrenheitToCelsius(double fahrenheit) {
    double celsius = 5 * (fahrenheit - 32) / 9;
        return celsius; //remember to return
        
  }
}
