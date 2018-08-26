package com.ubs.opsit.interviews;

public class HrTimerStrategy implements ClockStrategy {

    @Override
    public String getClock(TimeParser parser) {
        Integer hrs = parser.getGetHrs();
        return  String.format("%s\n%s", get5HrValue(hrs), get1HrValue(hrs)) ;
    }

    private  String get5HrValue(Integer hrs){
        int numberOf5hrs =  hrs / 5;
        return  new ClockPrinter().PrintValues(numberOf5hrs, "R");
    }

    private  String get1HrValue (Integer hrs) {
        int numberOf1Hr = hrs % 5;
        return new ClockPrinter().PrintValues(numberOf1Hr, "R");
    }
}
