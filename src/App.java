import Class.ConnectionAPI;
import Class.Metheds;

public class App {
    public static void main(String[] args) throws Exception {

        Metheds metodos = new Metheds();

        
        System.out.println("Hello, World!");
        System.out.println(metodos.CoisasAleatorias());

        metodos.RestoDivisao(4);
        metodos.RestoDivisao(5);

        ConnectionAPI connectionAPI = new ConnectionAPI();

        connectionAPI.API("https://viacep.com.br/ws/64060170/json/");

        connectionAPI.API("https://economia.awesomeapi.com.br/json/last/USD-BRL");

        connectionAPI.API("https://api.jikan.moe/v4/anime/2");

        connectionAPI.API("https://pokeapi.co/api/v2/pokemon/ditto");

        connectionAPI.API("https://jsonplaceholder.typicode.com/users");
    }
}

