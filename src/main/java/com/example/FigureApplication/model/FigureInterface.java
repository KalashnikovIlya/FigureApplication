package com.example.FigureApplication.model;

import java.awt.geom.Point2D;


public interface FigureInterface {

    void rotate(int degree);

    default Point2D rotatePoint(Point2D point, Point2D centerPoint, int degree){
        double radians = Math.toRadians(degree);
        point.setLocation(point.getX() - centerPoint.getX(), point.getY() - centerPoint.getY());
        point.setLocation((point.getX() * Math.cos(radians)) - ((point.getY()) * Math.sin(radians)),(point.getX() * Math.sin(radians)) + ((point.getY()) * Math.cos(radians)));
        point.setLocation(point.getX() + centerPoint.getX(), point.getY() + centerPoint.getY());
        return point;
    }
    default void move(){

    };
    default void resize(){

    };
    default void sqrt(){

    };
}
