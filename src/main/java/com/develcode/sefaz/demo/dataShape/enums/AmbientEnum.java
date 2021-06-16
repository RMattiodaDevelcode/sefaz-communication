package com.develcode.sefaz.demo.dataShape.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum AmbientEnum {
    PRODUCAO(1),
    HOMOLOGACAO(2);

    private Integer id;
}
