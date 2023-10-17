package com.example.exerciciocrud2.repositorio;

import com.example.exerciciocrud2.entidades.Emprestimo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmprestimoRepositorio extends JpaRepository<Emprestimo, Long> {
}
