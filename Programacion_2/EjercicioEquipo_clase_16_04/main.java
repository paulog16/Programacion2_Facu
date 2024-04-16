package EjercicioEquipo_clase_16_04;

public class main {
    public static void main(String[] args) {
        Jugador player1 = new Jugador("Messi", "Delantero", "10");
        Jugador player2= new Jugador("Lopez muñoz","mediocampista","10");
        Jugador player3= new Jugador("Petroli","arquero","1");

        Team team = new Team();
        team.addPlayers(player1);
        team.addPlayers(player2);
        team.addPlayers(player3);

        for(Jugador player: team){
            System.out.println(player);
        }



    }
}
