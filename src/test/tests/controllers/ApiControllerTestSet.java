package tests.controllers;

import model.controller.ApiController;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class ApiControllerTestSet {
    @Test
    public void test() {
        try {
            assertFalse(ApiController.getWeather().isEmpty());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
