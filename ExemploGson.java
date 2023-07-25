package br.com.screenmatch.gson;
import com.google.gson.Gson;
public class ExemploGson {
    public static void main(String[] args) {
        String json = """
          {
            "nome" : "João",
            "idade" : 30,
            "email" : "joao@email.com"
          }
        """;
        Gson gson = new Gson();
        Pessoa pessoa = gson.fromJson(json, Pessoa.class);
        System.out.println(pessoa.getIdade());
    }
}

