package cn.edu.tut4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalcTest {

    @Test
    void add() {
        int a = 2;
        int b = 1;
        assertEquals(a+b,Calc.add(a,b));
    }
    @Test
    void subtract() {
        int a = 2;
        int b = 1;
        assertEquals(a-b,Calc.subtract(a,b));
    }
}