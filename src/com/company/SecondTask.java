package com.company;

import java.util.ArrayList;
import java.util.Scanner;
class MyInputException extends Exception{

    private String text;
    public MyInputException(String text,String message){
        super(message + ": " + text);
        this.text = text;
    }
}
public class SecondTask {
    public static ArrayList<Integer> input() throws MyInputException {
        ArrayList<Integer> array = new ArrayList<>();
        for(int i = 0;i<20;i++) {

            Scanner s = new Scanner(System.in);
            String a = s.nextLine();
            if(a.matches("-?\\d+(\\.\\d+)?"))
            {
                array.add(Integer.parseInt(a));
            }
            else
            {
                throw new MyInputException(a,"Введены неверные данные");
            }

        }
        return array;



    }
    public static void printList(ArrayList<Integer> array)
    {
        for(int i : array)
        {
            System.out.println(i);
        }
    }
    public static void main(String[] args) throws MyInputException {
        ArrayList<Integer> array = input();
        ArrayList<Integer> div2 = new ArrayList<>();
        ArrayList<Integer> div3 = new ArrayList<>();
        ArrayList<Integer> another = new ArrayList<>();
        for(int i:array)
        {
            if(i%2==0)
                div2.add(i);
            if(i%3==0)
                div3.add(i);
            if(i%2!=0 && i%3!=0)
                another.add(i);
        }
        printList(div3);
        printList(div2);
        printList(another);



    }
}
