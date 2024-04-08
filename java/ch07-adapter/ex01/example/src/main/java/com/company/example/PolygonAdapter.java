package com.company.example;

import com.library.Polygon;
import com.library.Point;

import java.util.List;
import java.util.ArrayList;

// tag::source[]
public class PolygonAdapter extends Polygon {
    private Polyline polyline;

    public PolygonAdapter(Polyline polyline) {
        this.polyline = polyline;
    }

    public int getCount() {
        return polyline.getCount();
    }

    public Point getCoordinate(int index) {
        Coordinate coordinate = polyline.getCoordinate(index);
        Point point = new Point();
        point.setX(coordinate.getLongitude());
        point.setY(coordinate.getLatitude());
        return point;
    }
}
// end::source[]