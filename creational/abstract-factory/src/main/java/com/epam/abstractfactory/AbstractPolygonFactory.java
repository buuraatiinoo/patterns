package com.epam.abstractfactory;

public class AbstractPolygonFactory {
    public PolygonFactory getPolygon(int numberOfSides) {
        if (numberOfSides == 3) {
            return new TriangleFactory();
        }
        if (numberOfSides == 4) {
            return new QuadrangleFactory();
        }
        return null;
    }
}
