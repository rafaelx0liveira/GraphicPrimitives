package ponto;

import java.awt.Color;
import java.awt.Graphics;

public class PontoGr extends Ponto {
    Color corPto = Color.BLACK; // cor do ponto
    String nomePto = ""; // nome do ponto
    Color corNomePto  = Color.BLACK; // cor do nome (string) do ponto
    int diametro = 1; // diametro do ponto, default = 1

    PontoGr(int x, int y){
        super((double)x, (double)y);
        setCorPto(Color.black);
        setCorNomePto(Color.black);
        setNomePto("");
    }

    PontoGr(int x, int y, Color cor){
        super((double)x, (double)y);
        setCorPto(cor);
        setCorNomePto(Color.black);
        setNomePto("");
    }

    /**
     * Constroi um ponto na posicao x, y e com os atributos
     *
     * @param x coordenada x
     * @param y coordenada y
     * @param corPonto corReta do ponto a ser construido
     * @param diametro diametro do ponto
     */
    public PontoGr(int x, int y, Color corPonto, int diametro){
        this(x, y, corPonto);
        setDiametro(diametro);
    }

    /**
     * Constroi um ponto na posicao x, y e com os atributos
     *
     * @param x coordenada x
     * @param y coordenada y
     * @param corPonto corReta do ponto a ser construido
     * @param nomePonto nome do ponto
     * @param diametro diametro do ponto
     */
    public PontoGr(int x, int y, Color corPonto, String nomePonto, int diametro){
        this(x, y, corPonto, diametro);
        setNomePto(nomePonto);
    }
    PontoGr(int x, int y, Color cor, String str){
        super((double)x, (double)y);
        setCorPto(cor);
        setCorNomePto(Color.black);
        setNomePto(str);
    }

    PontoGr(PontoGr p2d, Color cor){
        super(p2d);
        setCorPto(cor);
        setCorNomePto(Color.black);
        setNomePto("");
    }

    public PontoGr(){
        super();
        setCorPto(Color.black);
        setCorNomePto(Color.black);
        setNomePto("");
    }


    /**
     * @return the corPto
     */
    public Color getCorPto() {
        return corPto;
    }

    /**
     * @param corPto the corPto to set
     */
    public void setCorPto(Color corPto) {
        this.corPto = corPto;
    }

    /**
     * @return the nomePto
     */
    public String getNomePto() {
        return nomePto;
    }

    /**
     * @param nomePto the nomePto to set
     */
    public void setNomePto(String nomePto) {
        this.nomePto = nomePto;
    }

    /**
     * @return the corNomePto
     */
    public Color getCorNomePto() {
        return corNomePto;
    }

    /**
     * @param corNomePto the corNomePto to set
     */
    public void setCorNomePto(Color corNomePto) {
        this.corNomePto = corNomePto;
    }

    /**
     * @return the diametro
     */
    public int getDiametro() {
        return diametro;
    }

    /**
     * @param diametro the diametro to set
     */
    public void setDiametro(int diametro) {
        this.diametro = diametro;
    }

    /**
     * desenha um ponto utilizando o oval
     *
     * @param g contexto grafico
     */
    public void desenharPonto(Graphics g)
    {
        // desenha ponto como um oval
        g.setColor(getCorPto());
        g.fillOval((int)getX() -(getDiametro()/2), (int)getY() - (getDiametro()/2), getDiametro(), getDiametro());

        // desenha nome do ponto
        g.setColor(getCorNomePto());
        g.drawString(getNomePto(), (int)getX() + getDiametro(), (int)getY());
    }


    public void desenharFigura(Graphics g, int x, int y, Color corPonto, String nomePonto, int diametro, int raio)
    {
        int baseCurta = (int)1.2247871*raio; //base de um dos triangulos pequenos formados na figura
        int baseLonga = baseCurta*2 - 25; //base de um dos tringulos grandes formados na figura

        PontoGr pontoDireita = new PontoGr(x+raio, y, corPonto, nomePonto, diametro);
        pontoDireita.desenharPonto(g);

        PontoGr pontoEsquerda = new PontoGr(x-raio, y, getCorPto(), getNomePto(), getDiametro());
        pontoEsquerda.desenharPonto(g);

        PontoGr pontoCima = new PontoGr(x, y-baseLonga, getCorPto(), getNomePto(), getDiametro());
        pontoCima.desenharPonto(g);

        PontoGr pontoBaixo = new PontoGr(x, y+baseLonga, getCorPto(), getNomePto(), getDiametro());
        pontoBaixo.desenharPonto(g);

        PontoGr diagonalDireitaBaixo = new PontoGr(x+(2*raio-50), y+87, getCorPto(), getNomePto(), getDiametro());
        diagonalDireitaBaixo.desenharPonto(g);

        PontoGr diagonalDireitaCima = new PontoGr(x+(2*raio-50), y-87, getCorPto(), getNomePto(), getDiametro());
        diagonalDireitaCima.desenharPonto(g);

        PontoGr diagonalEsquerdaBaixo = new PontoGr(x-(2*raio-50), y+87, getCorPto(), getNomePto(), getDiametro());
        diagonalEsquerdaBaixo.desenharPonto(g);

        PontoGr diagonalEsquerdaCima = new PontoGr(x-(2*raio-50), y-87, getCorPto(), getNomePto(), getDiametro());
        diagonalEsquerdaCima.desenharPonto(g);

        PontoGr pontoNoroesteCirculoCentral = new PontoGr(x-raio/2, y-87, getCorPto(), getNomePto(), getDiametro());
        pontoNoroesteCirculoCentral.desenharPonto(g);

        PontoGr pontoNordesteCirculoCentral = new PontoGr(x+raio/2, y-87, getCorPto(), getNomePto(), getDiametro());
        pontoNordesteCirculoCentral.desenharPonto(g);

        PontoGr pontoSudoesteCirculoCentral = new PontoGr(x+raio/2, y+87, getCorPto(), getNomePto(), getDiametro());
        pontoSudoesteCirculoCentral.desenharPonto(g);

        PontoGr pontoSudesteCirculoCentral = new PontoGr(x-raio/2, y+87, getCorPto(), getNomePto(), getDiametro());
        pontoSudesteCirculoCentral.desenharPonto(g);

    }
}
