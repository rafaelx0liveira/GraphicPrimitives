import EstruturaDeDados.ListaLigada;

import java.util.LinkedList;

/**
 * Aplicacao para testar primitivos graficos.
 *
 * @author Julio Arakaki
 * @version 22/08/2021
 */
class App
{
    LinkedList<Object> lista = new LinkedList<>();

    public static void main(String args[])
    {

        // Cria e define dimensao da janela (em pixels)
        new Gui(1000, 800);

    }

    PainelDesenho painelDesenho = new PainelDesenho(lista);
}
