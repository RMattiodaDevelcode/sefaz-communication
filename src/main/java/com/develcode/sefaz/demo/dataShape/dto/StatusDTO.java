package com.develcode.sefaz.demo.dataShape.dto;

import com.develcode.sefaz.demo.dataShape.enums.StatusServiceEnum;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StatusDTO implements SolicitacaoDTO {
    private StatusServiceEnum status;
    private Long responseTime;
}
