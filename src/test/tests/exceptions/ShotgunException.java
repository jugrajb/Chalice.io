package tests.exceptions;

import model.controller.WeaponKineticController;
import exceptions.WeaponNotFoundException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

public class ShotgunException implements ExceptionTestInterface {
    private WeaponKineticController ctrl;

    @BeforeEach
    public void setup() {
        ctrl = new WeaponKineticController();
    }

    @Test
    public void catchThrownError() {
        try {
            ctrl.getShotGun("bloop");
        } catch (WeaponNotFoundException e) {
            assertTrue(true);
        }
    }

    @Test
    public void noThrownError() {
        try {
            ctrl.getShotGun("parcelofstardust");
        } catch (WeaponNotFoundException e) {
            fail();
        }
        assertTrue(true);
    }
}
