package com.cadastropedserv.cadastroPedidoServico.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cadastropedserv.cadastroPedidoServico.dto.ServicoDTO;
import com.cadastropedserv.cadastroPedidoServico.entity.Servico;
import com.cadastropedserv.cadastroPedidoServico.repository.ServicoRepository;
import com.cadastropedserv.cadastroPedidoServico.utils.ConverterDTOToEntity;
import com.cadastropedserv.cadastroPedidoServico.utils.ConverterEntityToDTO;

@Service
public class ServicoService {
	
	@Autowired
	private ServicoRepository servicoRepository;
	
	public List<ServicoDTO> getServicos() {
		
		ConverterEntityToDTO converterEntityToDTO = new ConverterEntityToDTO();
		
		List<ServicoDTO> servicosDTO = new ArrayList<>();
		
		List<Servico> listServicos = servicoRepository.findAll();
				
		for (Servico servico : listServicos) {
			ServicoDTO servicoDTO = converterEntityToDTO.convertServiceToDto(servico);
			
			servicosDTO.add(servicoDTO);			
		}
		return servicosDTO;
	}
	
	public void save(ServicoDTO servicoDTO) {
		ConverterDTOToEntity converterDTOToEntity = new ConverterDTOToEntity();
		
		Servico servico = converterDTOToEntity.convertDTOToService(servicoDTO);
		
		if(servico != null) {
			servicoRepository.save(servico);			
		}
	}
	
}
