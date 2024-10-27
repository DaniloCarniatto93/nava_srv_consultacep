package com.br.nava.repository.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@Table(name = "tlog")
@Entity
@AllArgsConstructor
@NoArgsConstructor(force = true)
public class Transacao implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8956239011811571628L;

	
	@Id
	@Column(name="dateTime")
	private String dateTime;
	
	@Column(name="log")
	private String log;

}
