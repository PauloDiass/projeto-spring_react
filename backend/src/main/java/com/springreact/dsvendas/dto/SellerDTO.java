package com.springreact.dsvendas.dto;

import com.springreact.dsvendas.entities.Seller;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SellerDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    private String name;

    public SellerDTO(Seller entity){
        id = entity.getId();
        name = entity.getName();
    }
}
