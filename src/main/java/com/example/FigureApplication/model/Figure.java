package com.example.FigureApplication.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.awt.*;
import java.util.ArrayList;

@Entity
@Data
public abstract class Figure implements FigureInterface{
    @Id
    @Column(unique = true)
    private String name;
    protected Point centerPoint;
}
