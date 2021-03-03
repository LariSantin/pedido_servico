package com.cadastropedserv.cadastroPedidoServico.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cadastropedserv.cadastroPedidoServico.dto.ServicoDTO;
import com.cadastropedserv.cadastroPedidoServico.service.ServicoService;

@CrossOrigin
@RestController
@RequestMapping(value="/api")
public class ServicoController {
	
	@Autowired
	private ServicoService servicoService;
	
	@RequestMapping(value = "/servico", method = RequestMethod.GET)
    public List<ServicoDTO> getServicos() {
		return servicoService.getServicos();
	}
	
	@RequestMapping(value = "/servico", method =  RequestMethod.POST)
    public void save(@RequestBody(required= true) ServicoDTO servicoDTO) {
		servicoService.save(servicoDTO);
	}
}
