package com.atguigu1.dao;
import com.atguigu.springcloud.entity.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
@Mapper
public interface DeptDao {

     boolean addDept(Dept dept);
     Dept findById(long id);
     List<Dept> findAll();
}
