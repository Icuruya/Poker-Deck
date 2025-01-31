import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Deck {
    private List<Card> cards;
    private List<Card> removedCards;

    public Deck() {
        cards = new ArrayList<>();
        removedCards = new ArrayList<>();
        initializeDeck();
    }

    private void initializeDeck() {
        String[] palos = {"Tréboles", "Corazones", "Picas", "Diamantes"};
        String[] colores = {"Negro", "Rojo"};
        String[] valores = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "A", "J", "Q", "K"};

        for (String palo : palos) {
            for (String valor : valores) {
                String color = (palo.equals("Corazones") || palo.equals("Diamantes")) ? colores[1] : colores[0];
                cards.add(new Card(palo, color, valor));
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(cards);
        System.out.println("Se mezcló el Deck.");
    }

    public void head() {
        if (cards.isEmpty()) {
            System.out.println("No hay cartas en el deck.");
            return;
        }
        Card card = cards.remove(0);
        removedCards.add(card);
        System.out.println(card);
        System.out.println("Quedan " + cards.size() + " cartas en el deck.");
    }

    public void pick() {
        if (cards.isEmpty()) {
            System.out.println("No hay cartas en el deck.");
            return;
        }
        Random rand = new Random();
        int index = rand.nextInt(cards.size());
        Card card = cards.remove(index);
        removedCards.add(card);
        System.out.println(card);
        System.out.println("Quedan " + cards.size() + " cartas en el deck.");
    }

    public void hand() {
        if (cards.size() < 5) {
            System.out.println("No hay suficientes cartas en el deck para repartir una mano.");
            return;
        }
        for (int i = 0; i < 5; i++) {
            Card card = cards.remove(0);
            removedCards.add(card);
            System.out.println(card);
        }
        System.out.println("Quedan " + cards.size() + " cartas en el deck.");
    }
}
