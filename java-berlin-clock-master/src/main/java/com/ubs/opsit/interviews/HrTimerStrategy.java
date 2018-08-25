package com.ubs.opsit.interviews;

public class HrTimerStrategy implements ClockStrategy {

    @Override
    public String getClock(TimeParser parser) {
        Integer hrs = parser.getGetHrs();
        return  String.format("%s\n%s", get5HrValue(hrs), get1HrValue(hrs)) ;
    }

    private  String get5HrValue(Integer hrs){
        int numberOf5hrs =  hrs / 5;
        return  PrintValues(numberOf5hrs, "R");
    }

    private  String get1HrValue (Integer hrs){
        int numberOf1Hr = hrs % 5;
        return PrintValues(numberOf1Hr, "R");
    }


    private String PrintValues(int numberOfTimesToPrint, String chartToPrint){
        StringBuilder returnString = new StringBuilder();
        for(int i = 0 ; i < 4 ; i++){

            if(numberOfTimesToPrint > i) {
                returnString.append(chartToPrint);
            }
            else {
                returnString.append("O");
            }
        }
        return returnString.toString();
    }
}
