package poligono;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import reta.FiguraRetas;

import java.awt.*;
import java.util.LinkedList;

public class FigurasPoligono
{
    public static void desenharPoligono(Graphics g, int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4, int x5, int y5, int x6, int y6, int x7, int y7, int x8, int y8, int x9, int y9, int x10, int y10, String nome, int esp, Color cor, int vertices, LinkedList lista, JSONObject json2, JSONArray arrayPoligono)
    {
        JSONObject json1 = new JSONObject();
        JSONArray arrayCor = new JSONArray();
        JSONArray arrayCoordenada = new JSONArray();
        JSONArray arrayCoordenada2 = new JSONArray();
        JSONArray arrayCoordenada3 = new JSONArray();
        JSONArray arrayCoordenada4 = new JSONArray();
        JSONArray arrayCoordenada5 = new JSONArray();
        JSONArray arrayCoordenada6 = new JSONArray();
        JSONArray arrayCoordenada7 = new JSONArray();
        JSONArray arrayCoordenada8 = new JSONArray();
        JSONArray arrayCoordenada9 = new JSONArray();
        JSONArray arrayCoordenada10 = new JSONArray();
        JSONArray arrayFinal = new JSONArray();


        double cX1 = (float) x1/1000;
        double cY1 = (float) y1/800;
        double cX2 = (float) x2/1000;
        double cY2 = (float) y2/800;
        double cX3 = (float) x3/1000;
        double cY3 = (float) y3/800;

        double cX4 = (float) x4/1000;
        double cY4 = (float) y4/800;


        double cX5 = (float) x5/1000;
        double cY5 = (float) y5/800;


        double cX6 = (float) x6/1000;
        double cY6 = (float) y6/800;

        double cX7 = (float) x7/1000;
        double cY7 = (float) y7/800;

        double cX8 = (float) x8/1000;
        double cY8 = (float) y8/800;

        double cX9 = (float) x9/1000;
        double cY9 = (float) y9/800;

        double cX10 = (float) x10/1000;
        double cY10 = (float) y10/800;

        json1.put("esp: ",  + esp);
        arrayCor.add(cor.getRed());
        arrayCor.add(cor.getGreen());
        arrayCor.add(cor.getBlue());
        json1.put("cor:", arrayCor);

        if (vertices == 4)
        {
            FiguraRetas.desenharRetaMp(g, x1, y1, x2, y2, nome, esp, cor, lista, false);
            FiguraRetas.desenharRetaMp(g, x2, y2, x3, y3, nome, esp, cor, lista, false);
            FiguraRetas.desenharRetaMp(g, x3, y3, x4, y4, nome, esp, cor, lista, false);
            FiguraRetas.desenharRetaMp(g, x4, y4, x1, y1, nome, esp, cor, lista, false);

            arrayCoordenada.add(String.format("%.2f", cX1));
            arrayCoordenada.add(String.format("%.2f", cY1));

            arrayCoordenada2.add(String.format("%.2f", cX2));
            arrayCoordenada2.add(String.format("%.2f", cY2));

            arrayCoordenada3.add(String.format("%.2f", cX3));
            arrayCoordenada3.add(String.format("%.2f", cY3));

            arrayCoordenada4.add(String.format("%.2f", cX4));
            arrayCoordenada4.add(String.format("%.2f", cY4));

            arrayFinal.add(arrayCoordenada);
            arrayFinal.add(arrayCoordenada2);
            arrayFinal.add(arrayCoordenada3);
            arrayFinal.add(arrayCoordenada4);

            json1.put("coord", arrayFinal);
            json1.put("nome", "poligono");
            arrayPoligono.add(json1);
            json2.put("poligonos", arrayPoligono);

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

            arrayCoordenada.add(String.format("%.2f", cX1));
            arrayCoordenada.add(String.format("%.2f", cY1));

            arrayCoordenada2.add(String.format("%.2f", cX2));
            arrayCoordenada2.add(String.format("%.2f", cY2));

            arrayCoordenada3.add(String.format("%.2f", cX3));
            arrayCoordenada3.add(String.format("%.2f", cY3));

            arrayCoordenada4.add(String.format("%.2f", cX4));
            arrayCoordenada4.add(String.format("%.2f", cY4));

            arrayCoordenada5.add(String.format("%.2f", cX5));
            arrayCoordenada5.add(String.format("%.2f", cY5));

            arrayFinal.add(arrayCoordenada);
            arrayFinal.add(arrayCoordenada2);
            arrayFinal.add(arrayCoordenada3);
            arrayFinal.add(arrayCoordenada4);
            arrayFinal.add(arrayCoordenada5);

            json1.put("coord", arrayFinal);
            json1.put("nome", "poligono");
            arrayPoligono.add(json1);
            json2.put("poligonos", arrayPoligono);

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

            arrayCoordenada.add(String.format("%.2f", cX1));
            arrayCoordenada.add(String.format("%.2f", cY1));

            arrayCoordenada2.add(String.format("%.2f", cX2));
            arrayCoordenada2.add(String.format("%.2f", cY2));

            arrayCoordenada3.add(String.format("%.2f", cX3));
            arrayCoordenada3.add(String.format("%.2f", cY3));

            arrayCoordenada4.add(String.format("%.2f", cX4));
            arrayCoordenada4.add(String.format("%.2f", cY4));

            arrayCoordenada5.add(String.format("%.2f", cX5));
            arrayCoordenada5.add(String.format("%.2f", cY5));

            arrayCoordenada6.add(String.format("%.2f", cX6));
            arrayCoordenada6.add(String.format("%.2f", cY6));

            arrayFinal.add(arrayCoordenada);
            arrayFinal.add(arrayCoordenada2);
            arrayFinal.add(arrayCoordenada3);
            arrayFinal.add(arrayCoordenada4);
            arrayFinal.add(arrayCoordenada5);
            arrayFinal.add(arrayCoordenada6);

            json1.put("coord", arrayFinal);
            json1.put("nome", "poligono");
            arrayPoligono.add(json1);
            json2.put("poligonos", arrayPoligono);

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

            arrayCoordenada.add(String.format("%.2f", cX1));
            arrayCoordenada.add(String.format("%.2f", cY1));

            arrayCoordenada2.add(String.format("%.2f", cX2));
            arrayCoordenada2.add(String.format("%.2f", cY2));

            arrayCoordenada3.add(String.format("%.2f", cX3));
            arrayCoordenada3.add(String.format("%.2f", cY3));

            arrayCoordenada4.add(String.format("%.2f", cX4));
            arrayCoordenada4.add(String.format("%.2f", cY4));

            arrayCoordenada5.add(String.format("%.2f", cX5));
            arrayCoordenada5.add(String.format("%.2f", cY5));

            arrayCoordenada6.add(String.format("%.2f", cX6));
            arrayCoordenada6.add(String.format("%.2f", cY6));

            arrayCoordenada7.add(String.format("%.2f", cX7));
            arrayCoordenada7.add(String.format("%.2f", cY7));

            arrayFinal.add(arrayCoordenada);
            arrayFinal.add(arrayCoordenada2);
            arrayFinal.add(arrayCoordenada3);
            arrayFinal.add(arrayCoordenada4);
            arrayFinal.add(arrayCoordenada5);
            arrayFinal.add(arrayCoordenada6);
            arrayFinal.add(arrayCoordenada7);

            json1.put("coord", arrayFinal);
            json1.put("nome", "poligono");
            arrayPoligono.add(json1);
            json2.put("poligonos", arrayPoligono);

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

            arrayCoordenada.add(String.format("%.2f", cX1));
            arrayCoordenada.add(String.format("%.2f", cY1));

            arrayCoordenada2.add(String.format("%.2f", cX2));
            arrayCoordenada2.add(String.format("%.2f", cY2));

            arrayCoordenada3.add(String.format("%.2f", cX3));
            arrayCoordenada3.add(String.format("%.2f", cY3));

            arrayCoordenada4.add(String.format("%.2f", cX4));
            arrayCoordenada4.add(String.format("%.2f", cY4));

            arrayCoordenada5.add(String.format("%.2f", cX5));
            arrayCoordenada5.add(String.format("%.2f", cY5));

            arrayCoordenada6.add(String.format("%.2f", cX6));
            arrayCoordenada6.add(String.format("%.2f", cY6));

            arrayCoordenada7.add(String.format("%.2f", cX7));
            arrayCoordenada7.add(String.format("%.2f", cY7));

            arrayCoordenada8.add(String.format("%.2f", cX8));
            arrayCoordenada8.add(String.format("%.2f", cY8));

            arrayFinal.add(arrayCoordenada);
            arrayFinal.add(arrayCoordenada2);
            arrayFinal.add(arrayCoordenada3);
            arrayFinal.add(arrayCoordenada4);
            arrayFinal.add(arrayCoordenada5);
            arrayFinal.add(arrayCoordenada6);
            arrayFinal.add(arrayCoordenada7);
            arrayFinal.add(arrayCoordenada8);

            json1.put("coord", arrayFinal);
            json1.put("nome", "poligono");
            arrayPoligono.add(json1);
            json2.put("poligonos", arrayPoligono);

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

            arrayCoordenada.add(String.format("%.2f", cX1));
            arrayCoordenada.add(String.format("%.2f", cY1));

            arrayCoordenada2.add(String.format("%.2f", cX2));
            arrayCoordenada2.add(String.format("%.2f", cY2));

            arrayCoordenada3.add(String.format("%.2f", cX3));
            arrayCoordenada3.add(String.format("%.2f", cY3));

            arrayCoordenada4.add(String.format("%.2f", cX4));
            arrayCoordenada4.add(String.format("%.2f", cY4));

            arrayCoordenada5.add(String.format("%.2f", cX5));
            arrayCoordenada5.add(String.format("%.2f", cY5));

            arrayCoordenada6.add(String.format("%.2f", cX6));
            arrayCoordenada6.add(String.format("%.2f", cY6));

            arrayCoordenada7.add(String.format("%.2f", cX7));
            arrayCoordenada7.add(String.format("%.2f", cY7));

            arrayCoordenada8.add(String.format("%.2f", cX8));
            arrayCoordenada8.add(String.format("%.2f", cY8));

            arrayCoordenada9.add(String.format("%.2f", cX9));
            arrayCoordenada9.add(String.format("%.2f", cY9));

            arrayFinal.add(arrayCoordenada);
            arrayFinal.add(arrayCoordenada2);
            arrayFinal.add(arrayCoordenada3);
            arrayFinal.add(arrayCoordenada4);
            arrayFinal.add(arrayCoordenada5);
            arrayFinal.add(arrayCoordenada6);
            arrayFinal.add(arrayCoordenada7);
            arrayFinal.add(arrayCoordenada8);
            arrayFinal.add(arrayCoordenada9);

            json1.put("coord", arrayFinal);
            json1.put("nome", "poligono");
            arrayPoligono.add(json1);
            json2.put("poligonos", arrayPoligono);

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

            arrayCoordenada.add(String.format("%.2f", cX1));
            arrayCoordenada.add(String.format("%.2f", cY1));

            arrayCoordenada2.add(String.format("%.2f", cX2));
            arrayCoordenada2.add(String.format("%.2f", cY2));

            arrayCoordenada3.add(String.format("%.2f", cX3));
            arrayCoordenada3.add(String.format("%.2f", cY3));

            arrayCoordenada4.add(String.format("%.2f", cX4));
            arrayCoordenada4.add(String.format("%.2f", cY4));

            arrayCoordenada5.add(String.format("%.2f", cX5));
            arrayCoordenada5.add(String.format("%.2f", cY5));

            arrayCoordenada6.add(String.format("%.2f", cX6));
            arrayCoordenada6.add(String.format("%.2f", cY6));

            arrayCoordenada7.add(String.format("%.2f", cX7));
            arrayCoordenada7.add(String.format("%.2f", cY7));

            arrayCoordenada8.add(String.format("%.2f", cX8));
            arrayCoordenada8.add(String.format("%.2f", cY8));

            arrayCoordenada9.add(String.format("%.2f", cX9));
            arrayCoordenada9.add(String.format("%.2f", cY9));

            arrayCoordenada10.add(String.format("%.2f", cX10));
            arrayCoordenada10.add(String.format("%.2f", cY10));

            arrayFinal.add(arrayCoordenada);
            arrayFinal.add(arrayCoordenada2);
            arrayFinal.add(arrayCoordenada3);
            arrayFinal.add(arrayCoordenada4);
            arrayFinal.add(arrayCoordenada5);
            arrayFinal.add(arrayCoordenada6);
            arrayFinal.add(arrayCoordenada7);
            arrayFinal.add(arrayCoordenada8);
            arrayFinal.add(arrayCoordenada9);
            arrayFinal.add(arrayCoordenada10);

            json1.put("coord", arrayFinal);
            json1.put("nome", "poligono");
            arrayPoligono.add(json1);
            json2.put("poligonos", arrayPoligono);

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
