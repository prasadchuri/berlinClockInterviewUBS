package com.ubs.opsit.interviews;

public class ClockPrinter  {

    public  String PrintValues(int numberOfTimesToPrint, String chartToPrint){
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

    public  String PrintValues(int numberOfTimesToPrint){
        StringBuilder returnString = new StringBuilder();
        for(int i = 0 ; i < 11 ; i++){
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
