package com.areguig.bootapp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

import com.areguig.package1.Service1;
import com.areguig.package2.Component1;

@Configuration
@ComponentScan(basePackages = {"com.areguig.package1"},
		includeFilters = @ComponentScan.Filter(
				type = FilterType.ASSIGNABLE_TYPE, value = {Service1.class}) )
public class AppConfig {

	@Bean
	public Component1 getComponent1() {
		return new Component1();
	}
}
