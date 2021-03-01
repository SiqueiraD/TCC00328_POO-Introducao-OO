package exercicio_6;

import java.util.Arrays;
import java.util.Random;

public class Baralho {
    Carta[] cartas = new Carta[52];
    Baralho(){
        int qtdCartas = 0;
        for(int np = 0; np < 4; np++){
            for(int i = 0; i < 13; i++) {
                cartas[qtdCartas] = new Carta(i, np);
                qtdCartas++;
            }
        }
    }

    void embaralhar(){
        Random rgen = new Random();
        for (int i  = 0; i < cartas.length; i++) {
            int randomPosition = rgen.nextInt(cartas.length);
            Carta trans = cartas[randomPosition];
            cartas[randomPosition] = cartas[i];
            cartas[i] = trans;
        }
    }

    void imprimir(){
        for (int i = 0; i < 52; i++){
            System.out.print(cartas[i].naipe);
            System.out.print(" - ");
            System.out.println(cartas[i].valor);
        }
    }
}
