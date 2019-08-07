package com.clarkfordham;

enum action{
    //Fold, check, bet, raise, call
    F, X, B, R, C;
}

//this refers to a player in a hand for replay purposes
class Player{
    int chips;
    String name;
    Card[] holeCards;
    int seatNum;
    //may need to add something about position
    action[] preflop;
    action[] flop;
    action[] turn;
    action[] river;
    //may need a class that packages the action and amount together if applicable. 

    Player(int chipval, String username, Card[] cards, int seat, action[] preflopaction, action[] flopaction, action[] turnaction, action[] riveraction){
        chips = chipval;
        name = username;
        holeCards = cards;
        seatNum = seat;
        preflop = preflopaction;
        flop = flopaction;
        turn = turnaction;
        river = riveraction;
    }
}