package ProjectTasks;
import java.util.Locale;
import java.util.Scanner;
public class Project3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which music category would you prefer to listen? Please choose from following list:" + "\nClassical" + "\nPop" + "\nCountry");
        String music = scanner.nextLine();
        while (!(music.equals("classical") || music.equals("pop") || music.equals("country"))) {
            System.out.println("TYPE OF MUSIC is not available");
            System.out.println("Available music types are Classical, Pop, and Country\nPlease enter the music type from the list:");
            music = scanner.nextLine().toLowerCase(Locale.ROOT);
        }

        if (music.equalsIgnoreCase("Classical")) {
            System.out.println("Please choose a song from following list: " + "\nRondo alla Turca" + "\nO Fortuna" + "\nFigaro" +
                    "\nCarmen- Habanera" + "\nEine Kleine Nachtmusik");
            String songClassical = scanner.nextLine();

            if ((songClassical.equalsIgnoreCase("Rondo alla Turca")) || (songClassical.equalsIgnoreCase("O Fortuna")) ||
                    (songClassical.equalsIgnoreCase("Figaro")) || (songClassical.equalsIgnoreCase("Carmen- Habanera")) ||
                    (songClassical.equalsIgnoreCase("Eine Kleine Nachtmusik"))) {

                System.out.println("Please enter the 2$ for " + songClassical);
                double fee = scanner.nextDouble();
                if (fee < 2.00) {
                    System.out.println(fee + " $ is not sufficient amount ,please try again");

                } else if (fee == 2.00) {
                    System.out.println(songClassical + " is playing. Enjoy " + songClassical);

                } else if (fee > 2.00) {
                    System.out.println("You entered " + (fee - 2.00) + " $ more. Please wait for change. " + songClassical + " is playing. Enjoy " + songClassical);
                }


            } else {
                System.out.println(songClassical + " is currently not available. Please accept our apologies. ");
            }
           } else if (music.equalsIgnoreCase("Pop")) {
            System.out.println("Which song would you want to listen? Please choose from following list:" + "\nFather and son" + "\nSmooth criminal" + "\nBohemian Rhapsody" +
                    "\nBye Bye Love" + "\nRespect");
            String songPop = scanner.nextLine();
            if ((songPop.equalsIgnoreCase("Father and son")) || (songPop.equalsIgnoreCase("Smooth criminal")) ||
                    (songPop.equalsIgnoreCase("Bohemian Rhapsody")) || (songPop.equalsIgnoreCase("Bye Bye Love")) ||
                    (songPop.equalsIgnoreCase("Respect"))) {

                System.out.println("Please enter the 4$ for " + songPop);
                double fee = scanner.nextDouble();
                if (fee < 4.00) {
                    System.out.println(fee + " $ is not sufficient amount ,please try again");
                } else if (fee == 4.00) {
                    System.out.println(songPop + " is playing. Enjoy " + songPop);
                } else if (fee > 4.00) {
                    System.out.println("You entered " + (fee - 4.00) + " $ more. Please wait for change. " + songPop + " is playing. Enjoy " + songPop);
                }
            } else {
                System.out.println(songPop + " is currently not available. Please accept our apologies. ");
            }
            } else if (music.equalsIgnoreCase("country")) {
            System.out.println("Which song would you want to listen? Please choose from following list: " + "\nJolene" + "\nNasty Dan" + "\nTexas" +
                    "\nthe devil went down to Georgia" + "\nRing of Fire");
            String songCountry = scanner.nextLine();
            if ((songCountry.equalsIgnoreCase("Jolene")) || (songCountry.equalsIgnoreCase("Nasty Dan")) ||
                    (songCountry.equalsIgnoreCase("Texas")) || (songCountry.equalsIgnoreCase("the devil went down to Georgia")) ||
                    (songCountry.equalsIgnoreCase("Ring of Fire"))) {

                System.out.println("Please enter the 3$ for " + songCountry);
                double fee = scanner.nextDouble();
                if (fee < 3.00) {
                    System.out.println(fee + " $ is not sufficient amount ,please try again");

                } else if (fee == 3.00) {
                    System.out.println(songCountry + " is playing. Enjoy " + songCountry);

                } else if (fee > 3.00) {
                    System.out.println("You entered " + (fee - 2.00) + " $ more. Please wait for change. " + songCountry + " is playing. Enjoy " + songCountry);
                }
            } else {
                System.out.println(songCountry + " is currently not available. Please accept our apologies. ");
            }
           }else {
            System.out.println(music + " music category is not available.");


        }

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

