package com.develcode.sefaz.demo.service;

import com.develcode.sefaz.demo.dataShape.dto.StatusDTO;
import com.develcode.sefaz.demo.dataShape.mapper.StatusMapper;
import com.develcode.sefaz.demo.repository.StatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class StatusService {
    @Autowired
    private StatusRepository repository;
    @Autowired
    private StatusMapper mapper;

    public StatusDTO getStatus(Integer codigoUF) {
        return mapper.toDto(
            repository.findTopByUfOrderByDateResponseDesc(codigoUF)
                .orElseThrow(
                    () -> new ResponseStatusException(
                        HttpStatus.BAD_REQUEST,
                        "Não foi encontrado um registro de status de serviço da UF informada.",
                        null
                    )
                )
            );
    }
}
