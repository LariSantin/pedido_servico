package com.cadastropedserv.cadastroPedidoServico.dto;

import java.math.BigDecimal;

public class PedidoServicoDTO {
	
	private Long idOrderService;
	
	private ServicoDTO service;
	
	private BigDecimal quantityHour;
	
	private ProfissionalDTO professional;
	
	private BigDecimal percentageTax;

	public Long getIdOrderService() {
		return idOrderService;
	}

	public void setIdOrderService(Long idOrderService) {
		this.idOrderService = idOrderService;
	}

	public ServicoDTO getService() {
		return service;
	}

	public void setService(ServicoDTO service) {
		this.service = service;
	}

	public BigDecimal getQuantityHour() {
		return quantityHour;
	}

	public void setQuantityHour(BigDecimal quantityHour) {
		this.quantityHour = quantityHour;
	}

	public ProfissionalDTO getProfessional() {
		return professional;
	}

	public void setProfessional(ProfissionalDTO professional) {
		this.professional = professional;
	}

	public BigDecimal getPercentageTax() {
		return percentageTax;
	}

	public void setPercentageTax(BigDecimal percentageTax) {
		this.percentageTax = percentageTax;
	}
}
