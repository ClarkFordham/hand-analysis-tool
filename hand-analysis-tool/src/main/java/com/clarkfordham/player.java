package com.clarkfordham;

//this refers to a player in a hand for replay purposes
class Player{
    double chips;
    String name;
    Card[] holeCards;
    int seatNum;
    //may need to add something about position
    Action[] preflop;
    Action[] flop;
    Action[] turn;
    Action[] river;
    //may need a class that packages the action and amount together if applicable. 

    Player(double chipval, String username, Card[] cards, int seat, Action[] preflopaction, Action[] flopaction, Action[] turnaction, Action[] riveraction){
        chips = chipval;
        name = username;
        holeCards = cards;
        seatNum = seat;
        preflop = preflopaction;
        flop = flopaction;
        turn = turnaction;
        river = riveraction;
    }

    Player(double chipval, String username, int seat){
        chips = chipval;
        name = username;
        seatNum = seat;
    }
}