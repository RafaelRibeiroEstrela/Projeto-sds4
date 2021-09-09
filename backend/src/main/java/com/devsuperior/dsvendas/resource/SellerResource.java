package com.devsuperior.dsvendas.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dsvendas.model.Seller;
import com.devsuperior.dsvendas.service.SellerService;

@RestController
@RequestMapping("/sellers")
public class SellerResource {
	
	@Autowired
	private SellerService sellerService;
	
	@GetMapping("/all")
	public ResponseEntity<List<Seller>> findAll(){
		return ResponseEntity.ok().body(sellerService.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Seller> findById(@PathVariable Long id){
		return ResponseEntity.ok().body(sellerService.findById(id));
	}

}
