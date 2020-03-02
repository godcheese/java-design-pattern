package com.gioov.behavioral.state;

/**
 * @author godcheese [godcheese@outlook.com]
 * @date 2020-02-21
 */
public class Context {

    private Weather weather;

    public Weather getWeather() {
        return weather;
    }

    public void setWeather(Weather weather) {
        this.weather = weather;
    }

    public String weatherMessage() {
        return weather.getWeather();
    }
}
