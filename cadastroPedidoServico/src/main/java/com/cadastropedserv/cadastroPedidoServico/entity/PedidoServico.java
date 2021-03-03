package com.cadastropedserv.cadastroPedidoServico.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class PedidoServico implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idOrderService;
	
	@ManyToOne
	private Servico service;
	
	private BigDecimal quantityHour;
	
	@ManyToOne
	private Profissional professional;
	
	private BigDecimal percentageTax;

	public Long getIdOrderService() {
		return idOrderService;
	}

	public void setIdOrderService(Long idOrderService) {
		this.idOrderService = idOrderService;
	}

	public Servico getService() {
		return service;
	}

	public void setService(Servico service) {
		this.service = service;
	}

	public BigDecimal getQuantityHour() {
		return quantityHour;
	}

	public void setQuantityHour(BigDecimal quantityHour) {
		this.quantityHour = quantityHour;
	}

	public Profissional getProfessional() {
		return professional;
	}

	public void setProfessional(Profissional professional) {
		this.professional = professional;
	}

	public BigDecimal getPercentageTax() {
		return percentageTax;
	}

	public void setPercentageTax(BigDecimal percentageTax) {
		this.percentageTax = percentageTax;
	}
}
