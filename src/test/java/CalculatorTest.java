import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {


    Calculator calculator = null;
    @BeforeEach
    void setUp(){
        calculator = new Calculator();
    }

    @Test
    void shouldReturnSumOfTwoNumber2And5As7(){
        calculator = new Calculator();
        int sum = calculator.add(2,5);
        Assertions.assertEquals(7,sum);
    }

    @Test
    void shouldReturnQuotientofTwoNumber10And2As7(){
        calculator = new Calculator();
        int quotient = calculator.divide(10,2);
        Assertions.assertEquals(5, quotient);
    }

    @Test
    void shouldReturnArithmeticExceptionWhenDividedByZer(){
        calculator = new Calculator();
        ArithmeticException arithmeticException = Assertions.assertThrows(ArithmeticException.class,() -> calculator.divide(10,0));

        Assertions.assertEquals("Can't divide by zero", arithmeticException.getMessage());
    }
}
