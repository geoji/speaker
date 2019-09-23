package org.geoji.app.speaker;

public class HelloService {
	
	/**
	 * Returns a greeting that includes the name of the specified person
	 * @param firstName the first name of the person
	 * @param lastName the last name of the person
	 * @return the greeting
	 */
	public String greeting(String firstName, String lastName) {
		return "Hello " + firstName + " " + lastName; 
	}
}
