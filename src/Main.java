public class Main {
    public static void main(String[] args) {
        Deck deck = new Deck();

        // Mezclar el deck
        System.out.println("====================");
        System.out.println("Mezclando el deck...");
        System.out.println("====================");
        deck.shuffle();
        System.out.println(); // Salto de línea para separar

        // Mostrar la primera carta (head)
        System.out.println("====================");
        System.out.println("Sacando la primera carta del deck...");
        System.out.println("====================");
        deck.head();
        System.out.println(); // Salto de línea para separar

        // Seleccionar una carta al azar (pick)
        System.out.println("====================");
        System.out.println("Seleccionando una carta al azar...");
        System.out.println("====================");
        deck.pick();
        System.out.println(); // Salto de línea para separar

        // Repartir una mano de 5 cartas (hand)
        System.out.println("====================");
        System.out.println("Repartiendo una mano de 5 cartas...");
        System.out.println("====================");
        deck.hand();
        System.out.println(); // Salto de línea para separar
    }
}
