package HW3;

import Main.hw3.MainHW;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MainHWTest {
    private MainHW test;
    @BeforeEach
    void setTest() {
        test = new MainHW();
    }

    @ParameterizedTest
    @ValueSource(ints = {0,2,18,50})
    void evenTest(int n) {
        assertTrue(test.evenOddNumber(n));
    }

    @ParameterizedTest
    @ValueSource(ints = {1,17,29,83})
    void oddTest(int n) {
        assertFalse(test.evenOddNumber(n));
    }


    @ParameterizedTest
    @ValueSource(ints = {26,47,66,99})
    void numberInInterval(int n) {
        assertTrue(test.numberInInterval(n));
    }
    @ParameterizedTest
    @ValueSource(ints = {5,19,117,250})
    void numberNotInInterval(int n) {
        assertFalse(test.numberInInterval(n));
    }
}
