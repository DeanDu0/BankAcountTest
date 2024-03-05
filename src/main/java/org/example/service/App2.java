package org.example.service;

import org.example.config.AnnotationConfigClass;
import org.example.dao.AcountPojo;
import org.example.mapper.AcountMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Service;

//@Service
public class App2 {
    //@Autowired
    //private AcountMapper acountMapper;
    public static void main(String[] args) {
        ApplicationContext ioc=new AnnotationConfigApplicationContext(AnnotationConfigClass.class);
        AcountMapper acountMapper=ioc.getBean(AcountMapper.class);
        AcountPojo acountPojo=ioc.getBean(AcountPojo.class);
        acountPojo.setMoney(638000);
        acountPojo.setId(1);
        acountMapper.updateMethodAdd(acountPojo);
        AcountPojo acountPojo1=acountMapper.getByID(1);
        System.out.println(acountPojo1);
    }
}
