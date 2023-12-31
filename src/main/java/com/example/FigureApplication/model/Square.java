package com.example.FigureApplication.model;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.awt.geom.Point2D;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
public class Square extends Figure {
    private Point2D.Double a, b, c, d;

    @Override
    public void rotate(int degree) {
        a.setLocation(rotatePoint(a, centerPoint, degree));
        b.setLocation(rotatePoint(b, centerPoint, degree));
        c.setLocation(rotatePoint(c, centerPoint, degree));
        d.setLocation(rotatePoint(d, centerPoint, degree));
    }
}
