package com.example.RPSKursovik.repositories;

import com.example.RPSKursovik.models.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<Image, Long> {
}
