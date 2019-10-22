package tests.exceptions;

import model.controller.WeaponEnergyController;
import exceptions.WeaponNotFoundException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

public class EnergyExceptionTest implements ExceptionTestInterface {
    private WeaponEnergyController ctrl;

    @BeforeEach
    public void setup() {
        ctrl = new WeaponEnergyController();
    }

    @Test
    public void catchThrownError() {
        try {
            ctrl.getHandCannon("bloop");
        } catch (WeaponNotFoundException e) {
            assertTrue(true);
        }
    }

    @Test
    public void noThrownError() {
        try {
            ctrl.getHandCannon("trust");
        } catch (WeaponNotFoundException e) {
            fail();
        }
        assertTrue(true);
    }
}
