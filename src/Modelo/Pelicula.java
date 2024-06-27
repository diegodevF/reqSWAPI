package Modelo;

public class Pelicula {

    private String title;
    private String episode_id;

    public Pelicula(String title, String episode_id) {
        this.title = title;
        this.episode_id = episode_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEpisode_id() {
        return episode_id;
    }

    public void setEpisode_id(String episode_id) {
        this.episode_id = episode_id;
    }

    @Override
    public String toString() {
        return "Pelicula - Titulo: " + title + ", Episodio: " + episode_id + "]";
    }
}
