package com.cadastropedserv.cadastroPedidoServico.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Profissional implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idProfessional;
	
	private String name;

	public Long getIdProfessional() {
		return idProfessional;
	}

	public void setIdProfessional(Long idProfessional) {
		this.idProfessional = idProfessional;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}	
}
