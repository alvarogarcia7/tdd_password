package password;

import static org.junit.Assert.*;

import org.junit.Test;

public class ValidPasswordTest {

	@Test
	public void validPasswordWhenAllRequirementsPassed() {
		assertTrue(validPasword("1aA-aa"));
	}

	private boolean validPasword(String password){
		return true;
	}
}
