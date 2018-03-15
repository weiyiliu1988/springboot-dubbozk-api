package com.study.api;

import com.study.entity.City;

/**
 * @author LIU
 *
 */
public interface CityDubboService {

	City findCityByName(String cityName);
}
