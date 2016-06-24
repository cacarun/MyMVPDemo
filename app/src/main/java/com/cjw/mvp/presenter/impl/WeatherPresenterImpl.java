package com.cjw.mvp.presenter.impl;


import com.cjw.mvp.model.WeatherModel;
import com.cjw.mvp.model.entity.Weather;
import com.cjw.mvp.model.impl.WeatherModelImpl;
import com.cjw.mvp.presenter.OnWeatherListener;
import com.cjw.mvp.presenter.WeatherPresenter;
import com.cjw.mvp.ui.view.WeatherView;

/**
 * Created by Administrator on 2015/2/6.
 * 天气 Prestener实现
 */
public class WeatherPresenterImpl implements WeatherPresenter, OnWeatherListener {
	/*Presenter作为中间层，持有View和Model的引用*/
	private WeatherView weatherView;
	private WeatherModel weatherModel;

	public WeatherPresenterImpl(WeatherView weatherView) {
		this.weatherView = weatherView;
		weatherModel = new WeatherModelImpl();
	}

	@Override
	public void getWeather(String cityNO) {
		weatherView.showLoading();
		weatherModel.loadWeather(cityNO, this);
	}

	@Override
	public void onSuccess(Weather weather) {
		weatherView.hideLoading();
		weatherView.setWeatherInfo(weather);
	}

	@Override
	public void onError() {
		weatherView.hideLoading();
		weatherView.showError();
	}
}
