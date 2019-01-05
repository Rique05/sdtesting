package com.fhdev.sdtesting;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fhdev.sdtesting.domain.Assunto;
import com.fhdev.sdtesting.domain.Questao;
import com.fhdev.sdtesting.repositories.AssuntoRepository;
import com.fhdev.sdtesting.repositories.QuestaoRepository;

@SpringBootApplication
public class SdtestingApplication implements CommandLineRunner{
	
	@Autowired
	private AssuntoRepository assuntoRepository;
	
	@Autowired
	private QuestaoRepository questaoRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(SdtestingApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	
		//Instâncias de assunto		
		Assunto assunto1 = new Assunto(null, "Legislacao de Transito");
		Assunto assunto2 = new Assunto(null, "Direcao Defensiva");
		
		//Instâncias de Questao
		Questao questao1 = new Questao(null, "Para licenciamento de um veículo em outro Estado deve-se:", assunto1);
		Questao questao2 = new Questao(null, "O candidato poderá habilitar-se na:", assunto1);
		Questao questao3 = new Questao(null, "Dirigindo corretamente, o condutor terá que:", assunto2);
		
		//Adicionando as questões nos assuntos
		assunto1.getQuestoes().addAll(Arrays.asList(questao1, questao2));
		assunto2.getQuestoes().add(questao3);
		
		//Salvando as questões e os assuntos no banco de dados
		assuntoRepository.saveAll(Arrays.asList(assunto1, assunto2));
		questaoRepository.saveAll(Arrays.asList(questao1,questao2,questao3));
		
	}

}

