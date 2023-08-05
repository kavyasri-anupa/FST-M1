package examples;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;


public class CalculatorTest {
    Calculator obj;
    @BeforeEach
    public void setup(){
         obj = new Calculator();
    }


    @Test
    public void addTest(){
        int sum = obj.add(5,6);
        System.out.println(sum);
    }
    @Test
    @Disabled
    public void multiplyTest(){

        int mul = obj.multiply(10,20);
        System.out.println(mul);
    }
}
