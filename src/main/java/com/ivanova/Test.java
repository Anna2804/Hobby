package com.ivanova;


import java.util.Scanner;

public class Test
{
    public static void main( String[] args )
    {
        byte b = 40;
        short a =5;
        Swiming hb1 = new Swiming(b,a,8,true,500);
        Basketball hb2 = new Basketball(b,a,4,false,6);
        System.out.println("All about hobby's");
        Hobby array[] = {hb1, hb2};
        for (Hobby hobby: array) {
            hobby.tellAboutHobby();
        }




    }
}
