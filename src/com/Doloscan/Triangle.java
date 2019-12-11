package com.Doloscan;

public class Triangle {

    int p1, p2, p3;

    void determineType() {
        if ((p1 == p2 && p2 != p3) || (p1 != p2 && p3 == p1) || (p3 == p2 && p3 != p1)) {
            System.out.println("Isosceles");
        } else if (p1 != p2 && p2 != p3 && p3 != p1) {
            System.out.println("Scalene");
        } else if (p1 == p2 && p2 == p3) {
            System.out.println("Equilateral");


        }


    }}