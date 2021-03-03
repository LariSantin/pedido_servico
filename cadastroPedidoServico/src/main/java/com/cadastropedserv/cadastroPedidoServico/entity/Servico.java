package com.cadastropedserv.cadastroPedidoServico.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Servico implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idService;
	
	private String name;
	
	private BigDecimal valueHour;

	public Long getIdService() {
		return idService;
	}

	public void setIdService(Long idService) {
		this.idService = idService;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getValueHour() {
		return valueHour;
	}

	public void setValueHour(BigDecimal valueHour) {
		this.valueHour = valueHour;
	}
	
}
