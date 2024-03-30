package org.example;

public class UpgradedTriangle {
    public static String classifyTriangle(int a, int b, int c) {
        if (a + b > c && b + c > a && a + c > b && a > 0 && b > 0 && c > 0) {
            if (a == b && b == c) {
                return "EQUILATERAL";
            }
            else if (a == b || b == c || a == c) {
                return "ISOSCELES";
            }
            else {
                return "SCALENE";
            }
        } else {
            return "INVALID";
        }
    }

    public static double calculateArea(int a, int b, int c) {
        if (a + b > c && b + c > a && a + c > b && a > 0 && b > 0 && c > 0) {
            double s = (a + b + c) / 2.0;
            double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
            return area;
        } else {
            return 0.0;
        }
    }
}
