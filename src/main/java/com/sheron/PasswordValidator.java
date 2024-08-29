package com.sheron;

public class PasswordValidator {
    public static boolean isPasswordStrong(String password){
        if (password.length() < 8) return false;

        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasDigit = false;
        boolean hasSpecialChar = false;

        for(char c : password.toCharArray()){
            if (Character.isUpperCase(c)){
                hasUpperCase = true;
            }
            if (Character.isLowerCase(c)){
                hasLowerCase = true;
            }
            if (Character.isDigit(c)){
                hasDigit = true;
            }
            if (!Character.isDigit(c)&& !Character.isLetter(c)&& !Character.isWhitespace(c)){
                hasSpecialChar = true;
            }
        }
        return hasUpperCase && hasLowerCase && hasDigit && hasSpecialChar;
    }

}
