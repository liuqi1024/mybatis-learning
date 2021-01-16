package com.gw.ken.myb.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan({"com.gw.ken.myb.dao"})
public class MybatisConfig {
}
