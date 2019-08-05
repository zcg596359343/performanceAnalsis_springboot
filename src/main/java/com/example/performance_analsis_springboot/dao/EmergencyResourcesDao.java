package com.example.performance_analsis_springboot.dao;

import com.example.performance_analsis_springboot.model.EmergencyResources;
import com.example.performance_analsis_springboot.model.EmergencyResources_map;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface EmergencyResourcesDao {
    public List<EmergencyResources> getAll(@Param("name") String name);
    public List<EmergencyResources_map> get();
}
