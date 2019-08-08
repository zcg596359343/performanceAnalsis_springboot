package com.example.performance_analsis_springboot.dao;

import com.example.performance_analsis_springboot.model.Type_analysis;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public  interface Type_analysisDao {
    public List<Type_analysis> get();
}
