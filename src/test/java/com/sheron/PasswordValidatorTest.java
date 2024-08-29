package com.sheron;
import org.junit.Test;
import static org.junit.Assert.*;

public class PasswordValidatorTest {
    @Test
    public void testStrongPassword() {
        assertTrue(PasswordValidator.isPasswordStrong("@Strong7"));
    }

    @Test
    public void testWeakPassword() {
        assertFalse(PasswordValidator.isPasswordStrong("hello"));
    }
}
