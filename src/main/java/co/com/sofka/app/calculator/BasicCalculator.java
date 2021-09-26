package co.com.sofka.app.calculator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public final class BasicCalculator {
    private static final Logger logger = LoggerFactory.getLogger(BasicCalculator.class);

    public Long sum(Long number1, Long number2) {
        logger.info( "Summing {} + {}", number1, number2 );
        return number1 + number2;
    }
    public Long res(Long number1, Long number2) {
        logger.info( "Summing {} - {}", number1, number2 );
        return number1 - number2;
    }
    public Long multiplicacion(Long number1, Long number2) {
        logger.info( "Summing {} * {}", number1, number2 );
        return number1 * number2;
    }
    public Double division(Double number1, Double number2) {
        logger.info( "Summing {} / {}", number1, number2 );
        if(number2 == 0)  {
            throw new RuntimeException("No es posible dividir entre 0");
        }
        return number1 / number2;
    }
}
