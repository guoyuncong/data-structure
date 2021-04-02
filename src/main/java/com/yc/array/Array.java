package com.yc.array;

import lombok.Data;

/**
 * @author: yagena
 * @date: 2021-04-02
 */
@Data
public class Array {
    private int[] data;
    private int size;

    /**
     * 构造函数
     *
     * @param capacity 容量
     */
    public Array(int capacity) {
        data = new int[capacity];
    }

    /**
     * 获取数组中的元素个数
     *
     * @return int
     */
    public int getSize() {
        return size;
    }

    /**
     * 获取数组容量
     *
     * @return int
     */
    public int getCapacity() {
        return data.length;
    }

    /**
     * 在所有元素前添加一个元素
     *
     * @param e 元素
     */
    public void addFirst(int e) {
        add(0, e);
    }

    /**
     * 在所有元素后添加一个元素
     *
     * @param e 元素
     */
    public void addLast(int e) {
        add(size, e);
    }

    /**
     * 在指定索引处新增元素
     *
     * @param index 索引
     * @param e     元素
     */
    public void add(int index, int e) {
        System.out.println("Aaaa");
        if (size == data.length) {
            throw new IllegalArgumentException("AddLast failed. Array is full.");
        }
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("Add failed. Require index >= 0 and index <= size");
        }
        for (int i = size; i > index; i++) {
            data[i] = data[i - 1];
        }
        data[index] = e;
        size ++;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append(String.format("Array：size = %d , capacity = %d \n", size, data.length));
        res.append('[');
        for (int i = 0; i < size; i++) {
            res.append(data[i]);
            if (i != size - 1) {
                res.append(",");
            }
        }
        res.append(']');
        return res.toString();
    }
}
