package com.profissionais.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.profissionais.apirest.model.Profissionais;

public interface ProfissionalRepository extends JpaRepository<Profissionais, Long>{

	Profissionais findById(long id);
}
