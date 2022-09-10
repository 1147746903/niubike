package com.wqe.niubike.mapper;

import com.wqe.niubike.pojo.Bike;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BikeMapper {

    public void save(Bike bike);
}
