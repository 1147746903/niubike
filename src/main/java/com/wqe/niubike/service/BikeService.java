package com.wqe.niubike.service;

import com.wqe.niubike.pojo.Bike;

import java.util.List;

public interface BikeService {

    public void save(Bike bike);

    public void save(String bike);

    List<Bike> findAll();
}
