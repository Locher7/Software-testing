package org.example;

import org.junit.*;
import static org.junit.Assert.assertEquals;

public class BackPackTest {

    @Test
    public void testBackPack1() {
        // 重量为空
        int[] weights = {};
        int[] values = {3,4,5,6};
        int capacity = 8;
        int expectedMaxValue = 0;

        int maxValue = BackPack.backpack(weights, values, capacity);
        assertEquals(expectedMaxValue, maxValue);
        System.out.println("Test BackPack1 Successful");
    }

    @Test
    public void testBackPack2() {
        // 价值为空
        int[] weights = {2,3,4,5};
        int[] values = {};
        int capacity = 8;
        int expectedMaxValue = 0;

        int maxValue = BackPack.backpack(weights, values, capacity);
        assertEquals(expectedMaxValue, maxValue);
        System.out.println("Test BackPack2 Successful");
    }

    @Test
    public void testBackPack3() {
        // 容量为空
        int[] weights = {2,3,4,5};
        int[] values = {3,4,5,6};
        int capacity = 0;
        int expectedMaxValue = 0;

        int maxValue = BackPack.backpack(weights, values, capacity);
        assertEquals(expectedMaxValue, maxValue);
        System.out.println("Test BackPack3 Successful");
    }

    @Test
    public void testBackPack4() {
        // 单一元素且不满足条件
        int[] weights = {2};
        int[] values = {4};
        int capacity = 1;
        int expectedMaxValue = 0;

        int maxValue = BackPack.backpack(weights, values, capacity);
        assertEquals(expectedMaxValue, maxValue);
        System.out.println("Test BackPack4 Successful");
    }

    @Test
    public void testBackPack5() {
        // 随机测试用例
        int[] weights = {2,3,4,5};
        int[] values = {3,4,5,6};
        int capacity = 8;
        int expectedMaxValue = 10;

        int maxValue = BackPack.backpack(weights, values, capacity);
        assertEquals(expectedMaxValue, maxValue);
        System.out.println("Test BackPack5 Successful");
    }

    @Test
    public void testBackPack6() {
        // 单一元素且满足条件
        int[] weights = {2};
        int[] values = {3};
        int capacity = 4;
        int expectedMaxValue = 3;

        int maxValue = BackPack.backpack(weights, values, capacity);
        assertEquals(expectedMaxValue, maxValue);
        System.out.println("Test BackPack6 Successful");
    }

    @Test
    public void testBackPack7() {
        // 小规模测试用例
        int[] weights = {2,3};
        int[] values = {4,5};
        int capacity = 3;
        int expectedMaxValue = 5;

        int maxValue = BackPack.backpack(weights, values, capacity);
        assertEquals(expectedMaxValue, maxValue);
        System.out.println("Test BackPack7 Successful");
    }

    @Test
    public void testBackPack8() {
        // 重量包括负数
        int[] weights = {-1,2,3};
        int[] values = {3,4,5};
        int capacity = 8;
        int expectedMaxValue = 0;

        int maxValue = BackPack.backpack(weights, values, capacity);
        assertEquals(expectedMaxValue, maxValue);
        System.out.println("Test BackPack8 Successful");
    }

    @Test
    public void testBackPack9() {
        // 价值包括负数
        int[] weights = {2,3,4};
        int[] values = {-1,3,4};
        int capacity = 8;
        int expectedMaxValue = 0;

        int maxValue = BackPack.backpack(weights, values, capacity);
        assertEquals(expectedMaxValue, maxValue);
        System.out.println("Test BackPack9 Successful");
    }

    @Test
    public void testBackPack10() {
        // 容量为负数
        int[] weights = {2,3,4,5};
        int[] values = {3,4,5,6};
        int capacity = -8;
        int expectedMaxValue = 0;

        int maxValue = BackPack.backpack(weights, values, capacity);
        assertEquals(expectedMaxValue, maxValue);
        System.out.println("Test BackPack10 Successful");
    }

    @Test
    public void testBackPack11() {
        // 重量为0
        int[] weights = {0,0,0};
        int[] values = {3,4,5};
        int capacity = 8;
        int expectedMaxValue = 12;

        int maxValue = BackPack.backpack(weights, values, capacity);
        assertEquals(expectedMaxValue, maxValue);
        System.out.println("Test BackPack11 Successful");
    }

    @Test
    public void testBackPack12() {
        // 价值为0
        int[] weights = {2,3,4};
        int[] values = {0,0,0};
        int capacity = 8;
        int expectedMaxValue = 0;

        int maxValue = BackPack.backpack(weights, values, capacity);
        assertEquals(expectedMaxValue, maxValue);
        System.out.println("Test BackPack12 Successful");
    }

    @Test
    public void testBackPack13() {
        // 小重量测试用例
        int[] weights = {1,2,3};
        int[] values = {60,100,200};
        int capacity = 5;
        int expectedMaxValue = 300;

        int maxValue = BackPack.backpack(weights, values, capacity);
        assertEquals(expectedMaxValue, maxValue);
        System.out.println("Test BackPack13 Successful");
    }

    @Test
    public void testBackPack14() {
        // 容量为0
        int[] weights = {2,3,4};
        int[] values = {3,4,5};
        int capacity = 0;
        int expectedMaxValue = 0;

        int maxValue = BackPack.backpack(weights, values, capacity);
        assertEquals(expectedMaxValue, maxValue);
        System.out.println("Test BackPack14 Successful");
    }

    @Test
    public void testBackPack15() {
        // 大重量测试用例
        int[] weights = {10,20,30};
        int[] values = {60,100,120};
        int capacity = 50;
        int expectedMaxValue =220;

        int maxValue = BackPack.backpack(weights, values, capacity);
        assertEquals(expectedMaxValue, maxValue);
        System.out.println("Test BackPack15 Successful");
    }

}

//                        {new int[]{}, new int[]{3,4,5,6},8,0},// 重量数组为空
//                        {new int[]{2,3,4,5}, new int[]{},8,0},// 价值数组为空
//                        {new int[]{2,3,4,5}, new int[]{3,4,5,6},0,0},// 背包容量为0
//                        {new int[]{2,3,4,5}, new int[]{3,4,5,6},8,10},// 正常随机情况
//                        {new int[]{2}, new int[]{3},4,3},// 单个物品能满足
//                        {new int[]{2}, new int[]{4},1,0},// 单个物品不满足
//                        {new int[]{2,3}, new int[]{4,5},1,0},// 容量小情况
//                        {new int[]{-1,2,3}, new int[]{3,4,5},8,0},// 重量出现负数
//                        {new int[]{2,3,4}, new int[]{-1,3,4},8,0},// 价值出现负数
//                        {new int[]{2,3,4}, new int[]{3,4,5},-8,0},// 容量出现负数
//                        {new int[]{0,0,0}, new int[]{3,4,5},8,12},// 重量都为0
//                        {new int[]{2,3,4}, new int[]{0,0,0},8,0},// 价值全为0
//                        {new int[]{1,2,3}, new int[]{60,100,120},5,220},// 小重量测试
//                        {new int[]{2,3,4}, new int[]{3,4,5},0,0},// 容量为0
//                        {new int[]{10,20,30}, new int[]{60,100,120},50,220}// 大重量测试
