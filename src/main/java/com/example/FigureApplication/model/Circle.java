package com.example.FigureApplication.model;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.awt.geom.Point2D;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
public class Circle extends Figure{
    private Point2D.Double a;

    @Override
    public void rotate(int degree) {
        a.setLocation(rotatePoint(a, centerPoint, degree));
    }
}
