package com.clarkfordham;

class Action{
    
    enum decision{
        //Fold, check, bet, raise, call
        F, X, B, R, C;
    }

    decision act;

    //initializing to 0 because this value will be used when a player folds or checks
    double value = 0.0;
}