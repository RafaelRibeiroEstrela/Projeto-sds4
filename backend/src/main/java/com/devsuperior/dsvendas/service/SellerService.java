package com.devsuperior.dsvendas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.dsvendas.model.Seller;
import com.devsuperior.dsvendas.repository.SellerRepository;

@Service
public class SellerService {
	
	@Autowired
	private SellerRepository sellerRepository;
	
	public List<Seller> findAll(){
		return sellerRepository.findAll();
	}
	
	public Seller findById(Long id) {
		return sellerRepository.findById(id).orElseThrow(() -> new RuntimeException("Object not found by id = " + id));
	}

}
