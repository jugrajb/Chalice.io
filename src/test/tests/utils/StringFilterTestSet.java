package tests.utils;

import org.junit.jupiter.api.Test;
import model.utils.StringFilter;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringFilterTestSet {

    @Test
    void testWS(){
        assertEquals("AA", StringFilter.removeWhiteSpace("A A"));
    }

    @Test
    void testKey(){
        assertEquals("as", StringFilter.convertToKey("A s"));
    }

}
