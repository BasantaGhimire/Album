package com.example.Album.resourse;

import com.example.Album.model.Album;
import com.example.Album.service.AlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.*;


@RestController
@RequestMapping("/api")
public class AlbumResource {
    @Autowired
    private AlbumService albumService;

    /*@GetMapping("/album")
    public Album getUser(){
        return  albumService.getAlbum();
    }*/

    @PostMapping("/album")
    public Album saveAlbum(@RequestBody Album album){
        return albumService.saveAlbum(album);
    }

    @GetMapping("/Album")
    public List<Album> getAllAlbums(){
        return albumService.getAllAlbums();
    }

    @GetMapping("/album/{albumId}")
    public Album getAlbumById(@PathVariable("albumId") int albumId){
        return albumService.getAlbumById(albumId);
    }
    @PutMapping("/album/{albumId}")
    public Album updateAlbum(@PathVariable("albumId") int albumId, @RequestBody Album album){
        return albumService.updateAlbum(albumId, album);
    }

    @DeleteMapping("/album")
    public Album deleteAlbum(@RequestParam(name="albumId") int albumId){
        return albumService.deleteAlbum(albumId);
    }
}
