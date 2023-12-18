package com.example.FigureApplication.model;

import java.awt.*;

public interface FigureInterface {

    void rotate(int degree);

    default Point rotatePoint(Point point, Point centerPoint, int degree){
        double radians = Math.toRadians(degree);
        point.move(point.x - centerPoint.x, point.y - centerPoint.y);
        point.move((int) ((point.x * Math.cos(radians)) - ((point.y) * Math.sin(radians))), (int) ((point.x * Math.sin(radians)) + ((point.y) * Math.cos(radians))));
        point.move(point.x + centerPoint.x, point.y + centerPoint.y);
        return point;
    }
    default void move(){

    };
    default void resize(){

    };
    default void sqrt(){

    };
}
