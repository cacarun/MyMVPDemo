package com.cjw.mvp.ui.view;


import com.cjw.mvp.model.entity.Weather;

/**
 * Created by Administrator on 2015/2/7.
 */
public interface WeatherView {
    void showLoading();

    void hideLoading();

    void showError();

    void setWeatherInfo(Weather weather);
}
