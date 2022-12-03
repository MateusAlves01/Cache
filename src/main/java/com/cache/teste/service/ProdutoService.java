package com.cache.teste.service;

import com.cache.teste.entity.Produto;
import com.cache.teste.repository.ProdutoRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class ProdutoService {

    private final ProdutoRepository produtoRepository;

    @Cacheable("protudo-cache")
    public List<Produto> listAll(){
        log.info("c=ProdutoService, m=listAll");
        return produtoRepository.listAll();
    }
}
