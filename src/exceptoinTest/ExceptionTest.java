package exceptoinTest;

import service.DivisionByZeroException;
import service.MyDivision;

import java.util.logging.Logger;

public class ExceptionTest {
    static Logger logger= Logger.getLogger(ExceptionTest.class.getName());
    public static void main(String[] args) {

        try {
            logger.info(MyDivision.division(5,5));
        }catch (DivisionByZeroException e){
            e.printStackTrace();
        }

        try {
            logger.info(MyDivision.division(5,0));
        }catch (DivisionByZeroException e){
            e.printStackTrace();
        }

    }
}
