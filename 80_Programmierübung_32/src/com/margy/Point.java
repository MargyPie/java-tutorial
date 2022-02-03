package com.margy;
//You have to represent a point in 2D space. Write a class with the name Point.
// The class needs two fields (instance variables) with name x and y of type int.
//The class needs to have two constructors. The first constructor does not have any parameters.
// The second constructor has parameters x and y of type int and it needs to initialize the fields.
//* Method named distance without any parameters, it needs to return the distance between this Point and Point 0,0 as double.
//* Method named distance with two parameters x, y both of type int, it needs to return the distance between this Point and Point x,y as double.
//* Method named distance with parameter another of type Point, it needs to return the distance between this Point and another Point as double.
//How to find the distance between two points? To find a distance between points A(xA,yA) and B(xB,yB), we use the formula:
//d(A,B)=√ (xB − xA) * (xB - xA) + (yB − yA) * (yB - yA)
//Where √ represents square root.
//NOTE: Use Math.sqrt to calculate the square root √.
//NOTE: In total, you have to write 7 methods.
public class Point {
    private int x;
    private int y;

    public Point() {}

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
        return Math.sqrt((getX() - 0.0) * ( getX() - 0)  + (getY() - 0) * (getY() - 0));

    }

    public double distance(int x, int y) {
        return Math.sqrt( (getX() - x) * ( getX() - x)  + (getY() - y) * (getY() - y));

    }

    public double distance(Point another) {
        return Math.sqrt( (getX() - another.getX()) * ( getX() - another.getX())  + (getY() - another.getY() ) * (getY() - another.getY()));
    }
}
