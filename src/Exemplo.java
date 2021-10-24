import com.google.gson.Gson;
import ponto.Ponto;

public class Exemplo
{
    public static class Ponto
    {
        float x;
        float y;
        public Ponto()
        {
            x = 10;
            y = 1000;
        }
    }
    public static void main(String[] args)
    {
        Gson gson = new Gson();
        Ponto novoPonto = new Ponto();
        String json = gson.toJson(novoPonto);
        System.out.print(json);
    }
}
