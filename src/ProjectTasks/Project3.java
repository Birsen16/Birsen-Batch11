package ProjectTasks;

import java.util.Scanner;

public class Project3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please choose one of the following three music types: " + "\nClassical" +  "\nPop"  + "\nCountry");
        String music = scanner.nextLine().toLowerCase();
        String classical = "Classical";
        String pop = "pop";
        String country = "country";


        if (music.contains("classical")){
            System.out.println("Please choose one of the following songs for this category : " + "\nO Fortuna" +  "\nMoonlight Sonato"  + "\nWedding March"+  "\nFigaro"  + "\nThe Fout Season :Spring");

        }else if (music.contains("pop")){

        }//
    }
}
 /*

             Techtorial Music Box
There is a music box in a restaurant. The box is 20 years
old. The producer company wants to update the
application with a new music repertoire. The old
application is working with current songs but if the
company changes the songs the music box is not working.
Our job is to renew the application with new songs.
The music box should have 3 different types of music:
Classical, Pop, and Country. There should be 5 different
songs for every type of music. In total, we have 15 songs. 
The company wants us to build the application with the
following feature:
The music box should print the available category of
music and should ask the user what kind of music he/ she
wants to listen. If the answer is not matching any of the
available types (classical, pop, or country), the application
should print out: “TYPE OF MUSIC is not available”
message. If the entered type is available, then the
application should print the available songs under the type
and should ask “Which song the user want to listen”
Example 1
Available music types are Classical, Pop, and Country.
Please enter the music type: 
Rock 
The rock music category is not available
Example 2
Available music types are Classical, Pop, and Country. 
Please enter the music type: 
Classical 
Four Seasons, Fur Elise, Finlandia, Vocalise, The
Planets is available music under Classical music
Which one do you want to listen?
NOTE:
If entered song is not available on the list, then the
application should print “NameOfSong is not
available”. If entered the name of the song is
matching with one of the available song, then the
application should ask the price of the song.
Here is the price list:
Classical : 2$
Country: 3$
Pop : 4$
Example 3
Available music types are Classical, Pop, and Country. 
Please enter the music type: 
Classical 
Four Seasons, Fur Elise, Finlandia, Vocalise, The
Planets is available songs under Classical music
Which one do you want to listen?
Ave Maria
Ave Maria is not available song.
Example 4
Available music types are Classical, Pop, and Country. 
Please enter the music type: 
Classical 
Four Seasons, Fur Elise, Finlandia, Vocalise, The
Planets is available songs under Classical music
Which one do you want to listen?
Finlandia
Please enter the 2$ for this song
Example 5
Please enter the music type:
Pop
Bad guy, Talk, Please Me, 7 Ring, Without Me is
available songs under Pop music
Which one do you want to listen?
Bad guy
Please enter the 4$ for this song
If the entered price is not enough to print out
“ENTEREDPRICE is not enough,please try later”. If the
entered price is exactly matching with the required price
then print “SongName is playing. Enjoy with the song”. If
the entered price is bigger than the expected amount.
“You have entered X dollar more. Please wait for change.
SongName is playing. Enjoy with the song”.
Example 6
Available music types are Classical, Pop, and Country. 
Please enter the music type: 
Pop 
Bad guy, Talk, Please Me, 7 Ring, Without Me is
available songs under Pop music
Which one do you want to listen?
Bad guy
Please enter the 4$ for this music
2
2$ is not enough. Please try later.
(In this part you can use loop to keep continue to ask user to enter the rest of the amount. This is
only suggestion to improve application and it is not required for the project.)
Example 7
Available music types are Classical, Pop, and Country. 
Please enter the music type: 
Country 
Meant to Be, Heaven, Simple, One Number Away,
Get Along is available songs under County music
Which song do you want to listen?
Heaven
Please enter the 3$ for this song
3
Heaven is playing. Enjoy the song!
Example 8
Available music types are Classical, Pop, and Country. 
Please enter the music type: 
Country 
Meant To Be, Heaven, Simple, One Number Away,
Get Along is available songs under County music
Which one do you want to listen?
Simple
Please enter the 3$ for this song
4
You have entered 1$ dollar more. Please wait for the
change. Simple isplaying. Enjoy the song.
NOTE: Copyright (C) 2021 Techtorial LLC. <http://www.techtorialacademy.com/>. Coping and
         */

