package circulo;
import java.awt.Color;
import java.awt.Graphics;
import java.util.LinkedList;

/**
 * Desenhar figuras com circulo.
 *
 * @author Julio Arakaki
 * @version 27/08/2021
 */
public class FiguraCirculos {
    public static void desenharCirculoEq(Graphics g, int xc, int yc, int raio, String nome, int esp, Color cor, LinkedList lista){
        CirculoGr c = new CirculoGr(xc, yc, raio, cor, nome, esp);

        lista.add("CirculoEq");
        lista.add(xc);
        lista.add(yc);
        lista.add(raio);
        lista.add(esp);
        lista.add(cor.getRed());
        lista.add(cor.getGreen());
        lista.add(cor.getBlue());

        for(Object ponto : lista)
        {
            System.out.println(ponto);
        }

        c.desenharCirculoEq(g);
    }
    public static void desenharCirculoMp(Graphics g, int xc, int yc, int raio, String nome, int esp, Color cor, LinkedList lista){
        CirculoGr c = new CirculoGr(xc, yc, raio, cor, nome, esp);

        lista.add("CirculoMp");
        lista.add(xc);
        lista.add(yc);
        lista.add(raio);
        lista.add(esp);
        lista.add(cor.getRed());
        lista.add(cor.getGreen());
        lista.add(cor.getBlue());

        for(Object ponto : lista)
        {
            System.out.println(ponto);
        }

        c.desenharCirculoMp(g);
    }
    public static void desenharCirculosHv(Graphics g, int xc, int yc, int raio, String nome, int esp, Color cor, int n, LinkedList lista){
        //CirculoGr c = new CirculoGr(xc, yc, raio, cor, nome, esp);
        //c.desenharCirculosHv(g, xc, yc, 1);
        CirculoGr c = new CirculoGr(500, 340, 160, cor, nome, esp);

        lista.add("CirculoEq");
        lista.add(xc);
        lista.add(yc);
        lista.add(raio);
        lista.add(esp);
        lista.add(n);
        lista.add(cor.getRed());
        lista.add(cor.getGreen());
        lista.add(cor.getBlue());

        for(Object ponto : lista)
        {
            System.out.println(ponto);
        }

        c.desenharCirculosHv(g, 500, 340, n, 1);
    }
    public static void desenharFigura(Graphics g, int xc, int yc, int raio, String nome, int esp, Color cor, int n){
        CirculoGr c = new CirculoGr(500, 340, 100, cor.green, nome, esp);
        c.desenharFigura(g, 500, 340, n);
    }

    public static void desenharCirculos(Graphics g, int qtde, int esp){

        for(int i=0; i < qtde; i++) {
            int xc = (int) (Math.random() * 701);
            int yc = (int) (Math.random() * 601);
            int raio = (int) (Math.random() * 601);

            // R, G e B aleatorio
            Color cor = new Color((int) (Math.random() * 256),
                    (int) (Math.random() * 256),
                    (int) (Math.random() * 256));
            CirculoGr c = new CirculoGr(xc, yc, raio, cor, "", esp);
            c.desenharCirculoMp(g);
        }
    }
}
