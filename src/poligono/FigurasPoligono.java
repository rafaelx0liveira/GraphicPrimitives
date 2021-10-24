package poligono;

import reta.FiguraRetas;

import java.awt.*;
import java.util.LinkedList;

public class FigurasPoligono
{
    public static void desenharPoligono(Graphics g, int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4, int x5, int y5, int x6, int y6, int x7, int y7, int x8, int y8, int x9, int y9, int x10, int y10, String nome, int esp, Color cor, int vertices, LinkedList lista)
    {

        if (vertices == 4)
        {
            FiguraRetas.desenharRetaMp(g, x1, y1, x2, y2, nome, esp, cor, lista, false);
            FiguraRetas.desenharRetaMp(g, x2, y2, x3, y3, nome, esp, cor, lista, false);
            FiguraRetas.desenharRetaMp(g, x3, y3, x4, y4, nome, esp, cor, lista, false);
            FiguraRetas.desenharRetaMp(g, x4, y4, x1, y1, nome, esp, cor, lista, false);

            lista.add("Poligono");
            lista.add(x1);
            lista.add(y1);
            lista.add(x2);
            lista.add(y2);
            lista.add(x3);
            lista.add(y3);
            lista.add(x4);
            lista.add(y4);
            lista.add(esp);
            lista.add(cor.getRed());
            lista.add(cor.getGreen());
            lista.add(cor.getBlue());

            for(Object ponto : lista)
            {
                System.out.println(ponto);
            }
        }
        else if (vertices == 5)
        {
            FiguraRetas.desenharRetaMp(g, x1, y1, x2, y2, nome, esp, cor, lista, false);
            FiguraRetas.desenharRetaMp(g, x2, y2, x3, y3, nome, esp, cor, lista, false);
            FiguraRetas.desenharRetaMp(g, x3, y3, x4, y4, nome, esp, cor, lista, false);
            FiguraRetas.desenharRetaMp(g, x4, y4, x5, y5, nome, esp, cor, lista, false);
            FiguraRetas.desenharRetaMp(g, x5, y5, x1, y1, nome, esp, cor, lista, false);

            lista.add("Poligono");
            lista.add(x1);
            lista.add(y1);
            lista.add(x2);
            lista.add(y2);
            lista.add(x3);
            lista.add(y3);
            lista.add(x4);
            lista.add(y4);
            lista.add(x5);
            lista.add(y5);
            lista.add(esp);
            lista.add(cor.getRed());
            lista.add(cor.getGreen());
            lista.add(cor.getBlue());

            for(Object ponto : lista)
            {
                System.out.println(ponto);
            }

        }
        else if (vertices == 6)
        {
            FiguraRetas.desenharRetaMp(g, x1, y1, x2, y2, nome, esp, cor, lista, false);
            FiguraRetas.desenharRetaMp(g, x2, y2, x3, y3, nome, esp, cor, lista, false);
            FiguraRetas.desenharRetaMp(g, x3, y3, x4, y4, nome, esp, cor, lista, false);
            FiguraRetas.desenharRetaMp(g, x4, y4, x5, y5, nome, esp, cor, lista, false);
            FiguraRetas.desenharRetaMp(g, x5, y5, x6, y6, nome, esp, cor, lista, false);
            FiguraRetas.desenharRetaMp(g, x6, y6, x1, y1, nome, esp, cor, lista, false);

            lista.add("Poligono");
            lista.add(x1);
            lista.add(y1);
            lista.add(x2);
            lista.add(y2);
            lista.add(x3);
            lista.add(y3);
            lista.add(x4);
            lista.add(y4);
            lista.add(x5);
            lista.add(y5);
            lista.add(x6);
            lista.add(y6);
            lista.add(esp);
            lista.add(cor.getRed());
            lista.add(cor.getGreen());
            lista.add(cor.getBlue());

            for(Object ponto : lista)
            {
                System.out.println(ponto);
            }

        }
        else if (vertices == 7)
        {
            FiguraRetas.desenharRetaMp(g, x1, y1, x2, y2, nome, esp, cor, lista, false);
            FiguraRetas.desenharRetaMp(g, x2, y2, x3, y3, nome, esp, cor, lista, false);
            FiguraRetas.desenharRetaMp(g, x3, y3, x4, y4, nome, esp, cor, lista, false);
            FiguraRetas.desenharRetaMp(g, x4, y4, x5, y5, nome, esp, cor, lista, false);
            FiguraRetas.desenharRetaMp(g, x5, y5, x6, y6, nome, esp, cor, lista, false);
            FiguraRetas.desenharRetaMp(g, x6, y6, x7, y7, nome, esp, cor, lista, false);
            FiguraRetas.desenharRetaMp(g, x7, y7, x1, y1, nome, esp, cor, lista, false);

            lista.add("Poligono");
            lista.add(x1);
            lista.add(y1);
            lista.add(x2);
            lista.add(y2);
            lista.add(x3);
            lista.add(y3);
            lista.add(x4);
            lista.add(y4);
            lista.add(x5);
            lista.add(y5);
            lista.add(x6);
            lista.add(y6);
            lista.add(x7);
            lista.add(y7);
            lista.add(esp);
            lista.add(cor.getRed());
            lista.add(cor.getGreen());
            lista.add(cor.getBlue());

            for(Object ponto : lista)
            {
                System.out.println(ponto);
            }
        }
        else if ( vertices == 8)
        {
            FiguraRetas.desenharRetaMp(g, x1, y1, x2, y2, nome, esp, cor, lista, false);
            FiguraRetas.desenharRetaMp(g, x2, y2, x3, y3, nome, esp, cor, lista, false);
            FiguraRetas.desenharRetaMp(g, x3, y3, x4, y4, nome, esp, cor, lista, false);
            FiguraRetas.desenharRetaMp(g, x4, y4, x5, y5, nome, esp, cor, lista, false);
            FiguraRetas.desenharRetaMp(g, x5, y5, x6, y6, nome, esp, cor, lista, false);
            FiguraRetas.desenharRetaMp(g, x6, y6, x7, y7, nome, esp, cor, lista, false);
            FiguraRetas.desenharRetaMp(g, x7, y7, x8, y8, nome, esp, cor, lista, false);
            FiguraRetas.desenharRetaMp(g, x8, y8, x1, y1, nome, esp, cor, lista, false);

            lista.add("Poligono");
            lista.add(x1);
            lista.add(y1);
            lista.add(x2);
            lista.add(y2);
            lista.add(x3);
            lista.add(y3);
            lista.add(x4);
            lista.add(y4);
            lista.add(x5);
            lista.add(y5);
            lista.add(x6);
            lista.add(y6);
            lista.add(x7);
            lista.add(y7);
            lista.add(x8);
            lista.add(y8);
            lista.add(esp);
            lista.add(cor.getRed());
            lista.add(cor.getGreen());
            lista.add(cor.getBlue());

            for(Object ponto : lista)
            {
                System.out.println(ponto);
            }
        }
        else if (vertices == 9)
        {
            FiguraRetas.desenharRetaMp(g, x1, y1, x2, y2, nome, esp, cor, lista, false);
            FiguraRetas.desenharRetaMp(g, x2, y2, x3, y3, nome, esp, cor, lista, false);
            FiguraRetas.desenharRetaMp(g, x3, y3, x4, y4, nome, esp, cor, lista, false);
            FiguraRetas.desenharRetaMp(g, x4, y4, x5, y5, nome, esp, cor, lista, false);
            FiguraRetas.desenharRetaMp(g, x5, y5, x6, y6, nome, esp, cor, lista, false);
            FiguraRetas.desenharRetaMp(g, x6, y6, x7, y7, nome, esp, cor, lista, false);
            FiguraRetas.desenharRetaMp(g, x7, y7, x8, y8, nome, esp, cor, lista, false);
            FiguraRetas.desenharRetaMp(g, x8, y8, x9, y9, nome, esp, cor, lista, false);
            FiguraRetas.desenharRetaMp(g, x9, y9, x1, y1, nome, esp, cor, lista, false);

            lista.add("Poligono");
            lista.add(x1);
            lista.add(y1);
            lista.add(x2);
            lista.add(y2);
            lista.add(x3);
            lista.add(y3);
            lista.add(x4);
            lista.add(y4);
            lista.add(x5);
            lista.add(y5);
            lista.add(x6);
            lista.add(y6);
            lista.add(x7);
            lista.add(y7);
            lista.add(x8);
            lista.add(y8);
            lista.add(x9);
            lista.add(y9);
            lista.add(esp);
            lista.add(cor.getRed());
            lista.add(cor.getGreen());
            lista.add(cor.getBlue());

            for(Object ponto : lista)
            {
                System.out.println(ponto);
            }
        }
        else
        {
            FiguraRetas.desenharRetaMp(g, x1, y1, x2, y2, nome, esp, cor, lista, false);
            FiguraRetas.desenharRetaMp(g, x2, y2, x3, y3, nome, esp, cor, lista, false);
            FiguraRetas.desenharRetaMp(g, x3, y3, x4, y4, nome, esp, cor, lista, false);
            FiguraRetas.desenharRetaMp(g, x4, y4, x5, y5, nome, esp, cor, lista, false);
            FiguraRetas.desenharRetaMp(g, x5, y5, x6, y6, nome, esp, cor, lista, false);
            FiguraRetas.desenharRetaMp(g, x6, y6, x7, y7, nome, esp, cor, lista, false);
            FiguraRetas.desenharRetaMp(g, x7, y7, x8, y8, nome, esp, cor, lista, false);
            FiguraRetas.desenharRetaMp(g, x8, y8, x9, y9, nome, esp, cor, lista, false);
            FiguraRetas.desenharRetaMp(g, x9, y9, x10, y10, nome, esp, cor, lista, false);
            FiguraRetas.desenharRetaMp(g, x10, y10, x1, y1, nome, esp, cor, lista, false);

            lista.add("Poligono");
            lista.add(x1);
            lista.add(y1);
            lista.add(x2);
            lista.add(y2);
            lista.add(x3);
            lista.add(y3);
            lista.add(x4);
            lista.add(y4);
            lista.add(x5);
            lista.add(y5);
            lista.add(x6);
            lista.add(y6);
            lista.add(x7);
            lista.add(y7);
            lista.add(x8);
            lista.add(y8);
            lista.add(x9);
            lista.add(y9);
            lista.add(x10);
            lista.add(y10);
            lista.add(esp);
            lista.add(cor.getRed());
            lista.add(cor.getGreen());
            lista.add(cor.getBlue());

            for(Object ponto : lista)
            {
                System.out.println(ponto);
            }

        }

        /*
        //Decágono
        switch (vertices)
        {
            case 4:
                FiguraRetas.desenharRetaMp(g, x1, y1, x2, y2, nome, esp, cor);
                FiguraRetas.desenharRetaMp(g, x2, y2, x3, y3, nome, esp, cor);
                FiguraRetas.desenharRetaMp(g, x3, y3, x4, y4, nome, esp, cor);
                FiguraRetas.desenharRetaMp(g, x4, y4, x1, y1, nome, esp, cor);

            case 5:
                FiguraRetas.desenharRetaMp(g, x1, y1, x2, y2, nome, esp, cor);
                FiguraRetas.desenharRetaMp(g, x2, y2, x3, y3, nome, esp, cor);
                FiguraRetas.desenharRetaMp(g, x3, y3, x4, y4, nome, esp, cor);
                FiguraRetas.desenharRetaMp(g, x4, y4, x5, y5, nome, esp, cor);
                FiguraRetas.desenharRetaMp(g, x5, y5, x1, y1, nome, esp, cor);

            case 6:
                FiguraRetas.desenharRetaMp(g, x1, y1, x2, y2, nome, esp, cor);
                FiguraRetas.desenharRetaMp(g, x2, y2, x3, y3, nome, esp, cor);
                FiguraRetas.desenharRetaMp(g, x3, y3, x4, y4, nome, esp, cor);
                FiguraRetas.desenharRetaMp(g, x4, y4, x5, y5, nome, esp, cor);
                FiguraRetas.desenharRetaMp(g, x5, y5, x6, y6, nome, esp, cor);
                FiguraRetas.desenharRetaMp(g, x6, y6, x1, y1, nome, esp, cor);

            case 7:
                FiguraRetas.desenharRetaMp(g, x1, y1, x2, y2, nome, esp, cor);
                FiguraRetas.desenharRetaMp(g, x2, y2, x3, y3, nome, esp, cor);
                FiguraRetas.desenharRetaMp(g, x3, y3, x4, y4, nome, esp, cor);
                FiguraRetas.desenharRetaMp(g, x4, y4, x5, y5, nome, esp, cor);
                FiguraRetas.desenharRetaMp(g, x5, y5, x6, y6, nome, esp, cor);
                FiguraRetas.desenharRetaMp(g, x6, y6, x7, y7, nome, esp, cor);
                FiguraRetas.desenharRetaMp(g, x7, y7, x1, y1, nome, esp, cor);

            case 8:
                FiguraRetas.desenharRetaMp(g, x1, y1, x2, y2, nome, esp, cor);
                FiguraRetas.desenharRetaMp(g, x2, y2, x3, y3, nome, esp, cor);
                FiguraRetas.desenharRetaMp(g, x3, y3, x4, y4, nome, esp, cor);
                FiguraRetas.desenharRetaMp(g, x4, y4, x5, y5, nome, esp, cor);
                FiguraRetas.desenharRetaMp(g, x5, y5, x6, y6, nome, esp, cor);
                FiguraRetas.desenharRetaMp(g, x6, y6, x7, y7, nome, esp, cor);
                FiguraRetas.desenharRetaMp(g, x7, y7, x8, y8, nome, esp, cor);
                FiguraRetas.desenharRetaMp(g, x8, y8, x1, y1, nome, esp, cor);

            case 9:
                FiguraRetas.desenharRetaMp(g, x1, y1, x2, y2, nome, esp, cor);
                FiguraRetas.desenharRetaMp(g, x2, y2, x3, y3, nome, esp, cor);
                FiguraRetas.desenharRetaMp(g, x3, y3, x4, y4, nome, esp, cor);
                FiguraRetas.desenharRetaMp(g, x4, y4, x5, y5, nome, esp, cor);
                FiguraRetas.desenharRetaMp(g, x5, y5, x6, y6, nome, esp, cor);
                FiguraRetas.desenharRetaMp(g, x6, y6, x7, y7, nome, esp, cor);
                FiguraRetas.desenharRetaMp(g, x7, y7, x8, y8, nome, esp, cor);
                FiguraRetas.desenharRetaMp(g, x8, y8, x9, y9, nome, esp, cor);
                FiguraRetas.desenharRetaMp(g, x9, y9, x1, y1, nome, esp, cor);

            case 10:
                FiguraRetas.desenharRetaMp(g, x1, y1, x2, y2, nome, esp, cor);
                FiguraRetas.desenharRetaMp(g, x2, y2, x3, y3, nome, esp, cor);
                FiguraRetas.desenharRetaMp(g, x3, y3, x4, y4, nome, esp, cor);
                FiguraRetas.desenharRetaMp(g, x4, y4, x5, y5, nome, esp, cor);
                FiguraRetas.desenharRetaMp(g, x5, y5, x6, y6, nome, esp, cor);
                FiguraRetas.desenharRetaMp(g, x6, y6, x7, y7, nome, esp, cor);
                FiguraRetas.desenharRetaMp(g, x7, y7, x8, y8, nome, esp, cor);
                FiguraRetas.desenharRetaMp(g, x8, y8, x9, y9, nome, esp, cor);
                FiguraRetas.desenharRetaMp(g, x9, y9, x10, y10, nome, esp, cor);
                FiguraRetas.desenharRetaMp(g, x10, y10, x1, y1, nome, esp, cor);

            default:

        }
         */
    }
}
