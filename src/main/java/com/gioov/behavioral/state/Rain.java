package com.gioov.behavioral.state;

/**
 * @author godcheese [godcheese@outlook.com]
 * @date 2020-02-21
 */
public class Rain implements Weather {

    @Override
    public String getWeather() {
        return "下雨";
    }
}
