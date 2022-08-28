import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @Test
    void shouldAddTwoValues() {
        //given
        int value1 = 10;
        int value2 = 10;
        //when
        int sum = Calculator.getSum(10, 10);
        //then
        Assertions.assertEquals(20, sum);
    }

    @Test
    void shouldSubTwoValue() {
        //given
        int value1 = 25;
        int value2 = 10;
        //when
        int sub = Calculator.getSubtraction(25,10);
        //then
        Assertions.assertEquals(15, sub);
    }

    @Test
    void shouldMultiplyTwoValues() {
        //given
        int value1 = 25;
        int value2 = 10;
        //when
        int multiply = Calculator.getMultiplication(25,10);
        //then
        Assertions.assertEquals(250, multiply);
    }
}
