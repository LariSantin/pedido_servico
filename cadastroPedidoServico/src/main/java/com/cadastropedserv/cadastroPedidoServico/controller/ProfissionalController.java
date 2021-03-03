package com.cadastropedserv.cadastroPedidoServico.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cadastropedserv.cadastroPedidoServico.dto.ProfissionalDTO;
import com.cadastropedserv.cadastroPedidoServico.service.ProfissionalService;

@CrossOrigin
@RestController
@RequestMapping(value="/api")
public class ProfissionalController {

	@Autowired
	private ProfissionalService profissionalService;
	
	@RequestMapping(value = "/profissional", method = RequestMethod.GET)
    public List<ProfissionalDTO> getProfissionais() {
		return profissionalService.getProfissional();
	}
	
	@RequestMapping(value = "/profissional", method =  RequestMethod.POST)
    public void save(@RequestBody(required= true) ProfissionalDTO profissionalDTO) {
		profissionalService.save(profissionalDTO);
	}
	
}
