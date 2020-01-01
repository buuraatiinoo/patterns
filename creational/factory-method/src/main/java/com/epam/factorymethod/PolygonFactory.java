package com.epam.factorymethod;

public class PolygonFactory {
    public Polygon getPolygon(int numberOfSides) {
        if (numberOfSides == 3) {
            return new Triangle();
        }
        if (numberOfSides == 4) {
            return new Quadrangle();
        }
        return null;
    }
}
