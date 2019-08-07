package com.clarkfordham;

import java.nio.file.*;

//purpose is to take a text file representing an America's cardrrom (6-max cash game for now) hand history, and turn it into a hand object. 
class Parse{

    Path filePath;

    Parse(Path path){
        filePath = path;
    }

    //this is intended to bring up errors to users who have not entered a path to their hand histories.
    Parse(){
        filePath = null;
    }

    //creates the list of players to be added to the hand
    Player[] createPlayers(){
        
        //

        return null;
    }
}