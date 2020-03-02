package com.gioov.behavioral.state;

/**
 * @author godcheese [godcheese@outlook.com]
 * @date 2020-02-12
 */
public class Test {

    public static void main(String[] args) {
        Context context1 = new Context();
        context1.setWeather(new Sunshine());
        System.out.println(context1.weatherMessage());
        System.out.println("==========");
        Context context2 = new Context();
        context2.setWeather(new Rain());
        System.out.println(context2.weatherMessage());
    }
}
