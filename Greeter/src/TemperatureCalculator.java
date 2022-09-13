import ecs100.*;
/** Program for converting between temperature scales */

public class TemperatureCalculator {
	public static void main(String[] args) {
		new TemperatureCalculator().setupGUI();
	}
		
	/** Print conversion formula */
	
	public void printFormula() {
		UI.println("Celsius = (Fahrenheit - 32) * 5/9");
	}
	/** Ask for Fahrenheit and convert to Celsius */
	public void doFahrenheitToCelsius() {
	double fahrenheit = UI.askDouble("Fahrenheit:");
	double celsius = (fahrenheit - 32.0) * 5.0/9.0;
	UI.println(fahrenheit + "F ->" + celsius + "C");
	
	}
	/** Setup the buttons */
	public void  setupGUI() {
		UI.addButton("Formula", this::printFormula);
		UI.addButton("Convert", this::doFahrenheitToCelsius);
	}
}
