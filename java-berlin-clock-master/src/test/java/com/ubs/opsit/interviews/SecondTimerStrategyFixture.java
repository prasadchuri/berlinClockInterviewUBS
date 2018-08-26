package com.ubs.opsit.interviews;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class SecondTimerStrategyFixture {

        @Parameterized.Parameters(name = "{index}: SecondTimerStrategy({0})={1}")
        public static Collection<Object[]> data() {
            return Arrays.asList(new Object[][] {
                    { "00:00:00", "Y" }, { "13:17:01", "O" }, { "23:59:59", "O" }, { "24:00:00", "Y" }
            });
        }

        private String inputTime;

        private String expectedOutput;

        public SecondTimerStrategyFixture(String inputTime, String expectedOutput){
            this.inputTime = inputTime;
            this.expectedOutput =expectedOutput;
        }

        @Test
        public void ValidatePrintValues(){
            SecondTimerStrategy secondTimerStrategy = new SecondTimerStrategy();
            String actualValue = secondTimerStrategy.getClock(new TimeParser(inputTime));
            assertEquals(expectedOutput, actualValue);
        }
}
