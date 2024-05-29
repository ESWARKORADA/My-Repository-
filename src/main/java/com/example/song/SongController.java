package com.example.song;

import org.springframework.web.bind.annotation.*;
import com.example.song.Song;
import com.example.song.SongService;
import java.util.*;

@RestController
public class SongController {
    SongService songService = new SongService();

    @GetMapping("/songs")
    public ArrayList<Song> getList() {
        return songService.getList();
    }

    @GetMapping("/songs/{songId}")
    public Song getSongById(@PathVariable("songId") int id) {
        return songService.getSongById(id);
    }

    @PostMapping("/songs")
    public Song addSong(@RequestBody Song song1) {
        return songService.addSong(song1);
    }

    @PutMapping("/songs/{songId}")
    public Song updateSong(@PathVariable("songId") int id, @RequestBody Song song1) {
        return songService.updateSong(id, song1);
    }

    @DeleteMapping("/songs/{songId}")

    public void deleteSong(@PathVariable("songId") int id) {
        songService.deleteSong(id);
    }
}