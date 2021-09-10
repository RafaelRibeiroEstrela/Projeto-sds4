package com.devsuperior.dsvendas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dsvendas.model.Sale;
import com.devsuperior.dsvendas.model.dto.TaxaDeSucessoDTO;
import com.devsuperior.dsvendas.model.dto.TodasAsVendasEmPorcentagemDTO;
import com.devsuperior.dsvendas.repository.SaleRepository;
import com.devsuperior.dsvendas.repository.SellerRepository;

@Service
public class SaleService {
	
	@Autowired
	private SaleRepository saleRepository;
	
	@Autowired
	private SellerRepository sellerRepository;
	
	@Transactional(readOnly = true) //Melhorar o desempenho setando apenas para leitura
	public Page<Sale> find(Pageable pageable){
		
		//Fazer menos buscas no banco de dados
		sellerRepository.findAll();
		return saleRepository.findAll(pageable);
	}
	
	public List<Sale> findAll(){
		return saleRepository.findAll();
	}
	
	public Sale findById(Long id) {
		return saleRepository.findById(id).orElseThrow(() -> new RuntimeException("Object not find by id = " + id));
	}
	
	@Transactional(readOnly = true)
	public List<TodasAsVendasEmPorcentagemDTO> buscarTodasAsVendasEmPorcentagem(){
		return saleRepository.buscarTodasAsVendasEmPorcentagem();
	}
	
	public List<TaxaDeSucessoDTO> buscarTaxaDeSucesso(){
		return saleRepository.buscarTaxaDeSucesso();
	}
	
	

}
