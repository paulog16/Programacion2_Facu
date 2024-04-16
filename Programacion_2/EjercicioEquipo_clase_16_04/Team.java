package EjercicioEquipo_clase_16_04;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Team implements Iterable<Jugador> {

    private List<Jugador> players;

    public Team() {
        this.players = new ArrayList<>();
    }

    public void addPlayers(Jugador player) {
        players.add(player);
    }

    @Override
    public Iterator<Jugador> iterator() {
        return new IterarPlayers();
    }

    private class IterarPlayers implements Iterator<Jugador> {
        private int indice;

        @Override
        public boolean hasNext() {
            return indice < players.size();
        }

        @Override
        public Jugador next() {
            return players.get(indice++);
        }
    }
}
