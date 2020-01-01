package com.epam.abstractfactory;

public class TriangleFactory implements PolygonFactory {
    @Override
    public Polygon createPolygon() {
        return new Triangle();
    }
}
