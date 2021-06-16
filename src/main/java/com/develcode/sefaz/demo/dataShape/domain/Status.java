package com.develcode.sefaz.demo.dataShape.domain;

import com.develcode.sefaz.demo.dataShape.enums.AmbientEnum;
import com.develcode.sefaz.demo.dataShape.enums.StatusServiceEnum;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "status")
public class Status {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer uf;
    private LocalDateTime dateRequest;
    private LocalDateTime dateResponse;
    @Enumerated(EnumType.STRING)
    private StatusServiceEnum status;
    @Enumerated(EnumType.STRING)
    private AmbientEnum ambient;
    private String appVersion;
    private String layoutVersion;
    private Long responseTime;
    private String cause;
    private String observation;
}
