package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {
    @Test
    public void testCalculations() {
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);

        double add = calculator.add(30,6);
        double sub = calculator.sub(30,6);
        double mul = calculator.mul(30,6);
        double div = calculator.div(30,6);

        Assert.assertEquals(36, add,0.000001);
        Assert.assertEquals(24, sub,0.0000001);
        Assert.assertEquals(180, mul,0.0000001);
        Assert.assertEquals(5, div,0.0000001);
    }
}