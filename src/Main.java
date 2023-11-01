import entities.Smartphone;

public class Main {
    public static void main(String[] args) {
        var celular = new Smartphone();

        celular.ligar();
        celular.atender();
        celular.correioVoz();
        System.out.println();
        celular.tocar();
        celular.pausar();
        celular.selecioar();
        System.out.println();
        celular.exibirPaigina();
        celular.adicionarAba();
        celular.atualizarPagina();
    }
}