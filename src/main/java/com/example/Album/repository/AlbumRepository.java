package com.example.Album.repository;

import com.example.Album.model.Album;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.*;

@Repository
public class AlbumRepository {
    List <Album> albumList=new ArrayList<>(); //list of Album in albumList = new arrayList

       /*public Album getAlbum(){
        Album album=new Album(1,"Basanta","Big picture","https://scontent.fyto1-2.fna.fbcdn.net/v/t1.18169-9/23915571_10155977224783331_1920875213413390197_n.jpg?_nc_cat=106&ccb=1-7&_nc_sid=19026a&_nc_ohc=fsBkt6QfFMAAX8RrTo9&_nc_ht=scontent.fyto1-2.fna&oh=00_AT8w35Q29SWyfo5-8AwMwg4gdwTL2pyVAhjhNLw7j0swKA&oe=62EA5554");
        return album;
    }*/

    //Add a new album
    public Album saveAlbum(Album album) {
        album.setAlbumId(albumList.size()+1);
        albumList.add(album);
        return album;
    }

    //Return all albums
    public List<Album> getAllAlbums() {
        return albumList;
    }

    //Return the album of specific albumId
    public Album getAlbumById(int albumId) {
        for(Album album:albumList){
            if(album.getAlbumId()==albumId){
                return album;

            }
        }
        return null;

    }
    //Update the album of specific albumId
    public Album updateAlbum(int albumId, Album album) {
        for (Album a:albumList){
            if (a.getAlbumId()==albumId){
                a.setName(album.getName());
                a.setDescription(album.getDescription());
                a.setCoverPicUrl(album.getCoverPicUrl());
                return a;
            }
        }return null;
    }

    //Delete the album
    public Album deleteAlbum(int albumId) {
        Album deletedAlbum = null;
        for (Album a:albumList){
            if (a.getAlbumId() == albumId){
               deletedAlbum = a;
                albumList.remove(a);
                System.out.println("Album Id:- "+ albumId+ " Record deleted");
                return deletedAlbum;

            }
        }return null;

    }
}
