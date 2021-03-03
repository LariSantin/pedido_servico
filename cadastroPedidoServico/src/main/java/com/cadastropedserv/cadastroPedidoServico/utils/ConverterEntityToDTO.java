package com.cadastropedserv.cadastroPedidoServico.utils;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import com.cadastropedserv.cadastroPedidoServico.dto.PedidoServicoDTO;
import com.cadastropedserv.cadastroPedidoServico.dto.ProfissionalDTO;
import com.cadastropedserv.cadastroPedidoServico.dto.ServicoDTO;
import com.cadastropedserv.cadastroPedidoServico.entity.PedidoServico;
import com.cadastropedserv.cadastroPedidoServico.entity.Profissional;
import com.cadastropedserv.cadastroPedidoServico.entity.Servico;

public class ConverterEntityToDTO {
	
	@Autowired
	private ModelMapper modelMapper;
	  
	public ServicoDTO convertServiceToDto(Servico servico) {
		
	    ServicoDTO servicoDTO = modelMapper.map(servico, ServicoDTO.class);
	    
	    return servicoDTO;
	}
	
	  
	public ProfissionalDTO convertProfessionalToDto(Profissional profissional) {
		
		ProfissionalDTO profissionalDTO = modelMapper.map(profissional, ProfissionalDTO.class);
	    
	    return profissionalDTO;
	}
	
	  
	public PedidoServicoDTO convertOrderServiceToDto(PedidoServico pedidoServico) {
		
	    PedidoServicoDTO pedidoServicoDTO = modelMapper.map(pedidoServico, PedidoServicoDTO.class);
	    
	    return pedidoServicoDTO;
	}
	
}
