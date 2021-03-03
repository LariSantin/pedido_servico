package com.cadastropedserv.cadastroPedidoServico.utils;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import com.cadastropedserv.cadastroPedidoServico.dto.PedidoServicoDTO;
import com.cadastropedserv.cadastroPedidoServico.dto.ProfissionalDTO;
import com.cadastropedserv.cadastroPedidoServico.dto.ServicoDTO;
import com.cadastropedserv.cadastroPedidoServico.entity.PedidoServico;
import com.cadastropedserv.cadastroPedidoServico.entity.Profissional;
import com.cadastropedserv.cadastroPedidoServico.entity.Servico;

public class ConverterDTOToEntity {
	
	@Autowired
	private ModelMapper modelMapper;
	  
	public Servico convertDTOToService(ServicoDTO servioDTO) {
		
	    Servico servico = modelMapper.map(servioDTO, Servico.class);
	    
	    return servico;
	}
	
	  
	public Profissional convertDTOToProfessional(ProfissionalDTO profissionalDTO) {
		
		Profissional profissional = modelMapper.map(profissionalDTO, Profissional.class);
	    
	    return profissional;
	}
	
	  
	public PedidoServico convertDTOToOrderService(PedidoServicoDTO pedidoServicoDTO) {
	
		PedidoServico pedidoServico = modelMapper.map(pedidoServicoDTO, PedidoServico.class);
	    
	    return pedidoServico;
	}
	
}
