package com.calculoFreteapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.calculoFreteapi.model.CadastroFrete;

@Repository
public interface CadastroRepository extends JpaRepository<CadastroFrete, Long> {

}
