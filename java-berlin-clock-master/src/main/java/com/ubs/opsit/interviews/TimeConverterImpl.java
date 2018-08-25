package com.ubs.opsit.interviews;

public class TimeConverterImpl implements TimeConverter {

    @Override
    public String convertTime(String aTime) {
        TimeParser parser =  new TimeParser(aTime);

        SecondTimerStrategy secTimerStrategy = new SecondTimerStrategy();
        HrTimerStrategy hrTimerStrategy = new HrTimerStrategy();
        MinTimerStrategy minTimerStrategy = new MinTimerStrategy();

        return String.format("%s\n%s\n%s", secTimerStrategy.getClock(parser),
                hrTimerStrategy.getClock(parser),
                minTimerStrategy.getClock(parser) );

    }
}
