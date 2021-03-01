package exercicio_8;

public class Celular {
    int capacidadeBateria = 100;
    int nivelCarga = 99;

    void enviarSMS(){
        nivelCarga--;
    }

    void realizarLigacao(int tempoSegundos){
        for (int i = 0; i < tempoSegundos; i+=5)
            nivelCarga--;
    }
}
