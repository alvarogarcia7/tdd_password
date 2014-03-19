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
	public void invalidPasswordWhenHasNoNumbers(){
		assertFalse(isValidPassword("123456"));
	}
	
	private boolean isValidPassword(String candidatePassword) {
		boolean isValidPassword = false;
		if(candidatePassword.length() >= 6){
			if(isNumbersOnly(candidatePassword)){
				isValidPassword = false;
				return isValidPassword;
			}
			if(candidatePassword.replaceAll("[A-Z]", "").length() == candidatePassword.length()){
				return isValidPassword;
			}
			isValidPassword = true;
		}
		return isValidPassword;
		
	}
	private boolean isNumbersOnly(String candidatePassword) {
		String objectWithoutNumbers = candidatePassword.replaceAll("[0-9]+", "");
		return objectWithoutNumbers.length() == 0;
	}
	

}
