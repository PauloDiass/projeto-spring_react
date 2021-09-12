package com.springreact.dsvendas.services;

import com.springreact.dsvendas.dto.SellerDTO;
import com.springreact.dsvendas.entities.Seller;
import com.springreact.dsvendas.repositories.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SellerService {

    @Autowired
    private SellerRepository sellerRepository;

    public List<SellerDTO> findAll(){
        List<Seller> result =  sellerRepository.findAll();
        return result.stream().map(seller -> new SellerDTO(seller)).collect(Collectors.toList());
    }
}
