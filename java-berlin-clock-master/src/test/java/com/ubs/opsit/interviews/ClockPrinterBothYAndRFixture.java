package com.ubs.opsit.interviews;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class ClockPrinterBothYAndRFixture {

    @Parameters(name = "{index}: ClockPrinterBothYAndRFixture({0})={1}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { 3, "YYROOOOOOOO" }, { 6, "YYRYYROOOOO" }, { 9, "YYRYYRYYROO" }
        });
    }

    private int inputCount;

    private String expectedOutput;

    public ClockPrinterBothYAndRFixture(int inputCount, String expectedOutput){
        this.inputCount = inputCount;
        this.expectedOutput =expectedOutput;
    }

    @Test
    public void ValidatePrintValues(){
        assertEquals(expectedOutput, new ClockPrinter().PrintValues(inputCount));
    }
}
