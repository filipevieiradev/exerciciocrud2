package com.example.exerciciocrud2.controller;

import com.example.exerciciocrud2.entidades.Emprestimo;
import com.example.exerciciocrud2.repositorio.EmprestimoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/emprestimo")
public class EmprestimoController {

    @Autowired
    EmprestimoRepositorio emprestimoRepositorio;

    @PostMapping("/salvar")
    public void salvarEmprestimo(@RequestBody Emprestimo emprestimo){
        emprestimoRepositorio.save(emprestimo);
    }


    @GetMapping("/buscar/{id}")
    public Optional<Emprestimo> buscarporId(@PathVariable Long id){

        return emprestimoRepositorio.findById(id);
    }



}
