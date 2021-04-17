package com.ligaofei.springbootxdtest;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan("com.ligaofei.springbootxdtest.mapper")//配置扫描mapper路径
@EnableTransactionManagement
public class SpringbootXdtestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootXdtestApplication.class, args);
	}

}
