package com.book.movie;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.book.movie.filter.MovieFilter;


@Configuration
public class MovieConfig implements WebMvcConfigurer {
	
	@Bean
	public MovieFilter getFilter() {
		return new MovieFilter();
	}
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		
		registry.addInterceptor(getFilter()).addPathPatterns("/*");
	}

}
