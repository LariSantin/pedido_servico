package com.cadastropedserv.cadastroPedidoServico.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cadastropedserv.cadastroPedidoServico.dto.PedidoServicoDTO;
import com.cadastropedserv.cadastroPedidoServico.service.PedidoServicoService;

@CrossOrigin
@RestController
@RequestMapping(value="/api")
public class PedidoServicoController {	
	
	@Autowired
	private PedidoServicoService pedidoServicoService;
	
	@RequestMapping(value = "/pedidoservico", method = RequestMethod.GET)
    public List<PedidoServicoDTO> getPedidosServico() {
		return pedidoServicoService.getOrderService();
	}
	
	@RequestMapping(value = "/pedidoservico", method =  RequestMethod.POST)
    public void save(@RequestBody(required= true) PedidoServicoDTO pedidoServicoDTO) {
		pedidoServicoService.save(pedidoServicoDTO);
	}	

}
