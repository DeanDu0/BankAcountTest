package org.example.config;

import org.apache.ibatis.logging.stdout.StdOutImpl;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

public class MyBatisConfig {
    @Bean
    public SqlSessionFactoryBean sqlSessionFactoryBean(DataSource dataSource){
        SqlSessionFactoryBean ssfb=new SqlSessionFactoryBean();
        ssfb.setTypeAliasesPackage("org.example.dao");
        ssfb.setDataSource(dataSource);
        // 设置 MyBatis Configuration 对象
        org.apache.ibatis.session.Configuration configuration = new org.apache.ibatis.session.Configuration();
        // 启用日志输出
        configuration.setLogImpl(StdOutImpl.class);
        ssfb.setConfiguration(configuration);
        return ssfb;
    }
    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer(){
        MapperScannerConfigurer mscf=new MapperScannerConfigurer();
        mscf.setBasePackage("org.example.mapper");
        return mscf;
    }


}
