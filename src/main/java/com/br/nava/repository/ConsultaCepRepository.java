package com.br.nava.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.br.nava.repository.entity.Transacao;

@Repository
public interface ConsultaCepRepository extends JpaRepository<Transacao, String> {

	Transacao save(String cep);
}
