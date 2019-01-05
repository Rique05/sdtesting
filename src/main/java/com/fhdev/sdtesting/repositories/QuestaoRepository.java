package com.fhdev.sdtesting.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fhdev.sdtesting.domain.Questao;

@Repository
public interface QuestaoRepository extends JpaRepository<Questao, Integer> {

}
