package tests.exceptions;

import model.controller.WeaponKineticController;
import exceptions.WeaponNotFoundException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SniperExceptionTest {
    private WeaponKineticController ctrl;

    @BeforeEach
    public void setup() {
        ctrl = new WeaponKineticController();
    }

    @Test
    public void catchThrownError() {
        try {
            ctrl.getSniper("bloop");
        } catch (WeaponNotFoundException e) {
            assertTrue(true);
        }
    }

    @Test void noThrownError() {
        try {
            ctrl.getSniper("dreadedventure");
        } catch (WeaponNotFoundException e) {
            fail();
        }
        assertTrue(true);
    }
}
