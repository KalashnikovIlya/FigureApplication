package com.example.FigureApplication.repository;

import com.example.FigureApplication.model.Figure;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FigureRepository extends JpaRepository <Figure, Long> {
    void deleteByName(String name);
    Figure findFigureByName(String name);

}
