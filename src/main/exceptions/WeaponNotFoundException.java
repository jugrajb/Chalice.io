package exceptions;

public class WeaponNotFoundException extends Exception {
    public WeaponNotFoundException() {
        super("item not found");
    }
}
