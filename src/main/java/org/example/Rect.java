package org.example;

public class Rect {
    double width;
    double height;

    void setDimens(double width, double height) {
        this.width = width;
        this.height = height;
    }

    double area() {
        return width * height;
    }

    double perimeter() {
        return (width + height) * 2;
    }
}
