package com.example.Album.model;


public class Album {
    private int albumId;
    private String name;
    private String description;
    private String coverPicUrl;

    public Album(int albumId, String name, String description, String coverPicUrl) {
        this.albumId = albumId;
        this.name = name;
        this.description = description;
        this.coverPicUrl = coverPicUrl;
    }

    public int getAlbumId() {
        return albumId;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getCoverPicUrl() {
        return coverPicUrl;
    }

    public void setAlbumId(int albumId) {
        this.albumId = albumId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCoverPicUrl(String coverPicUrl) {
        this.coverPicUrl = coverPicUrl;
    }
}
