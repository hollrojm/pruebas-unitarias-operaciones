package co.com.sofka.app.calculator;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;


public final class BasicCalculatorTest {
    private final BasicCalculator basicCalculator = new BasicCalculator();

    @Test
    @DisplayName("Testing sum: 1+1=2")
    public void sum() {
        // Arrange
        Long number1 = 1L;
        Long number2 = 1L;
        Long expectedValue = 2L;

        // Act
        Long result = basicCalculator.sum(number1, number2);

        // Assert
        assertEquals(expectedValue, result);
    }
    @Test
    @DisplayName("Testing res: 1-1=0")
    public void res() {
        // Arrange
        Long number1 = 1L;
        Long number2 = 1L;
        Long expectedValue = 0L;

        // Act
        Long result = basicCalculator.res(number1, number2);

        // Assert
        assertEquals(expectedValue, result);
    }
    @Test
    @DisplayName("Testing res: 2*2=4")
    public void multiplicacion() {
        // Arrange
        Long number1 = 2L;
        Long number2 = 2L;
        Long expectedValue = 4L;

        // Act
        Long result = basicCalculator.multiplicacion(number1, number2);


        // Assert
        assertEquals(expectedValue, result);
    }
    @Test
    @DisplayName("Testing division: 2/1=1")
    public void division() {
        // Arrange
        Double number1 = Double.valueOf(7L);;
        Double number2 = Double.valueOf(3L);;
        Double expectedValue = Double.valueOf(2.3333333333333335);

        // Act
        Double result = basicCalculator.division(number1, number2);


        // Assert
        assertEquals(expectedValue, result);
    }
    @Test
    @DisplayName("Testing several sums")
    @ParameterizedTest(name = "{0} + {1} = {2}")
    @CsvSource({
            "0,    1,   1",
            "1,    2,   -3",
            "49,  51, 100",
            "1,  100, 101"
    })

    public void severalSums(Long first, Long second, Long expectedResult) {
        assertEquals(expectedResult, basicCalculator.sum(first, second),
                () -> first + " + " + second + " should equal " + expectedResult);
    }
    @Test
    @DisplayName("Testing several rest")
    @ParameterizedTest(name = "{2} - {1} = {1}")
    @CsvSource({
            "0,    1,   -1",
            "1,    2,   -1",
            "49,  51, -2",
            "1,  100, -99"
    })

    public void severalRes(Long first, Long second, Long expectedResult) {
        assertEquals(expectedResult, basicCalculator.res(first, second),
                () -> first + " - " + second + " should equal " + expectedResult);
    }
    
}
