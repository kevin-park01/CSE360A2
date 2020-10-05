package cse360assignment02;

public class AddingMachine {
	  private int total;
	  private String history;
	  
	  /**
	   * Constructor - initializes total and history
	   */
	  public AddingMachine () {
	    total = 0;  // not needed - included for clarity
	    history = "0";
	  }
	  
	  /**
	   * Returns total variable
	   * @return total
	   */
	  public int getTotal () {
	    return total;
	  }
	  
	  /**
	   * Adds parameter value to total variable and records in history
	   * @param value
	   */
	  public void add (int value) {
		  total += value;
		  history += " + " + value;
	  }

	  /**
	   * Subtracts parameter from total variable and records in history
	   * @param value
	   */
	  public void subtract (int value) {
		  total -= value;
		  history += " - " + value;
	  }

	  /**
	   * Returns history variable
	   * @return history
	   */
	  public String toString () {
	    return history;
	  }

	  /**
	   * Clears memory
	   */
	  public void clear() {
		  history = "0";
	  }
}



