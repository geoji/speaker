/*
 * Copyright 2019 George Varghese
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package org.geoji.app.speaker;

import com.googlecode.jsonrpc4j.JsonRpcParam;

public class HelloService {
	
	/**
	 * Returns a greeting that includes the name of the specified person
	 * @param firstName the first name of the person
	 * @param lastName the last name of the person
	 * @return the greeting
	 */
	public String greeting(@JsonRpcParam(value="firstName") String firstName, @JsonRpcParam(value="lastName") String lastName) {
		return "Hello " + firstName + " " + lastName; 
	}
	
	/**
	 * Subtracts <code>secondNumber</code> from <code>firstNumber</code> and returns
	 * the result
	 * @param firstNumber
	 * @param secondNumber
	 * @return the result of subtraction (firstNumber - secondNumber)
	 */
	public double subtract(@JsonRpcParam(value="firstNumber") double firstNumber, @JsonRpcParam(value="secondNumber") double secondNumber) {
		return firstNumber - secondNumber; 
	}
}