package com.alura.literaluraChallenge.literalura.repository;

import com.alura.literaluraChallenge.literalura.model.Autor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AutorRepository extends JpaRepository<Autor,Long> {
}
