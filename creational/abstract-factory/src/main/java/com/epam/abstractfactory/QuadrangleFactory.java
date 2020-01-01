package com.epam.abstractfactory;

public class QuadrangleFactory implements PolygonFactory {
    @Override
    public Polygon createPolygon() {
        return new Quadrangle();
    }
}
