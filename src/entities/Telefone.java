package entities;

public interface Telefone {
    default void ligar(){
        System.out.println("Ligando para...");
    }
    default void atender(){
        System.out.println("Atender celular");
    }
    default void correioVoz(){
        System.out.println("Correio de Voz");
    }
}
