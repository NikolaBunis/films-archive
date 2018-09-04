package models;

public class Movie {

    String name;
    String description;
    String urlImage;

    public Movie(String name, String description, String urlImage) {
        setName(name);
        setDescription(description);
        setUrlImage(urlImage);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }
}
