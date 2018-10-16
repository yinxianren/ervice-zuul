package com.yinxianren.study.servicezuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 *  http://localhost:8700/service-feign/hi?name=forezp
 *  http://localhost:8700/service-feign/hi?name=forezp&uid=“11111”
 *
 *  http://localhost:8700/service-consumer/hi?name=forezp
 *  http://localhost:8700/service-consumer/hi?name=forezp&uid=“11111”
 *
 * 测试成功
 * 所以我们可以总结出规律：访问
 * http://GATEWAY:GATEWAY_PORT/想要访问的Eureka服务id的小写/**
 * ，将会访问到
 * http://想要访问的Eureka服务id的小写:该服务端口/**
 */

@EnableZuulProxy
@SpringBootApplication
public class ServiceZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceZuulApplication.class, args);
	}
}
