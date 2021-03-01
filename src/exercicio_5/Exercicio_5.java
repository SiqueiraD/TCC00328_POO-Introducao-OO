package exercicio_5;

public class Exercicio_5 {
    public static void main(String[] args) {
        System.gc();
        Televisao tv = new Televisao();
        tv.ligaDesliga();
        tv.trocarMudo();
        tv.mudarCanal(100);
        tv.mudarCanal(100);
        tv.mudarCanal(100);
        tv.mudarCanal(100);
        tv.mudarCanal(100);
        tv.trocarMudo();

        System.out.print("\nTV ligada: ");
        System.out.println(tv.estado.ligada);
        System.out.print("Volume: ");
        System.out.println(tv.estado.volume);
        System.out.print("Volume silenciado: ");
        System.out.println(tv.estado.volume_silenciado);
        System.out.print("Canal: ");
        System.out.println(tv.estado.canal);
    }
}
