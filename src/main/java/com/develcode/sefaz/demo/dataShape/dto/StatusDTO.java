package com.develcode.sefaz.demo.dataShape.dto;

import com.develcode.sefaz.demo.dataShape.enums.StatusServiceEnum;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class StatusDTO implements SolicitacaoDTO, Serializable {
    private static final long serialVersionUID = 1l;

    private StatusServiceEnum status;
    private Long responseTime;
}
