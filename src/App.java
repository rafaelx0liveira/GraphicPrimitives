import EstruturaDeDados.ListaLigada;

import java.util.LinkedList;
import java.util.Locale;

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
        Locale.setDefault(Locale.US);
        // Cria e define dimensao da janela (em pixels)
        new Gui(1000, 800);
    }

    PainelDesenho painelDesenho = new PainelDesenho(lista);
}
