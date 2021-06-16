package com.develcode.sefaz.demo.repository;

import com.develcode.sefaz.demo.dataShape.domain.Inutilizacao;
import com.develcode.sefaz.demo.dataShape.domain.Status;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StatusRepository extends JpaRepository<Status, Long> {
}
