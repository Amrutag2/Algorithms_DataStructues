package Algorithms;

import java.util.ArrayList;
import java.util.List;

// Class to represent a point in 2D space
class Point1 {
    double x, y;

    // Constructor to initialize the x and y values of a point
    public Point1(double x, double y) {
        this.x = x;
        this.y = y;
    }
}

class Algo_37_RayCasting {
    // Checking if a point lies inside a polygon
    public static boolean pointInPolygon(Point1 point, List<Point1> polygon) {

        // Total number of vertices in the polygon
        int numVertices = polygon.size();

        // X and Y coordinates of the point
        double x = point.x, y = point.y;

        // Flag to store if the point is inside the polygon or not
        boolean inside = false;

        // First vertex of the polygon
        Point1 p1 = polygon.get(0);

        // Loop through each vertex in the polygon
        for (int i = 1; i <= numVertices; i++) {
            Point1 p2 = polygon.get(i % numVertices); // Current vertex

            // Check if the point is below the lower edge of the polygon
            if (y > Math.min(p1.y, p2.y)) {

                // Check if the point is above the upper edge of the polygon
                if (y <= Math.max(p1.y, p2.y)) {

                    // Check if the point is on the left of the polygon
                    if (x <= Math.max(p1.x, p2.x)) {

                       /*
                       Calculate the intersection of the line passing through
                       the two vertices and the horizontal line passing through the point
                       */
                        double xIntersection = (y - p1.y) * (p2.x - p1.x) / (p2.y - p1.y) + p1.x;

                        // Check if the line passes through the point or if the two vertices are at the same x-coordinate
                        if (p1.x == p2.x || x <= xIntersection) {

                            // Flip the inside flag
                            inside = !inside;
                        }
                    }
                }
            }

            // Set the current vertex as the previous vertex for the next iteration
            p1 = p2;
        }

        // Return the inside flag as the result
        return inside;
    }

    public static void main(String[] args) {
        Point1 point = new Point1(3, 3);

        // Create a polygon as a list of points
        List<Point1> polygon = new ArrayList<Point1>();
        polygon.add(new Point1(0, 0));
        polygon.add(new Point1(4, 0));
        polygon.add(new Point1(4, 4));
        polygon.add(new Point1(0, 4));

        // Check if the point lies inside the polygon
        if (pointInPolygon(point, polygon)) {
            System.out.println("Point is inside the polygon");
        } else {
            System.out.println("Point is outside the polygon");
        }
    }
}

