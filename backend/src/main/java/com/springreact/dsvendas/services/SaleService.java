package com.springreact.dsvendas.services;

import com.springreact.dsvendas.dto.SaleDTO;
import com.springreact.dsvendas.entities.Sale;
import com.springreact.dsvendas.repositories.SaleRepository;
import com.springreact.dsvendas.repositories.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class SaleService {

    @Autowired
    private SaleRepository saleRepository;

    @Autowired
    private SellerRepository sellerRepository;

    @Transactional(readOnly = true)
    public Page<SaleDTO> findAll(Pageable pageable){
        sellerRepository.findAll();
        Page<Sale> result =  saleRepository.findAll(pageable);
        return result.map(sale -> new SaleDTO(sale));
    }
}