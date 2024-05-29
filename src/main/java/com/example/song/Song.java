package com.example.song;

public class Song {
    private int songId;
    private String songName;
    private String liricist;
    private String singer;
    private String musicDirector;

    public Song(int songId, String songName, String liricist, String singer, String musicDirector) {
        this.songId = songId;
        this.songName = songName;
        this.liricist = liricist;
        this.singer = singer;
        this.musicDirector = musicDirector;
    }

    public int getSongId() {
        return songId;
    }

    public void setSongId(int id) {
        this.songId = id;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String name) {
        this.songName = name;
    }

    public String getLiricist() {
        return liricist;
    }

    public void setLiricist(String liricist) {
        this.liricist = liricist;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getMusicDirector() {
        return musicDirector;
    }

    public void setMusicDirector(String musicDirector) {
        this.musicDirector = musicDirector;
    }
}