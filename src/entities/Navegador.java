package entities;

public interface Navegador {
    default void exibirPaigina(){
        System.out.println("Exibindo pagina");
    }
    default void adicionarAba(){
        System.out.println("Adicionando pagina");
    }
    default void atualizarPagina(){
        System.out.println("Atualizar pagina");
    }
}
