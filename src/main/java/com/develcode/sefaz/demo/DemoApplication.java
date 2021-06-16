package com.develcode.sefaz.demo;

import com.develcode.sefaz.demo.dataShape.domain.Status;
import com.develcode.sefaz.demo.dataShape.enums.AmbientEnum;
import com.develcode.sefaz.demo.dataShape.enums.StatusServiceEnum;
import com.develcode.sefaz.demo.repository.StatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDateTime;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
	@Autowired
	private StatusRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		while(true){
			//	TODO: job worker
			Thread.sleep(180000);
		}
	}
}
