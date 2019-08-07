package com.clarkfordham;

class Card{
    
    enum val{
        TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE;
    } 

    enum symbol{
        CLUBS, DIAMONDS, HEARTS, SPADES;
    }

    val value;

    symbol suit;

    //this constructor might cause problems
    Card(val num, symbol sym){
        value = num;
        suit = sym;
    }
}