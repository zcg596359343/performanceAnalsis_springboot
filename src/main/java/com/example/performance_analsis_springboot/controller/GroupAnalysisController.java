package com.example.performance_analsis_springboot.controller;


import com.example.performance_analsis_springboot.dao.EmergencyResourcesDao;
import com.example.performance_analsis_springboot.dao.UccDao;
import com.example.performance_analsis_springboot.model.*;
import net.sf.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@EnableAutoConfiguration
@RequestMapping(value = "/GroupAnalysis")
public class GroupAnalysisController {
    @Autowired
    UccDao uccDao;

    @RequestMapping(value = "/type")
    public String getType(@RequestParam("city") List<String> city, @RequestParam("time") List<String> time) {
        String startTime = time.get(0);
        String endTime = time.get(1);
        List<UccType> list = uccDao.getType(city,startTime,endTime);
        JSONArray jsonArray = JSONArray.fromObject(list);
        return jsonArray.toString();
    }

    @RequestMapping(value = "/married")
    public String getMarried(@RequestParam("city") List<String> city, @RequestParam("time") List<String> time) {
        String startTime = time.get(0);
        String endTime = time.get(1);
        List<UccMarried> list = uccDao.getMarried(city,startTime,endTime);
   /*     UccMarried uccMarried = list.get(0);
        uccMarried.setIsMarried("其他");
        list.set(0, uccMarried);*/
        /*if (list.size()==0){
            UccMarried uccMarried1=new UccMarried();
            uccMarried1.setIsMarried("无数据");
            uccMarried1.setNumber("1");
            list.add(uccMarried1);
        }*/
        JSONArray jsonArray = JSONArray.fromObject(list);
        return jsonArray.toString();
    }

    @RequestMapping(value = "/profession")
    public String getProfession(@RequestParam("city") List<String> city, @RequestParam("time") List<String> time) {
        String startTime = time.get(0);
        String endTime = time.get(1);
        List<UccProfession> list = uccDao.getProfession(city,startTime,endTime);
        JSONArray jsonArray = JSONArray.fromObject(list);
        return jsonArray.toString();
    }

    @RequestMapping(value = "/Line")
    public String getOld(@RequestParam("city") List<String> city, @RequestParam("time") List<String> time) {
        String startTime = time.get(0);
        String endTime = time.get(1);
        List<UccMan> list = uccDao.getMan(city,startTime,endTime);
        List<UccMan> list1 = uccDao.getWoman(city,startTime,endTime);
        list.addAll(list1);
        JSONArray jsonArray = JSONArray.fromObject(list);
        return jsonArray.toString();
    }
}
