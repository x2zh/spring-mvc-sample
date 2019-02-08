package net.zhangxiaoxiao.spring.mvc.learn.dao;

import net.zhangxiaoxiao.spring.mvc.learn.entity.City;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;


public interface CityMapper {
    @Select("SELECT * FROM city WHERE id = #{cityId}")
    City getCity(@Param("cityId") Integer cityId);
}
