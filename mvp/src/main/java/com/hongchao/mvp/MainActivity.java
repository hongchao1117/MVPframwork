package com.hongchao.mvp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.hongchao.mvp.Presenter.presenter;
import com.hongchao.mvp.View.IView;

public class MainActivity extends AppCompatActivity implements IView{

    Button getWeather_button,clear_button;
    EditText cityName;
    TextView weatherShowText;
    presenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mPresenter  = new presenter((IView) this);

        getWeather_button = findViewById(R.id.get_weather);
        clear_button = findViewById(R.id.clear_weather);
        cityName = findViewById(R.id.city_name);
        weatherShowText = findViewById(R.id.show_weather);

        getWeather_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String city = mPresenter.getCity();
                String weather = mPresenter.getWeather(city);
                mPresenter.showWeather(weather);
            }
        });
        clear_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPresenter.clearMessage();
            }
        });
    }

    @Override
    public String getCity() {
        return cityName.getText().toString();
    }

    @Override
    public void showWeather(String s) {
        weatherShowText.setText(s);
    }

    @Override
    public void clearMessage() {
        cityName.setText("");
        weatherShowText.setText("显示天气");
    }
}
