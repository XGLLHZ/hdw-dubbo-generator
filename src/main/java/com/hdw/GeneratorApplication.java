package com.hdw;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 代码生成器
 *
 * @author TuMinglong
 * @email tuminglong@126.com
 * @date 2018/12/21 14:17
 */

@SpringBootApplication
@MapperScan("com.hdw.dao")
public class GeneratorApplication {

	public static void main(String[] args) {
		SpringApplication.run(GeneratorApplication.class, args);
	}
}
