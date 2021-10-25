package Playlist_LinkedList;

import java.util.*;

public class main_Bank {
    private static ArrayList<Album> MyAlbum=new ArrayList<>();
    public static void main(String[] args) {

        Album album=new Album("Post malone","Hollywood bleeding");
        album.AddSong("hollywood bleeding",4.5);
        album.AddSong("better now",4.5);
        album.AddSong("one more time",2.0);
        album.AddSong("sunflower",2.5);
        album.AddSong("goodbye",1.5);
        album.AddSong("you die for me",10.0);
        album.AddSong("dont do shit bitch",4.5);
        MyAlbum.add(album);
        Album honey=new Album("Honey singh","Punjab on fire");
        honey.AddSong("one more night",4.5);
        honey.AddSong("daaru pack",4.5);
        honey.AddSong("vodka",2.0);
        honey.AddSong("birthday bash",2.5);
        honey.AddSong("high heel",1.5);
        honey.AddSong("loca",10.0);
        honey.AddSong("shit",4.5);
        MyAlbum.add(honey);

        LinkedList<Song> playlist=new LinkedList<>();

        MyAlbum.get(0).AddToPlaylist("hollywood bleeding",playlist);
        MyAlbum.get(0).AddToPlaylist("better now",playlist);
        MyAlbum.get(0).AddToPlaylist("goodbye",playlist);
        MyAlbum.get(1).AddToPlaylist("fucking thing",playlist);
        MyAlbum.get(0).AddToPlaylist(7,playlist);
        MyAlbum.get(0).AddToPlaylist(27,playlist);
        play(playlist);
    }
    public static void play(LinkedList<Song> playlist)
    {
        Scanner s=new Scanner(System.in);
        int choice;
        boolean quit=false;
        boolean forward=true;
        ListIterator<Song> listIterator=playlist.listIterator();
        if (playlist.size()<=0)
        {
            System.out.println("No song in Playlist ");
            return;
        }
        else
        {
            System.out.println("Now Playing song is "+listIterator.next().toString());
            printMenu();
        }
        while (!quit)
        {
            System.out.println("Enter choice ");
            choice=s.nextInt();
            s.nextLine();
            switch (choice)
            {
                case 0:
                    System.out.println("Playlist Complete ");
                    quit=true;
                    break;
                case 1:
                    if (!forward)
                    {
                        if (listIterator.hasNext())
                        {
                           listIterator.next();
                        }
                        forward=true;
                    }
                    if (listIterator.hasNext())
                    {
                        System.out.println("Now Playing "+listIterator.next().toString());
                    }
                    else {
                        System.out.println("We are Reached to end of the playlist ");
                        forward=false;
                    }

                    break;
                case 2:
                    if(forward)
                    {
                        if (listIterator.hasPrevious())
                        {
                            listIterator.previous();
                        }
                        forward=false;
                    }
                    if (listIterator.hasPrevious())
                    {
                        System.out.println("Now Playing "+listIterator.previous().toString());
                    }
                    else {
                        System.out.println("We Are At The Beginig of the Playlist");
                        forward=true;
                    }
                    break;
                case 3:
                    if(forward)
                    {
                       if (listIterator.hasPrevious())
                       {
                           System.out.println("Now Playing "+listIterator.previous().toString());
                           forward=false;
                       }
                       else {
                           System.out.println("we are at the begining of list ");
                       }
                    }
                    else {
                        if (listIterator.hasNext())
                        {
                            System.out.println("Now playing "+listIterator.next().toString());
                            forward=true;
                        }
                        else {
                            System.out.println("We are at the end of playlist ");
                        }
                    }
                    break;
                case 4:
                    SongList(playlist);
                    break;
                case 5:
                    printMenu();
                    break;
                case 6:
                        if(playlist.size()>0)
                        {
                            listIterator.remove();
                            if (listIterator.hasNext())
                            {
                                System.out.println("Now playing "+listIterator.next());
                            }
                            else if(listIterator.hasPrevious())
                            {
                                System.out.println("Now playing "+listIterator.previous());
                            }
                        }
                            break;
                default:
                    System.out.println("mismatch in choice ");
                    break;
            }
        }
    }
    public static void printMenu()
    {
        System.out.println("Available Action ");
        System.out.println("0. quit ");
        System.out.println("1. play next song ");
        System.out.println("2. play previous song ");
        System.out.println("3. replay current song ");
        System.out.println("4. list song in the playlist  ");
        System.out.println("5. print available action  ");
        System.out.println("6. remove current play song  ");
    }
    public static void SongList(LinkedList<Song> songs)
    {
        int cnt=1;
        ListIterator<Song> listIterator=songs.listIterator();
        System.out.println("======================================");
        if (songs.size()<=0)
        {
            System.out.println("No song in the list ");
            return;
        }
        else
        {
            System.out.println("Song list ");
            while (listIterator.hasNext())
            {
                System.out.println(cnt+". "+listIterator.next());
                ++cnt;
            }
            System.out.println("======================================");
        }
    }
}



























            /*
            *   This code use by Album old code and song old code
            * */
/*
   private static Scanner s=new Scanner(System.in);
   private static Album album=new Album("Post_Malone");
    public static void main(String[] args) {
       int choice;
       boolean quit=false;
        PrintForMain();
       while (!quit)
       {
           System.out.println("Enter 3 Available Action ");
           choice=s.nextInt();
           switch (choice)
           {
               case 0:
                   quit=true;
                   break;
               case 1:
                   AddSongInAlbum();
                   break;
               case 2:
                   AddSongInPlaylist();
                   break;
               case 3:
                    PrintForMain();
                    break;
               default:
                   System.out.println("Mismatch In Choice ");
                   break;
           }
       }

    }
    public static void PrintForMain()
    {
        System.out.println("0. Exit \n"+
                "1. Add Song in Album (*Required ) \n"+
                "2. Add Song in Playlist (Optional) \n"+
                "3. Print All Stement \n");
    }
    public static void AddSongInPlaylist()
    {
        Playlist playlist=new Playlist("sad_Song");
        System.out.println("Enter Song Name For Playlist");
        String songName=s.next();
        playlist.AddPlaylistSong(songName);
        playlist.ShowAllPlaylistSong(playlist.getPlaylist());
    }
    public static void AddSongInAlbum()
    {
        int choice=1;
        boolean quit=false;
        PrintStatement();
        while (!quit)
        {
            System.out.println("Enter Your Choice... ");
            choice=s.nextInt();
            switch (choice)
            {
                case 0:
                    quit=true;
                    break;
                case 1:
                    AddSong();
                    break;
                case 2:
                    System.out.println("Song list ");
                    ShowAllSong();
                    break;
                case 3:
                    UpdateSong();
                    break;
                case 4:
                    PrintStatement();
                    break;
                default:
                    System.out.println("Mismatch ");
                    break;
            }
        }
    }
    public static void UpdateSong()
    {
        System.out.println("Enter Existing Song Name ");
        String OldsongName=s.next();
        s.nextLine();
        Song song;
        System.out.println("Enter New Song Name ");
        String NewSong=s.next();
        System.out.println("Enter Duration For New Song ");
        double Duration=s.nextDouble();

        if(album.UpdateExistingSong(OldsongName,NewSong,Duration))
        {
            System.out.println(OldsongName+" was Changed to "+NewSong+" Duration :"+Duration);
        }
        else
        {
            System.out.println("Falied To Updated ");
        }
    }
    public static void AddSong()
    {
        System.out.println("Enter Song Name ");
        String name=s.next();
        System.out.println("Enter Duration of "+name+" Song ");
        double Duration=s.nextDouble();
        s.nextLine();
        Song song=new Song(name,Duration);

        if ( album.AddSong(song))
        {
            System.out.println("");
            System.out.println("Succesfully Added New Song "+song.getTitle()+"\n" +"Duration : "+song.getDuration()+ " in Your Album ");
            s.nextLine();
        }
        else
        {
            System.out.println("Error To Add Song "+song.getTitle()+" in your Album ");
        }
    }
    public static void ShowAllSong()
    {
        album.ListOfSong();
    }
    public static void PrintStatement()
    {
        System.out.println("0. Exit \n"+
                "1. Enter New Song \n"+
                "2. Song List \n"+
                "3. Update Song  \n"+
                "4. Print All Statement \n");
    }
}


*/











        /*
         *   This Is Disadvantage of Array Compare to Arraylist
         *
         */

        /*int[] MyIntArray=new int[10];
        System.out.println("Enter 10 Element  in Array ");
        for (int i=0;i<10;i++)
        {
            MyIntArray[i]=s.nextInt();
        }
        for (int i=0;i<10;i++)
        {
            System.out.println("index "+(i+1)+" value "+MyIntArray[i]);
        }
        System.out.println("Enter 12 Element ");
        int[] Array=printArray(MyIntArray);
        for (int i=0;i<12;i++)
        {
            System.out.println((i+1)+"--->"+Array[i]);
        }
    }
    public static int[] printArray(int MyArray[])
    {
        int[] MyIntArray=MyArray;
        MyIntArray=new int[12];
        for (int i=0;i<12;i++)
        {
            MyIntArray[i]=s.nextInt();
        }
        return MyIntArray;*/



        /*
        *       this code show Advantage of linked list compare to Arraylist
        *
        */

     /*
          ArrayList<Integer> MyNumber=new ArrayList<>();
        MyNumber.add(10);
        MyNumber.add(20);
        MyNumber.add(30);
        for (int i=0;i<MyNumber.size();i++)
        {
            System.out.println(MyNumber.get(i));
        }
        System.out.println("After Adding New Element ");
        MyNumber.add(1,2);
        for (int i=0;i<MyNumber.size();i++)
        {
            System.out.println(MyNumber.get(i));
        }*/

        /*
         *       the  below code Call Bank class and it totally based on
         *      Arraylist concept. Huge project
         *      Class used: Bank,Branch,Customer
         */

              /* Bank bank=new Bank("Bank_Of_Baroda");
        if(bank.AddBranch("Pandesara"))
        {
            System.out.println("Pandesara Branch is Created ");
        }
        bank.AddCustomer("Pandesara","Rohit",450.5);
        bank.AddCustomerTransaction("Pandesara","Rohit",4500);
        bank.AddCustomerTransaction("Pandesara","Rohit",1200);
        bank.CustomerList("Pandesara",true);
        bank.AddBranch("Udhana");
        bank.AddCustomer("Udhana","Sonal_singh",4500);
        bank.AddCustomer("Udhana","Kajal_singh",1500);
        bank.CustomerList("Udhana",true);*/


/*
 *
 *   this code Check max Array Element And Add in sort way !!!!!!!
 *
 * */


   /* Scanner s=new Scanner(System.in);
    int[] a=new int[5];
    int len=a.length;
        System.out.println("Enter VAlue in Array");
                for (int i=0;i<len;i++)
        {
        a[i]=s.nextInt();
        }
        System.out.println("Sorting is here ");
        boolean flag=true;
        while (flag)
        {

        flag = false;
        for (int i = 0; i < len - 1; i++)
        {
        int temp;
        if (a[i] > a[i + 1])
        {
        temp = a[i];
        a[i] = a[i + 1];
        a[i + 1] = temp;
        flag = true;
        }
        }
        }
        for (int i=0;i<len;i++)
        {
        System.out.println(a[i]);
        }
*/

        /*
        *
        *   this code Reversed Array Element okay!!!!!!!
        *
        * */
/*
    Scanner s=new Scanner(System.in);
    int[] MyNumber=new int[5];
    int len=0;
        System.out.println("Enter  element in Array ");
                len=MyNumber.length;
                for (int i=0;i<len;i++)
        {
        MyNumber[i]=s.nextInt();
        }
        System.out.println("Array Element is Here :");
        for (int i=0;i<len;i++)
        {
        System.out.println((i+1)+". Value "+MyNumber[i]);
        }

        int HalfLength=len/2;
        int temp;
        int MaxIndex=(len-1);
        for (int i=0;i<HalfLength;i++)
        {
        temp=MyNumber[i];
        MyNumber[i]=MyNumber[MaxIndex-i];
        MyNumber[MaxIndex-i]=temp;
        }
        System.out.println("Reversed Array Element is here ");
        for (int i=0;i<len;i++)
        {
        System.out.println((i+1)+". Value "+MyNumber[i]);
        }
*/

