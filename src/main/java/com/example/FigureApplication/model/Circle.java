package com.example.FigureApplication.model;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
public class Circle extends Figure{
    private Point a;

    @Override
    public void rotate(int degree) {
        a.setLocation(rotatePoint(a, centerPoint, degree));
    }
}
