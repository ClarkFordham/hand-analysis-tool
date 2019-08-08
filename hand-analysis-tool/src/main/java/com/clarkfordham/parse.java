package com.clarkfordham;

import java.util.*;
import java.nio.file.*;
import java.nio.charset.StandardCharsets;

//purpose is to take a text file representing an America's cardrrom (6-max cash game for now) hand history, and turn it into a hand object. 
class Parse{

    List<String> fileLines;

    String filePath;

    Parse(String path){
        filePath = path;
    }

    //this is intended to bring up errors to users who have not entered a path to their hand histories.
    Parse(){
        filePath = null;
    }

    //inserts the file into the fileLines variable
    void readFile(){
        try{
            fileLines = Files.readAllLines(Paths.get(filePath), StandardCharsets.UTF_8);
        } catch (Exception e) {
            e.printStackTrace();
            //do something to alert the user that they need to input a file path
        }
    }

    Hand buildHand(){



        //int num, String game, String table, int P, String bigBlind, Player[] player, int button
        //return new Hand(id, game, table, numPlayers, BB, playerList, buttonNum);
        return null;
    }
}