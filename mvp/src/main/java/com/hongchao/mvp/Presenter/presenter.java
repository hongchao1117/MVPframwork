package com.hongchao.mvp.Presenter;

import com.hongchao.mvp.MainActivity;
import com.hongchao.mvp.Model.IModel;
import com.hongchao.mvp.Model.modelImp;
import com.hongchao.mvp.View.IView;

public class presenter {
    IModel model;
    IView view;

    public presenter(IView view) {
        model = new modelImp();
        view = new MainActivity();
    }

    public String getWeather(String s){
        String weather = model.getWeather(s);
        if (weather==null){
            return "咱无此城市数据";
        }else{
            return weather;
        }
    }

    public void clearMessage(){
        view.clearMessage();;
    }

    public String getCity(){
        return view.getCity();
    }

    public void showWeather(String s){
        view.showWeather(s);
    }
}
