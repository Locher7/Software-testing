package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestUpgradedTriangle {

    @Test
    public void testClassifyTriangle1() {
        //边长为0
        assertEquals("INVALID", UpgradedTriangle.classifyTriangle(0, 0, 0));
        System.out.println("testClassifyTriangle1: Success!");
    }
    @Test
    public void testClassifyTriangle2() {
        //边长为负
        assertEquals("INVALID", UpgradedTriangle.classifyTriangle(-5, -5, -5));
        System.out.println("testClassifyTriangle2: Success!");
    }
    @Test
    public void testClassifyTriangle3() {
        //边长有正有负
        assertEquals("INVALID", UpgradedTriangle.classifyTriangle(-5, 0, 5));
        System.out.println("testClassifyTriangle3: Success!");
    }
    @Test
    public void testClassifyTriangle4() {
        //两边之和不大于第三边
        assertEquals("INVALID", UpgradedTriangle.classifyTriangle(1, 2, 3));
        System.out.println("testClassifyTriangle4: Success!");
    }
    @Test
    public void testClassifyTriangle5() {
        //等腰三角形
        assertEquals("ISOSCELES", UpgradedTriangle.classifyTriangle(5, 4, 5));
        System.out.println("testClassifyTriangle5: Success!");
    }
    @Test
    public void testClassifyTriangle6() {
        //等边三角形
        assertEquals("EQUILATERAL", UpgradedTriangle.classifyTriangle(5, 5, 5));
        System.out.println("testClassifyTriangle6: Success!");
    }
    @Test
    public void testClassifyTriangle7() {
        //普通三角形
        assertEquals("SCALENE", UpgradedTriangle.classifyTriangle(2, 3, 4));
        System.out.println("testClassifyTriangle7: Success!");
    }
    @Test
    public void testClassifyTriangle8() {
        //直角三角形
        assertEquals("SCALENE", UpgradedTriangle.classifyTriangle(3, 4, 5));
        System.out.println("testClassifyTriangle8: Success!");
    }
    @Test
    public void testClassifyTriangle9() {
        //边长长度逆序三角形
        assertEquals("SCALENE", UpgradedTriangle.classifyTriangle(4, 3, 2));
        System.out.println("testClassifyTriangle9: Success!");
    }
    @Test
    //小边长三角形
    public void testClassifyTriangle10() {
        //小边长三角形
        assertEquals("EQUILATERAL", UpgradedTriangle.classifyTriangle(1, 1, 1));
        System.out.println("testClassifyTriangle10: Success!");
    }
    @Test
    public void testClassifyTriangle11() {
        //大边长三角形
        assertEquals("EQUILATERAL", UpgradedTriangle.classifyTriangle(10000, 10000, 10000));
        System.out.println("testClassifyTriangle11: Success!");
    }
    @Test
    public void testClassifyTriangle12() {
        //两边相等，但两边之和不大于第三边
        assertEquals("INVALID", UpgradedTriangle.classifyTriangle(1, 2, 1));
        System.out.println("testClassifyTriangle12: Success!");
    }
    @Test
    public void testClassifyTriangle13() {
        //边长有长有短的三角形
        assertEquals("ISOSCELES", UpgradedTriangle.classifyTriangle(10000, 10000, 1));
        System.out.println("testClassifyTriangle13: Success!");
    }
    @Test
    public void testClassifyTriangle14() {
        //边长乱序三角形
        assertEquals("SCALENE", UpgradedTriangle.classifyTriangle(6, 8, 7));
        System.out.println("testClassifyTriangle14: Success!");
    }
    @Test
    public void testClassifyTriangle15() {
        //边长为负数，两边相等
        assertEquals("INVALID", UpgradedTriangle.classifyTriangle(-5, -7, -5));
        System.out.println("testClassifyTriangle15: Success!");
    }
// -----------------------------------------------------------------------------------------------------//
    @Test
    public void testCalculateArea1() {
        //边长为负
        assertEquals(0.0, UpgradedTriangle.calculateArea(-5, -5, -5), 0.00001);
        System.out.println("testCalculateArea1: Success!");
    }
    @Test
    public void testCalculateArea2() {
        //边长为0
        assertEquals(0.0, UpgradedTriangle.calculateArea(0, 0, 0), 0.00001);
        System.out.println("testCalculateArea2: Success!");
    }
    @Test
    public void testCalculateArea3() {
        //边长有正有负
        assertEquals(0.0, UpgradedTriangle.calculateArea(-2, 0, 2), 0.00001);
        System.out.println("testCalculateArea3: Success!");
    }
    @Test
    public void testCalculateArea4() {
        //等边三角形
        assertEquals(10.825317547305485, UpgradedTriangle.calculateArea(5, 5, 5), 0.00001);
        System.out.println("testCalculateArea4: Success!");
    }
    @Test
    public void testCalculateArea5() {
        //等腰三角形
        assertEquals(7.1545440106270926, UpgradedTriangle.calculateArea(5, 5, 3), 0.00001);
        System.out.println("testCalculateArea5: Success!");
    }
    @Test
    public void testCalculateArea6() {
        //两边之和不大于第三边
        assertEquals(0.0, UpgradedTriangle.calculateArea(2, 3, 5), 0.00001);
        System.out.println("testCalculateArea6: Success!");
    }
    @Test
    public void testCalculateArea7() {
        //普通三角形
        assertEquals(2.9047375096555625, UpgradedTriangle.calculateArea(2, 3, 4), 0.00001);
        System.out.println("testCalculateArea7: Success!");
    }
    @Test
    public void testCalculateArea8() {
        //小边长三角形
        assertEquals(0.4330127018922193, UpgradedTriangle.calculateArea(1, 1, 1), 0.00001);
        System.out.println("testCalculateArea8: Success!");
    }
    @Test
    public void testCalculateArea9() {
        //大边长三角形
        assertEquals(24999.99921874999, UpgradedTriangle.calculateArea(10000, 10000, 5), 0.00001);
        System.out.println("testCalculateArea9: Success!");
    }
    @Test
    public void testCalculateArea10() {
        //直角三角形
        assertEquals(6.0, UpgradedTriangle.calculateArea(3, 4, 5), 0.00001);
        System.out.println("testCalculateArea10: Success!");
    }
    @Test
    public void testCalculateArea11() {
        //边长乱序三角形
        assertEquals(14.696938456699069, UpgradedTriangle.calculateArea(6, 5, 7), 0.00001);
        System.out.println("testCalculateArea11: Success!");
    }
    @Test
    public void testCalculateArea12() {
        //边长为负数，两边相等
        assertEquals(0.0, UpgradedTriangle.calculateArea(-5, -5, -3), 0.00001);
        System.out.println("testCalculateArea12: Success!");
    }
    @Test
    public void testCalculateArea13() {
        //两边相等，但两边之和不大于第三边
        assertEquals(0.0, UpgradedTriangle.calculateArea(1, 2, 1), 0.00001);
        System.out.println("testCalculateArea13: Success!");
    }
    @Test
    public void testCalculateArea14() {
        //边长逆序三角形
        assertEquals(20.33316256758894, UpgradedTriangle.calculateArea(8, 7, 6), 0.00001);
        System.out.println("testCalculateArea14: Success!");
    }
    @Test
    public void testCalculateArea15() {
        //普通三角形
        assertEquals(17.41228014936585, UpgradedTriangle.calculateArea(5, 7, 9), 0.00001);
        System.out.println("testCalculateArea15: Success!");
    }
}