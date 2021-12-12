package com.company;

import java.util.NoSuchElementException;

class Pair<T,K>
{
    private T obj1;
    private K obj2;
    private Pair(T obj1,K obj2)
    {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }
    public static <A,B> Pair<A,B> of(A arg1, B arg2)
    {
        return new Pair<A,B>(arg1,arg2);
    }
    public T getFirst()
    {
        if(obj1.equals(null))
        {
            throw new NoSuchElementException();
        }
        else return obj1;
    }
    public K getSecond()
    {
        if(obj2.equals(null))
        {
            throw new NoSuchElementException();
        }
        else return obj2;
    }
    public boolean equals(Object pair)
    {
        if(this.hashCode() == pair.hashCode())
        {
            return true;
        }
        else
            return false;
    }
    public int hashCode()
    {
        int a = 0;
        int b = 0;
        if(!obj1.equals(null))
        {
            a = obj1.hashCode();
        }
        if (!obj2.equals(null)) {
            b = obj2.hashCode();
        }
        int result = obj1.hashCode()*37 + obj2.hashCode()*31;
        return result;
    }
}
public class Main {

    public static void main(String[] args) {

    }
}
