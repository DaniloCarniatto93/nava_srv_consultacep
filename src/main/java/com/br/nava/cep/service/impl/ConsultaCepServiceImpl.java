package com.br.nava.cep.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.br.nava.cep.service.ConsultaCepService;
import com.br.nava.config.NavaConfig;
import com.br.nava.dto.Cep;

import lombok.AllArgsConstructor;

//@Slf4j
@Service
@AllArgsConstructor
public class ConsultaCepServiceImpl implements ConsultaCepService {

	@Autowired
	private RestTemplate restTemplate;

	private final NavaConfig navaConfig;

	@Override
	public Cep consultaCep(String cep) {

		final HttpHeaders headers = new HttpHeaders();
		headers.add("cep", cep);

		HttpEntity<String> entity = new HttpEntity<>("", headers);
		try {
			final ResponseEntity<Cep> response = restTemplate.exchange(navaConfig.getUrlConsultaCep(), HttpMethod.GET,
					entity, Cep.class);

			return response.getBody();
		} catch (Exception e) {
			final Cep cepNovo = new Cep();
			return new ResponseEntity<>(cepNovo, HttpStatus.OK).getBody();
		}
	}

}
