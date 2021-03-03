package com.cadastropedserv.cadastroPedidoServico.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cadastropedserv.cadastroPedidoServico.dto.PedidoServicoDTO;
import com.cadastropedserv.cadastroPedidoServico.entity.PedidoServico;
import com.cadastropedserv.cadastroPedidoServico.repository.PedidoServicoRepository;
import com.cadastropedserv.cadastroPedidoServico.utils.ConverterDTOToEntity;
import com.cadastropedserv.cadastroPedidoServico.utils.ConverterEntityToDTO;

@Service
public class PedidoServicoService {	
	
	@Autowired
	private PedidoServicoRepository orderServiceRepository;
	
	public List<PedidoServicoDTO> getOrderService() {
		ConverterEntityToDTO converterEntityToDTO = new ConverterEntityToDTO();
		
		List<PedidoServicoDTO> pedidoServicosDTO = new ArrayList<>();
		
		List<PedidoServico> listPedidoServicos = orderServiceRepository.findAll();
				
		for (PedidoServico pedidoServico : listPedidoServicos) {
			PedidoServicoDTO pedidoServicoDTO = converterEntityToDTO.convertOrderServiceToDto(pedidoServico);
			
			pedidoServicosDTO.add(pedidoServicoDTO);			
		}
		return pedidoServicosDTO;
	}
	
	public void save(PedidoServicoDTO pedidoServicoDTO) {
		ConverterDTOToEntity converterDTOToEntity = new ConverterDTOToEntity();
		
		PedidoServico pedidoServico = converterDTOToEntity.convertDTOToOrderService(pedidoServicoDTO);
		
		if(pedidoServico != null) {
			orderServiceRepository.save(pedidoServico);			
		}
	}

}
