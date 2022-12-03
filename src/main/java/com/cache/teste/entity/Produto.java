package com.cache.teste.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;

@Builder
@Getter
@Setter
public class Produto implements Serializable {

    private String sku;
    private BigDecimal preco;
    private String descricao;
}
