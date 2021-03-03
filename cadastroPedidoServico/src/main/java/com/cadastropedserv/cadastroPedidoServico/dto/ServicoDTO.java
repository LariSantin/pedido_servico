package com.cadastropedserv.cadastroPedidoServico.dto;

import java.math.BigDecimal;

public class ServicoDTO {
	
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
