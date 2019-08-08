package com.example.performance_analsis_springboot.controller;


import com.example.performance_analsis_springboot.dao.Type_analysisDao;
import com.example.performance_analsis_springboot.model.Type_analysis;
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
@RequestMapping(value = "/TypeAnalysis")
public class TypeAnalysisController {
    @Autowired
    Type_analysisDao type_analysisDao;
    @RequestMapping(value = "/typeAnalysis")
    public String get(){
        List<Type_analysis>list=type_analysisDao.get();
        JSONArray jsonArray = JSONArray.fromObject(list);
        return jsonArray.toString();
    }
}
