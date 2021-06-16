package com.develcode.sefaz.demo.dataShape.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
public enum AmbientEnum {
    PRODUCAO(1),
    HOMOLOGACAO(2);

    private AmbientEnum (Integer id){
        this.id = id;
    }

    private Integer id;
}
