package password;  

import static org.junit.Assert.*;

import org.junit.Test;

public class ValidPasswordTest {

	@Test
	public void invalidPasswordDoesNotHaveValidLength(){
		assertFalse(isValidPassword("sdf-A"));  
	} 
	@Test
	public void validatePasswordWhenHasLenghtUpperLowerNumber(){
		assertTrue(isValidPassword("1sdf-A"));
	}
	@Test
	public void validatePasswordWhenHasBiggerLenghtUpperLowerNumber(){
		assertTrue(isValidPassword("1sdf-A1"));
	}
	@Test
	public void invalidPasswordWhenHasNoMayus(){
		assertFalse(isValidPassword("1sdf-a1")); 
	}
	@Test
	public void invalidPasswordWhenHasOnlyNumbers(){
		assertFalse(isValidPassword("123456"));
	}
	@Test
	public void invalidPasswordWhenHasLengthUpperLowerButNoNumber(){
		assertFalse(isValidPassword("Aaaaaa"));
	}
	@Test
	public void invalidPasswordWhenHasLengthNumberLowerButNoLower(){
		assertFalse(isValidPassword("AAAAA1"));
	}  
	@Test
	public void invalidPasswordWhenHasLengthNumberLowerUpperButNoDash(){
		assertFalse(isValidPassword("AAAAa1"));
	}
	
	private boolean isValidPassword(String candidatePassword) {
		boolean isValidPassword = false;
		int passwordLength = candidatePassword.length();
		if(passwordLength >= 6){
			if(hasNoNumbers(candidatePassword)){
				return isValidPassword;
			}
			if(hasNoUpperCase(candidatePassword)){
				return isValidPassword;
			}
			if(hasNoDashOrUnderscore(candidatePassword)){
				return isValidPassword;
			}
			if(hasNoLowerCase(candidatePassword)){
				return isValidPassword;
			}
			isValidPassword = true;
		}
		return isValidPassword;
		
	}
	private boolean hasNoDashOrUnderscore(String candidatePassword) {
		return candidatePassword.replaceAll("[-_]", "").length() == candidatePassword.length();
	}
	private boolean hasNoLowerCase(String candidatePassword) {
		return candidatePassword.replaceAll("[a-z]", "").length() == candidatePassword.length();
	}
	private boolean hasNoNumbers(String candidatePassword) {
		return candidatePassword.replaceAll("[0-9]", "").length() == candidatePassword.length();
	}
	private boolean hasNoUpperCase(String candidatePassword) {
		return candidatePassword.replaceAll("[A-Z]", "").length() == candidatePassword.length();
	}
	private boolean hasNoUpperCharsAndNoLowerChars(String candidatePassword) {
		String objectWithoutNumbers = candidatePassword.replaceAll("[0-9]+", "");
		return objectWithoutNumbers.length() == 0;
	}
	

}
