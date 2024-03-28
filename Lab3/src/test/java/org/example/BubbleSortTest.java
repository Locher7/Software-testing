package org.example;
import org.junit.*;
import static org.junit.Assert.assertArrayEquals;

public class BubbleSortTest {

    @Test
    public void testBubbleSort1() {
        // 空数组
        int[] inputArray = {};
        int[] expectedArray = {};
        BubbleSort.bubbleSort(inputArray);
        assertArrayEquals(expectedArray, inputArray);
        System.out.println("Test BubbleSort1 Successful");
    }

    @Test
    public void testBubbleSort2() {
        // 单一元素数组
        int[] inputArray = {1};
        int[] expectedArray = {1};
        BubbleSort.bubbleSort(inputArray);
        assertArrayEquals(expectedArray, inputArray);
        System.out.println("Test BubbleSort2 Successful");
    }

    @Test
    public void testBubbleSort3() {
        // 逆序数组
        int[] inputArray = {5,4,3,2,1};
        int[] expectedArray = {1,2,3,4,5};
        BubbleSort.bubbleSort(inputArray);
        assertArrayEquals(expectedArray, inputArray);
        System.out.println("Test BubbleSort3 Successful");
    }

    @Test
    public void testBubbleSort4() {
        // 顺序数组
        int[] inputArray = {1,2,3,4,5};
        int[] expectedArray = {1,2,3,4,5};
        BubbleSort.bubbleSort(inputArray);
        assertArrayEquals(expectedArray, inputArray);
        System.out.println("Test BubbleSort4 Successful");
    }

    @Test
    public void testBubbleSort5() {
        // 多个重复元素数组
        int[] inputArray = {1,1,1,1,1,1,0};
        int[] expectedArray = {0,1,1,1,1,1,1};
        BubbleSort.bubbleSort(inputArray);
        assertArrayEquals(expectedArray, inputArray);
        System.out.println("Test BubbleSort5 Successful");
    }

    @Test
    public void testBubbleSort6() {
        // 负数数组
        int[] inputArray = {-3,-6,-1,-9,-5};
        int[] expectedArray = {-9,-6,-5,-3,-1};
        BubbleSort.bubbleSort(inputArray);
        assertArrayEquals(expectedArray, inputArray);
        System.out.println("Test BubbleSort6 Successful");
    }

    @Test
    public void testBubbleSort7() {
        // 正负元素都有的数组
        int[] inputArray = {1,5,0,-2,-9};
        int[] expectedArray = {-9,-2,0,1,5};
        BubbleSort.bubbleSort(inputArray);
        assertArrayEquals(expectedArray, inputArray);
        System.out.println("Test BubbleSort7 Successful");
    }

    @Test
    public void testBubbleSort8() {
        // 正数数组
        int[] inputArray = {4,7,2,0,6};
        int[] expectedArray = {0,2,4,6,7};
        BubbleSort.bubbleSort(inputArray);
        assertArrayEquals(expectedArray, inputArray);
        System.out.println("Test BubbleSort8 Successful");
    }

    @Test
    public void testBubbleSort9() {
        // 所有元素都重复的数组
        int[] inputArray = {2,2,2,2,2};
        int[] expectedArray = {2,2,2,2,2};
        BubbleSort.bubbleSort(inputArray);
        assertArrayEquals(expectedArray, inputArray);
        System.out.println("Test BubbleSort9 Successful");
    }

    @Test
    public void testBubbleSort10() {
        // 小规模数组
        int[] inputArray = {2,1};
        int[] expectedArray = {1,2};
        BubbleSort.bubbleSort(inputArray);
        assertArrayEquals(expectedArray, inputArray);
        System.out.println("Test BubbleSort10 Successful");
    }

    @Test
    public void testBubbleSort11() {
        // 大规模数组
        int[] inputArray = {10,9,8,5,6,7,4,2,5,9,5,3,6,4,2,1};
        int[] expectedArray = {1,2,2,3,4,4,5,5,5,6,6,7,8,9,9,10};
        BubbleSort.bubbleSort(inputArray);
        assertArrayEquals(expectedArray, inputArray);
        System.out.println("Test BubbleSort11 Successful");
    }

    @Test
    public void testBubbleSort12() {
        // 正数数组
        int[] inputArray = {4,6,3,0,1};
        int[] expectedArray = {0,1,3,4,6};
        BubbleSort.bubbleSort(inputArray);
        assertArrayEquals(expectedArray, inputArray);
        System.out.println("Test BubbleSort12 Successful");
    }

    @Test
    public void testBubbleSort13() {
        // 重复元素顺序数组
        int[] inputArray = {1,1,2,2,2,3,3,3,4,4,5};
        int[] expectedArray = {1,1,2,2,2,3,3,3,4,4,5};
        BubbleSort.bubbleSort(inputArray);
        assertArrayEquals(expectedArray, inputArray);
        System.out.println("Test BubbleSort13 Successful");
    }

    @Test
    public void testBubbleSort14() {
        // 重复元素逆序数组
        int[] inputArray = {5,5,4,4,4,3,3,2,1,1};
        int[] expectedArray = {1,1,2,3,3,4,4,4,5,5};
        BubbleSort.bubbleSort(inputArray);
        assertArrayEquals(expectedArray, inputArray);
        System.out.println("Test BubbleSort14 Successful");
    }

    @Test
    public void testBubbleSort15() {
        // 随机数组
        int[] inputArray = {0,5,7,5,7};
        int[] expectedArray = {0,5,5,7,7};
        BubbleSort.bubbleSort(inputArray);
        assertArrayEquals(expectedArray, inputArray);
        System.out.println("Test BubbleSort15 Successful");
    }

}
