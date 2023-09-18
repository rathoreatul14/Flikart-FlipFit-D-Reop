/**
 * 
 */
package com.flipkart.validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author arjit.giri
 */
public class UserValidator {
	
	private static final String EMAIL_PATTERN = "^[A-Za-z0-9+_.-]+@(.+)$";

    public static boolean isValidEmail(String email) {
        // Check if the provided email matches the format
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        Matcher matcher = pattern.matcher(email);

        return matcher.matches(); // Returns true if it matches the format, false otherwise
    }

}
