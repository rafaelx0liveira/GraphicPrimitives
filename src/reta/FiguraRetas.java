package reta;
import java.awt.*;
import java.util.LinkedList;

/**
 * Escreva a descriÃ§Ã£o da classe FiguraRetas aqui.
 *
 * @author (seu nome)
 * @version (nÃºmero de versÃ£o ou data)
 */
public class FiguraRetas {
    public static void desenharRetaEq(Graphics g, int x1, int y1, int x2, int y2, String nome, int esp, Color cor, LinkedList lista){
        RetaGr r = new RetaGr(x1, y1, x2, y2, cor, nome, esp);

        lista.add("RetaEq");
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

        r.desenharRetaEq(g);
    }
    public static void desenharRetaMp(Graphics g, int x1, int y1, int x2, int y2, String nome, int esp, Color cor, LinkedList lista, boolean teste){
        RetaGr r = new RetaGr(x1, y1, x2, y2, cor, nome, esp);

        if (teste == true)
        {
            lista.add("RetaMp");
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


        r.desenharRetaMp(g );
    }
    public static void desenharFigura(Graphics g, int x1, int y1, int x2, int y2, String nome, int esp, Color cor, int n, int raio){
        RetaGr r = new RetaGr(500, 340, x2, y2, cor.red, nome, esp);
        r.desenharFigura(g, 500, 340, x2, y2, n, 100);
    }

    public static void desenharRetas(Graphics g, int qtde, int esp){

        for(int i=0; i < qtde; i++) {
            int x1 = (int) (Math.random() * 801);
            int y1 = (int) (Math.random() * 801);
            int x2 = (int) (Math.random() * 801);
            int y2 = (int) (Math.random() * 801);

            // R, G e B aleatorio
            Color cor = new Color((int) (Math.random() * 256),
                    (int) (Math.random() * 256),
                    (int) (Math.random() * 256));
            RetaGr r = new RetaGr(x1, y1, x2, y2, cor, "", esp);
            r.desenharRetaMp(g);
        }
    }
}
