package com.ms.rest.day0.restful.web.services.controller;

import com.ms.rest.day0.restful.web.services.beans.EmployeeBean;
import com.ms.rest.day0.restful.web.services.exception.EmployeeNotFoundException;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class EmployeeService {

    static List<EmployeeBean> emps = new ArrayList<>();
    int count = 3 ;

    static {
        emps.add(new EmployeeBean(1,"Prashant","IT"));
        emps.add(new EmployeeBean(2,"Sagar","ITES"));
        emps.add(new EmployeeBean(3,"Preeti","DevOps"));
    }
    public EmployeeBean findEmp(Integer id){
        if(id == 0){
            throw new RuntimeException("null");
        }
      List<EmployeeBean> emp = emps.stream().filter(e->e.getId()==id).collect(Collectors.toList());
      return  emp==null || emp.isEmpty() ? null : emp.get(0);
    }

    public EmployeeBean add(EmployeeBean e){
        e.setId(++count);
        emps.add(e);
        return e;
    }

    public List<EmployeeBean> findAll(){
        return emps;
    }

}
