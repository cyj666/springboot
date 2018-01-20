package com.boot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
//@EnableAutoConfiguration
/**
 * @SpringBootApplication注解包含了spring的@Configuration、@ComponentScan和
springboot的@EnableAutoConfiguration（springboot自动配置）
 * @author DELL
 *
 */
@SpringBootApplication  
@RestController
//@Configuration
//@ComponentScan
public class SampleController {
	
	@Value(value="${MyRealName}")
	private String name;
	
	@RequestMapping("/")
	//@ResponseBody
	public String home() {
		return "Hello World!"+name;	
	}
	
	
	
	public static void main(String[] args) throws Exception {
		//负责启动引导程序
        SpringApplication.run(SampleController.class, args);
    }
}
