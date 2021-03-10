package Section_9_InnerAndAbstractClassesAndInterfaces.InnerClasses_Parts.Challenge.Solution;

import java.util.*;

public class Main {

    // 129. Inner Classes Challenge

    public static void main(String[] args) {
        ArrayList<Album> albums = new ArrayList<>();

        Album album = new Album("Stormbringer", "Deep Purple");
        album.addSong("Stormbringer", 4.6);
        album.addSong("Love don't mean a thing", 4.22);
        album.addSong("Holy man", 4.3);
        album.addSong("Hold on", 5.6);
        album.addSong("Lady double dealer", 3.21);
        album.addSong("You can't do it right", 6.23);
        album.addSong("High ball shooter", 4.27);
        album.addSong("The gypsy", 4.2);
        album.addSong("Soldier of fortune", 3.13);
        albums.add(album);

        album = new Album("For those about to rock", "AC/DC");
        album.addSong("For those about to rock", 5.44);
        album.addSong("I put the finger on you", 3.25);
        album.addSong("Lets go", 3.45);
        album.addSong("Inject the venom", 3.33);
        album.addSong("Snowballed", 4.51);
        album.addSong("Evil walks", 3.45);
        album.addSong("C.O.D.", 5.25);
        album.addSong("Breaking the rules", 5.32);
        album.addSong("Night of the long knives", 5.12);
        albums.add(album);

        LinkedList<Song> playList = new LinkedList<Song>();
        // Focusing on the Deep Purple album
        albums.get(0).addToPlaylist("You can't do it right", playList);
        albums.get(0).addToPlaylist("Holy man", playList);
        albums.get(0).addToPlaylist("Speed king", playList);  // Does not exist
        albums.get(0).addToPlaylist(9, playList);
        // Now focusing on the AC/DC album
        albums.get(1).addToPlaylist(3, playList);
        albums.get(1).addToPlaylist(2, playList);
        albums.get(1).addToPlaylist(24, playList);  // There is no track 24
        System.out.println("===========");
        play(playList);
    }

    private static void play(LinkedList<Song> playlist) {
        ListIterator<Song> listIterator = playlist.listIterator();
        if (playlist.size() == 0) {
            System.out.println("No songs in playlist");
            return;
        } else {
            System.out.println("Now playing: " + listIterator.next().toString());
            printMenu();
        }
        Scanner scanner = new Scanner((System.in));
        boolean quit = false;
        boolean forward = true;

        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine(); // clear the buffer

            switch (action) {
                case 0:
                    System.out.println("Exiting playlist...");
                    quit = true;
                    break;
                case 1:
                    // ===== Going Forwards =====
                    // If we're going backwards
                    if (!forward) {
                        // If there is another song going forward
                        if (listIterator.hasNext()) {
                            // Go to SAME SONG (I THINK???) - Coz of Looping Problem (Tortoise and Hare)
                            listIterator.next();
                            forward = true;
                        }
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("Now playing: " + listIterator.next().toString());
                    } else {
                        System.out.println("END of the playlist reached.");
                        forward = false; // because we cannot go forward anymore
                    }
                    break;
                case 2:
                    // ===== Going Backwards =====
                    // if we're going forwards
                    if (forward) {
                        // If there is a previous song
                        if (listIterator.hasPrevious()) {
                            // Go to SAME SONG (I THINK???) - Coz of Looping Problem (Tortoise and Hare)
                            listIterator.previous();
                            forward = false;
                        }
                    }
                    if (listIterator.hasPrevious()) {
                        System.out.println("Now playing: " + listIterator.previous());
//                        System.out.println("Now playing: " + listIterator.previous().toString()); .toString() is Optional
                    } else {
                        System.out.println("START of the playlist reached");
                        forward = true; // because we cannot go backward anymore
                    }
                    break;
                case 3:
                    // ===== Replay Playlist Sing =====
                    if (forward) {
                        if (listIterator.hasPrevious()) {
                            System.out.println("Replaying " + listIterator.previous());
                            forward = false; // i.e. had to go back to replay the song
                        } else {
                            System.out.println("We are at the START of the playlist");
                        }
                    } else {
                        if (listIterator.hasNext()) {
                            System.out.println("Replaying " + listIterator.next());
                            forward = true;
                        } else {
                            System.out.println("We are at the END of the playlist");
                        }
                    }
                    break;
                case 4:
                    printPlaylist(playlist);
                    break;
                case 5:
                    printMenu();
                    break;
                case 6:
                    // ===== Delete current song =====
                    if (playlist.size() > 0) {
                        listIterator.remove();
                        // Moving the pointer after the song has been removed
                        if (listIterator.hasNext()) {
                            listIterator.next();
                            System.out.println("Deleted. Now playing: " + listIterator.next());
                        } else if (listIterator.hasPrevious()) { // COULD ALSO BE "ELSE" STATEMENT, BUT JUST BEING EXPLICIT
                            listIterator.previous();
                            System.out.println("Deleted. Now playing: " + listIterator.previous());
                        }
                    }
                    break;
            }
        }
    }

    private static void printMenu() {
        System.out.println("Available actions: ");
        System.out.println("press: ");
        System.out.println("\t 0 - to quit\n" +
                            "\t 1 - to go forward a song\n" +
                            "\t 2 - to go back a song\n" +
                            "\t 3 - to replay a song\n" +
                            "\t 4 - to print the full playlist\n" +
                            "\t 5 - print available actions\n" +
                            "\t 6 - Delete current song\n");
    }

    private static void printPlaylist(LinkedList<Song> playlist) {
        // Because we simply just wish to iterate over the entire LL (i.e. no going back and forth), a simple
        // iterator will suffice
        Iterator<Song> iterator = playlist.iterator();
        System.out.println("=========================");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
//            System.out.println(iterator.next().toString()); // .toString() is Optional
        }
        System.out.println("=========================");
    }
}
