package net.zhangxiaoxiao.spring.mvc.learn.web.controller;

import net.zhangxiaoxiao.spring.mvc.learn.dao.CityMapper;
import net.zhangxiaoxiao.spring.mvc.learn.entity.City;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;
import javax.validation.constraints.Size;

@RestController
public class SpringController {

    @Inject
    public SpringController(CityMapper cityMapper) {
        this.cityMapper = cityMapper;
    }

    private CityMapper cityMapper;

    @RequestMapping("/spring")
    public City helloSpring(@RequestParam("cityId") @Size(max = 100, min = 10) int cityId) {
        System.out.println(cityId);
        City city = cityMapper.selectByPrimaryKey(cityId);
        System.out.println(city);
        return city;
    }
}
