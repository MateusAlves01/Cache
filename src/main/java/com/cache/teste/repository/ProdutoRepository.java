package com.cache.teste.repository;

import com.cache.teste.entity.Produto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.List;

@Component
@Slf4j
public class ProdutoRepository {

    public List<Produto> listAll(){
        log.info("c=ProdutoRepository, m=listAll");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        final Produto produto1 = Produto.builder()
                .sku("produto1")
                .preco(new BigDecimal(10))
                .descricao("PROMO1")
                .build();
        final Produto produto2 = Produto.builder()
                .sku("produto2")
                .preco(new BigDecimal(20))
                .descricao("PROMO20")
                .build();

        List<Produto> produtos = List.of(produto1, produto2);
        return produtos;
    }
}
