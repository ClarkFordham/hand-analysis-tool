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
}