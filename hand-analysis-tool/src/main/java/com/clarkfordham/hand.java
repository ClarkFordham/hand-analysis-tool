package com.clarkfordham;

//will contain all of the information about a hand, useful for replays and database storage. Created with text parsing.
class Hand{
    //hand #
    String id;

    //ex: holem(nolimit)
    String gameType;

    //name of the table
    String tableName;

    //table size ex: 6
    String numPlayers;

    //big blind ex: $0.10
    String BB;

    //list of players in the game
    Player[] players;

    //seat # that has the button
    int buttonNum;

    Hand(String num, String game, String table, String P, String bigBlind, Player[] player, int button){
        this.id = num;
        this.gameType = game;
        this.tableName = table;
        this.numPlayers = P;
        this.BB = bigBlind;
        this.players = player;
        this.buttonNum = button;
    }
}