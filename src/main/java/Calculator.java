

public class Calculator {
    public int add(int firstNum, int secondNum) {
        return firstNum + secondNum;
    }

    public int divide(int firstNum, int divisor) {
        if(divisor == 0){
            throw new ArithmeticException("Can't divide by zero");
        }
        return firstNum/divisor;
    }


}
