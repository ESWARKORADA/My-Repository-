package com.example.song;

import java.util.*;

public interface SongRepository {
    ArrayList<Song> getList();

    Song getSongById(int id);

    Song addSong(Song song1);

    Song updateSong(int id, Song song1);

    void deleteSong(int id);
}