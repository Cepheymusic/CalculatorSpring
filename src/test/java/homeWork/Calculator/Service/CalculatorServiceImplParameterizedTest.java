package homeWork.Calculator.Service;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorServiceImplParameterizedTest {
    CalculatorService underTest2 = new CalculatorServiceImpl();
    private static Stream<Arguments> dataForDivide() {
        return Stream.of(
                Arguments.of(4,4,1),
                Arguments.of(7,2,3.5)
        );
    }
    private static Stream<Arguments> dataForMultiply() {
        return Stream.of(
                Arguments.of(4,4,16),
                Arguments.of(5,-5,-25)
        );
    }
    private static Stream<Arguments> dataForPlus() {
        return Stream.of(
                Arguments.of(5,5,10),
                Arguments.of(-5,2,-3)
        );
    }
    private static Stream<Arguments> dataForMinus() {
        return Stream.of(
                Arguments.of(5,5,0),
                Arguments.of(5,10,-5)
        );
    }
    @ParameterizedTest
    @MethodSource("dataForDivide")
    void divide__returnDouble(int num1, int num2, double expectedResult) {
        var result = underTest2.divide(num1, num2);
        assertEquals(expectedResult, result);
    }
    @ParameterizedTest
    @MethodSource("dataForMultiply")
    void multiply__returnProduct(int num1, int num2, int expectedResult) {
        var result = underTest2.multiply(num1, num2);
        assertEquals(expectedResult, result);
    }
    @ParameterizedTest
    @MethodSource("dataForPlus")
    void plus__returnPositive(int num1, int num2, int expectedResult) {
        var result = underTest2.plus(num1, num2);
        assertEquals(expectedResult, result);
    }
    @ParameterizedTest
    @MethodSource("dataForMinus")
    void minus__returnNegative(int num1, int num2, int expectedResult) {
        var result = underTest2.minus(num1, num2);
        assertEquals(expectedResult, result);
    }
}