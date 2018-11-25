package javaWeek_2.exercise6;

import java.util.Scanner;

public class CoordinateGatherer {

    Scanner scanner = new Scanner(System.in);

    public Coordinate gatherCoordinate() {
        Scanner scanner = new Scanner(System.in);
        Double latitude = askLatitude();
        Double longitude = askLongitude();
        Coordinate coordinate = new Coordinate(latitude, longitude);
        return coordinate;
    }

    public Double askLatitude() {
        System.out.println("Write the latitude of the coordinate: ");
        Double latitude = scanner.nextDouble();
        return Math.toRadians(latitude);
    }
    public Double askLongitude() {
        System.out.println("Write the longitude of the coordinate: ");
        Double longitude = scanner.nextDouble();
        return Math.toRadians(longitude);
    }
}
