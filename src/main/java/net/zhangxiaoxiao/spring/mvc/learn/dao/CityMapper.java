package net.zhangxiaoxiao.spring.mvc.learn.dao;

import java.util.List;
import net.zhangxiaoxiao.spring.mvc.learn.entity.City;


public interface CityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(City record);

    City selectByPrimaryKey(Integer id);

    List<City> selectAll();

    int updateByPrimaryKey(City record);
}