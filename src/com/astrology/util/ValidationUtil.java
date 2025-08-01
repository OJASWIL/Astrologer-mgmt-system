package com.astrology.util;


import java.util.regex.Pattern;

public class ValidationUtil {

    // Regular expression patterns
    private static final Pattern NAME_PATTERN = Pattern.compile("^[a-zA-Z\\s]+$");
    private static final Pattern ID_PATTERN = Pattern.compile("^\\d{7}$");
    private static final Pattern LEVEL_PATTERN = Pattern.compile("^(beginner|intermediate|expert)$");
    private static final Pattern CONTACT_PATTERN = Pattern.compile("^98\\d{8}$");

    /**
     * Validates if a string is null or empty.
     *
     * @param value the string to validate
     * @return true if the string is null or empty, otherwise false
     */
    public static boolean isNullOrEmpty(String value) {
        return value == null || value.trim().isEmpty();
    }

    /**
     * Validates if the name contains only alphabets and spaces.
     *
     * @param name the name to validate
     * @return true if valid, otherwise false
     */
    public static boolean isValidName(String name) {
        return !isNullOrEmpty(name) && NAME_PATTERN.matcher(name).matches();
    }

    /**
     * Validates if the LMU ID is exactly 7 digits.
     *
     * @param id the ID to validate
     * @return true if valid, otherwise false
     */
    public static boolean isValidId(String id) {
        return !isNullOrEmpty(id) && ID_PATTERN.matcher(id).matches();
    }
 /**
     * Validates if the program is one of the allowed options.
     *
     * @param level the program to validate
     * @return true if valid, otherwise false
     */
    public static boolean isValidLevel(String level) {
        return !isNullOrEmpty(level) && LEVEL_PATTERN.matcher(level).matches();
    }
    /**
     * Validates if the contact number starts with 98 and has 10 digits in total.
     *
     * @param contact the contact number to validate
     * @return true if valid, otherwise false
     */
    public static boolean isValidContact(String contact) {
        return !isNullOrEmpty(contact) && CONTACT_PATTERN.matcher(contact.toLowerCase()).matches();
    }

    /**
     * Validates if the age is between 18 and 70 (inclusive).
     *
     * @param age the age to validate
     * @return true if valid, otherwise false
     */
    public static boolean isValidAge(short age) {
        return age >= 18 && age <= 70;
    }

    /**
     * Generic field validation utility that checks for non-empty and specific criteria.
     *
     * @param value      the field value to validate
     * @param isCriteria the specific criteria to validate against
     * @return true if both non-empty and criteria validation pass, otherwise false
     */
    public static boolean validateField(String value, boolean isCriteria) {
        return !isNullOrEmpty(value) && isCriteria;
    }

    /**
     * Utility to parse and validate an age value.
     *
     * @param ageText the text representing age
     * @return true if valid, otherwise false
     */
    public static boolean validateAgeInput(String ageText) {
        try {
            short age = Short.parseShort(ageText.trim());
            return isValidAge(age);
        } catch (NumberFormatException e) {
            return false;
        }
    }
}