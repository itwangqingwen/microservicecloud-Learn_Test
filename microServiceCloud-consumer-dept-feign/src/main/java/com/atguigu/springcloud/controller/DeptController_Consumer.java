package com.atguigu.springcloud.controller;


import com.atguigu.springcloud.entity.Dept;
import com.atguigu.springcloud.service.DeptControllerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
public class DeptController_Consumer {
/*    private static final String REST_URL_PREFIX="http://127.0.0.1:8001";*/
    private static final String REST_URL_PREFIX="http://MICROSERVICECLOUD-DEPT";

    @Autowired
    private DeptControllerService service;
    @RequestMapping(value = "consumer/dept/add")
    public boolean add(Dept dept){
        return  this.service.add(dept);
    }
    @RequestMapping(value = "consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") long id){
        return  this.service.get(id);
    }
    @SuppressWarnings("unchecked")
    @RequestMapping(value = "consumer/dept/list")
    public List<Dept> list(){
        return  this.service.list();
    }

}
