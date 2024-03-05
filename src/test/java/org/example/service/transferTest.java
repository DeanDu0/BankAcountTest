package org.example.service;

import org.example.config.AnnotationConfigClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AnnotationConfigClass.class)
public class transferTest {
    @Autowired
    private App3 app3;
    @Test
    public void transferTest(){
        app3.transfer("Tom","Jerry",50);


    }
}
