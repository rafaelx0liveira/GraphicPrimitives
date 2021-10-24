import EstruturaDeDados.ListaLigada;

import java.awt.BorderLayout;
import java.awt.Color;
import java.util.LinkedList;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.JToolBar;

@SuppressWarnings("serial")
class Gui extends JFrame
{
    // Tipo Atual de primitivo
    private TipoPrimitivo tipoAtual = TipoPrimitivo.NENHUM;

    // Cor atual
    private Color corAtual = Color.BLACK;

    // Espessura atual do primitivo
    private int espAtual = 1;
    private int nAtual = 1;
    private int vAtual = 4;

    // Componentes de GUI
    // barra de menu (inserir componente)
    private JToolBar barraComandos = new JToolBar();

    // mensagens
    private JLabel msg = new JLabel("Msg: ");

    ListaLigada lista = new ListaLigada();

    // Painel de desenho
    private PainelDesenho areaDesenho = new PainelDesenho(msg, tipoAtual, corAtual, 10, 10);

    // Botoes
    private JButton jbSalvar = new JButton("Salvar");

    private JButton jbPonto = new JButton("Ponto");
    private JButton jbRetaEq = new JButton("RetaEq");
    private JButton jbRetaMp = new JButton("RetaMp");
    private JButton jbCirculoEq = new JButton("CirculoEq");
    private JButton jbCirculoMp = new JButton("CirculoMp");
    private JButton jbCirculosHv = new JButton("CirculosHv");

    // JButton para Triangulo
    private JButton jbTriangulo = new JButton("Triângulo");

    //JButton para Poligono
    private JButton jbPoligono = new JButton("Polígono");

    //JButton para Retangulo
    private JButton jbRetangulo = new JButton("Retângulo");

    private JButton jbFigura = new JButton("Figura");
    private JButton jbLimpar = new JButton("Limpar");


    private JButton jbCor = new JButton("Cor");


    private JButton jbSair = new JButton("Sair");

    // Entrada (slider) para definir espessura dos primitivos
    private JLabel jlEsp = new JLabel("   Espessura: " + String.format("%-5s", 1));
    private JSlider jsEsp = new JSlider(1, 50, 1);

    private JLabel jlN = new JLabel("   Divisoes: " + String.format("%-5s", 1));
    private JSlider jsN = new JSlider(1, 10, 1);

    //Vertices
    private JLabel jlV = new JLabel("   Vertices: " + String.format("%-5s", 4));
    private JSlider jsV = new JSlider(4, 10, 4);

    // Construtor
    public Gui(int larg, int alt)
    {
        /**
         * Definicoes de janela
         */
        super("Testa Primitivos");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(larg, alt);
        setVisible(true);

        //-----------------------------
        barraComandos.add(jbSalvar);
        //-----------------------------

        barraComandos.add(jbPonto);
        barraComandos.add(jbRetaEq);
        barraComandos.add(jbRetaMp);
        barraComandos.add(jbCirculoEq);
        barraComandos.add(jbCirculoMp);
        barraComandos.add(jbCirculosHv);

        //-----------------------------
        barraComandos.add(jbTriangulo);
        //-----------------------------

        //-----------------------------
        barraComandos.add(jbPoligono);
        //-----------------------------

        //-----------------------------
        barraComandos.add(jbRetangulo);
        //-----------------------------

        barraComandos.add(jbFigura);
        barraComandos.add(jbLimpar); // Botao de Limpar

        barraComandos.add(jbCor); // Botao de Cores


        barraComandos.add(jlEsp); // Label para espessura
        barraComandos.add(jsEsp);    // Slider para espacamento
        areaDesenho.setEsp(espAtual); // define a espessura inicial

        //Slider para divisoes
        barraComandos.add(jlN); // Label para espessura
        barraComandos.add(jsN);    // Slider para espacamento
        areaDesenho.setN(nAtual); // define a espessura inicial

        //Slider para vertices
        barraComandos.add(jlV);
        barraComandos.add(jsV);    // Slider para Vertices
        areaDesenho.setV(vAtual);   //Slider para Vertices

        barraComandos.add(jbSair); // Botao de Cores

        // adiciona os componentes com os respectivos layouts
        add(barraComandos, BorderLayout.NORTH);
        add(areaDesenho, BorderLayout.CENTER);
        add(msg, BorderLayout.SOUTH);

        // Adiciona "tratador" ("ouvidor") de eventos para
        // cada componente

        jbSalvar.addActionListener(e -> {

        });

        jbPonto.addActionListener(e -> {
            tipoAtual = TipoPrimitivo.PONTO;
            areaDesenho.setTipo(tipoAtual);
        });
        jbRetaEq.addActionListener(e -> {
            tipoAtual = TipoPrimitivo.RETA_EQ;
            areaDesenho.setTipo(tipoAtual);
        });
        jbRetaMp.addActionListener(e -> {
            tipoAtual = TipoPrimitivo.RETA_MP;
            areaDesenho.setTipo(tipoAtual);
        });
        jbCirculoEq.addActionListener(e -> {
            tipoAtual = TipoPrimitivo.CIRCULO_EQ;
            areaDesenho.setTipo(tipoAtual);
        });
        jbCirculoMp.addActionListener(e -> {
            tipoAtual = TipoPrimitivo.CIRCULO_MP;
            areaDesenho.setTipo(tipoAtual);
        });
        jbCirculosHv.addActionListener(e -> {
            tipoAtual = TipoPrimitivo.CIRCULOS_HV;
            areaDesenho.setTipo(tipoAtual);
        });

        jbTriangulo.addActionListener(e -> {
            tipoAtual = TipoPrimitivo.TRIANGULO;
            areaDesenho.setTipo(tipoAtual);
        });

        jbPoligono.addActionListener(e -> {
            tipoAtual = TipoPrimitivo.POLIGONO;
            areaDesenho.setTipo(tipoAtual);
        });

        jbRetangulo.addActionListener(e -> {
            tipoAtual = TipoPrimitivo.RETANGULO;
            areaDesenho.setTipo(tipoAtual);
        });

        jbFigura.addActionListener(e -> {
            tipoAtual = TipoPrimitivo.FIGURA;
            areaDesenho.setTipo(tipoAtual);
        });

        jbLimpar.addActionListener(e -> {
            PainelDesenho painel = new PainelDesenho();
            LinkedList lista = painel.getLista();
            lista.clear();
            painel.setLista(lista);
            System.out.println("LIMPOU PORA");
            areaDesenho.removeAll();
            jsEsp.setValue(1); // inicia slider (necessário para limpar ultimo primitivo da tela)
            jsN.setValue(1);
            repaint();
        });

        jbCor.addActionListener(e -> {
            Color c = JColorChooser.showDialog(null, "Escolha uma cor", msg.getForeground());
            if (c != null){
                corAtual = c; // pega do chooserColor
            }
            areaDesenho.setCorAtual(corAtual); // cor atual
        });


        jsEsp.addChangeListener(e -> {
            espAtual = jsEsp.getValue();
            jlEsp.setText("   Espessura: " + String.format("%-5s", espAtual));
            areaDesenho.setEsp(espAtual);
        });


        jsN.addChangeListener(e -> {
            nAtual = jsN.getValue();
            jlN.setText("   Divisões: " + String.format("%-5s", nAtual));
            areaDesenho.setN(nAtual);
        });

        jsV.addChangeListener(e -> {
            vAtual = jsV.getValue();
            jlV.setText("   Vértices: " + String.format("%-5s", vAtual));
            areaDesenho.setV(vAtual);
        });

        jbSair.addActionListener(e -> {
            System.exit(0);
        });
    }
}
