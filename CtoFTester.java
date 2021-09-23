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

	public static void main(String[] args) {
		// test cases for celsiusToFahrenheit()
		double celsius0 = 0.0;
		double celsius1 = 3.14159265358;
		double celsius2 = 100.0;
		System.out.printf(celsius0 + "degrees C = " + celsiusToFahrenheit(celsius0) + " degrees F.\n");
		System.out.printf(celsius1 + "degrees C = " + celsiusToFahrenheit(celsius1) + " degrees F.\n");
		System.out.printf(celsius2 + "degrees C = " + celsiusToFahrenheit(celsius2) + " degrees F.\n");
	}
}