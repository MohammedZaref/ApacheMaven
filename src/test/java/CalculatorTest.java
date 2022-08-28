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
}
