package com.ubs.opsit.interviews;

public class TimeParser {
    private String time;

    public TimeParser(String aTime){
        this.time = aTime;
    }

    public Integer getGetSeconds() {
        String seconds = time.split(":")[2];
        return  Integer.parseInt(seconds);
    }

    public Integer getGetMinutes() {
        String minutes = time.split(":")[1];
        return  Integer.parseInt(minutes);
    }


    public Integer getGetHrs() {
        String hrs = time.split(":")[0];
        return  Integer.parseInt(hrs);
    }

}
