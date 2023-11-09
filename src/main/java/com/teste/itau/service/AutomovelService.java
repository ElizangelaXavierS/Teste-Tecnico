package com.teste.itau.service;

import com.teste.itau.model.Automovel;
import com.teste.itau.repository.AutomovelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutomovelService {
    @Autowired
    private AutomovelRepository automovelRepository;
    public Automovel cadastrar(Automovel automovel){
        return automovelRepository.save(automovel);
    }

    public List<Automovel> buscar (){
        return automovelRepository.findAll();
    }
}
