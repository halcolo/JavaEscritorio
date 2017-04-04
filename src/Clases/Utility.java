package Clases;

public class Utility {

    public static boolean isNumeric(String chain) {
        try {
            Integer.parseInt(chain);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }

}
