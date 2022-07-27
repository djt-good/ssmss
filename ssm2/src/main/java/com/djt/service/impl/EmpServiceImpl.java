package com.djt.service.impl;

import com.djt.domain.Emp;
import com.djt.mapper.EmpMapper;
import com.djt.service.EmpService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmpServiceImpl implements EmpService {
    @Autowired
    public EmpMapper empMapper;
    @Override
    public List<Emp> getAlluser() {
        List<Emp> allEmp = empMapper.getAllEmp();
        return allEmp;
    }

    @Override
    public PageInfo<Emp> employeepage(Integer pageNum) {
        PageHelper.startPage(pageNum,4);
        List<Emp> allEmp = empMapper.getAllEmp();
        PageInfo<Emp> page= new PageInfo<>(allEmp,5);
        return page;
    }
}
