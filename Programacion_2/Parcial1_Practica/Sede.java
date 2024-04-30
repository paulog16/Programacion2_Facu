package Parcial1_Practica;

public class Sede {
    private int fase;
    private String date;
    private String hour;
    private Test test;
    private Installation ins;

    public Sede() {
    }

    public Sede(int fase, String date, String hour, Test test, Installation ins) {
        this.fase = fase;
        this.date = date;
        this.hour = hour;
        this.test = test;
        this.ins = ins;
    }

    public int getFase() {
        return fase;
    }

    public void setFase(int fase) {
        this.fase = fase;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public Test getTest() {
        return test;
    }

    public void setTest(Test test) {
        this.test = test;
    }

    public Installation getIns() {
        return ins;
    }

    public void setIns(Installation ins) {
        this.ins = ins;
    }
}
