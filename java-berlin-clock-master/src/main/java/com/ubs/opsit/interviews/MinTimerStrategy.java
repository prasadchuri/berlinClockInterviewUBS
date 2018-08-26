package com.ubs.opsit.interviews;

public class MinTimerStrategy implements  ClockStrategy {

    @Override
    public String getClock(TimeParser parser) {
     return  String.format("%s\n%s", get5MinValue(parser.getGetMinutes()), get1MinValue(parser.getGetMinutes()) );
    }

    private  String get5MinValue(Integer mins){
        int munberOf5Mins =  mins / 5;
        return  new ClockPrinter().PrintValues(munberOf5Mins);
    }

    private  String get1MinValue (Integer mins){
        int numberOf1Min = mins % 5;
        return new ClockPrinter().PrintValues(numberOf1Min, "Y");
    }

}
