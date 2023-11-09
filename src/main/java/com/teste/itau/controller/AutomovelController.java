package com.teste.itau.controller;

import com.teste.itau.model.Automovel;
import com.teste.itau.service.AutomovelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/automovel")

public class AutomovelController {
    @Autowired
    private AutomovelService automovelService;
    @PostMapping
    public ResponseEntity<Automovel> cadastrar (@RequestBody Automovel automovel){
        Automovel response = automovelService.cadastrar(automovel);
        return ResponseEntity.status(201).body(response);
    }

    @GetMapping
    public ResponseEntity<List<Automovel>> buscar(){
        List<Automovel> response = automovelService.buscar();
        return ResponseEntity.ok(response);
    }
}
