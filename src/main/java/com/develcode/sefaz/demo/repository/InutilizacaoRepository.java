package com.develcode.sefaz.demo.repository;

import com.develcode.sefaz.demo.dataShape.domain.Inutilizacao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InutilizacaoRepository extends JpaRepository<Inutilizacao, Long> {
}
