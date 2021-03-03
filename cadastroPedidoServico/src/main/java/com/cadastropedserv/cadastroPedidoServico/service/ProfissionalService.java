package com.cadastropedserv.cadastroPedidoServico.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cadastropedserv.cadastroPedidoServico.dto.ProfissionalDTO;
import com.cadastropedserv.cadastroPedidoServico.entity.Profissional;
import com.cadastropedserv.cadastroPedidoServico.repository.ProfissionalRepository;
import com.cadastropedserv.cadastroPedidoServico.utils.ConverterDTOToEntity;
import com.cadastropedserv.cadastroPedidoServico.utils.ConverterEntityToDTO;

@Service
public class ProfissionalService {
	
	@Autowired
	private ProfissionalRepository profissionalRepository;
	
	public List<ProfissionalDTO> getProfissional() {
		ConverterEntityToDTO converterEntityToDTO = new ConverterEntityToDTO();
		
		List<ProfissionalDTO> profissionalDTOs = new ArrayList<>();
		
		List<Profissional> listProfissionais = profissionalRepository.findAll();
				
		for (Profissional profissional : listProfissionais) {
			ProfissionalDTO profissionalDTO = 
					converterEntityToDTO.convertProfessionalToDto(profissional);
			
			profissionalDTOs.add(profissionalDTO);			
		}
		return profissionalDTOs;
	}
	
	public void save(ProfissionalDTO profissionalDTO) {
		ConverterDTOToEntity converterDTOToEntity = new ConverterDTOToEntity();
		
		Profissional profissional = converterDTOToEntity.convertDTOToProfessional(profissionalDTO);
		
		if(profissional != null) {
			profissionalRepository.save(profissional);			
		}
	}
	
}
