package com.ivanova;

public class Swiming extends Hobby {
    private float squareOfPoll;

    @Override
    public String toString() {
        return "Swiming{" +
                "squareOfPoll=" + squareOfPoll +
                "} " + super.toString();
    }

    public Swiming(byte timeOfLesson, short costForWeek, float avarageTimeOfMonth, boolean isMyHobby, float squareOfPoll) {
        super(timeOfLesson, costForWeek, avarageTimeOfMonth, isMyHobby);
        this.squareOfPoll = squareOfPoll;
    }

    @Override
    public void tellAboutHobby() {
        System.out.println("All about swiming");
        System.out.println(toString());
    }
}
