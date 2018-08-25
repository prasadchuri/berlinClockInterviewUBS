package com.ubs.opsit.interviews;

public class SecondTimerStrategy implements ClockStrategy {

    @Override
    public String getClock(TimeParser parser) {
        return (parser.getGetSeconds().intValue() % 2  == 0) ? "Y": "O" ;
    }
}
