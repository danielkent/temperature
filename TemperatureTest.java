/** 
 * @author Aditya Mahajan <aditya.mahajan@mcgill.ca>
 * @version 2013.10.06
 * Unit Testing Temperature class
 */

import org.junit.* ;
import static org.junit.Assert.* ;

public class TemperatureTest {

  // Add multiple tests to check all functions of
  // {@Code Temperature} class.

	@Test
 	public void getUnits (){
		Temperature test = new Temperature(0, Temperature.Units.CELSIUS);  //Tests to see if we get CELSIUS
		Temperature.Units result = test.getUnits();
		assertEquals(result, Temperature.Units.CELSIUS);
		
		emperature test1 = new Temperature(0, Temperature.Units.FAHRENHEIT); //Tests to see if we get FAHRENHEIT
		Temperature.Units result1 = test1.getUnits();
		assertEquals(result1, Temperature.Units.FAHRENHEIT);
		
		Temperature test2 = new Temperature(0, Temperature.Units.KELVIN); //Tests to see if we get KELVIN
		Temperature.Units result2 = test2.getUnits();
		assertEquals(result2, Temperature.Units.KELVIN);
		}

 	@Test
	public void getValue (){
		Temperature test = new Temperature(0, Temperature.Units.KELVIN); //Tests to see if we get correct values
		double result = test.getValue();
		assertEquals(0, 0);
		}
	
	@Test
	public void changeUnits (){
		Temperature test = new Temperature(0, Temperature.Units.CELSIUS);
		Temperature.Units result = test.changeUnits(Temperature.Units.FAHRENHEIT);
		assertEquals(result, Temperature.Units.FAHRENHEIT);
		
		Temperature test1 = new Temperature(0, Temperature.Units.CELSIUS);
		Temperature.Units result1 = test1.changeUnits(Temperature.Units.KELVIN);
		assertEquals(result1, Temperature.Units.KELVIN);
		
		Temperature test2 = new Temperature(0, Temperature.Units.KELVIN);
		Temperature.Units result2 = test2.changeUnits(Temperature.Units.FAHRENHEIT);
		assertEquals(result2, Temperature.Units.FAHRENHEIT);
		
		Temperature test3 = new Temperature(0, Temperature.Units.KELVIN);
		Temperature.Units result3 = test3.changeUnits(Temperature.Units.CELSIUS);
		assertEquals(result3, Temperature.Units.CELSIUS);
		
		Temperature test4 = new Temperature(0, Temperature.Units.FAHRENHEIT);
		Temperature.Units result4 = test4.changeUnits(Temperature.Units.CELSIUS);
		assertEquals(result4, Temperature.Units.CELSIUS);
		
		Temperature test5 = new Temperature(0, Temperature.Units.FAHRENHEIT);
		Temperature.Units result5 = test5.changeUnits(Temperature.Units.KELVIN);
		assertEquals(result5, Temperature.Units.KELVIN);
		}
	
	}
