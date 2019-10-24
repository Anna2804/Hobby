package com.ivanova;

public class Basketball extends Hobby {
    private int amountOfTeaam;

    public Basketball(byte timeOfLesson, short costForWeek, float avarageTimeOfMonth, boolean isMyHobby, int amountOfTeaam) {
        super(timeOfLesson, costForWeek, avarageTimeOfMonth, isMyHobby);
        this.amountOfTeaam = amountOfTeaam;
    }

    @Override
    public String toString() {
        return "Basketball{" +
                "amountOfTeaam=" + amountOfTeaam +
                "} " + super.toString();
    }

    @Override
    public void tellAboutHobby() {
        System.out.println("All about basketball");

        System.out.println(toString());

    }

}
