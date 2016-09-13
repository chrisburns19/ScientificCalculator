package burns.chris.calculator;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Created by christopherburns on 9/12/16.
 */
public class BasicCalcTest {

    @Test
    public void addTest(){
        BasicMath add = new BasicMath();
        double expectedAnswer = 4.0;
        double actualAnswer = add.add(2.0, 2.0);
        assertEquals("should be 29", expectedAnswer, actualAnswer, 0.0);

    }
//    @Test
//    public void subtractTest(){
//        BasicMath subtract = new BasicMath();
//        double expectedAnswer = 10;
//        double actualAnswer = subtract.subtract();
//        assertEquals("should be 10",expectedAnswer,actualAnswer, 0.0);
//    }
//    @Test
//    public void multiplyTest() {
//        BasicMath multiply = new BasicMath();
//        double expectedAnswer = 30;
//        double actualAnswer = multiply.multiply();
//        assertEquals("should be 30", expectedAnswer, actualAnswer, 30);
//    }
//    @Test
//    public void divideTest () {
//        BasicMath divide = new BasicMath();
//        double expectedAnswer = 5;
//        double actualAnswer = divide.divide();
//        assertEquals("should be 5", expectedAnswer, actualAnswer, 5);
//
//    }
//    @Test
//    public void squareTest () {
//        BasicMath square = new BasicMath();
//        double expectedAnswer = 121;
//        double actualAnswer = square.square();
//        assertEquals("should be 121", expectedAnswer, actualAnswer, 121);
//        }
//    @Test
//    public void squareRootTest () {
//        BasicMath squareRoot = new BasicMath();
//        double expectedAnswer = 6;
//        double actualAnswer = squareRoot.squareRoot();
//        assertEquals("should be 6 ", expectedAnswer, actualAnswer, 6);
//    }
//    @Test
//    public void exponentTest () {
//        BasicMath exponent = new BasicMath();
//        double expctedAnswer = 68;
//        double actualAnswer = exponent.exponent();
//        assertEquals("should be 6 ", expctedAnswer, actualAnswer, 68);
//    }
//    @Test
//    public void inverseTest () {
//        BasicMath inverse = new BasicMath();
//        double expectedAnswer = 0;
//        double actualAnswer = inverse.inverse();
//        assertEquals("should be , ", expectedAnswer, actualAnswer, 0);
//    }
//    @Test
//    public void negative () {
//        BasicMath negative = new BasicMath();
//        double expectedAnswer = 20;
//        double actualAnswer = negative.negative();
//        assertEquals("should be ", expectedAnswer, actualAnswer, 20);
//    }
}