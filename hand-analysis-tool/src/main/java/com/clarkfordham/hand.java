package com.clarkfordham;

//will contain all of the information about a hand, useful for replays and database storage. Created with text parsing.
class Hand{
    //hand #
    int id;

    //ex: holem(nolimit)
    String gameType;

    //name of the table
    String tableName;

    //table size ex: 6
    int numPlayers;

    //big blind ex: $0.10
    String BB;

    //list of players in the game
    Player[] players;

    //seat # that has the button
    int buttonNum;

    Hand(int num, String game, String table, int P, String bigBlind, Player[] player, int button){
        id = num;
        gameType = game;
        tableName = table;
        numPlayers = P;
        BB = bigBlind;
        players = player;
        buttonNum = button;
    }
}