package com.company.example;

import java.util.List;
import java.util.ArrayList;

import com.library.VertexCalculator;


// tag::source[]
public class Application {
    private Polyline polyline;

    public Application() {
        polyline = new Polyline();
        polyline.addCoordinate(new Coordinate(0,2));
        polyline.addCoordinate(new Coordinate(3,5));
        polyline.addCoordinate(new Coordinate(7,4));
    }

    public int calculateCornerCount() {
        return VertexCalculator.countVertices(new PolygonAdapter(polyline));
    }
}
// end::source[]