package LinkedList.Excersize;

import java.util.*;

public class MainAcitvity {

     private static ArrayList<Album> albums = new ArrayList<>();
     static int cnt = 0;

    public static void main(String[] args) {

        Album album = new Album("makhna", "honey_singh");
        album.addSong("coca-cola",4.25);
        album.addSong("aa mahi",1.45);
        album.addSong("bas tu aur me",3.17);
        album.addSong("Agar tum saath ho",5.89);

        albums.add(album);

        LinkedList<Song> playlist = new LinkedList<>();

        albums.get(0).addToPlaylist(1,playlist);
        albums.get(0).addToPlaylist(5,playlist);
        albums.get(0).addToPlaylist(3,playlist);
        albums.get(0).addToPlaylist(4,playlist);

         play(playlist);
    }
    public static void play(LinkedList<Song> songs)
    {
        /* difference between iterator and listIteration are next and previous */

        ListIterator<Song> music = songs.listIterator();
        if (songs.size()==0)
        {
            System.out.println("no music Available in playlist");
        }
        else
        {
            System.out.println("Now playing "+music.next());
        }

        Scanner s = new Scanner(System.in);

        boolean forward = true;
        boolean quit = false;
        while (!quit)
        {
            int action;
            printMenu();
            System.out.println("Enter your choice ");
            action = s.nextInt();
            switch (action)
            {
                case 0:
                    System.out.println("playlist completed now ");
                    quit = true;
                    break;
                case 1:
                    if(!forward)
                    {
                        if (music.hasNext())
                        {
                            music.next();
                        }
                        forward = true;
                    }
                    if (music.hasNext())
                    {
                        System.out.println("we are playing "+music.next());
                    }
                    else
                    {
                        System.out.println("we are reached at the end ");
                        forward = false;
                    }
                    break;
                case 2:
                    if (forward)
                    {
                        if (music.hasPrevious())
                        {
                            music.previous();
                        }
                        forward =false;
                    }
                    if (music.hasPrevious())
                    {
                        System.out.println("we are playing "+music.previous());
                    }
                    else
                    {
                        System.out.println("We are reahed at the begining ");
                        forward =true;
                    }
                    break;
                case 3:
                    printlist(songs);
                    break;
                case 4:
                    printMenu();
                    break;
                default:
                    System.out.println("wrong input choice ");
                    break;

            }
        }
    }
    public static void printlist(LinkedList<Song> music)
    {
        ListIterator<Song> musicList = music.listIterator();
        System.out.println("All "+music.size()+ " Song in Your Playlist ");

        while (musicList.hasNext())
        {
            ++cnt;

            System.out.println("#"+cnt+". "+musicList.next());
        }
    }
    public static void printMenu()
    {
        System.out.println("Available Action here "+'\n');
        System.out.println("0. exit from playlist ");
        System.out.println("1. Play Next Song from playlist ");
        System.out.println("2. Play Previous Song from playlist ");
        System.out.println("3. Show all of playlist ");
        System.out.println("4. Print Menu ");
    }
}