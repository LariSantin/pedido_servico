package com.cadastropedserv.cadastroPedidoServico.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cadastropedserv.cadastroPedidoServico.entity.Servico;

@Repository
public interface ServicoRepository extends JpaRepository<Servico, Long> {
	
	
}
