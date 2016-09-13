package burns.chris.calculator;




public class BasicMath {


    public double add(double input1, double input2) {
        double result = input1 + input2;
        return result;
    }

    public double subtract(double input1, double input2) {
        double result = input1 - input2;
        return result;
    }

    public double multiply(double input1, double input2) {
        double result = input1 * input2;
        return result;
    }

    public double divide(double input1, double input2) {
        double result = input1 / input2;
        return result;
    }

    public double square(double input1 ) {
        double result = Math.pow(input1, 2);
        return result;
    }
    public double squareRoot(double input1) {
        double result = Math.sqrt(input1);
        return result;
    }
    public double exponent(double input1 ) {
        double result = input1 * input1 ;
        return result;
    }

    public double inverse(){
        return 0;
    }

    public double negative(){
        return 0;
    }
}


