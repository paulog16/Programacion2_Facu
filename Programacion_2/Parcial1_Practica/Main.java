package Parcial1_Practica;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //CREO ATLETAS
        Athlete athlete1 = new Athlete(44841460, "Paulo", 1.78, 21, 70);
        Athlete athlete2= new Athlete(45345345, "pedro", 1.20, 17,50);
        Athlete athlete3= new Athlete(413423423,"Juan",1.70,25,80);

        // CREO INSTALACION
        Installation in=new Installation("peso liviano","mendoza","polideportivo","redondo");

        //CREO TEAM
        NationalTeam nt= new NationalTeam("Celeste","Argentina");
        nt.addAthletes(athlete1);
        nt.addAthletes(athlete2);
        nt.addAthletes(athlete3);

        //CREO PRUEBAS
        Test test1= new Test(1602,"Nado de espalda",in,nt.getAthletes());
        Test test2= new Test(1603,"Salto largo",in,nt.getAthletes());

        //CREO SEDE
        Sede sede1= new Sede(1,"16/02/03","16:30hs",test2,in);

        //AGREGO LAS PRUEBAS A LA INSTALACION
        in.addTest(test1);
        in.addTest(test2);

        //NOMBRE 3ER Atleta de la segunda prueba
        System.out.println("nombre del 3er atleta de la 2da prueba: " +in.getTests().get(1).getAthletes().get(2).getName());

        //CODIGO SEGUNDA PRUEBA
        System.out.println("codigo de la segunda prueba: "+in.getTests().get(1).getCode());
        System.out.println("-----------------------");

        //ALTURA DE TODOS LOS ATLETAS
        nt.showHeights();

        System.out.println("------------------------");

        //PESO EXTRA DE LOS ATLETAS?
        nt.showExtraWeight();
    }
}
