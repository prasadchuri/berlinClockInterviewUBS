package com.ubs.opsit.interviews;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TimeParserFixture {
    @Test
    public void testGetSecs(){
        assertEquals(59, new TimeParser("23:59:59").getGetSeconds().intValue());
    }

    @Test
    public void testGetMins(){
        assertEquals(59, new TimeParser("23:59:59").getGetMinutes().intValue());
    }

    @Test
    public void testGetHrs(){
        assertEquals(23, new TimeParser("23:59:59").getGetHrs().intValue());
    }

    @Test
    public  void testValidateInvalidTime(){
        assertEquals(59, new TimeParser("23:59:59:90").getGetSeconds().intValue());
    }
}
