package org.example.service;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.example.dao.AcountPojo;
import org.example.mapper.AcountMapper;

import java.io.InputStream;

public class App1 {
    public static void main(String[] args) throws Exception {
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder=new SqlSessionFactoryBuilder();
        InputStream inputStream=Resources.getResourceAsStream("mybatisConfig.xml");
        SqlSessionFactory sqlSessionFactory=sqlSessionFactoryBuilder.build(inputStream);
        SqlSession sqlSession=sqlSessionFactory.openSession();
        AcountMapper acountMapper=sqlSession.getMapper(AcountMapper.class);
        AcountPojo acountPojo=new AcountPojo();
        acountPojo.setId(1);
        acountPojo.setMoney(100);
        System.out.println(acountPojo);
        acountMapper.updateMethodAdd(acountPojo);
        //事务提交
        sqlSession.commit();
        AcountPojo acountPojo2=acountMapper.getByID(1);
        System.out.println(acountPojo2);
        sqlSession.close();
    }
}
