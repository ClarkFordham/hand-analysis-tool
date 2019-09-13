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
        this.value = num;
        this.suit = sym;
    }

    Card(char num, char sym){
        switch(num){
            case '2':
                this.value = val.TWO;
            case '3':
                this.value = val.THREE;
            case '4':
                this.value = val.FOUR;
            case '5':
                this.value = val.FIVE;
            case '6':
                this.value = val.SIX;
            case '7':
                this.value = val.SEVEN;
            case '8':
                this.value = val.EIGHT;
            case '9':
                this.value = val.NINE;
            case 'T':
                this.value = val.TEN;
            case 'J':
                this.value = val.JACK;
            case 'Q':
                this.value = val.QUEEN;
            case 'K':
                this.value = val.KING;
            case 'A':
                this.value = val.ACE;
        }

        switch(sym){
            case 's':
                this.suit = symbol.SPADES;
            case 'd':
                this.suit = symbol.DIAMONDS;
            case 'c':
                this.suit = symbol.CLUBS;
            case 'h':
                this.suit = symbol.HEARTS;
        }
    }
}