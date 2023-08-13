package homeWork.Calculator.Service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceImplTest {
     CalculatorService underTest = new CalculatorServiceImpl();

    @Test
    void welcome__returnWelcomeString() {
        String result = underTest.welcome();
        assertEquals("Welcome to the calculator", result);
    }

    @Test
    void plus_num1AndNum2_resultPositive() {
        int result = underTest.plus(4,4);
        assertEquals(8,result);
    }
    @Test
    void plus_num1AndNum2_resultNegative() {
        int result = underTest.plus(-5,4);
        assertEquals(-1,result);
    }
    @Test
    void minus_num1MinusNum2_resultPositive() {
        int result = underTest.minus(4,4);
        assertEquals(0,result);
    }
    @Test
    void minus_num1LessThenNum2_resultNegative() {
        int result = underTest.minus(5,10);
        assertEquals(-5,result);
    }

    @Test
    void multiply_num1MultiplierNum2_resultPositive() {
        int result = underTest.multiply(5,5);
        assertEquals(25,result);
    }
    @Test
    void multiply_num1NegativeMultiplierNum2_resultNegativeProduct() {
        int result = underTest.multiply(5,-5);
        assertEquals(-25,result);
    }

    @Test
    void divide_num1DividedNum2WithoutFraction_resultFraction() {
        double result = underTest.divide(4,2);
        assertEquals(2, result);
    }
    @Test
    void divide_num1DividedNum2WithFraction_resultFraction() {
        double result = underTest.divide(7,2);
        assertEquals(3.5, result);
    }
    @Test
    void divide_num2Is0_throwIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> underTest.divide(1,0));
    }

}