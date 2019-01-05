package com.fhdev.sdtesting.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fhdev.sdtesting.domain.Assunto;

@Repository
public interface AssuntoRepository extends JpaRepository<Assunto, Integer>{

}
