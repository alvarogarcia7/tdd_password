package password;

import static org.junit.Assert.*;

import org.junit.Test;

public class ValidPasswordTest {

	@Test
	public void validPasswordWhenAllRequirementsPassed() {
		assertTrue(isValidPassword("1aA-aa"));
	}
	
	@Test
	public void validPasswordWhenMinimumLengthIsLessThan() {
		assertTrue(checkLength("1aA-aa"));
	}

	private boolean isValidPassword(String password){
		return true;
	}
}
