package com.example.jex00.config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import lombok.extern.log4j.Log4j2;
import org.apache.ibatis.session.*;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.sql.Connection;
import java.util.ArrayList;

@Log4j2
@Configuration
@ComponentScan(basePackages = {"com.example.service"})
@MapperScan(basePackages = {"com.example.mapper"})
public class RootConfig {



    @Bean
    public SqlSessionFactory sqlSessionFactory() throws Exception{
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource());
        return sqlSessionFactoryBean.getObject();
    }



    @Bean  // 안전하게 (destroyMethod = "close") 해주는 것이 좋다?
    public DataSource dataSource() {
        HikariConfig config = new HikariConfig();
        config.setDriverClassName("com.mysql.cj.jdbc.Driver");
        config.setJdbcUrl("jdbc:mysql://localhost:3306/springdb");
        config.setUsername("springuser");
        config.setPassword("springuser");

        HikariDataSource dataSource = new HikariDataSource(config);

        return dataSource;
    }

    @Bean( name = "names")     // 빈의 이름은 보통 메서드의 이름이랑 맞춰서 사용
    public ArrayList<String> names() {   //동사가 아니라 명사로 잡는다.
        ArrayList<String> list = new ArrayList<>();
        list.add("AAA");
        list.add("BBB");
        list.add("CCC");
        return list;

    }

}
