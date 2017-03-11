package utility;

import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
/**
 * Created by CHEULONG on 3/12/2017.
 */
public class GradeCalculatorTest {
    @Test
    public void testCalculate(){
        GradeCalculator gradeCalculator=new GradeCalculator();
        assertThat(gradeCalculator.calculate(25,28,32),is('B'));
        assertThat(gradeCalculator.calculate(25,25,15),is('C'));
    }
}
