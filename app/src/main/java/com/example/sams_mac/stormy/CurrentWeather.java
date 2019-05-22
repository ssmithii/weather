package com.example.sams_mac.stormy;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class CurrentWeather {

    private String locationLabel;
    private String icon;
    private long time;
    private double tempature;
    private double humidity;
    private double precipChance;
    private String summary;
    private String timeZone;


    public CurrentWeather() {
    }

    public CurrentWeather(String locationLabel, String icon, long time,
                          double tempature, double humidity,
                          double precipChance, String summary,
                          String timeZone) {
        this.locationLabel = locationLabel;
        this.icon = icon;
        this.time = time;
        this.tempature = tempature;
        this.humidity = humidity;
        this.precipChance = precipChance;
        this.summary = summary;
        this.timeZone = timeZone;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public String getLocationLabel() {
        return locationLabel;
    }

    public void setLocationLabel(String locationLabel) {
        this.locationLabel = locationLabel;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }





    public int getIconId(){
        //clear-day, clear-night, rain, snow, sleet, wind, fog, cloudy,
        // partly-cloudy-day, or partly-cloudy-night

        int iconId = R.drawable.clear_day;

        switch(icon) {
            case "clear-day":
                iconId = R.drawable.clear_day;
                break;
            case "rain":
                iconId = R.drawable.rain;
                break;
            case "snow":
                iconId = R.drawable.snow;
                break;
            case "sleet":
                iconId = R.drawable.sleet;
                break;
            case "wind":
                iconId = R.drawable.wind;
                break;
            case "fog":
                iconId = R.drawable.fog;
                break;
            case "cloudy":
                iconId = R.drawable.cloudy;
                break;
            case "partly-cloudy-day":
                iconId = R.drawable.partly_cloudy;
                break;
            case "partly-cloudy-night":
                iconId = R.drawable.cloudy_night;
                break;

        }
        return iconId;

    }
    public long getTime() {
        return time;
    }

    public String getFormattedTime(){
        SimpleDateFormat formatter = new SimpleDateFormat("h:mm a");

        formatter.setTimeZone(TimeZone.getTimeZone(timeZone));


        Date dateTime = new Date(time * 1000);
        return formatter.format(dateTime);
    }
    public void setTime(long time) {
        this.time = time;
    }

    public double getTempature() {
        return tempature;
    }

    public void setTempature(double tempature) {
        this.tempature = tempature;
    }

    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    public double getPrecipChance() {
        return precipChance;
    }

    public void setPrecipChance(double precipChance) {
        this.precipChance = precipChance;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }
}