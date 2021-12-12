package com.company;

import java.util.NoSuchElementException;

/**
 * Должен наследовать SimpleList
 *
 * Должен иметь 2 конструктора
 * - без аргументов - создает внутренний массив дефолтного размера
 на ваш выбор
 * - с аргументом - начальный размер массива
 */
public class MyArrayList implements SimpleList {
    public int array[];
    public int current_size;
    public int size;
    public MyArrayList() {
        array = new int[2];
        current_size = 0;
        size = 2;
    }
    public MyArrayList(int capacity) {
        array = new int[capacity];
        current_size = 0;
        size = capacity;
    }
    @Override
    public void add(int item) {
        if(current_size == size)
        {
            int[] h = new int[2*size];
            for(int i = 0;i<size;i++)
            {
                h[i] = array[i];
            }
            array = h;
            size = 2*size;
        }
        array[current_size++] = item;
    }
    @Override
    public int remove(int idx) throws NoSuchElementException {
        if(idx < current_size && idx >=0)
        {
           int a = array[idx];
           for(int i = idx;i< current_size;i++)
           {
               array[idx] = array[idx+1];
           }
           current_size--;
           return a;
        }
        else
        {
            throw new NoSuchElementException();
        }
    }
    @Override
    public int size() {
        return current_size;
    }
    @Override
    public int get(int idx) throws NoSuchElementException{
        if(idx < current_size && idx >=0)
        {
            return array[idx];
        }
        else
        {
            throw new NoSuchElementException();
        }
    }
    public static void main(String[] args) {

    }
}
