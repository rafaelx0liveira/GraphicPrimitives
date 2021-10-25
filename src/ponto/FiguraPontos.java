package ponto;

import EstruturaDeDados.ListaLigada;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.awt.*;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;

/**
 * Escreva a descricao da classe FiguraCirculos aqui.
 *
 * @author (seu nome)
 * @version (numero de versao ou data)
 */
public class FiguraPontos
{

    public static void desenharPonto(Graphics g, int x, int y, String nome, int diametro, Color cor, LinkedList lista)
    {
        PontoGr p = new PontoGr(x, y, cor, nome, diametro);

        //lista.add("Ponto");




        //array1.clear();




        //json1.put("coord", array2);






        lista.add(x);
        //array1.add(lista.getLast());
        //array1.add(x);

        lista.add(y);
        //array1.add(y);

        //array1.add(lista.getLast());
        //jsonArray.add(lista);

        //json1.put("coord", array1);


        //array2.add(json1);
        //json2.put("ponto", array2);


        /*
        lista.add("Ponto");
        lista.add(x);
        lista.add(y);
         */

        lista.add(cor.getRed());
        lista.add(cor.getGreen());
        lista.add(cor.getBlue());
        lista.add(diametro);



        for(Object ponto : lista)
        {
            System.out.println(ponto);
        }
        p.desenharPonto(g);
    }


    public static void desenharFigura(Graphics g, int x, int y, String nome, int esp, Color cor, int tamanho, int raio)
    {
        /*
        x = 500;
        y = 340;*/
        // Color cor = new Color((int) (Math.random() * 256),
        // (int) (Math.random() * 256),
        // (int) (Math.random() * 256));
        // public PontoGr(int x, int y, Color corPonto, String nomePonto, int diametro)
        PontoGr p = new PontoGr(x, y, cor.blue, nome, 10);
        p.desenharFigura(g, x, y, cor.blue, nome, 10, 100);
    }

    public static void desenharPontos(Graphics g, int qtde, int larg){

        for(int i=0; i < qtde; i++) {
            int x = (int) (Math.random() * 801);
            int y = (int) (Math.random() * 801);

            // R, G e B aleatorio
            Color cor = new Color((int) (Math.random() * 256),
                    (int) (Math.random() * 256),
                    (int) (Math.random() * 256));
            PontoGr p = new PontoGr(x, y, cor, larg);
            p.desenharPonto(g);
        }
    }
}
