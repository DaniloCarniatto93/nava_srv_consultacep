package com.br.nava.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.nava.cep.service.ConsultaCepService;
import com.br.nava.dto.Cep;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/ms/")
public class ConsultaCepController {

	private final ConsultaCepService consultaCepService;

	@GetMapping("consulta-cep")
	private Cep consultacep(
		 @RequestHeader("cep") final String cep) {

		return consultaCepService.consultaCep(cep);
	}
}
