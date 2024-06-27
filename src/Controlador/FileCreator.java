package Controlador;

import Modelo.Pelicula;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class FileCreator {
    public static void guardarJson(Pelicula pelicula){
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        try{
            FileWriter jsonFile = new FileWriter(pelicula.getTitle() + ".json");
            jsonFile.write(gson.toJson(pelicula));
            jsonFile.close();
        }catch(IOException e){
            System.out.println("Error: " + e.getClass() + ": " + e.getMessage());
        }
    }
}
