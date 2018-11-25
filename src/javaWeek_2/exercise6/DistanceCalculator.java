package javaWeek_2.exercise6;

public class DistanceCalculator {

    public void calculateDistance() {
        CoordinateGatherer coordinateGatherer = new CoordinateGatherer();

        Coordinate pointA = coordinateGatherer.gatherCoordinate();
        Coordinate pointB = coordinateGatherer.gatherCoordinate();
        Double radius = 6371.01;

        //distance = radius * arccos(sin(x1) * sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2))

        Double distance = radius * Math.acos(Math.sin(pointA.getLatitude()) * Math.sin(pointB.getLatitude()) +
                Math.cos(pointA.getLatitude()) * Math.cos(pointB.getLatitude()) * Math.cos(pointA.getLongitude() - pointB.getLongitude()));
        System.out.println("(calculating...)");
        System.out.println("The distance between those points is: " + distance + " km.");
    }
}
