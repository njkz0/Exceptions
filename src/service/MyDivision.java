package service;

public class MyDivision {
    public static String division  (int divident, int divider) throws DivisionByZeroException {

        if(divider==0){
            throw new DivisionByZeroException("Division by zero is prohibited");
        }else { int result=divident/divider;
            return String.format("Result of %d/%d is %d", divident, divider, result);}

    }
}
