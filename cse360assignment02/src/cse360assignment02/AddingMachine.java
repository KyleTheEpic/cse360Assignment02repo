/**
 * An AddingMachine object is meant to add and subtract values from some total (starting at 0), and keep track of those operations in a string.
 * @author Kyle J. Atkinson
 * @version 1.1
 * @since 7-10-2020
 * 
 */
package cse360assignment02;

/**
 * 
 */
public class AddingMachine {

	private int total;
	private String record;
	/**
	 * Constructor instantiates AddingMachine object, giving the total int 0.
	 */
	public AddingMachine() {
		// TODO Auto-generated constructor stub
		total = 0;
		record = "0";
	}
	/**
	 * getTotal() returns the total variable int.
	 * @param ()
	 * @return total
	 */
	public int getTotal () {
	    return total;
	  }
	  /**
	   * add(int value) adds value to total.
	   * @return void
	   * @param (int value)
	   */
	  public void add (int value) {
		  total = total + value;
		  record = record + " " + "+" + " " + String.valueOf(value);
	  }
	  /**
	   * subtract(int value) subtracts value from total.
	   * @return int
	   * @param value
	   */
	  public void subtract (int value) {
		  total = total - value;
		  record = record + " " + "-" + " " + String.valueOf(value);
	  }
	  /**
	   * toString() method returns the String where all the operations on total have been recorded.
	   * @return String
	   * @param ()
	   */
	  public String toString () {
	    return record;
	  }
	  /**
	   * clear() method makes the record String empty and puts the total back to 0
	   * @return void
	   * @param ()
	   */
	  public void clear() {
		  record = "0";
		  total = 0;
	  }

}
