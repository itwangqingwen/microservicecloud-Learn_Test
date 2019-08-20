package com.atguigu1.service.impl;
import com.atguigu.springcloud.entity.Dept;
import com.atguigu1.dao.DeptDao;
import com.atguigu1.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    private  DeptDao dao;
    @Override
    public boolean add(Dept dept) {
        return dao.addDept(dept);
    }

    @Override
    public Dept get(long id) {
        return dao.findById(id);
    }

    @Override
    public List<Dept> list() {
        return dao.findAll();
    }
}
