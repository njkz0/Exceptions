package service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyDivisionTest {

    @Test
    void division() throws DivisionByZeroException{
       String result= MyDivision.division(5, 5);
       assertEquals("Result of 5/5 is 1", result);
    }
}