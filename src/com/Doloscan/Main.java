package com.Doloscan;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Triangle triangle = new Triangle();

        Scanner scr = new Scanner(System.in);
        System.out.print("P1: ");
        triangle.p1 = scr.nextInt();
        System.out.print("P2: ");
        triangle.p2 = scr.nextInt();
        System.out.print("P3: ");
        triangle.p3 = scr.nextInt();

        triangle.determineType();
    }
}
