package com.devsuperior.dsvendas.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.devsuperior.dsvendas.model.Sale;
import com.devsuperior.dsvendas.model.dto.TaxaDeSucessoDTO;
import com.devsuperior.dsvendas.model.dto.TodasAsVendasEmPorcentagemDTO;

@Repository
public interface SaleRepository extends JpaRepository<Sale, Long>{
	
	@Query("SELECT new com.devsuperior.dsvendas.model.dto.TodasAsVendasEmPorcentagemDTO(sale.seller, SUM(sale.amount)) "
			+ "FROM Sale sale "
			+ "GROUP BY sale.seller")
	public List<TodasAsVendasEmPorcentagemDTO> buscarTodasAsVendasEmPorcentagem();

	@Query("SELECT new com.devsuperior.dsvendas.model.dto.TaxaDeSucessoDTO(sale.seller, SUM(sale.visited), SUM(sale.deals)) "
			+ "FROM Sale sale "
			+ "GROUP BY sale.seller")
	public List<TaxaDeSucessoDTO> buscarTaxaDeSucesso();
	
	
}
