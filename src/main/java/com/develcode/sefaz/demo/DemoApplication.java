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
		System.out.println("--------------------------------------");
	}

	@Override
	public void run(String... args) throws Exception {
		LocalDateTime agora = LocalDateTime.now();
		Status mock = new Status(
				1L,
				1,
				agora,
				agora.plusSeconds(3l),
				StatusServiceEnum.ATIVO,
				AmbientEnum.PRODUCAO,
				"TESTE",
				"TESTE",
				3l,
				"TESTE",
				"TESTE"
		);
		Status mockPosterior = new Status(
				2L,
				1,
				agora.plusMinutes(3),
				agora.plusMinutes(3).plusSeconds(3l),
				StatusServiceEnum.CONTINGENCIA_TEMPORARIA,
				AmbientEnum.PRODUCAO,
				"TESTE",
				"TESTE",
				3l,
				"TESTE",
				"TESTE"
		);
		repository.save(mock);
		repository.save(mockPosterior);
	}
}
