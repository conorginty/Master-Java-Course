package Section_8_Arrays_JavaInbuiltLists_AutoboxingAndUnboxing.LinkedList_Parts.Challenge.MyAttempt;

public class Main {
    // 119. LinkedList Challenge

    // Create a program that implements a Playlist for Songs
    // Create a Song class having Title and Duration for a song
    // The program will have an Album class containing a list of songs
    // The albums will be stored in an ArrayList
    // Songs from different albums can be added to the playlist and will appear in the playlist in the order
    // in which they are added.
    // Once the songs have been added to the playlist, create a menu of options to:
    // - Quit
    // - Skip to the next song
    // - Skip to the previous song
    // - Replay the current song
    // - List the songs in the playlist
    // - Remove the current song from the playlist
    // A song must exist in an album before it can be added to the playlist (so you can only play songs you own)

    public static void main(String[] args) {
        Album album = new Album("Thriller", "Michael Jackson");
        album.addSong("The Girl is Mine", 3.43);
        album.addSong("Billie Jean", 4.33);
        album.addSong("Thriller", 5.57);

        for (int i=0; i < album.getSongs().size(); i++) {
            Song current = album.getSongs().get(i);

            System.out.println((i+1) + " " + current.getTitle() + ": " + current.getDuration());
        }

        Playlist playlist = new Playlist("Cool Hits");
//        playlist.addSong()
    }
}
