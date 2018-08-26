package com.ubs.opsit.interviews;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class MinTimeStrategyFixture {

    @Parameterized.Parameters(name = "{index}: MinTimeStrategy({0})={1}")
    public static Iterable<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { "00:00:00", "OOOOOOOOOOO\nOOOO" }, { "00:17:00", "YYROOOOOOOO\nYYOO" }, { "00:59:00", "YYRYYRYYRYY\nYYYY" }, { "24:00:00", "OOOOOOOOOOO\nOOOO" }
        });
    }


    private String inputTime;

    private String expectedOutput;


    public MinTimeStrategyFixture(String inputTime, String expectedOutput){
        this.inputTime = inputTime;
        this.expectedOutput =expectedOutput;
    }


    @Test
    public void TestMinClock(){
        MinTimerStrategy minTimerStrategy = new MinTimerStrategy();
        String actualValue = minTimerStrategy.getClock(new TimeParser(inputTime));
        assertEquals(expectedOutput, actualValue);
    }

}
