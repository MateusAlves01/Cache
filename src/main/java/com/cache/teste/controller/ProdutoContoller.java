package com.cache.teste.controller;

import com.cache.teste.entity.Produto;
import com.cache.teste.service.ProdutoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/produtos")
@RequiredArgsConstructor
@Slf4j
public class ProdutoContoller {

    private final ProdutoService produtoService;

    @GetMapping
    public List<Produto> listAll(){
        log.info("c=ProdutoController, m=listAll");
        return produtoService.listAll();
    }

}
