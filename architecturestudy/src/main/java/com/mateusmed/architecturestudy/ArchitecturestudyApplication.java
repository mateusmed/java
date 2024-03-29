package com.mateusmed.architecturestudy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc // necessário para ter um handler genérico
@SpringBootApplication
@EnableFeignClients
public class ArchitecturestudyApplication {

	public static void main(String[] args) {

// 		DEFAULT
//		SpringApplication.run(ArchitecturestudyApplication.class, args);

		ApplicationContext ctx = SpringApplication.run(ArchitecturestudyApplication.class, args);

		DispatcherServlet dispatcherServlet = (DispatcherServlet)ctx.getBean("dispatcherServlet");
		dispatcherServlet.setThrowExceptionIfNoHandlerFound(true);
	}

}
