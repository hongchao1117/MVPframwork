package com.hongchao.mvp.View;

public interface IView {
    String getCity();//获取用户城市信息
    void showWeather(String s);//显示天气结果信息
    void clearMessage();//清除信息
}
