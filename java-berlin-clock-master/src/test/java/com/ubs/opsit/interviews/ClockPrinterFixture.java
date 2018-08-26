package com.ubs.opsit.interviews;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import java.util.Arrays;
import java.util.Collection;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class ClockPrinterFixture {

    @Parameters(name = "{index}: ClockPrinterFixture({0})={1}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { 1, "ROOO" }, { 2, "RROO" }, { 3, "RRRO" }, { 4, "RRRR" }
        });
    }

    private int inputCount;

    private String expectedOutput;

    public ClockPrinterFixture(int inputCount, String expectedOutput){
        this.inputCount = inputCount;
        this.expectedOutput =expectedOutput;
    }

    @Test
    public void ValidatePrintValues(){
        assertEquals(expectedOutput, new ClockPrinter().PrintValues(inputCount, "R"));
    }
}
