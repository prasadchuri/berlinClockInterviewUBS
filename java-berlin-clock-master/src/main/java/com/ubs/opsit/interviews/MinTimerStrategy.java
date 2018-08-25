package com.ubs.opsit.interviews;

public class MinTimerStrategy implements  ClockStrategy {

    @Override
    public String getClock(TimeParser parser) {
     return  String.format("%s\n%s", get5MinValue(parser.getGetMinutes()), get1MinValue(parser.getGetMinutes()) );
    }

    private  String get5MinValue(Integer mins){
        int munberOf5Mins =  mins / 5;
        return  PrintValues(munberOf5Mins, 11);
    }

    private  String get1MinValue (Integer mins){
        int numberOf1Min = mins % 5;
        return PrintValues(numberOf1Min, "Y");
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

    private String PrintValues(int numberOfTimesToPrint, int iterationCount){
        StringBuilder returnString = new StringBuilder();
        for(int i = 0 ; i < iterationCount ; i++){
            if(numberOfTimesToPrint > i) {

                if ((i + 1) % 3 == 0) {
                    returnString.append("R");
                } else {
                    returnString.append("Y");
                }
            }
            else {
                returnString.append("O");
            }
        }
        return returnString.toString();
    }
}
