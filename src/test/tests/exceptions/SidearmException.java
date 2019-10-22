package tests.exceptions;

import model.controller.WeaponKineticController;
import exceptions.WeaponNotFoundException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

public class SidearmException implements ExceptionTestInterface {
    private WeaponKineticController ctrl;

    @BeforeEach
    public void setup() {
        ctrl = new WeaponKineticController();
    }

    @Test
    public void catchThrownError() {
        try {
            ctrl.getSideArm("bloop");
        } catch (WeaponNotFoundException e) {
            assertTrue(true);
        }
    }

    @Test
    public void noThrownError() {
        try {
            ctrl.getSideArm("smugglersword");
        } catch (WeaponNotFoundException e) {
            fail();
        }
        assertTrue(true);
    }
}
