package model.utils;

public class StringFilter {

    //MODIFIES: str
    //EFFECTS: returns the str with whitespace removed
    public static String removeWhiteSpace(String str) {
        return str.replaceAll(" ", "");
    }

    //MODIFIES: str
    //EFFECTS: returns string in lowercase and removes white space
    public static String convertToKey(String str) {
        return str.toLowerCase().replaceAll(" ", "");
    }
}
