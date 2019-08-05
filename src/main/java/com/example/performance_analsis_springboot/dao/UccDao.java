package com.example.performance_analsis_springboot.dao;

import com.example.performance_analsis_springboot.model.UccMan;
import com.example.performance_analsis_springboot.model.UccMarried;
import com.example.performance_analsis_springboot.model.UccProfession;
import com.example.performance_analsis_springboot.model.UccType;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface UccDao {
    public List<UccType> getType(@Param("city") List<String> city,@Param("startTime") String startTime,@Param("endTime") String endTime);
    public List<UccMarried> getMarried(@Param("city") List<String> city,@Param("startTime") String startTime,@Param("endTime") String endTime);
    public List<UccProfession> getProfession(@Param("city") List<String> city,@Param("startTime") String startTime,@Param("endTime") String endTime);
    public List<UccMan> getMan(@Param("city") List<String> city,@Param("startTime") String startTime,@Param("endTime") String endTime);
    public List<UccMan> getWoman(@Param("city") List<String> city,@Param("startTime") String startTime,@Param("endTime") String endTime);
}
