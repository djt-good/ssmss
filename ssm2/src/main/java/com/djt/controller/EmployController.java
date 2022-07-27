package com.djt.controller;

import com.djt.domain.Emp;
import com.djt.service.EmpService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class EmployController {
    @Autowired
    public EmpService empService;


    @RequestMapping("/getAll/page/{pageNum}")
    public String getAllEmppage(@PathVariable("pageNum") Integer pageNum,Model model){
   PageInfo<Emp> empPageInfo= empService.employeepage(pageNum);
   model.addAttribute("page",empPageInfo);
   return "emp_list";
    }
    @RequestMapping("/getAll")
    public String getAlluser(Model model){
        List<Emp> alluser = empService.getAlluser();
        model.addAttribute("list",alluser);
        return "emp";
    }
}
