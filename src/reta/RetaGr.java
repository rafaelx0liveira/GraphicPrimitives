package reta;
import ponto.PontoGr;
import java.awt.Color;
import java.awt.Graphics;

/**
 * Implementacao da classe reta grafica.
 *
 * @author Julio Arakaki
 * @version 1.0 - 24/08/2020
 */
public class RetaGr extends Reta{
    // Atributos da reta grafica
    Color corReta = Color.BLACK;   // cor da reta
    String nomeReta = ""; // nome da reta
    Color corNomeReta  = Color.BLACK;
    int espReta = 1; // espessura da reta

    // Construtores
    /**
     * RetaGr - Constroi uma reta grafica
     *
     * @param x1 int. Coordenada x1
     * @param y1 int. Coordenada y1
     * @param x2 int. Coordenada x2
     * @param y2 int. Coordenada y2
     * @param cor Color. Cor da reta
     * @param nome String. Nome da reta
     * @param esp int. Espessura da reta
     */
    public RetaGr(int x1, int y1, int x2, int y2, Color cor, String nome, int esp){
        super (x1, y1, x2, y2);
        setCorReta(cor);
        setNomeReta(nome);
        setEspReta(esp);
    }

    /**
     * RetaGr - Constroi uma reta grafica
     *
     * @param x1 int. Coordenada x1
     * @param y1 int. Coordenada y1
     * @param x2 int. Coordenada x2
     * @param y2 int. Coordenada y2
     * @param cor Color. Cor da reta
     */
    public RetaGr(int x1, int y1, int x2, int y2, Color cor){
        super (x1, y1, x2, y2);
        setCorReta(cor);
        setNomeReta("");
    }

    /**
     * RetaGr - Constroi uma reta grafica
     *
     * @param x1 int. Coordenada x1
     * @param y1 int. Coordenada y1
     * @param x2 int. Coordenada x2
     * @param y2 int. Coordenada y2
     * @param cor Color. Cor da reta
     * @param esp int. Espessura da reta
     */
    public RetaGr(int x1, int y1, int x2, int y2, Color cor, int esp){
        super (x1, y1, x2, y2);
        setCorReta(cor);
        setNomeReta("");
        setEspReta(esp);
    }

    /**
     * RetaGr - Constroi uma reta grafica
     *
     * @param x1 int. Coordenada x1
     * @param y1 int. Coordenada y1
     * @param x2 int. Coordenada x2
     * @param y2 int. Coordenada y2
     */
    public RetaGr(int x1, int y1, int x2, int y2){
        super (x1, y1, x2, y2);
    }

    /**
     * RetaGr - Constroi uma reta grafica
     *
     * @param p1 PontoGr. Ponto grafico p1 (x1, y1)
     * @param p2 PontoGr. Ponto grafico p2 (x2, y2)
     */
    public RetaGr(PontoGr p1, PontoGr p2){
        super(p1, p2);
    }

    /**
     * RetaGr - Constroi uma reta grafica
     *
     * @param p1 PontoGr. Ponto grafico p1 (x1, y1)
     * @param p2 PontoGr. Ponto grafico p2 (x2, y2)
     * @param cor Color. Cor da reta
     */
    public RetaGr(PontoGr p1, PontoGr p2, Color cor){
        super(p1, p2);
        setCorReta(cor);
    }

    /**
     * RetaGr - Constroi uma reta grafica
     *
     * @param p1 PontoGr. Ponto grafico p1 (x1, y1)
     * @param p2 PontoGr. Ponto grafico p2 (x2, y2)
     * @param cor Color. Cor da reta
     * @param nome String. Nome da reta
     */
    public RetaGr(PontoGr p1, PontoGr p2, Color cor, String str){
        super(p1, p2);
        setCorReta(cor);
        setNomeReta(str);
    }

    /**
     * Altera a cor da reta.
     *
     * @param cor Color. Cor da reta.
     */
    public void setCorReta(Color cor) {
        this.corReta = cor;
    }

    /**
     * Altera o nome da reta.
     *
     * @param str String. Nome da reta.
     */
    public void setNomeReta(String str) {
        this.nomeReta = str;
    }

    /**
     * Altera a espessura da reta.
     *
     * @param esp int. Espessura da reta.
     */
    public void setEspReta(int esp) {
        this.espReta = esp;
    }

    /**
     * Retorna a espessura da reta.
     *
     * @return int. Espessura da reta.
     */
    public int getEspReta() {
        return(this.espReta);
    }

    /**
     * Retorna a cor da reta.
     *
     * @return Color. Cor da reta.
     */
    public Color getCorReta() {
        return corReta;
    }

    /**
     * Retorna o nome da reta.
     *
     * @return String. Nome da reta.
     */
    public String getNomeReta() {
        return nomeReta;
    }

    /**
     * @return the corNomeReta
     */
    public Color getCorNomeReta() {
        return corNomeReta;
    }

    /**
     * @param corNomeReta the corNomeReta to set
     */
    public void setCorNomeReta(Color corNomeReta) {
        this.corNomeReta = corNomeReta;
    }

    /**
     * Desenha reta grafica utilizando a equacao da reta: y = mx + b
     *
     * @param g Graphics. Classe com os metodos graficos do Java
     */
    public void desenharRetaEq(Graphics g){

        // calcula m e b da equacao da reta y = mx + b
        double m = calcularM();
        double b = calcularB();

        // Variaveis auxiliares
        PontoGr ponto = new PontoGr();
        double x, y;

        double pIni;
        double pFim;

        // desenha nome da reta
        g.setColor(getCorNomeReta());
        g.drawString(getNomeReta(), (int)getP1().getX() + getEspReta(), (int)getP1().getY());

        if(p1.getX() == p2.getX()) { // reta vertical
            // Caso 1: y1 < y2
            if (p1.getY() < p2.getY()){
                pIni = p1.getY();
                pFim = p2.getY();
            } else { // Caso 2: y1 > y2
                pIni = p2.getY();
                pFim = p1.getY();
            }
            // percorre de y1 ate y2.
            // x e´ calculado pela equacao: x = (y - b) / m
            for(y = pIni; y <= pFim; ++y){ // percorre de y1 ate y2
                // x1 e x2 são iguais
                x = p1.getX(); // ou x = p2.getX()

                // Define ponto grafico
                //ponto = new PontoGr((int)x, (int)y, getCorReta(), getEspReta());
                ponto.setX((int)x);
                ponto.setY((int)y);
                ponto.setCorPto(getCorReta());
                ponto.setDiametro(getEspReta());

                // Desenha ponto grafico
                ponto.desenharPonto(g);
            }
        } else {
            double deltaX = Math.abs(p1.getX() - p2.getX());
            double deltaY = Math.abs(p1.getY() - p2.getY());

            if (deltaX > deltaY){ // percorre pelo x
                // Caso 1: x1 < x2
                if (p1.getX() < p2.getX()){
                    pIni = p1.getX();
                    pFim = p2.getX();
                } else { // Caso 2: x1 > x2
                    pIni = p2.getX();
                    pFim = p1.getX();
                }

                // percorre de x1 ate x2.
                // y e´ calculado pela equacao: y = mx + b
                for(x = pIni; x <= pFim; ++x){
                    // Calculo de y pela equacao da reta
                    y = (m*x + b);

                    // Define ponto grafico
                    //ponto = new PontoGr((int)x, (int)y, getCorReta(), getEspReta());
                    ponto.setX((int)x);
                    ponto.setY((int)y);
                    ponto.setCorPto(getCorReta());
                    ponto.setDiametro(getEspReta());

                    // Desenha ponto grafico
                    ponto.desenharPonto(g);
                }
            } else { //deltaY > deltaX, percorre pelo y
                // Caso 1: y1 < y2
                if (p1.getY() < p2.getY()){
                    pIni = p1.getY();
                    pFim = p2.getY();
                } else { // Caso 2: y1 > y2
                    pIni = p2.getY();
                    pFim = p1.getY();
                }
                // percorre de y1 ate y2.
                // x e´ calculado pela equacao: x = (y - b) / m
                for(y = pIni; y <= pFim; ++y){ // percorre de y1 ate y2
                    // Calculo de x pela equacao da reta
                    x = ((y - b)/m);

                    // Define ponto grafico
                    //ponto = new PontoGr((int)x, (int)y, getCorReta(), getEspReta());
                    ponto.setX((int)x);
                    ponto.setY((int)y);
                    ponto.setCorPto(getCorReta());
                    ponto.setDiametro(getEspReta());

                    // Desenha ponto grafico
                    ponto.desenharPonto(g);
                }
            }
        }
    }

    /**
     * Desenha reta utilizando o algoritmo de MidPoint (Bresenham)
     * @param g
     */
    void desenharRetaMp(Graphics g){

        int x1 = (int)getP1().getX(), x2 = (int)getP2().getX();
        int y1 = (int)getP1().getY(), y2 = (int)getP2().getY();

        int dx = x2-x1;
        int dy = y2-y1;

        int i, e;
        int incx, incy, inc1, inc2;
        int x,y;

        if (dx < 0) dx = -dx;
        if (dy < 0) dy = -dy;
        incx = 1;
        if (x2 < x1) incx = -1;
        incy = 1;
        if (y2 < y1) incy = -1;
        x = x1; y = y1;

        PontoGr ponto = new PontoGr();
        // desenha nome da reta
        g.setColor(getCorNomeReta());
        g.drawString(getNomeReta(), (int)getP1().getX() + getEspReta(), (int)getP1().getY());

        if (dx > dy) {
            ponto.setX(x);
            ponto.setY(y);
            ponto.setCorPto(getCorReta());
            ponto.setDiametro(getEspReta());
            ponto.desenharPonto(g);
            e = 2 * dy-dx;
            inc1 = 2*(dy-dx);
            inc2 = 2*dy;
            for (i=0; i<dx; i++) {
                if (e >= 0) {
                    y += incy;
                    e += inc1;
                }
                else
                    e += inc2;
                x += incx;
                ponto.setX(x);
                ponto.setY(y);
                ponto.setCorPto(getCorReta());
                ponto.setDiametro(getEspReta());
                ponto.desenharPonto(g);
            }

        } else {
            ponto.setX(x);
            ponto.setY(y);
            ponto.desenharPonto(g);
            e = 2*dx-dy;
            inc1 = 2*(dx-dy);
            inc2 = 2*dx;
            for (i=0; i<dy; i++) {
                if (e >= 0) {
                    x += incx;
                    e += inc1;
                }
                else
                    e += inc2;
                y += incy;
                ponto.setX(x);
                ponto.setY(y);
                ponto.setCorPto(getCorReta());
                ponto.setDiametro(getEspReta());
                ponto.desenharPonto(g);
            }
        }
    }

    void desenharFigura(Graphics g, int x1, int y1, int x2, int y2, int n, int raio)
    {
        int baseCurta = (int)1.2247871*raio; //base de um dos triangulos pequenos formados na figura
        int baseLonga = baseCurta*2 - 25; //base de um dos tringulos grandes formados na figura
        //O raio é equivalente a diagonal de um dos tringulos formados na figura

        //------------------DIREITA-ESQUERDA-CIMA-BAIXO---------------------------------------------//

        RetaGr direita = new RetaGr(x1, y1, x1+raio, y1, getCorReta(), getNomeReta(), getEspReta());
        direita.desenharRetaMp(g);

        RetaGr esquerda = new RetaGr(x1, y1, x1-raio, y1, getCorReta(), getNomeReta(), getEspReta());
        esquerda.desenharRetaMp(g);

        RetaGr baixo = new RetaGr(x1, y1, x1, y1+baseLonga, getCorReta(), getNomeReta(), getEspReta());
        baixo.desenharRetaMp(g);

        RetaGr cima = new RetaGr(x1, y1, x1, y1-baseLonga, getCorReta(), getNomeReta(), getEspReta());
        cima.desenharRetaMp(g);
        //------------------------------------------------------------------------------------------//

        //---------------------------DIAGONAIS-------------------------------------------------------------------------------------//
        RetaGr diagonalSudeste = new RetaGr(x1, y1, x1+(2*raio-50), y1+(baseCurta+14-27), getCorReta(), getNomeReta(), getEspReta());
        diagonalSudeste.desenharRetaMp(g);

        RetaGr diagonalNordeste = new RetaGr(x1, y1, x1+(2*raio-50), y1-(baseCurta+14-27), getCorReta(), getNomeReta(), getEspReta());
        diagonalNordeste.desenharRetaMp(g);

        RetaGr diagonalSudoeste = new RetaGr(x1, y1, x1-(2*raio-50), y1+(baseCurta+14-27), getCorReta(), getNomeReta(), getEspReta());
        diagonalSudoeste.desenharRetaMp(g);

        RetaGr diagonaNoroeste = new RetaGr(x1, y1, x1-(2*raio-50), y1-(baseCurta+14-27), getCorReta(), getNomeReta(), getEspReta());
        diagonaNoroeste.desenharRetaMp(g);
        //-------------------------------------------------------------------------------------------------------------------------//

        //----------------------------HORIZONTAIS------------------------------------------------------------------------------------------------------------------//
        RetaGr horizontalBaixo = new RetaGr(x1-(2*raio-50), y1+baseCurta-13, x1+(2*raio-50), y1+(baseCurta+14-27), getCorReta(), getNomeReta(), getEspReta());
        horizontalBaixo.desenharRetaMp(g);

        RetaGr horizontalCima = new RetaGr(x1+(2*raio-50), y1-baseCurta+13, x1-(2*raio-50), y1-(baseCurta+14-27), getCorReta(), getNomeReta(), getEspReta());
        horizontalCima.desenharRetaMp(g);
        //--------------------------------------------------------------------------------------------------------------------------------------------------//

        //----------------------------DIAGONAIS-INFERIORES-E-SUPERIORES---------------------------------------------------------------------------------------//
        RetaGr diagonalSuperiorDireita = new RetaGr(x1, y1-baseLonga, x1+((int)3.5*raio-150), y1-(baseCurta+14-27), getCorReta(), getNomeReta(), getEspReta());
        diagonalSuperiorDireita.desenharRetaMp(g);

        RetaGr diagonalSuperiorEsquerda = new RetaGr(x1, y1-baseLonga, x1-((int)3.5*raio-150), y1-(baseCurta+14-27), getCorReta(), getNomeReta(), getEspReta());
        diagonalSuperiorEsquerda.desenharRetaMp(g);

        RetaGr diagonalInferiorEsquerda = new RetaGr(x1, y1+baseLonga, x1-((int)3.5*raio-150), y1+(baseCurta+14-27), getCorReta(), getNomeReta(), getEspReta());
        diagonalInferiorEsquerda.desenharRetaMp(g);

        RetaGr diagonalInferiorDireita = new RetaGr(x1, y1+baseLonga, x1+((int)3.5*raio-150), y1+(baseCurta+14-27), getCorReta(), getNomeReta(), getEspReta());
        diagonalInferiorDireita.desenharRetaMp(g);
        //---------------------------------------------------------------------------------------------------------------------------------------------------//

        //-------------------------------------LATERAIS-----------------------------------------------------//
        RetaGr lateralEsquerda = new RetaGr(x1-(2*raio-50), y1-baseLonga/2, x1-((int)3.5*raio-150), y1+(baseCurta+14-27), getCorReta(), getNomeReta(), getEspReta());
        lateralEsquerda.desenharRetaMp(g);

        RetaGr lateralDireita = new RetaGr(x1+(2*raio-50), y1-baseLonga/2, x1+((int)3.5*raio-150), y1+(baseCurta+14-27), getCorReta(), getNomeReta(), getEspReta());
        lateralDireita.desenharRetaMp(g);

        //-------------------------------------DIAGONAL DE CIMA ATÉ A PONTA DA ESQUERDA E DIREITA-----------------------------------------------//
        RetaGr diagonalCBEsquerda = new RetaGr(x1, y1-baseCurta-75, x1-(2*raio-50), y1+(baseCurta+14-27), getCorReta(), getNomeReta(), getEspReta());
        diagonalCBEsquerda.desenharRetaEq(g);

        RetaGr diagonalCBDireita = new RetaGr(x1, y1-baseCurta-75, x1+(2*raio-50), y1+(baseCurta+14-27), getCorReta(), getNomeReta(), getEspReta());
        diagonalCBDireita.desenharRetaEq(g);

        //-------------------------------------DIAGONAL DE BAIXO ATÉ A PONTA DA ESQUERDA E DIREITA-----------------------------------------------//
        RetaGr diagonalBCEsquerda = new RetaGr(x1, y1+baseCurta+75, x1-(2*raio-50), y1-(baseCurta+14-27), getCorReta(), getNomeReta(), getEspReta());
        diagonalBCEsquerda.desenharRetaEq(g);

        RetaGr diagonalBCDireita = new RetaGr(x1, y1+baseCurta+75, x1+(2*raio-50), y1-(baseCurta+14-27), getCorReta(), getNomeReta(), getEspReta());
        diagonalBCDireita.desenharRetaEq(g);
    }

}

