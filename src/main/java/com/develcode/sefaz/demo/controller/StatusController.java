package com.develcode.sefaz.demo.controller;

import com.develcode.sefaz.demo.service.InutilizacaoService;
import com.develcode.sefaz.demo.service.StatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api/status")
public class StatusController {
    @Autowired
    private StatusService service;

    @GetMapping("/{codigoUF}")
    public ResponseEntity<Boolean> getStatus(@PathVariable("codigoUF") Integer codigoUF){
        return ResponseEntity.ok(service.getStatus(codigoUF));
    }
}
