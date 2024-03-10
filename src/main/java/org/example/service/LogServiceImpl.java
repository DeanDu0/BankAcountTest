package org.example.service;

import org.example.mapper.LogMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LogServiceImpl implements LogService {
    @Autowired
    private LogMapper logMapper;
    @Override
    public void log(String out, String in, Integer money) {
        logMapper.log("转账操作由"+out+"到"+in+"，金额："+money);

    }
}
