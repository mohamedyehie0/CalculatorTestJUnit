import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

        private calculator calculatorTest;

        @Before
        public void setup() {
            calculatorTest = new calculator();
        }

        @Test
        public void addTest() {
            int a = 10;
            int b = 10;
            int expectedResult = 20;
            int result = calculatorTest.add(a, b);

            Assert.assertEquals(expectedResult, result);
        }

        @Test
        public void subtractTest() {
            int a = 10;
            int b =5;
            int expectedResult = 5;
            int result = calculatorTest.subtract(a, b);
            Assert.assertEquals(expectedResult, result);
        }

        @Test
        public void multiplyTest() {
            int a = 10;
            int b = 10;
            long expectedResult = 100;
            long result = calculatorTest.multiply(a, b);
            Assert.assertEquals(expectedResult, result);
        }

        @Test
        public void divideTest() {
            int a = 100;
            int b = 10;
            int expectedResult = 10;
            int result = calculatorTest.divide(a, b);
            Assert.assertEquals(expectedResult, result);
        }

        @Test
        public void divideByZeroTest() {
            int a = 100;
            int b = 0;
            calculatorTest.divide(a, b);
        }

        @Test
        public void sqrTest(){
            int x = 10;
            int result = calculatorTest.sqr(x);
            int expectedResult = 100;
            Assert.assertEquals(expectedResult, result);

        }

        @Test
        public void reminderTest(){
            int a = 15;
            int b = 8;
            int result = calculatorTest.reminder(a,b);
            int expectedResult = 7;
            Assert.assertEquals(expectedResult,result);
        }

    }
