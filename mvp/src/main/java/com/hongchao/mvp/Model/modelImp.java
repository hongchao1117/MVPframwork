package com.hongchao.mvp.Model;

public class modelImp implements IModel{

    private String[] cityName = {
            "北京","上海"
            ,"广州","深圳"
    };
    private String[] weatherStr ={
            "阴天，20~28",
            "晴天，24~30",
            "晴天，23~40",
            "中雨，15~24",
            "中雨转阴，10~18",
            "小雨转晴，22~28",
            "晴天，23~31"
    };

    @Override
    public String getWeather(String s) {
        for (int i = 0; i < cityName.length; i++) {
            if (s.equals(cityName[i])){
                return weatherStr[i];
            }
        }
        return null;
    }
}
