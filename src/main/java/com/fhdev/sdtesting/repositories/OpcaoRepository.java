package com.fhdev.sdtesting.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fhdev.sdtesting.domain.Opcao;

@Repository
public interface OpcaoRepository extends JpaRepository<Opcao, Integer>{

}
