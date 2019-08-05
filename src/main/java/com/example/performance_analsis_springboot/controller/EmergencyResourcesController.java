package com.example.performance_analsis_springboot.controller;

import com.example.performance_analsis_springboot.dao.EmergencyResourcesDao;
import com.example.performance_analsis_springboot.model.EmergencyResources;
import com.example.performance_analsis_springboot.model.EmergencyResources_map;
import net.sf.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@EnableAutoConfiguration
@RequestMapping(value = "/EmergencyResources")
public class EmergencyResourcesController {
    @Autowired
    EmergencyResourcesDao emergencyResourcesDao;

    @RequestMapping(value = "map")
    public String map(){
        List<EmergencyResources_map> list =emergencyResourcesDao.get();
        JSONArray jsonArray=JSONArray.fromObject(list);
        return jsonArray.toString();
    }

    @RequestMapping(value = "/cx")
    public String get(){
        List<EmergencyResources> list =emergencyResourcesDao.getAll("北苑急救站");
        JSONArray jsonArray = JSONArray.fromObject(list);
        return jsonArray.toString();
    }
}
