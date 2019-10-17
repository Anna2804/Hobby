package com.ivanova;

public class Hobby {
    private String name;
    private char id;
    private byte timeOfLesson ;
    private short costForWeek;
    private int costForMonth;
    private long costForYear;
    private double avarageTimeOfYear;
    private float avarageTimeOfMonth;
    private boolean isMyHobby;

    public Hobby() {
    }

    public Hobby(String name) {
        this.name = name;
    }

    public Hobby(String name, char id, byte timeOfLesson, short costForWeek, int costForMonth, long costForYear, double avarageTimeOfYear, float avarageTimeOfMonth, boolean isMyHobby) {
        this.name = name;
        this.id = id;
        this.timeOfLesson = timeOfLesson;
        this.costForWeek = costForWeek;
        this.costForMonth = costForMonth;
        this.costForYear = costForYear;
        this.avarageTimeOfYear = avarageTimeOfYear;
        this.avarageTimeOfMonth = avarageTimeOfMonth;
        this.isMyHobby = isMyHobby;
    }

    @Override
    public String toString() {
        return "Hobby{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", timeOfLesson=" + timeOfLesson +
                ", costForWeek=" + costForWeek +
                ", costForMonth=" + costForMonth +
                ", costForYear=" + costForYear +
                ", avarageTimeOfYear=" + avarageTimeOfYear +
                ", avarageTimeOfMonth=" + avarageTimeOfMonth +
                ", isMyHobby=" + isMyHobby +
                '}';
    }
    public void tellAboutHobby(){
        System.out.println(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getId() {
        return id;
    }

    public void setId(char id) {
        this.id = id;
    }

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

    public int getCostForMonth() {
        return costForMonth;
    }

    public void setCostForMonth(int costForMonth) {
        this.costForMonth = costForMonth;
    }

    public long getCostForYear() {
        return costForYear;
    }

    public void setCostForYear(long costForYear) {
        this.costForYear = costForYear;
    }

    public double getAvarageTimeOfYear() {
        return avarageTimeOfYear;
    }

    public void setAvarageTimeOfYear(double avarageTimeOfYear) {
        this.avarageTimeOfYear = avarageTimeOfYear;
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
}
