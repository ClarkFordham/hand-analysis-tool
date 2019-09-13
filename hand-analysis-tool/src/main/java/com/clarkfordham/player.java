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
        this.chips = chipval;
        this.name = username;
        this.holeCards = cards;
        this.seatNum = seat;
        this.preflop = preflopaction;
        this.flop = flopaction;
        this.turn = turnaction;
        this.river = riveraction;
    }

    Player(double chipval, String username, int seat){
        this.chips = chipval;
        this.name = username;
        this.seatNum = seat;
    }
}