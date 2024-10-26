package com.example.minioserver;

import com.example.minioserver.config.MinioProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties(value = {MinioProperties.class})
@SpringBootApplication
public class MinioserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(MinioserverApplication.class, args);
	}

}
