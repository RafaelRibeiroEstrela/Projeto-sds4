package com.devsuperior.dsvendas.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dsvendas.model.Sale;
import com.devsuperior.dsvendas.service.SaleService;

@RestController
@RequestMapping("/sales")
public class SaleResource {
	
	@Autowired
	private SaleService saleService;
	
	@GetMapping
	public ResponseEntity<Page<Sale>> find(Pageable pageable){
		return ResponseEntity.ok().body(saleService.find(pageable));
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<Sale>> findAll(){
		return ResponseEntity.ok().body(saleService.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Sale> findById(@PathVariable Long id){
		return ResponseEntity.ok().body(saleService.findById(id));
	}

}
