package com.develcode.sefaz.demo.service;

import com.develcode.sefaz.demo.repository.StatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class StatusService {
    @Autowired
    private StatusRepository repository;

    public Boolean getStatus(Integer codigoUF) {

        return null;
    }
}
