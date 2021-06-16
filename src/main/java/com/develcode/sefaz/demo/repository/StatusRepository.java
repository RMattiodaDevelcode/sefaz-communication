package com.develcode.sefaz.demo.repository;

import com.develcode.sefaz.demo.dataShape.domain.Status;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface StatusRepository extends JpaRepository<Status, Long> {

    Optional<Status> findTopByUfOrderByDateResponseDesc(Integer uf);
}
