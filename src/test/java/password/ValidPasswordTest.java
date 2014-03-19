package password;

import static org.junit.Assert.*;

import org.junit.Test;

public class ValidPasswordTest {

	@Test
	public void falsePassword(){
		assertFalse(isValidPassword("sdf-A"));
	}
	@Test
	public void validPassword(){
		assertTrue(isValidPassword("1sdf-A"));
	}
	@Test
	public void invalidPasswordWhenHasNoNumbers(){
		assertFalse(isValidPassword("123456"));
	}
	
	private boolean isValidPassword(String candidatePassword) {
		boolean isValidPassword = false;
		if(candidatePassword.length() == 6 ){
			if(isNumbersOnly(candidatePassword)){
				isValidPassword = false;
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
