package com.atguigu1.service;



import com.atguigu.springcloud.entity.Dept;

import java.util.List;

public interface DeptService {


     boolean add(Dept dept);
     Dept get(long id);
     List<Dept> list();
}
