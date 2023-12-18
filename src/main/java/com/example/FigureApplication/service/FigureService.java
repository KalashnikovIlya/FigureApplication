package com.example.FigureApplication.service;

import com.example.FigureApplication.model.Figure;
import com.example.FigureApplication.repository.FigureRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@AllArgsConstructor
public class FigureService {

    private final FigureRepository repository;

    public List<Figure> allFigures() {
        return repository.findAll();
    }

    public Figure saveFigure(Figure figure) {
        return repository.save(figure);
    }

    public Figure findByName(String name) {
        return repository.findFigureByName(name);
    }

    @Transactional
    public void deleteFigure(String name) {
        repository.deleteByName(name);
    }

    public void rotateFigure(String name, int degree) {
        Figure figure = repository.findFigureByName(name);
        figure.rotate(degree);
        repository.save(figure);
    }

}
