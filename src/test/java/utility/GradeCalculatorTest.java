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
<<<<<<< HEAD
        assertThat(gradeCalculator.calculate(25,10,05),is('F'));
=======
        assertThat(gradeCalculator.calculate(30,40,30),is('A'));
>>>>>>> 5d1e79dc72f3a9fa26df5454d69f558b4e4388c8
    }
}
