package org.example.service;

import org.example.mapper.AcountMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class App3 {
    @Autowired
    private AcountMapper acountMapper;
    public void transfer(String name1,String name2,Integer money){
        acountMapper.outMoney(name1,money);
        acountMapper.inMoney(name2,money);
    }

}
