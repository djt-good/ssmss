package com.djt.service;

import com.djt.domain.Emp;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface EmpService {
    List<Emp> getAlluser();

    PageInfo<Emp> employeepage(Integer pageNum);
}
