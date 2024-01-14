package com.bachtx.genresservice.configurations;

import com.bachtx.genresservice.GenresServiceApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(basePackageClasses = GenresServiceApplication.class)
public class FeignClientConfiguration {
}
