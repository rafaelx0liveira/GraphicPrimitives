import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Locale;

import javax.swing.JLabel;
import javax.swing.JPanel;

import EstruturaDeDados.ListaLigada;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import poligono.FigurasPoligono;
import ponto.FiguraPontos;
import reta.FiguraRetas;
import circulo.FiguraCirculos;


import retangulo.FiguraRetangulo;
import triangulo.FiguraTriangulos;


/**
 * Escreva a descricao da classe PainelDesenho aqui.
 *
 * @author (seu nome)
 * @version (numero de versao ou data)
 */
public class PainelDesenho extends JPanel implements MouseListener, MouseMotionListener
{
    JLabel msg;           // Label para mensagens
    TipoPrimitivo tipo; // Tipo do primitivo
    Color corAtual;       // Cor atual do primitivo
    int esp;              // Diametro do ponto
    int n;



    //Vertices
    int v;

    int raio;

    // Para ponto
    int x, y;

    // Para reta
    int x1, y1, x2, y2;

    //Para triangulo
    int x3, y3;

    //Para poligono
    int x4 = 0, y4 = 0, x5 = 0, y5 = 0, x6 = 0, y6 = 0, x7 = 0, y7 = 0, x8 = 0, y8 = 0, x9 = 0, y9 = 0, x10 = 0, y10 = 0;


    // selecionar primeiro click do mouse
    boolean primeiraVez = true;
    boolean segundaVez = false;

    boolean terceiraVez = false;
    boolean quartaVez = false;
    boolean quintaVez = false;
    boolean sextaVez = false;
    boolean setimaVez = false;
    boolean oitavaVez = false;
    boolean nonaVez = false;


    /**
     * COnstrutor para objetos da classe PainelDesenho
     */
    public PainelDesenho(JLabel msg, TipoPrimitivo tipo, Color corAtual, int esp, int n)
    {
        setTipo(tipo);
        setMsg(msg);
        setCorAtual(corAtual);
        setEsp(esp);
        setN(n);

        // Adiciona "ouvidor" de eventos de mouse
        this.addMouseListener(this);
        this.addMouseMotionListener(this);
    }

    public PainelDesenho(){}

    boolean limpou = false;

    public boolean isLimpou() {
        return limpou;
    }

    public void setLimpou(boolean limpou) {
        this.limpou = limpou;
    }

    //****************************************
    //**************** JSON ******************
    //****************************************
    JSONObject json2 = new JSONObject();

    JSONArray jsonArrayPonto = new JSONArray();

    JSONArray arrayReta = new JSONArray();
    JSONArray arrayMp = new JSONArray();

    JSONArray arrayCirculo = new JSONArray();

    JSONArray arrayTriangulo = new JSONArray();

    JSONArray arrayRetangulo = new JSONArray();

    JSONArray arrayPoligono = new JSONArray();

    public JSONObject getJson2() {
        return json2;
    }

    public void setJson2(JSONObject json2) {
        this.json2 = json2;
    }

    public JSONArray getArrayPoligono() {
        return arrayPoligono;
    }

    public void setArrayPoligono(JSONArray arrayPoligono) {
        this.arrayPoligono = arrayPoligono;
    }
    //****************************************


    LinkedList <Object> lista = new LinkedList<>();

    public LinkedList<Object> getLista() {
        return lista;
    }

    public void setLista(LinkedList<Object> lista) {
        this.lista = lista;
    }

    public PainelDesenho (LinkedList lista)
    {
        setLista(lista);
    }

    public void setTipo(TipoPrimitivo tipo){
        this.tipo = tipo;
    }

    public TipoPrimitivo getTipo(){
        return this.tipo;
    }

    public void setEsp(int esp){
        this.esp = esp;
    }

    public int getEsp(){
        return this.esp;
    }

    public void setN(int n){
        this.n = n;
    }

    public int getN(){
        return this.n;
    }

    public int getV()
    {
        return this.v;
    }

    public void setV(int v)
    {
        this.v = v;
    }

    public void setCorAtual(Color corAtual){
        this.corAtual = corAtual;
    }

    public Color getCorAtual(){
        return this.corAtual;
    }

    public void setMsg(JLabel msg){
        this.msg = msg;
    }

    public JLabel getMsg(){
        return this.msg;
    }

    /**
     * @return the raio
     */
    public int getRaio() {
        return raio;
    }

    /**
     * @param raio the raio to set
     */
    public void setRaio(int raio) {
        this.raio = raio;
    }

    public void paintComponent(Graphics g) {
        desenharPrimitivos(g);
    }

    // Capturando os Eventos com o mouse
    public void mousePressed(MouseEvent e)
    {
        Graphics g = getGraphics();
        if (tipo == TipoPrimitivo.PONTO)
        {
            //if (! primeiraVez) {
            x = e.getX();
            y = e.getY();
            //}
            //repaint();
            paint(g);
        } else if (tipo == TipoPrimitivo.RETA_EQ || tipo == TipoPrimitivo.RETA_MP || tipo == TipoPrimitivo.RETANGULO)
        {
            if (primeiraVez == true)
            {
                x1 = e.getX();
                y1 = e.getY();
                primeiraVez = false;
            } else {
                x2 = e.getX();
                y2 = e.getY();
                primeiraVez = true;
                paint(g);
            }
        } else if (tipo == TipoPrimitivo.CIRCULO_EQ || tipo == TipoPrimitivo.CIRCULO_MP)
        {
            if (primeiraVez == true)
            {
                x1 = e.getX();
                y1 = e.getY();
                primeiraVez = false;
            } else {
                x2 = (int)e.getX();
                y2 = (int)e.getY();
                primeiraVez = true;

                // calcula o raio
                raio = (int)Math.sqrt(Math.pow((y2-y1), 2) + Math.pow((x2-x1), 2));
                setRaio(raio);
                paint(g);
            }
            //paint(g);
        } else if (tipo == TipoPrimitivo.CIRCULOS_HV || tipo == TipoPrimitivo.FIGURA){
            paint(g);
        }
        else if (tipo == TipoPrimitivo.TRIANGULO)
        {
            if (primeiraVez == true)
            {
                x1 = e.getX();
                y1 = e.getY();
                primeiraVez = false;
                segundaVez = true;
            } else if (segundaVez == true)
            {
                x2 = e.getX();
                y2 = e.getY();
                segundaVez = false;
            } else
            {
                x3 = e.getX();
                y3 = e.getY();
                paint(g);
                primeiraVez = true;
            }
        }
        else if (tipo == TipoPrimitivo.POLIGONO)
        {
            if (primeiraVez == true)
            {
                x1 = e.getX();
                y1 = e.getY();
                primeiraVez = false;
                segundaVez = true;
            } else if (segundaVez == true)
            {
                x2 = e.getX();
                y2 = e.getY();
                segundaVez = false;
                terceiraVez = true;
                if (v == 2)
                {
                    primeiraVez = true;
                    terceiraVez = false;
                    paint(g);
                }
            } else if (terceiraVez == true)
            {
                x3 = e.getX();
                y3 = e.getY();
                terceiraVez = false;
                quartaVez = true;
                if (v == 3)
                {
                    primeiraVez = true;
                    quartaVez = false;
                    paint(g);
                }
            }
            else if (quartaVez == true)
            {
                x4 = e.getX();
                y4 = e.getY();
                quartaVez = false;
                quintaVez = true;
                if (v == 4)
                {
                    primeiraVez = true;
                    quintaVez = false;
                    paint(g);
                }
            }
            else if (quintaVez == true)
            {
                x5 = e.getX();
                y5 = e.getY();
                quintaVez = false;
                sextaVez = true;
                if (v == 5)
                {
                    primeiraVez = true;
                    sextaVez = false;
                    paint(g);
                }
            }
            else if (sextaVez == true)
            {
                x6 = e.getX();
                y6 = e.getY();
                sextaVez = false;
                setimaVez = true;
                if (v == 6)
                {
                    primeiraVez = true;
                    setimaVez = false;
                    paint(g);
                }
            }
            else if (setimaVez == true)
            {
                x7 = e.getX();
                y7 = e.getY();
                setimaVez = false;
                oitavaVez = true;
                if (v == 7)
                {
                    primeiraVez = true;
                    oitavaVez = false;
                    paint(g);
                }
            }
            else if (oitavaVez == true)
            {
                x8 = e.getX();
                y8 = e.getY();
                oitavaVez = false;
                nonaVez = true;
                if (v == 8)
                {
                    primeiraVez = true;
                    nonaVez = false;
                    paint(g);
                }
            }
            else if (nonaVez == true)
            {
                x9 = e.getX();
                y9 = e.getY();
                nonaVez = false;
                if (v == 9)
                {
                    primeiraVez = true;
                    paint(g);
                }
            }
            else
            {
                x10 = e.getX();
                y10 = e.getY();
                paint(g);
                primeiraVez = true;
            }
        }
    }


    public void mouseReleased(MouseEvent e) {
    }

    public void mouseClicked(MouseEvent e) {
        //        this.msg.setText("CLICOU: "+e.getButton());
    }

    public void mouseEntered(MouseEvent e) {
    }

    public void mouseExited(MouseEvent e) {
    }

    public void mouseDragged(MouseEvent e) {
    }

    public void mouseMoved(MouseEvent e) {

        this.msg.setText("("+e.getX() + ", " + e.getY() + ") - " + getTipo());
        //System.out.println("("+e.getX() + ", " + e.getY() + ")");
    }

    public void desenharPrimitivos(Graphics g)
    {
        if (tipo == TipoPrimitivo.PONTO)
        {
            FiguraPontos.desenharPonto(g, x, y, "", getEsp(), getCorAtual(), getLista());

            JSONObject json1 = new JSONObject();
            JSONArray arrayCor = new JSONArray();
            JSONArray arrayCoordenada = new JSONArray();

            double cX = (float) x/1000;
            double cY = (float) y/800;

            json1.put("esp: ",  + getEsp());
            arrayCor.add(getCorAtual().getRed());
            arrayCor.add(getCorAtual().getGreen());
            arrayCor.add(getCorAtual().getBlue());
            json1.put("cor:", arrayCor);
            arrayCoordenada.add(String.format("%.2f", cX));
            arrayCoordenada.add(String.format("%.2f", cY));
            json1.put("coord", arrayCoordenada);
            json1.put("nome", "ponto");
            jsonArrayPonto.add(json1);
            json2.put("pontos", jsonArrayPonto);

        }
        else if (tipo == TipoPrimitivo.RETA_EQ)
        {
            tipo =  TipoPrimitivo.RETA_EQ;
            FiguraRetas.desenharRetaEq(g, x1, y1, x2, y2, "", getEsp(), getCorAtual(), getLista());

            JSONObject json1 = new JSONObject();
            JSONArray arrayCor = new JSONArray();
            JSONArray arrayCoordenada = new JSONArray();
            JSONArray arrayCoordenada2 = new JSONArray();
            JSONArray arrayFinal = new JSONArray();
            JSONArray jsonArray = new JSONArray();

            double cX1 = (float) x1/1000;
            double cY1 = (float) y1/800;
            double cX2 = (float) x2/1000;
            double cY2 = (float) y2/800;

            json1.put("esp: ",  + getEsp());
            arrayCor.add(getCorAtual().getRed());
            arrayCor.add(getCorAtual().getGreen());
            arrayCor.add(getCorAtual().getBlue());
            json1.put("cor:", arrayCor);

            arrayCoordenada.add(String.format("%.2f", cX1));
            arrayCoordenada.add(String.format("%.2f", cY1));

            arrayCoordenada2.add(String.format("%.2f", cX2));
            arrayCoordenada2.add(String.format("%.2f", cY2));

            arrayFinal.add(arrayCoordenada);
            arrayFinal.add(arrayCoordenada2);

            json1.put("coord", arrayFinal);
            json1.put("nome", "reta_eq");
            arrayReta.add(json1);
            json2.put("reta_e'", arrayReta);

        } else if (tipo == TipoPrimitivo.RETA_MP)
        {
            FiguraRetas.desenharRetaMp(g, x1, y1, x2, y2, "", getEsp(), getCorAtual(), getLista(), true);

            JSONObject json1 = new JSONObject();
            JSONArray arrayCor = new JSONArray();
            JSONArray arrayCoordenada = new JSONArray();
            JSONArray arrayCoordenada2 = new JSONArray();
            JSONArray arrayFinal = new JSONArray();

            double cX1 = (float) x1/1000;
            double cY1 = (float) y1/800;
            double cX2 = (float) x2/1000;
            double cY2 = (float) y2/800;

            json1.put("esp: ",  + getEsp());
            arrayCor.add(getCorAtual().getRed());
            arrayCor.add(getCorAtual().getGreen());
            arrayCor.add(getCorAtual().getBlue());
            json1.put("cor:", arrayCor);

            arrayCoordenada.add(String.format("%.2f", cX1));
            arrayCoordenada.add(String.format("%.2f", cY1));

            arrayCoordenada2.add(String.format("%.2f", cX2));
            arrayCoordenada2.add(String.format("%.2f", cY2));

            arrayFinal.add(arrayCoordenada);
            arrayFinal.add(arrayCoordenada2);

            json1.put("coord", arrayFinal);
            json1.put("nome", "reta");
            arrayMp.add(json1);
            json2.put("retas", arrayMp);

        } else if (tipo==TipoPrimitivo.CIRCULO_EQ){
            FiguraCirculos.desenharCirculoEq(g, x1, y1, getRaio(), "", getEsp(), getCorAtual(), getLista());

        } else if (tipo==TipoPrimitivo.CIRCULO_MP){
            FiguraCirculos.desenharCirculoMp(g, x1, y1, getRaio(), "", getEsp(), getCorAtual(), getLista());

            JSONObject json1 = new JSONObject();
            JSONArray arrayCor = new JSONArray();
            JSONArray arrayCoordenada = new JSONArray();
            //JSONArray jsonArray = new JSONArray();

            double cX = (float) x1/1000;
            double cY = (float) y1/800;
            double cRaio = (float) raio/1000;

            json1.put("esp: ",  + getEsp());
            arrayCor.add(getCorAtual().getRed());
            arrayCor.add(getCorAtual().getGreen());
            arrayCor.add(getCorAtual().getBlue());
            json1.put("cor:", arrayCor);
            json1.put("raio", String.format("%.2f", cRaio));
            arrayCoordenada.add(String.format("%.2f", cX));
            arrayCoordenada.add(String.format("%.2f", cY));
            json1.put("centro", arrayCoordenada);
            json1.put("nome", "circulo");
            arrayCirculo.add(json1);
            json2.put("circulos", arrayCirculo);

        } else if (tipo==TipoPrimitivo.CIRCULOS_HV){
            FiguraCirculos.desenharCirculosHv(g, x1, y1, getRaio(), "", getEsp(), getCorAtual(), getN(), getLista());
            //FiguraCirculos.desenharCirculos(g, 50, 2);

        } else if (tipo==TipoPrimitivo.FIGURA){
            FiguraCirculos.desenharFigura(g, x1, y1, getRaio(), "", getEsp(), getCorAtual(), getN());
            FiguraRetas.desenharFigura(g, x1, y1, x2, y2, "", getEsp(), getCorAtual(),getN(), getRaio());
            FiguraPontos.desenharFigura(g, 500, 340, "", getEsp(), getCorAtual(), getN(), getRaio());

        } else if (tipo==TipoPrimitivo.TRIANGULO)
        {
            FiguraTriangulos.desenharTriangulo(g, x1, y1, x2, y2, x3, y3,  "", getEsp(), getCorAtual(), getLista());

            JSONObject json1 = new JSONObject();
            JSONArray arrayCor = new JSONArray();
            JSONArray arrayCoordenada = new JSONArray();
            JSONArray arrayCoordenada2 = new JSONArray();
            JSONArray arrayCoordenada3 = new JSONArray();
            JSONArray arrayFinal = new JSONArray();

            double cX1 = (float) x1/1000;
            double cY1 = (float) y1/800;
            double cX2 = (float) x2/1000;
            double cY2 = (float) y2/800;
            double cX3 = (float) x3/1000;
            double cY3 = (float) y3/800;

            json1.put("esp: ",  + getEsp());
            arrayCor.add(getCorAtual().getRed());
            arrayCor.add(getCorAtual().getGreen());
            arrayCor.add(getCorAtual().getBlue());
            json1.put("cor:", arrayCor);

            arrayCoordenada.add(String.format("%.2f", cX1));
            arrayCoordenada.add(String.format("%.2f", cY1));

            arrayCoordenada2.add(String.format("%.2f", cX2));
            arrayCoordenada2.add(String.format("%.2f", cY2));

            arrayCoordenada3.add(String.format("%.2f", cX3));
            arrayCoordenada3.add(String.format("%.2f", cY3));

            arrayFinal.add(arrayCoordenada);
            arrayFinal.add(arrayCoordenada2);
            arrayFinal.add(arrayCoordenada3);

            json1.put("coord", arrayFinal);
            json1.put("nome", "triangulo");
            arrayTriangulo.add(json1);
            json2.put("triangulos", arrayTriangulo);
        }
        else if (tipo==TipoPrimitivo.POLIGONO)
        {
            FigurasPoligono.desenharPoligono(g, x1, y1, x2, y2, x3, y3, x4, y4, x5, y5, x6, y6, x7, y7, x8, y8, x9, y9, x10, y10, "", getEsp(), getCorAtual(), getV(), getLista(), getJson2(), getArrayPoligono());

        }

        else if (tipo==TipoPrimitivo.RETANGULO)
        {
            FiguraRetangulo.desenharRetangulo(g, x1, x2, y1, y2, "", getEsp(), getCorAtual(), getLista());

            JSONObject json1 = new JSONObject();
            JSONArray arrayCor = new JSONArray();
            JSONArray arrayCoordenada = new JSONArray();
            JSONArray arrayCoordenada2 = new JSONArray();
            JSONArray arrayFinal = new JSONArray();

            double cX1 = (float) x1/1000;
            double cY1 = (float) y1/800;
            double cX2 = (float) x2/1000;
            double cY2 = (float) y2/800;

            json1.put("esp: ",  + getEsp());
            arrayCor.add(getCorAtual().getRed());
            arrayCor.add(getCorAtual().getGreen());
            arrayCor.add(getCorAtual().getBlue());
            json1.put("cor:", arrayCor);

            arrayCoordenada.add(String.format("%.2f", cX1));
            arrayCoordenada.add(String.format("%.2f", cY1));

            arrayCoordenada2.add(String.format("%.2f", cX2));
            arrayCoordenada2.add(String.format("%.2f", cY2));

            arrayFinal.add(arrayCoordenada);
            arrayFinal.add(arrayCoordenada2);

            json1.put("coord", arrayFinal);
            json1.put("nome", "retangulo");
            arrayRetangulo.add(json1);
            json2.put("retangulos", arrayRetangulo);

        }

        if(limpou == true)
        {
            getLista().clear();
            System.out.println(lista.getFirst());
            System.out.println("Limpou");
            limpou = false;
        }


        try(FileWriter arquivoJson = new FileWriter("JSON.json"))
        {
            arquivoJson.append(getJson2().toString());
            arquivoJson.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
