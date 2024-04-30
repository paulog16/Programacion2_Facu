package Parcial1_Practica;

import java.util.ArrayList;
import java.util.List;

public class Test {
    private int code;
    private String title;
    private Installation insta;
    private List<Athlete> athletes;

    public Test() {
    }

    public Test(int code, String title, Installation insta, List<Athlete> athletes) {
        this.code = code;
        this.title = title;
        this.insta = insta;
        this.athletes = athletes;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Installation getInsta() {
        return insta;
    }

    public void setInsta(Installation insta) {
        this.insta = insta;
    }

    public List<Athlete> getAthletes() {
        return athletes;
    }

    public void setAthletes(List<Athlete> athletes) {
        this.athletes = athletes;
    }
}
