/**
 * 
 */
package com.flipkart.validator;


/**
 * @arjit
 */
public class GymOwnerValidator {
	
    public static boolean isValidAadharNumber(String aadharNumber) {
        // Check if the provided Aadhar number matches the format
    	if (aadharNumber.length() != 12) {
            return false;
        }

        // Check if all characters in the string are numeric
        for (char c : aadharNumber.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        
        return true;
    }
    
   
    public static boolean isValidGST(String gstNumber) {
        // Check if the provided GST number matches the format
    	if (gstNumber.length() != 16) {
            return false;
        }

        // Check if all characters in the string are numeric
        for (char c : gstNumber.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        
        return true;
    }
    
    

}
