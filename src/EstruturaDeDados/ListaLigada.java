
package EstruturaDeDados;

import java.util.LinkedList;

public class ListaLigada
{
    LinkedList<Object> lista = new LinkedList<>();

    public ListaLigada() {}

    public LinkedList<Object> getLista() {
        return lista;
    }

    public void setLista(LinkedList<Object> lista) {
        this.lista = lista;
    }

    /*
    public static void addLista(Object object)
    {
        LinkedList<Object> lista1 = lista.getLista();
        lista1.add(object);
        lista.setLista(lista1);
    }


     */

}


/*
            // Criar arquivo Json
            try(FileWriter arquivoJson = new FileWriter("JSON.json"))
            {
                put("esp:",  + p1.getDiametro());
                obj1.put("cor:", p1.getCorPto().getRed() + ", " + p1.getCorPto().getGreen() + ", " + p1.getCorPto().getBlue());
                obj1.put("nome", "ponto1");
                //obj1.put("coord", "["+ x + ", " + y + "]");
                array2.add(p1.getX());
                array2.add(p1.getY());

                obj1.put("coord", array2);

                array.add(obj1);
                obj2.put("ponto", array);


                arquivoJson.append(object.toJSONString());
                arquivoJson.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
            json = false;

             */