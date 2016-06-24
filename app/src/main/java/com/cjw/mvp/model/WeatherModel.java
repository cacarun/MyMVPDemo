package com.cjw.mvp.model;


import com.cjw.mvp.presenter.OnWeatherListener;

/**
 * Created by Administrator on 2015/2/6.
 * 天气Model接口
 */
public interface WeatherModel {
    void loadWeather(String cityNO, OnWeatherListener listener);
}
