package com.cadastropedserv.cadastroPedidoServico.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cadastropedserv.cadastroPedidoServico.entity.Profissional;

@Repository
public interface ProfissionalRepository extends JpaRepository<Profissional, Long> {
	
	
}
