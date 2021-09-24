public class CtoFTester {
	
	/* INPUT: celsiusToFahrenheit includes one parameter, celsius, 
	*  		  that passes an argument in the form of a double indicating
	*  		  the input temperature in Celsius.
	*  OUTPUT: the method will return a double containing the converted
	*         temperature, now in Fahrenheit.
	*/
	public static double celsiusToFahrenheit(double celsius) {
		double fahrenheit = (9.0 / 5.0) * celsius + 32.0;
		return fahrenheit;
	}

	/* INPUT: fahrenheitToCelsius includes one parameter, fahrenheit, 
	*         that passes an argument as a double indicating the input
	*         temperature in Fahrenheit.
	*  OUTPUT: the method will return a double containing the converted
	*         temperature, now in Celsius.
	*/
	public static double fahrenheitToCelsius(double fahrenheit) {
		double celsius = (fahrenheit - 32.0) * (5.0 / 9.0);
		return celsius;
	}

	public static void main(String[] args) {
		// test cases for celsiusToFahrenheit()
		double celsius0 = 0.0;
		double celsius1 = 3.14159265358;
		double celsius2 = 100.0;
		System.out.printf(celsius0 + " degrees C = " + celsiusToFahrenheit(celsius0) + " degrees F.\n");
		System.out.printf(celsius1 + " degrees C = " + celsiusToFahrenheit(celsius1) + " degrees F.\n");
		System.out.printf(celsius2 + " degrees C = " + celsiusToFahrenheit(celsius2) + " degrees F.\n");

		// test cases for fahrenheitToCelsius()
		double fah0 = 37.654866776444;
		double fah1 = 32.0;
		double fah2 = 212.0;
		System.out.printf(fah0 + " degrees F = " + fahrenheitToCelsius(fah0) + " degrees C.\n");
		System.out.printf(fah1 + " degrees F = " + fahrenheitToCelsius(fah1) + " degrees C.\n");
		System.out.printf(fah2 + " degrees F = " + fahrenheitToCelsius(fah2) + " degrees C.\n");
	}
}