package com.thingcinema.filmsarchive.models;

public class Movie {

    private String name;
    private String description;
    private String urlImage;

    public Movie(){

    }

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
