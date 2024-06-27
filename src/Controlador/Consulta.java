package Controlador;
import Modelo.Pelicula;
import com.google.gson.Gson;

import java.net.http.*;
import java.net.URI;

public class Consulta {

        public static Pelicula buscarPelicula(int idPelicula){
            URI direccion = URI.create("https://swapi.dev/api/films/" + idPelicula);

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder().uri(direccion).build();

            try {
                HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
                return new Gson().fromJson(response.body(), Pelicula.class);
            }catch (Exception e){
                throw new RuntimeException("Movie not found: " + e.getMessage());
            }
        }
}
