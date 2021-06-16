package com.develcode.sefaz.demo;

import com.develcode.sefaz.demo.dataShape.dto.toSefaz.StatusXML;
import com.develcode.sefaz.demo.dataShape.enums.AmbientEnum;
import com.develcode.sefaz.demo.repository.StatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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
			for (int codUF = 11; codUF <= 53; codUF++) {
				StatusXML toSend = new StatusXML(
					AmbientEnum.HOMOLOGACAO.getId(),
					codUF
				);
				//mandar para sefaz
			}
			Thread.sleep(180000);
		}
	}
}
