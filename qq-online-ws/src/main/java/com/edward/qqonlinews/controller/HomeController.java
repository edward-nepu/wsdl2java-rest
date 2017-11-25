package com.edward.qqonlinews.controller;

import com.edward.qqonlinews.weather.GetWeatherbyCityName;
import com.edward.qqonlinews.weather.WeatherWebService;
import com.edward.qqonlinews.weather.WeatherWebServiceSoap;
import com.edward.qqonlinews.wsdl.QqOnlineWebService;
import com.edward.qqonlinews.wsdl.QqOnlineWebServiceSoap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/online/{qqCode}")
    public Object test(@PathVariable String qqCode){

        QqOnlineWebService service = new QqOnlineWebService();
        QqOnlineWebServiceSoap serviceSoap = service.getQqOnlineWebServiceSoap();
        return serviceSoap.qqCheckOnline(qqCode);

    }

    @RequestMapping("/getProvinces")
    public Object getProvinces(){

        WeatherWebService service = new WeatherWebService();
        WeatherWebServiceSoap serviceSoap = service.getWeatherWebServiceSoap();

        return serviceSoap.getSupportProvince().getString();

    }
    @GetMapping("/getWeatherByCity/{cityName}")
    public Object getWeatherByCity(@PathVariable String cityName){

        WeatherWebService service = new WeatherWebService();
        WeatherWebServiceSoap serviceSoap = service.getWeatherWebServiceSoap();

        return serviceSoap.getWeatherbyCityName(cityName);

    }
}
