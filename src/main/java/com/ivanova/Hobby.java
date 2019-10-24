package com.ivanova;

public abstract class Hobby {
    private byte timeOfLesson;
    private short costForWeek;
    private float avarageTimeOfMonth;
    private boolean isMyHobby;

    public Hobby(byte timeOfLesson, short costForWeek, float avarageTimeOfMonth, boolean isMyHobby) {

        this.timeOfLesson = timeOfLesson;
        this.costForWeek = costForWeek;
        this.avarageTimeOfMonth = avarageTimeOfMonth;
        this.isMyHobby = isMyHobby;
    }

    public abstract void tellAboutHobby();

    public byte getTimeOfLesson() {
        return timeOfLesson;
    }

    public void setTimeOfLesson(byte timeOfLesson) {
        this.timeOfLesson = timeOfLesson;
    }

    public short getCostForWeek() {
        return costForWeek;
    }

    public void setCostForWeek(short costForWeek) {
        this.costForWeek = costForWeek;
    }

    public float getAvarageTimeOfMonth() {
        return avarageTimeOfMonth;
    }

    public void setAvarageTimeOfMonth(float avarageTimeOfMonth) {
        this.avarageTimeOfMonth = avarageTimeOfMonth;
    }

    public boolean isMyHobby() {
        return isMyHobby;
    }

    public void setMyHobby(boolean myHobby) {
        isMyHobby = myHobby;
    }

    @Override
    public String toString() {
        return "Hobby{" +
                "timeOfLesson=" + timeOfLesson +
                ", costForWeek=" + costForWeek +
                ", avarageTimeOfMonth=" + avarageTimeOfMonth +
                ", isMyHobby=" + isMyHobby +
                '}';
    }
}
