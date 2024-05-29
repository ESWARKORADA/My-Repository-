
package com.example.song;

import java.util.*;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import com.example.song.Song;
import com.example.song.SongRepository;

// Don't modify the below code
public class SongService implements SongRepository {
    private static HashMap<Integer, Song> playlist = new HashMap<>();

    public SongService() {
        playlist.put(1, new Song(1, "Butta Bomma", "Ramajogayya Sastry", "Armaan Malik", "Thaman S"));
        playlist.put(2, new Song(2, "Kathari Poovazhagi", "Vijay", "Benny Dayal, Swetha Mohan", "A.R. Rahman"));
        playlist.put(3, new Song(3, "Tum Hi Ho", "Mithoon", "Arijit Singh", "Mithoon"));
        playlist.put(4, new Song(4, "Vizhiyil", "Vairamuthu", "Unni Menon", "A.R. Rahman"));
        playlist.put(5, new Song(5, "Nenjame", "Panchu Arunachalam", "S.P.Balasubrahmanyam", "Ilaiyaraaja"));
    }

    // Don't modify the above code

    int uniqueId = 6;

    @Override
    public ArrayList<Song> getList() {
        Collection<Song> collectionBook = playlist.values();
        ArrayList<Song> arrList = new ArrayList<>(collectionBook);
        return arrList;
    }

    @Override

    public Song getSongById(int id) {
        Song song = playlist.get(id);
        if (song == null)
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        return song;
    }

    @Override

    public Song addSong(Song song1) {
        song1.setSongId(uniqueId);
        playlist.put(uniqueId, song1);
        uniqueId += 1;
        return song1;
    }

    @Override
    public Song updateSong(int id, Song song1) {
        Song existingSong = playlist.get(id);
        if (existingSong == null)
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);

        if (song1.getSongName() != null)
            existingSong.setSongName(song1.getSongName());

        if (song1.getLiricist() != null)
            existingSong.setLiricist(song1.getLiricist());

        if (song1.getSinger() != null)
            existingSong.setSinger(song1.getSinger());

        if (song1.getMusicDirector() != null)
            existingSong.setMusicDirector(song1.getMusicDirector());

        return existingSong;
    }

    @Override

    public void deleteSong(int id) {
        Song song = playlist.get(id);

        if (song == null)
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        else {
            playlist.remove(id);
            throw new ResponseStatusException(HttpStatus.NO_CONTENT);
        }
    }

}