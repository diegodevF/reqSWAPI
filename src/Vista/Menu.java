package Vista;

import Controlador.Consulta;
import Controlador.FileCreator;
import Modelo.Pelicula;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Star Wars API.");
        System.out.println("Digite la pelicula a buscar: ");
        int idPelicula = Integer.valueOf(entrada.nextLine());

        try {
            Pelicula pelicula = Consulta.buscarPelicula(idPelicula);
            System.out.println(pelicula);
            FileCreator.guardarJson(pelicula);
        }catch(Exception e){
            System.out.println("Error: " + e.getClass() + ": " + e.getMessage());
        }
    }
}
