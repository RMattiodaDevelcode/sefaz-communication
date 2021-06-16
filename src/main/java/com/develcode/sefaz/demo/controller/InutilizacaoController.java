package com.develcode.sefaz.demo.controller;

import com.develcode.sefaz.demo.service.InutilizacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api/inutilizacao")
public class InutilizacaoController {
    @Autowired
    private InutilizacaoService service;
}
