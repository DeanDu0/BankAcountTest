package org.example.service;

import org.example.mapper.AcountMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;

@Service
public class App3 {
    @Autowired
    private AcountMapper acountMapper;
    @Autowired
    private LogService logService;
    //事务的注解通常不写在实现类上，而是写在实现类对应的接口上，App3没有实现接口暂时先安排在这里
    @Transactional(rollbackFor = {IOException.class})
    public void transfer(String name1,String name2,Integer money) throws IOException {
        try{
            acountMapper.outMoney(name1,money);
            int i=1/0;
//          if(true){throw new IOException();
//          }
            acountMapper.inMoney(name2,money);
        }finally {
            //转入转出是同一个事务，因为在同一个方法中
            logService.log(name1,name2,money);
        }


    }

}
