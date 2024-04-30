package Parcial1_Practica;

import java.util.ArrayList;
import java.util.List;

public class NationalTeam {
    private String color;
    private String country;
    private List<Athlete> athletes;

    public NationalTeam() {
    }

    public NationalTeam(String color, String country) {
        this.color = color;
        this.country = country;
        athletes= new ArrayList<>();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public List<Athlete> getAthletes() {
        return athletes;
    }

    public void setAthletes(List<Athlete> athletes) {
        this.athletes = athletes;
    }

    public void addAthletes(Athlete athlete){
        athletes.add(athlete);
    }
    public void showExtraWeight(){
        for(Athlete athlete: athletes){
            double imc= athlete.calculateImc();
            boolean hasExtraWeight=athlete.thereIsExtraWeight(imc);
            System.out.println("Atleta: "+athlete.getName()+ " , Peso extra: "+ hasExtraWeight);
        }
    }
    public void showHeights(){
        for (Athlete athlete: athletes){
            System.out.println("Atleta: "+athlete.getName()+" ,Altura: "+ athlete.getHeight());
        }
    }
}
