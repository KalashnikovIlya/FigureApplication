package com.example.FigureApplication.controller;

import com.example.FigureApplication.model.*;
import com.example.FigureApplication.service.FigureService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/figures")
public class FigureController {

    private final FigureService service;

    public FigureController(FigureService service) {
        this.service = service;
    }

    @GetMapping
    public List<Figure> allFigures() {
        return service.allFigures();
    }

    @PostMapping("save_square")
    public Figure saveFigure(@RequestBody Square square) {
        return service.saveFigure(square);
    }

    @PostMapping("save_triangle")
    public Figure saveFigure(@RequestBody Triangle triangle) {
        return service.saveFigure(triangle);
    }

    @PostMapping("save_circle")
    public Figure saveFigure(@RequestBody Circle circle) {
        return service.saveFigure(circle);
    }

    @PostMapping("save_hexagon")
    public Figure saveFigure(@RequestBody Hexagon hexagon) {
        return service.saveFigure(hexagon);
    }

    @GetMapping("/{name}")
    public Figure findFigure(@PathVariable String name) {
        return service.findByName(name);
    }

    @DeleteMapping("delete_figure/{name}")
    public void deleteFigure(@PathVariable String name) {
        service.deleteFigure(name);
    }

    @PostMapping("rotate/{name}")
    public void rotate(@PathVariable String name) {
        service.rotateFigure(name, 90);
    }

}
