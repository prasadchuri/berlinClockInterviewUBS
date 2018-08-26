package com.ubs.opsit.interviews;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class HrTimeStrategyFixture {

    @Parameterized.Parameters(name = "{index}: HrTimeStrategyFixture({0})={1}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { "00:00:00", "OOOO\nOOOO" }, { "13:17:01", "RROO\nRRRO" }, { "23:59:59", "RRRR\nRRRO" }, { "24:00:00", "RRRR\nRRRR" }
        });
    }

    private String inputTime;

    private String expectedOutput;

    public HrTimeStrategyFixture(String inputTime, String expectedOutput){
        this.inputTime = inputTime;
        this.expectedOutput =expectedOutput;
    }

    @Test
    public void TestHrClock(){
        HrTimerStrategy hrTimerStrategy = new HrTimerStrategy();
        String actualValue = hrTimerStrategy.getClock(new TimeParser(inputTime));
        assertEquals(expectedOutput, actualValue);
    }

}
