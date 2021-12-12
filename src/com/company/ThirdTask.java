package com.company;

import java.util.HashSet;
import java.util.Set;

public class ThirdTask {
    public static <T> Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2)  {
        HashSet<T> s = new HashSet<>();
        for(T i:set1)
        {
            boolean f= true;
            for(T j:set2)
            {
                if(i.equals(j))
                {
                    f = false;
                }
            }
            if(f)
            {
                s.add(i);
            }
        }
        for(T i:set2)
        {
            boolean f= true;
            for(T j:set1)
            {
                if(i.equals(j))
                {
                    f = false;
                }
            }
            if(f)
            {
                s.add(i);
            }
        }
        return s;
    }
    public static void main(String[] args) {



    }

}
