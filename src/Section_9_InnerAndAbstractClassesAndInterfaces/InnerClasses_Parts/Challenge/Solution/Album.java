package Section_9_InnerAndAbstractClassesAndInterfaces.InnerClasses_Parts.Challenge.Solution;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private SongList songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        songs = new SongList();
    }

    private class SongList {
        private ArrayList<Song> songs;

        public SongList() {
            songs = new ArrayList<Song>();
        }

        private boolean add(Song song) {
            if (songs.contains(song)) {
                return false;
            }
            songs.add(song);
            return true;
        }

        private Song findSong(String title) {
            for (Song current: songs) {
                if (current.getTitle().equals(title)) {
                    System.out.println(title + " found successfully");
                    return current;
                }
            }
            return null;
        }

        private Song findSong(int trackNumber) {
            int index = trackNumber-1;
            if ((index >= 0) && (index < songs.size())) {
                return songs.get(index);
            }
            return null;
        }
    }

    public boolean addSong(String title, double duration) {
        return songs.add(new Song(title, duration));
    }

    public boolean addToPlaylist(int trackNumber, LinkedList<Song> playlist) {
        Song checkedSong = songs.findSong(trackNumber);
        if (checkedSong != null) {
            playlist.add(checkedSong);
            return true;
        }
        return false;
    }

    // Overloaded method for Track Title as well
    public boolean addToPlaylist(String songTitle, LinkedList<Song> playlist) {
        Song checkedSong = songs.findSong(songTitle);
        if (checkedSong != null) {
            playlist.add(checkedSong);
            return true;
        }
        return false;
    }
}
