package com.br.nava.repository.dao;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.br.nava.repository.ConsultaCepRepository;
import com.br.nava.repository.entity.Transacao;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class TransacaoDao {
	
	@Autowired
	private final ConsultaCepRepository repository;
	
	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public String insertLog(final String cep) {
		Transacao response = repository.save(Transacao.builder().dateTime(LocalDateTime.now().toString()).log(cep).build());
		return response.getDateTime();
	}

}
