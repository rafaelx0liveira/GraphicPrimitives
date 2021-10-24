package retangulo;

import reta.FiguraRetas;

import java.awt.*;
import java.util.LinkedList;

public class FiguraRetangulo
{
    public static void desenharRetangulo (Graphics g, int x1, int x2, int y1, int y2, String nome, int esp, Color cor, LinkedList lista)
    {
        int x3 = x2, y3 = y1, x4 = x1, y4 = y2;

        FiguraRetas.desenharRetaMp(g, x1, y1, x3, y3, nome, esp, cor, lista, false);

        FiguraRetas.desenharRetaMp(g, x3, y3, x2, y2, nome, esp, cor, lista, false);

        FiguraRetas.desenharRetaMp(g, x2, y2, x4, y4, nome, esp, cor, lista, false);

        FiguraRetas.desenharRetaMp(g, x4, y4, x1, y1, nome, esp, cor, lista, false);

        lista.add("Retangulo");
        lista.add(x1);
        lista.add(y1);
        lista.add(x2);
        lista.add(y2);
        lista.add(esp);
        lista.add(cor.getRed());
        lista.add(cor.getGreen());
        lista.add(cor.getBlue());

        for(Object ponto : lista)
        {
            System.out.println(ponto);
        }

    }
}
