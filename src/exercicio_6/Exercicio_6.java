package exercicio_6;

import java.io.IOException;

public class Exercicio_6 {
    public static void main(String[] args) {
        System.out.println("Baralho: ");
        Baralho baralho = new Baralho();
        baralho.imprimir();
        try {
            int a = System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
        baralho.embaralhar();
        baralho.imprimir();
    }
}
