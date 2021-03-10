package Section_9_InnerAndAbstractClassesAndInterfaces.InnerClasses_Parts.Challenge.MyAttempt;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private SongList allSongs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        allSongs = new SongList();
    }

    private class SongList {
        private ArrayList<Song> songs;

        public SongList() {
            songs = new ArrayList<Song>();
        }

        private boolean addSong(String title, double duration) {
            Song songToAdd = findSong(title);
            if (songToAdd == null) {
                // Song doesn't exist in songs
                System.out.println("Adding " + title + " to the Album");
                songToAdd = new Song(title, duration);
                songs.add(songToAdd);
                return true;
            }
            System.out.println("Song already exists in the album");
            return false;
        }

        private Song findSong(String title) {
            System.out.println("All good here");

            for (Song current: songs) {
                if (current.getTitle().equals(title)) {
                    System.out.println(title + " found successfully");
                    return current;
                }
            }
            return null;
        }
    }

    public boolean addSong(String title, double duration) {
        allSongs.addSong(title, duration);
        return true;
    }

    public boolean addToPlaylist(int trackNumber, LinkedList<Song> playlist) {
        int index = trackNumber-1;
        if ((index >= 0) && (index < allSongs.songs.size())) {
            playlist.add(allSongs.songs.get(index));
            return true;
        }
        System.out.println("This album does NOT have a track " + trackNumber);
        return false;
    }

    // Overloaded method for Track Title as well
    public boolean addToPlaylist(String songTitle, LinkedList<Song> playlist) {
        Song songToFind = allSongs.findSong(songTitle);
        if (songToFind != null) {
            // Then it exists in the album, so we can add it to the playlist
            playlist.add(songToFind);
            return true;
        }
        System.out.println("This album does NOT have the song: " + songTitle);
        return false;
    }
}
