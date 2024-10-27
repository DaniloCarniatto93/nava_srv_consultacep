package com.br.nava.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import lombok.Getter;

@Getter
@Component
@Configuration
public class NavaConfig {
	
	@Value("${nava.consulta.cep}")
	private String urlConsultaCep;
}
