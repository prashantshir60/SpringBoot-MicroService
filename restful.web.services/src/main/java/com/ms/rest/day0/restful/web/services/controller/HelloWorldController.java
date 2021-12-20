package com.ms.rest.day0.restful.web.services.controller;

import com.ms.rest.day0.restful.web.services.beans.EmployeeBean;
import com.ms.rest.day0.restful.web.services.beans.HelloWorldBean;
import com.ms.rest.day0.restful.web.services.exception.EmployeeNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HelloWorldController {

    @Autowired
    public EmployeeService empService;

    @GetMapping(path = "/")
    public String swaggerUi() {
        return "redirect:/swagger-ui.html";
    }
    @GetMapping(path = "/hello-world")
    public String helloWorld() {
        return "Hello World !!!";
    }

    @GetMapping(path = "/hello-world-bean")
    public HelloWorldBean helloWorldBean() {
        return new HelloWorldBean("Hello-World-Bean");
    }

    @GetMapping(path = "/get-all-employee")
    public List<EmployeeBean> findAll() {
        return empService.findAll();
    }

    @GetMapping(path = "/get-emp/{id}")
    public EmployeeBean getEmpByid(@PathVariable int id) {
        EmployeeBean bean =  empService.findEmp(id);
        if(null==bean){
            throw new EmployeeNotFoundException("id->"+ id);
        }else {
            return bean;
        }
    }

    @PostMapping(path = "/add-employee")
    public EmployeeBean addEmployee(@RequestBody EmployeeBean e) {
        return empService.add(e);
    }
}
