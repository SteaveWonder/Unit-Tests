package HW1;

import Main.hw1.Calculator.Calculator;
import org.junit.jupiter.api.*;


import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {
    private Calculator calculator;

    @BeforeAll
    static void setup() {
        System.out.println("Before all tests");
    }

    @BeforeEach
    void init() {
        calculator = new Calculator();
    }
    @AfterEach
    void cleanup() {
        calculator = null;
    }

    @AfterAll
    static void teardown() {
        System.out.println("After all tests");
    }

    void testAdd() {
        int result = calculator.add(5, 3);
        assertEquals(8, result, "5 + 3 should equal 8");
    }

    @Test
    @DisplayName("Test subtraction")


    void testSubtract() {
        int result = calculator.subtract(10, 4);
        assertEquals(6, result, "10 - 4 should equal 6");
    }

    @Test
    @DisplayName("Test multiplication")


    void testMultiply() {
        int result = calculator.multiply(6, 7);
        assertEquals(42, result, "6 * 7 should equal 42");
    }

    @Test
    @DisplayName("Test division")


    void testDivide() {
        int result = calculator.divide(20, 5);
        assertEquals(4, result, "20 / 5 should equal 4");
    }

    @Test
    @DisplayName("Test division by zero")


    void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> calculator.divide(10, 0),
                "Division by zero should throw ArithmeticException");
    }

    @Test
    @DisplayName("Test calculateDiscount with valid input")


    void calculateDiscount() {
        double result = calculator.calculateDiscount(20, 10);
        assertEquals(18, result, "Your sum with discount should equal 18");
    }

    @Test
    @DisplayName("Test calculateDiscount with negative sum")


    void testCalculateDiscountByPositiveSum() {
        assertThrows(ArithmeticException.class, () -> calculator.calculateDiscount(-5, 5),
                "Sum can`t be less than 0");
    }

    @Test
    @DisplayName("Test calculateDiscount with big discount")


    void testCalculateDiscountByBigDiscount() {
        assertThrows(ArithmeticException.class, () -> calculator.calculateDiscount(50, 60),
                "Sum can`t be less than 0");
    }
}
