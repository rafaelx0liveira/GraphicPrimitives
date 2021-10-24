package triangulo;

import ponto.Ponto;
import reta.FiguraRetas;

import java.awt.*;
import java.util.LinkedList;

public class FiguraTriangulos
{
    public static void desenharTriangulo(Graphics g, int x1, int y1, int x2, int y2, int x3, int y3, String nome, int esp, Color cor, LinkedList lista)
    {
        FiguraRetas.desenharRetaMp(g, x1, y1, x2, y2, nome, esp, cor, lista, false);
        FiguraRetas.desenharRetaMp(g, x2, y2, x3, y3, nome, esp, cor, lista, false);
        FiguraRetas.desenharRetaMp(g, x3, y3, x1, y1, nome, esp, cor, lista, false);

        lista.add("Triangulo");
        lista.add(x1);
        lista.add(y1);
        lista.add(x2);
        lista.add(y2);
        lista.add(x3);
        lista.add(y3);
        lista.add(esp);
        lista.add(cor.getRed());
        lista.add(cor.getGreen());
        lista.add(cor.getBlue());

        for(Object triangulo : lista)
        {
            System.out.println(triangulo);
        }
    }
}
