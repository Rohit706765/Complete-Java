package Playlist_LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Playlist {}
    /*
     *   This linkedlist challenge here
     *   Class use Song , Album
     *   Concept use Arraylist,Linkedlist
     * */

    /*private LinkedList<String > playlist;
    private static Scanner s=new Scanner(System.in);
    private String PlaylistName;

    public LinkedList<String> getPlaylist() {
        return playlist;
    }

    public String getPlaylistName() {
        return PlaylistName;
    }

    public Playlist(String playlistName) {
        PlaylistName = playlistName;
        this.playlist=new LinkedList<>();
    }
    public boolean AddPlaylistSong(String PlaylistSong)
    {
        int position=FindAlbumSong(PlaylistSong);
        System.out.println("value =="+position);
        if (position<0)
        {
            System.out.println(PlaylistSong+" Song is not in your Album ");
            return false;
        }
        if(addInOrder(playlist,PlaylistSong))
        {
            System.out.println("Successfully Added "+PlaylistSong+" In your Playlist ");
            return true;
        }
        else {
            return false;
        }

    }
    private boolean addInOrder(LinkedList<String> Playlist,String Newsong)
    {
        ListIterator<String> listIterator=Playlist.listIterator();
        while (listIterator.hasNext())
        {
            int position=listIterator.next().compareTo(Newsong);
            if(position==0)
            {
                System.out.println(" This Song Already in your Playlist ");
                return false ;
            }
            else if(position>0)
            {
                    listIterator.previous();
                    listIterator.add(Newsong);
                    return true;
            }
            else if(position<0){
                // move to next song
            }
        }
        listIterator.add(Newsong);
        return true;
    }
    private int FindAlbumSong(String SongName)
    {
        for(int i=0;i<album.getAlbum().size();i++)
        {
            Song song=this.album.getAlbum().get(i);
            System.out.println("Song value in FindAlbum()---"+album.getAlbum().get(i).getTitle());
            if (song.getTitle().equals(SongName))
            {
                return i;
            }
        }
        return -1;
    }
    private boolean RemovePlaylistSong(LinkedList<String> playlist,String RemoveSong)
    {
        ListIterator<String> listIterator=playlist.listIterator();
        while (listIterator.hasNext())
        {
          int compare=listIterator.next().compareTo(RemoveSong);
          if (compare==0)
          {
              playlist.remove(RemoveSong);
              return true;
          }
        }
        return false;
    }
    public void ShowAllPlaylistSong(LinkedList<String> playlist)
    {
        int cnt=1;
        ListIterator<String> list=playlist.listIterator();
        System.out.println("Song List ");
        if(playlist.isEmpty())
        {
            System.out.println("No Song in Your Playlist ");
            return;
        }
        else {
            System.out.println("Song of "+PlaylistName+" Playlist is "+list.next()+" Song ");
            printMenu();
        }
        int choice;
        boolean quit=false;
        while (!quit)
        {
            System.out.println("enter Choice ");
           choice=s.nextInt();
           boolean GoingToForward=false;
           switch (choice)
           {
               case 0:
                   quit=false;
                   break;
               case 1:
                   System.out.println("Enter Song Name For "+PlaylistName+" Playlist ");
                   String name=s.next();
                   AddPlaylistSong(name);
                   break;
               case 2:
                   System.out.println("Enter old Song Name ");
                   String OldSongName=s.next();
                   System.out.println("Enter New Song Name ");
                   String newSongName=s.next();
                   if(UpdatePlaylistSong(playlist,OldSongName,newSongName))
                   {
                       System.out.println("Successfully Updated ");
                   }
                   break;
               case 3:
                   if(!GoingToForward)
                   {
                        while (list.hasNext())
                        {
                            list.next();
                        }
                        GoingToForward=true;
                   }
                   System.out.println("Next Playlist Song ");
                   if (list.hasNext())
                   {
                       System.out.println(list.next());
                   }
                   else
                   {
                       System.out.println("We Reached To The End ");
                       GoingToForward=false;
                   }
                   break;
               case 4:
                   if (GoingToForward)
                   {
                      while (list.hasPrevious())
                      {
                          list.previous();
                      }
                      GoingToForward=true;
                   }
                   if(list.hasPrevious())
                   {
                       System.out.println("Previous Song "+list.previous());
                   }
                   else
                   {
                       System.out.println("We Reached To The End ");
                       GoingToForward=false;
                   }
                   break;
               case 5:
                   while (list.hasNext())
                   {
                       System.out.println("Now Playing Song is "+list.next());
                   }
                   break;
               case 6:
                   System.out.println("Enter Remove Song ");
                   String RemoveSong=s.next();
                   if(RemovePlaylistSong(playlist,RemoveSong))
                   {
                       System.out.println("Successfully Remove "+RemoveSong+" Song From Playlist ");
                       return;
                   }
                   break;
               default:
                   System.out.println("Mismatch in choice ");
                   break;
           }
        }
    }
    private boolean UpdatePlaylistSong(LinkedList<String> playlist,String oldSongName,String NewSongName)
    {
        ListIterator<String> listIterator=playlist.listIterator();
        if(playlist.isEmpty())
        {
            System.out.println("No Song in Playlist");
            return false ;
        }
        while (listIterator.hasNext()) {
            int compare = listIterator.next().compareTo(oldSongName);
            if (compare == 0) {
                playlist.remove(oldSongName);
                playlist.add(NewSongName);
                System.out.println(oldSongName + " Song Was Change by " + NewSongName + " Song ");
                return true;
            }
        }
        return false;
    }
    private void printMenu()
    {
        System.out.println("0. Exit \n"+
                            "1. New Song In Playlist \n"+
                            "2. Update Playlist Song \n"+
                            "3. Next Playlist Song \n"+
                            "4. Previous Playlist Song \n"+
                            "5. Replay This Song \n"+
                            "6. Remove Playlist Song \n");
        System.out.println("Enter Action (6 Available Action )");
    }
}*/
