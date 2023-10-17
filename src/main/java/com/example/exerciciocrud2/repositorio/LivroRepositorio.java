package com.example.exerciciocrud2.repositorio;

import com.example.exerciciocrud2.entidades.Livro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LivroRepositorio extends JpaRepository<Livro, Long> {
}
