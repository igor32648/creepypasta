package com.igor32648.mycreepypasta.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.igor32648.mycreepypasta.model.Categoria;
import com.igor32648.mycreepypasta.model.Historia;

@Repository
public interface HistoriaRepository extends JpaRepository<Historia, Long> {

	List<Historia> findByCategoria(Categoria categoria);

}
