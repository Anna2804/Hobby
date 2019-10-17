package com.ivanova;


import java.util.Scanner;

public class Test
{
    public static void main( String[] args )
    {
        Hobby hb1 = new Hobby();

        Hobby hb2 = new Hobby("Reading");
        byte b = 1;
        short a = 5;
        hb2.setId('r');
        hb2.setTimeOfLesson(b);
        hb2.setCostForWeek(a);
        hb2.setCostForMonth(20);
        hb2.setCostForYear(240);
        hb2.setAvarageTimeOfYear(72);
        hb2.setAvarageTimeOfMonth(6);
        hb2.setMyHobby(true);

        Hobby hb3 = new Hobby("Football",'f',b,a,20,240,48,4,false);

        Scanner skaner = new Scanner(System.in);
        System.out.println("Введите параметры хобби:");
        System.out.println("Name:");
        String name = skaner.nextLine();
        hb1.setName(name);
        System.out.println("ID:");
        hb1.setId((char) skaner.next().charAt(0));
        System.out.println("Time of lesson:");
        hb1.setTimeOfLesson(skaner.nextByte());
        System.out.println("Cost for week:");
        hb1.setCostForWeek(skaner.nextShort());
        System.out.println("Cost for month:");
        hb1.setCostForMonth(skaner.nextInt());
        System.out.println("Cost for year:");
        hb1.setCostForYear(skaner.nextLong());
        System.out.println("Avarage time of year:");
        hb1.setAvarageTimeOfYear(skaner.nextDouble());
        System.out.println("Avarage time of month:");
        hb1.setAvarageTimeOfMonth(skaner.nextFloat());
        System.out.println("Is your hobby?");
        hb1.setMyHobby(skaner.nextBoolean());

        System.out.println("All about hobby's");
        Hobby array[] = {hb1, hb2, hb3};
        for (int i = 0; i < array.length; i++) {
            array[i].tellAboutHobby();
        }




    }
}
