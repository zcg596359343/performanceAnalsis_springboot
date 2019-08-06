package com.example.performance_analsis_springboot.controller;

import com.example.performance_analsis_springboot.dao.EmergencyResourcesDao;
import com.example.performance_analsis_springboot.model.EmergencyResources;
import com.example.performance_analsis_springboot.model.EmergencyResources_map;
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
@RequestMapping(value = "/EmergencyResources")
public class EmergencyResourcesController {
    @Autowired
    EmergencyResourcesDao emergencyResourcesDao;

    @RequestMapping(value = "map")
    public String map(){
        List<EmergencyResources_map> list =emergencyResourcesDao.get();
        for (int i = 0; i <list.size() ; i++) {
            EmergencyResources_map emergencyResources_map=new EmergencyResources_map();
            emergencyResources_map=list.get(i);
            if (emergencyResources_map.getSite_name()==null){
                emergencyResources_map.setSite_name(emergencyResources_map.getSs_yljg());
                list.set(i,emergencyResources_map);
            }else {
            }
        }
        for (int j = 0; j <list.size() ; j++) {
            EmergencyResources_map emergencyResources_map1 = new EmergencyResources_map();
            emergencyResources_map1 = list.get(j);
            if (emergencyResources_map1.getSite_type() != null) {
                if (emergencyResources_map1.getSite_type().equals("直属站")) {
                    emergencyResources_map1.setValue("40");
                    list.set(j, emergencyResources_map1);
                }
                if (emergencyResources_map1.getSite_type().equals("分中心")) {
                    emergencyResources_map1.setValue("30");
                    list.set(j, emergencyResources_map1);
                }
                if (emergencyResources_map1.getSite_type().equals("社区站")) {
                    emergencyResources_map1.setValue("20");
                    list.set(j, emergencyResources_map1);
                }
            }
        }
        JSONArray jsonArray=JSONArray.fromObject(list);
        return jsonArray.toString();
    }

    @RequestMapping(value = "/cx")
    public String get(@RequestParam("name") String name){
        List<EmergencyResources> list =emergencyResourcesDao.getAll(name);
        JSONArray jsonArray = JSONArray.fromObject(list);
        return jsonArray.toString();
    }
}
