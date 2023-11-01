package entities;

public interface Reproduzir {
    default void tocar(){
        System.out.println("Tocando musica");
    }
    default void pausar(){
        System.out.println("Pausa");
    }
    default void selecioar(){
        System.out.println("Selecionar musica");
    }
}
