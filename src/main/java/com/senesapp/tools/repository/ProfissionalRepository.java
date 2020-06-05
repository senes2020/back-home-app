package com.senesapp.tools.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.senesapp.tools.model.Profissional;

public interface ProfissionalRepository extends JpaRepository<Profissional, Long> {

	Profissional findById(long id);

	@Query(value="SELECT p FROM Profissional p "
			+ "INNER JOIN p.especializacoes especi WHERE especi.nome_especializacao = :nome_especializacao")
	List<Profissional> findProfissionalPorEspecializacao(@Param("nome_especializacao") String especializacao);
}
