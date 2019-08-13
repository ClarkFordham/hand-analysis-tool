package com.clarkfordham;

import java.util.*;
import java.nio.file.*;
import java.nio.charset.StandardCharsets;

//purpose is to take a text file representing an America's cardrrom (6-max cash game for now) hand history, and turn it into a hand object. 
class HistoryFile{

    List<String> fileLines;

    String filePath;

    HistoryFile(String path){
        filePath = path;
    }

    //this is intended to bring up errors to users who have not entered a path to their hand histories.
    HistoryFile(){
        filePath = null;
    }

    //inserts the lines in the text file into the fileLines variable
    void readFile(){
        try{
            fileLines = Files.readAllLines(Paths.get(filePath), StandardCharsets.UTF_8);
        } catch (Exception e) {
            e.printStackTrace();
            //do something to alert the user that they need to input a file path
        }
    }

    //builds a hand from the given text lines
    Hand buildHand(List<String> lines){

        String id = null;
        String game = null;
        String table = null;
        String numPlayers = 0;
        String BB = null;
        Player[] playerList = null;
        int buttonNum = 0;

        for(int num = 0; num < lines.size(); num++){

            String word = (lines.get(num)).split(" ")[0];

            switch(word) {
                case "Hand": //get info from first line and second line
                    String[] info = lines.get(num).split(" - ");
                    id = info[0].split(" #")[1];
                    game = info[1];
                    BB = info[2];
                    //date = 
                    //time = 

                    String[] info2 = lines.get(num+1).split(" ");
                    table = info2[0];
                    numPlayers = info2[1];
                    //this line VVV might cause problems if there are more words than expected, we will see
                    buttonNum = (int) info2[3].charAt(1);

                case "Seat": //create player and add it to playerList

                case "Dealt": //add cards to player

                case "*** SUMMARY ***": //get info from the entire summary and finish up
            }
        }

        //int num, String game, String table, int P, String bigBlind, Player[] player, int button
        return new Hand(id, game, table, numPlayers, BB, playerList, buttonNum);
    }

    //returns an array of hands (all hands present in the file)
    Hand[] gather(){
        return null;
    }
}