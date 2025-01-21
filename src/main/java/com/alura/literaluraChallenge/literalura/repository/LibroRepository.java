package com.alura.literaluraChallenge.literalura.repository;

import com.alura.literaluraChallenge.literalura.model.Libro;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LibroRepository extends JpaRepository<Libro,Long> {
    List<Libro> findByTituloContainingIgnoreCase(String titulo);
}
