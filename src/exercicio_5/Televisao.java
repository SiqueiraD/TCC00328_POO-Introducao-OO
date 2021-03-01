package exercicio_5;

public class Televisao {
    class Estado {
        boolean ligada = false;
        boolean volume_silenciado = false;
        int volume = 7;
        int canal = 0;
    }
    Estado estado = new Estado();

    void trocarMudo(){
        this.estado.volume_silenciado = !this.estado.volume_silenciado;
    }

    boolean ligaDesliga(){
        this.estado.ligada = !this.estado.ligada;
        return this.estado.ligada;
    }

    int mudarCanal(int canal){
        if(canal < 0){
            if(this.estado.canal != 0)
                this.estado.canal--;
            else
                this.estado.canal = 99;
        }
        else if(canal > 99){
            if (this.estado.canal != 99)
                this.estado.canal++;
            else
                this.estado.canal = 0;
        }
        else
            this.estado.canal = canal;

        return this.estado.canal;
    }


}
