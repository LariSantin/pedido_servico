package com.cadastropedserv.cadastroPedidoServico.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cadastropedserv.cadastroPedidoServico.entity.PedidoServico;

@Repository
public interface PedidoServicoRepository extends JpaRepository<PedidoServico, Long> {
	
	
}
