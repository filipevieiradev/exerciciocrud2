package com.example.exerciciocrud2.controller;

import com.example.exerciciocrud2.entidades.Livro;
import com.example.exerciciocrud2.repositorio.LivroRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/livro")
public class LivroController {

    @Autowired
    LivroRepositorio livroRepositorio;

    @PostMapping("/salvar")
    public void salvarLivro(@RequestBody Livro livro){

        livroRepositorio.save(livro);
    }

    @GetMapping("/buscar/{id}")
    public Optional<Livro> buscarporId(@PathVariable Long id){

        return livroRepositorio.findById(id);
    }


}
